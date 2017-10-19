package com.example.best_fan.beautiful_weather.MVP.impl;


import android.os.Handler;
import android.util.Log;

import com.example.best_fan.beautiful_weather.MVP.MvpMainView;
import com.example.best_fan.beautiful_weather.bean.ForecastBean;
import com.example.best_fan.beautiful_weather.bean.NowBean;
import com.example.best_fan.beautiful_weather.utils.HttpUtil;
import com.example.best_fan.beautiful_weather.utils.JsonUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/8/5.
 */

public class MainPresenter extends BasePresenter{
    //实时天气状况接口
    String  str_url="https://api.caiyunapp.com/v2/vycYQJU3=3Z-0tOq/";
    //天气预报接口
    String nowurl,weatherurl;
    MvpMainView mvpMainView;
    NowBean nowbean;
    ForecastBean forecastBean;

    public NowBean getNowbean(){
        return  nowbean;
    }
    public ForecastBean getForecastBean(){
        return forecastBean;
    }


    public MainPresenter(MvpMainView mainView){
        mvpMainView=mainView;
    }

    public void GetPosition(Map<String, String> parm){
        if (parm==null){
            mvpMainView.showToast("定位失败");
        }else {
            nowurl=str_url+getparms(parm)+"realtime.json";
            weatherurl=str_url+getparms(parm)+"forecast.json?alert=true";
            sendHttp();

        }
    }
    private void sendHttp(){
        //
        HttpUtil httpUtil=new HttpUtil(new HttpUtil.HttpResponse() {

            @Override
            public void onSuccess(Object object) {
                String json=object.toString();
                 Log.i("tag", "onSuccess: "+json);
                 JsonUtils jsonutils=new JsonUtils();
                 nowbean=jsonutils.NowJson(json);
                 //解析数据
                mvpMainView.updatenowview();


            }

            @Override
            public void onFail(String error) {
                mvpMainView.showToast(error);
                Log.i("tag", "onFail: "+error);
                mvpMainView.hideLoagingView();

            }
        });
        httpUtil.sendGettHttp(nowurl);
        //
        HttpUtil http=new HttpUtil(new HttpUtil.HttpResponse() {
            @Override
            public void onSuccess(Object object) {
                String json=object.toString();
                JsonUtils jsonutils=new JsonUtils();
                forecastBean=jsonutils.ForecastJson(json);
                //解析数据
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Log.i("tag", "forecast: "+json);
                mvpMainView.updateforecastview();

            }

            @Override
            public void onFail(String error) {
                mvpMainView.showToast(error);
                mvpMainView.hideLoagingView();

            }
        });

        http.sendGettHttp(weatherurl);
    }

    //经纬度
    public String getparms(Map<String,String> pams){
        String str = null;
        str= pams.get("longitude")+","+pams.get("latitude")+"/";
        Log.i("tag", "getparms: "+str);
        return str;
    }


}
