package com.example.best_fan.beautiful_weather;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;


import android.os.Build;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationClient;
import com.amap.api.location.AMapLocationClientOption;
import com.amap.api.location.AMapLocationListener;
import com.example.best_fan.beautiful_weather.MVP.DailyForecastView;
import com.example.best_fan.beautiful_weather.MVP.MvpMainView;
import com.example.best_fan.beautiful_weather.MVP.UpDownTextView;
import com.example.best_fan.beautiful_weather.MVP.impl.MainPresenter;
import com.example.best_fan.beautiful_weather.adapter.AMapListener;
import com.example.best_fan.beautiful_weather.adapter.WeatherAdapter;
import com.example.best_fan.beautiful_weather.bean.ForecastBean;
import com.example.best_fan.beautiful_weather.bean.NowBean;
import com.example.best_fan.beautiful_weather.utils.AnimationUtils;
import com.example.best_fan.beautiful_weather.utils.WeatherUtils;

import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class MainActivity extends AppCompatActivity implements MvpMainView{
    MainPresenter  mainPresenter;
    private TextView tv_city,tv_temp,tv_hd,tv_aqi,tv_alert,tv_alert1,tv_updatetime;
    private UpDownTextView tv_weather;
    private ListView lv;
    private final String TAG="tag";
    private int[] weatherimg=new int[]{R.drawable.clear_day,R.drawable.cloudy,R.drawable.rain,R.drawable.snow,R.drawable.wind,R.drawable.fog};
    private WeatherAdapter weatherAdapter;
    //声明AMapLocationClient类对象
    public AMapLocationClient mLocationClient = null;
    //声明定位回调监听器
    public AMapLocationListener mLocationListener = new MyaMapListener();
    //声明AMapLocationClientOption对象
    public AMapLocationClientOption mLocationOption = null;

    Map<String,String> location=new HashMap<>();
    Map<String,String> alert_map=new HashMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loding_main);


        init();
        int color = Color.parseColor("#4ba7e1");
        initWindows(color);
        final RefreshLayout refreshLayout = (RefreshLayout) findViewById(R.id.smartLayout);
       // location= aMapListener.getposition();
        Log.i(TAG, "onCreate: "+location);
        //开启自动刷新
        refreshLayout.autoRefresh(0);



        refreshLayout.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh(RefreshLayout refreshlayout) {

                    //开始定位
                    mLocationClient.startLocation();
                    if (location.size()==0)
                    {
                        mLocationClient.startLocation();
                        Toast.makeText(MainActivity.this, "定位失败，请刷新后再试", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        //传递位置信息
                        // location.put("longitude","114.5391");
                       // location.put("latitude","35.5712");
                        Log.i(TAG, "onRefresh: 发送请求");
                        mainPresenter.GetPosition(location);
                    }
                     refreshlayout.finishRefresh();//刷新完成






            }
        });


    }

   private void init(){
       mainPresenter=new MainPresenter(this);
       mainPresenter.attach(this);
       //初始化定位
       mLocationClient = new AMapLocationClient(getApplicationContext());
       //设置定位回调监听
       mLocationClient.setLocationListener(mLocationListener);
       //初始化AMapLocationClientOption对象
       mLocationOption = new AMapLocationClientOption();
       //设置定位模式为AMapLocationMode.Hight_Accuracy，高精度模式。
       mLocationOption.setLocationMode(AMapLocationClientOption.AMapLocationMode.Hight_Accuracy);
       //获取一次定位结果：
        //该方法默认为false。
       mLocationOption.setOnceLocation(true);
        //获取最近3s内精度最高的一次定位结果：
        //设置setOnceLocationLatest(boolean b)接口为true，启动定位时SDK会返回最近3s内精度最高的一次定位结果。如果设置其为true，setOnceLocation(boolean b)接口也会被设置为true，反之不会，默认为false。
       mLocationOption.setOnceLocationLatest(true);
       //设置是否返回地址信息（默认返回地址信息）
       mLocationOption.setNeedAddress(true);
       //设置是否强制刷新WIFI，默认为true，强制刷新。
       mLocationOption.setWifiActiveScan(false);
       //设置是否允许模拟位置,默认为true，允许模拟位置
       mLocationOption.setMockEnable(false);
       //单位是毫秒，默认30000毫秒，建议超时时间不要低于8000毫秒。
       mLocationOption.setHttpTimeOut(20000);
       //关闭缓存机制
       mLocationOption.setLocationCacheEnable(false);
       //给定位客户端对象设置定位参数
       mLocationClient.setLocationOption(mLocationOption);

       //初始化控件
       tv_city= (TextView) findViewById(R.id.tv_position);
       tv_temp= (TextView) findViewById(R.id.tv_tempe);
       tv_weather= (UpDownTextView) findViewById(R.id.tv_weatherinfor);
       tv_hd= (TextView) findViewById(R.id.tv_hd);
       tv_updatetime= (TextView) findViewById(R.id.tv_updatetime);
       tv_aqi= (TextView) findViewById(R.id.tv_aqi);
       tv_alert= (TextView) findViewById(R.id.tv_alert);
       tv_alert1= (TextView) findViewById(R.id.tv_aler1);


       //获取请求参数
       Intent intent=this.getIntent();
       location.put("longitude",intent.getStringExtra("Longitude"));
       location.put("latitude",intent.getStringExtra("Latitude"));
       location.put("position",intent.getStringExtra("position"));





   }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mLocationClient.stopLocation();//停止定位后，本地定位服务并不会被销毁
        mLocationClient.onDestroy();//销毁定位客户端，同时销毁本地定位服务。
    }


    @Override
    public void showLoagingView() {

    }

    @Override
    public void hideLoagingView() {

    }

    @Override
    public void showToast(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
    //nowbean
    @Override
    public void updatenowview() {
        View view=findViewById(R.id.tv_tempe);
        AnimationUtils.textAimation(view);
        Log.i(TAG, "updatenowview: "+location.get("position"));
        tv_city.setText(location.get("position"));
        NowBean nowBean=mainPresenter.getNowbean();
        tv_temp.setText(nowBean.result.temperature+"");
        tv_updatetime.setText(WeatherUtils.gettime(nowBean.server_time));
        tv_aqi.setText(WeatherUtils.getaqi(nowBean.result.aqi));
        view=findViewById(R.id.tv_weatherinfor);
        AnimationUtils.textAimation(view);
        List<String> weatherinfor=new ArrayList<>();
        weatherinfor.add(WeatherUtils.getweather(nowBean.result.skycon)+" | 湿度:"+
                WeatherUtils.gethumidity(nowBean.result.humidity));
        weatherinfor.add(WeatherUtils.getwind(nowBean.result.wind.direction)+":"+
                WeatherUtils.getwindpower(nowBean.result.wind.speed));
        tv_weather.setText(weatherinfor.get(1));
        tv_weather.setTextList(weatherinfor);
        tv_weather.startAutoScroll();

    }
    //forceastbean
    @Override
    public void updateforecastview() {
        List<String> alertcode=new ArrayList<>();
        List<String> description=new ArrayList<>();
        ForecastBean forecastBean=mainPresenter.getForecastBean();
        tv_hd.setText(forecastBean.result.hourly.description);
        List<ForecastBean.ResultBean.AlertBean.ContentBean>  alert=forecastBean.result.alert.content;
        if (alert.isEmpty()){
           //预警信息为空
        }else {
            for (ForecastBean.ResultBean.AlertBean.ContentBean ss:alert)
            {
                alertcode.add(WeatherUtils.getalert(ss.code.trim()));
                description.add(ss.description.trim());
            }
            for (int i=0;i<alertcode.size();i++){
                if (i==0){
                    tv_alert.setText(alertcode.get(i));
                    alert_map.put("alert_title",alertcode.get(i));
                    tv_alert.setTextColor(Color.parseColor(WeatherUtils.getcolor(alertcode.get(i))));
                    alert_map.put("alert_title_color",WeatherUtils.getcolor(alertcode.get(i)));
                    alert_map.put("alert_description",description.get(i));


                }else {
                    tv_alert1.setText(alertcode.get(i));
                    tv_alert1.setTextColor(Color.parseColor(WeatherUtils.getcolor(alertcode.get(i))));
                    alert_map.put("alert1_title",alertcode.get(i));
                    alert_map.put("alert1_title_color",WeatherUtils.getcolor(alertcode.get(i)));
                    alert_map.put("alert1_description",description.get(i));

                }
            }
            if (alertcode.size()<2){
                tv_alert.setVisibility(View.VISIBLE);
            }else {
                tv_alert.setVisibility(View.VISIBLE);
                tv_alert1.setVisibility(View.VISIBLE);
            }
            Log.i(TAG, "updateview:个数 "+alert.size());
        }
        int[] tempter=new int[7];
        String[] date=new String[7];
        String[] wind=new String[7];
        String[] skycon=new String[7];
        DailyForecastView mCharView = (DailyForecastView) findViewById(R.id.line_char);
        List<ForecastBean.ResultBean.HourlyBean.TemperatureBean> temperatureBeanList=forecastBean.result.hourly.temperature;
        List<ForecastBean.ResultBean.HourlyBean.WindBean> windBeanList=forecastBean.result.hourly.wind;
        List<ForecastBean.ResultBean.HourlyBean.SkyconBean> skyconBeanList=forecastBean.result.hourly.skycon;
         for (int i=0;i<date.length;i++){
             tempter[i]=temperatureBeanList.get(i).value;
             date[i]=temperatureBeanList.get(i).datetime;
             wind[i]=WeatherUtils.getwindpower(windBeanList.get(i).speed);
             skycon[i]=WeatherUtils.getweather(skyconBeanList.get(i).value);

         }
        // set day
        mCharView.setTempDay(tempter);
        mCharView.setWeatherinfro(skycon,wind,date,forecastBean.result.minutely.description);
        mCharView.invalidate();
        //未来天气
        lv = (ListView)findViewById(R.id.mylistview);
        weatherAdapter=new WeatherAdapter(this,getData(forecastBean));
        lv.setAdapter(weatherAdapter);
    }
    //预警信息点击事件
    public  void onclick(View view){
        LayoutInflater inflater=LayoutInflater.from(this);
        View alert_view=inflater.inflate(R.layout.dialog_view,null);
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setView(alert_view);
        TextView title=alert_view.findViewById(R.id.dialog_tv_title);
        TextView content= alert_view.findViewById(R.id.dialog_tv_content);
        switch (view.getId()){
            case R.id.tv_alert:
                title.setText(alert_map.get("alert_title"));
                title.setTextColor(Color.parseColor(alert_map.get("alert_title_color")));
                content.setText("\u3000\u3000"+alert_map.get("alert_description"));
                break;
            case R.id.tv_aler1:
                title.setText(alert_map.get("alert1_title"));
                title.setTextColor(Color.parseColor(alert_map.get("alert1_title_color")));
                content.setText("\u3000\u3000"+alert_map.get("alert1_description"));
                break;

        }
        final AlertDialog dialog=builder.create();
        dialog.show();
        alert_view.findViewById(R.id.dialog_btn_back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });

    }

    //传递adapter 参数信息
    private List<Map<String, Object>> getData(ForecastBean forecastBean)
    {
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        List<ForecastBean.ResultBean.DailyBean.SkyconBeanX> skyconBeanList=forecastBean.result.daily.skycon;
        List<ForecastBean.ResultBean.DailyBean.TemperatureBeanX> temperatureBeanList=forecastBean.result.daily.temperature;
        Map<String, Object> map;
        for(int i=0;i<skyconBeanList.size();i++)
        {
            map = new HashMap<String, Object>();
            map.put("img",weatherimg[WeatherUtils.getimg(skyconBeanList.get(i).value)]);
            map.put("weather", WeatherUtils.getweather(skyconBeanList.get(i).value));
            try {

                    if (i==0){
                        map.put("date","今 天");
                    }else if (i==1){
                        map.put("date","明 天");
                    }else {
                        map.put("date", WeatherUtils.getWeek(skyconBeanList.get(i).date));
                    }


            } catch (ParseException e) {
                e.printStackTrace();
            }
            map.put("temp",WeatherUtils.getTemp(temperatureBeanList.get(i).max,temperatureBeanList.get(i).min));
            list.add(map);
        }
        return list;
    }

    /**
     * Created by Administrator on 2017/8/14.
     */

    public class MyaMapListener implements AMapLocationListener {
        MainPresenter mainPresenter;
        @Override
        public void onLocationChanged(AMapLocation amapLocation) {
            if (amapLocation != null) {
                if (amapLocation.getErrorCode() == 0) {
                    //可在其中解析amapLocation获取相应内容。
                }else {
                    //定位失败时，可通过ErrCode（错误码）信息来确定失败的原因，errInfo是错误信息，详见错误码表。
                    Log.e("AmapError","location Error, ErrCode:"
                            + amapLocation.getErrorCode() + ", errInfo:"
                            + amapLocation.getErrorInfo());
                    Toast.makeText(MainActivity.this, amapLocation.getErrorInfo(), Toast.LENGTH_SHORT).show();
                }
            }
            // Log.i(TAG, "onLocationChanged: "+amapLocation.getLocationType());
            //获取当前定位结果来源，如网络定位结果，详见定位类型表
            amapLocation.getLatitude();//获取纬度
            amapLocation.getLongitude();//获取经度
            amapLocation.getAccuracy();//获取精度信息
            amapLocation.getAddress();//地址，如果option中设置isNeedAddress为false，则没有此结果，网络定位结果中会有地址信息，GPS定位不返回地址信息。
            amapLocation.getCountry();//国家信息
            amapLocation.getProvince();//省信息
            amapLocation.getCity();//城市信息
            amapLocation.getDistrict();//城区信息
            amapLocation.getStreet();//街道信息
            amapLocation.getStreetNum();//街道门牌号信息
            amapLocation.getCityCode();//城市编码
            amapLocation.getAdCode();//地区编码
            amapLocation.getAoiName();//获取当前定位点的AOI信息
//        amapLocation.getBuildingId();//获取当前室内定位的建筑物Id
//        amapLocation.getFloor();//获取当前室内定位的楼层
            //  Log.i(TAG, "onLocationChanged: "+amapLocation.getAddress());
            if (TextUtils.isEmpty(amapLocation.getDistrict()))
            {
                location.put("position",amapLocation.getCity()+amapLocation.getDistrict()+amapLocation.getStreet()+amapLocation.getPoiName()+"附近");
            }else {
                location.put("position",amapLocation.getDistrict()+amapLocation.getStreet()+amapLocation.getPoiName()+"附近");

            }

            location.put("longitude",String.valueOf(amapLocation.getLongitude()));
            location.put("latitude",String.valueOf(amapLocation.getLatitude()));
            Log.i(TAG, "onLocationChanged: "+amapLocation.getLongitude()+amapLocation.getLatitude());


        }
    }


    /**
     * @author Administrator
     * @date 2017/7/19
     * @time 13:18
     * @describe 沉浸式状态栏
     */
    public void initWindows(int color) {
        Window window = getWindow();

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS
                    | WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
            window.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                    | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                    | View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            //设置状态栏颜色
            window.setStatusBarColor(color);
            //设置导航栏颜色
            window.setNavigationBarColor(color);
            ViewGroup contentView = ((ViewGroup) findViewById(android.R.id.content));
            View childAt = contentView.getChildAt(0);
            if (childAt != null) {
                childAt.setFitsSystemWindows(true);
            }
        } else if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            //透明状态栏
            window.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            //透明导航栏
            window.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
            //设置contentview为fitsSystemWindows
            ViewGroup contentView = (ViewGroup) findViewById(android.R.id.content);
            View childAt = contentView.getChildAt(0);
            if (childAt != null) {
                childAt.setFitsSystemWindows(true);
            }
            //给statusbar着色
            View view = new View(this);
            view.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, getStatusBarHeight(this)));
            view.setBackgroundColor(color);
            contentView.addView(view);

        }

    }

    /**
     * @author Administrator
     * @date 2017/7/19
     * @time 13:25
     * @describe 获取状态栏高度
     */
    private int getStatusBarHeight(Context context) {
        int resourceId = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        return context.getResources().getDimensionPixelSize(resourceId);
    }
}

