package com.example.best_fan.beautiful_weather.MVP;

import com.example.best_fan.beautiful_weather.utils.ToastUtil;

/**
 * Created by Administrator on 2017/8/5.
 */

public interface MvpMainView extends MvpLoadingView,ToastUtil{


    void updatenowview();
    void updateforecastview();
}
