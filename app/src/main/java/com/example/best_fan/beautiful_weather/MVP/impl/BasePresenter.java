package com.example.best_fan.beautiful_weather.MVP.impl;

import android.content.Context;

/**
 * Created by Administrator on 2017/8/5.
 */

public class BasePresenter {
    Context mcontext;
    public  void attach(Context context){
        mcontext=context;
    }
    public void onPause(){}
    public void onResume(){}
    public void onDestory(){
        mcontext=null;
    }
}
