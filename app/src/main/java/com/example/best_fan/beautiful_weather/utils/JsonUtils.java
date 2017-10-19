package com.example.best_fan.beautiful_weather.utils;


import android.util.Log;

import com.alibaba.fastjson.JSON;
import com.example.best_fan.beautiful_weather.bean.ForecastBean;
import com.example.best_fan.beautiful_weather.bean.NowBean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/8/9.
 */

public class JsonUtils {
    NowBean nowBean;
    public  NowBean NowJson(String result){
        nowBean= JSON.parseObject(result,NowBean.class);
        return nowBean;
    }
    ForecastBean forecastBean;
    public ForecastBean ForecastJson(String result){
        forecastBean=JSON.parseObject(result,ForecastBean.class);
        return  forecastBean;
    }
}
