package com.example.best_fan.beautiful_weather;

import android.Manifest;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationClient;
import com.amap.api.location.AMapLocationClientOption;
import com.amap.api.location.AMapLocationListener;
import com.example.best_fan.beautiful_weather.adapter.WeatherAdapter;
import com.example.best_fan.beautiful_weather.adapter.AMapListener;
import com.yanzhenjie.permission.AndPermission;
import com.yanzhenjie.permission.PermissionListener;
import com.yanzhenjie.permission.SettingService;

import java.util.List;

public class Lanch_Aty extends AppCompatActivity {
    private static final int REQUEST_CODE_PERMISSION = 100;
    private WeatherAdapter weatherAdapter;
    //声明AMapLocationClient类对象
    public AMapLocationClient mLocationClient = null;
    //声明定位回调监听器
    public AMapLocationListener mLocationListener = new MyaMapListener();
    //声明AMapLocationClientOption对象
    public AMapLocationClientOption mLocationOption = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lanch__aty);
        init();
        AndPermission.with(Lanch_Aty.this)
                .requestCode(REQUEST_CODE_PERMISSION)
                .permission(
                        Manifest.permission.ACCESS_COARSE_LOCATION,
                        Manifest.permission.WRITE_EXTERNAL_STORAGE,
                        Manifest.permission.READ_EXTERNAL_STORAGE,
                        Manifest.permission.READ_PHONE_STATE)
                .callback(permissionListener)
                .start();


    }

    private void animatorStart() {
        //开始定位
        mLocationClient.startLocation();
        // 第一个参数－－－target:你要对哪个View绑定动画－－－今天我们要对ImageView绑定动画
        View target = findViewById(R.id.iv_bg);
        // 第二个参数－－－propertyName:你要执行什么动画－－－动画的属性名称
        // 缩放动画：scaleX
        // 渐变动画：
        // 第三个参数－－－动画变化范围（例如：缩放动画变化范围0.0-1.0之间）
        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(target, "alpha",
                0.1f, 1.0f);
        // 设置动画执行的时间（企业级开发标准：执行时间一般情况2-3秒钟）
        objectAnimator.setDuration(5000);
        // 启动动画
        objectAnimator.start();
    }

    private void init(){
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




    }
    public class MyaMapListener implements AMapLocationListener {
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
                    Toast.makeText(Lanch_Aty.this, amapLocation.getErrorInfo(), Toast.LENGTH_SHORT).show();
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

            Log.i("tag", "onLocationChanged: "+amapLocation.getLongitude()+amapLocation.getLatitude());


            Intent intent=new Intent(Lanch_Aty.this,MainActivity.class);
            if (TextUtils.isEmpty(amapLocation.getDistrict()))
            {
                intent.putExtra("position",amapLocation.getCity()+amapLocation.getDistrict()+amapLocation.getStreet()+amapLocation.getPoiName()+"附近");
            }else {
                intent.putExtra("position",amapLocation.getDistrict()+amapLocation.getStreet()+amapLocation.getPoiName()+"附近");

            }
            intent.putExtra("Longitude",String.valueOf(amapLocation.getLongitude()));
            intent.putExtra("Latitude",String.valueOf(amapLocation.getLatitude()));
            mLocationClient.stopLocation();//停止定位后，本地定位服务并不会被销毁
            startActivity(intent);


        }
    }
    /**
     *  @author Administrator
     *  @date   2017/10/19
     *  @time   16:23
     *  @describe 权限申请 监听回调
     */
    private PermissionListener permissionListener = new PermissionListener() {
        @Override
        public void onSucceed(int requestCode, @NonNull List<String> grantPermissions) {
            switch (requestCode) {
                case REQUEST_CODE_PERMISSION: {
                    //Toast.makeText(Lanch_Aty.this, "权限申请成功", Toast.LENGTH_SHORT).show();
                    //启动动画
                    animatorStart();
                    break;
                }
            }

        }

        @Override
        public void onFailed(int requestCode, @NonNull List<String> deniedPermissions) {
            switch (requestCode) {
                case REQUEST_CODE_PERMISSION: {
                    Toast.makeText(Lanch_Aty.this,"权限申请失败", Toast.LENGTH_SHORT).show();
                    break;
                }
            }
            // 用户否勾选了不再提示并且拒绝了权限，那么提示用户到设置中授权。
            if (AndPermission.hasAlwaysDeniedPermission(Lanch_Aty.this, deniedPermissions)) {

                // 第三种：自定义dialog样式。
                final SettingService settingService = AndPermission.defineSettingDialog(Lanch_Aty.this, 400);




                AlertDialog.Builder builder = new AlertDialog.Builder(Lanch_Aty.this);
                builder.setTitle("权限申请失败");
                builder.setMessage("我们需要的一些权限被您拒绝了或者系统发生错误导致申请失败，请您到设置页面手动授权，否则软件将无法正常运行");
                builder.setNegativeButton("退出软件", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // 你的dialog点击了取消调用：
                        System.exit(0);

                    }
                });
                builder.setPositiveButton("好，去设置", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // 你的dialog点击了确定调用：
                        settingService.execute();
                    }
                });
                AlertDialog dialog = builder.create();
                dialog.show();
            }


        }

    };


    @Override
    protected void onDestroy() {
        super.onDestroy();

        mLocationClient.onDestroy();//销毁定位客户端，同时销毁本地定位服务。
    }
}
