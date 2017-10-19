package com.example.best_fan.beautiful_weather.utils;

import android.animation.ObjectAnimator;
import android.view.View;

import java.util.Stack;

/**
 * Created by Administrator on 2017/8/11.
 */

public class AnimationUtils {
    public static void textAimation(View  view){
        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(view, "alpha",
                0.0f, 1.0f);
        // 设置动画执行的时间（企业级开发标准：执行时间一般情况2-3秒钟）
        objectAnimator.setDuration(1500);
        // 启动动画
        objectAnimator.start();

    }
}
