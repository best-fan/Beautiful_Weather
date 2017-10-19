package com.example.best_fan.beautiful_weather.utils;

import android.graphics.Color;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Switch;

import com.example.best_fan.beautiful_weather.R;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2017/8/10.
 */

public class WeatherUtils {


    //天气状态
    public static String getweather(String infor){
        String weather = null;
        if (TextUtils.isEmpty(infor)) {

            weather="空";
        }else {
            switch (infor){
                case "CLEAR_DAY": weather="晴";
                    break;
                case "CLEAR_NIGHT":  weather= "晴";
                    break;
                case "PARTLY_CLOUDY_DAY":  weather= "多云";
                break;
                case "PARTLY_CLOUDY_NIGHT":  weather= "多云";
                break;
                case "CLOUDY":  weather= "阴天";
                break;
                case "RAIN":  weather= "雨";
                break;
                case "SNOW":  weather= "雪";
                break;
                case "WIND":  weather= "风";
                break;
                case "FOG":  weather= "雾";
                break;
                default:
                    weather="未知天气";


            }
        }
        return  weather;
    }
    //相对湿度
    public  static   String gethumidity(Double str){
        String[] strings=String.valueOf(str).split("\\.");
        strings[1]=strings[1]+"%";
        return   strings[1];
    }
    //风向
    public static   String getwind(Double db){
        String wind;
        if (db<45){
            if (db==0){
                wind="北风";
            }else {
                wind="东北风";
            }
        }else if (db>=45&&db<=90){
            if (db==90){
                wind="东风";
            }else {
                wind="东北风";

            }

        }else if ((db>90&&db<=180)){
            if (db==180){
               wind="南风";
            }else {
                wind="东南风";
            }
        }else if ((db>180&&db<=270)){
            if (db==270){
                wind="西风";
            }else {
                wind="西南风";
            }
        }
        else{
            wind="西北风";
        }
        return wind;
    }
    //更新时间
    public static String gettime(int createTime){
        try {
            Log.i("tag", "parseDate: "+createTime);
            //获取定位时间
            SimpleDateFormat df = new SimpleDateFormat("HH:mm");
            long lt = new Long(createTime);
            Date date = new Date(lt*1000);
            String time= df.format(date);
            return  time+"更新";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    //预警信息
    public static  String getalert(String str){
        //AA取01-16，分别表示：台风、暴雨、暴雪、寒潮、大风、沙尘暴、高温、干旱、
        // 雷电、冰雹、霜冻、大雾、霾、道路结冰、森林火灾、雷雨大风，
        // BB取01-04，分别表示：蓝色、黄色、橙色、红色
        String str1,str2;
        str1=str.substring(0,2);
        str2=str.substring(2,str.length());
//        Log.i("str", "str1: "+str1+str.length());
//        Log.i("str", "str1: "+str2);
        switch (str1){
            case "01": str1="台风"; break;
            case "02": str1="暴雨"; break;
            case "03": str1="暴雪"; break;
            case "04": str1="寒潮"; break;
            case "05": str1="大风"; break;
            case "06": str1="沙尘暴"; break;
            case "07": str1="高温";break;
            case "08": str1="干旱"; break;
            case "09": str1="雷电"; break;
            case "10": str1="冰雹"; break;
            case "11": str1="霜冻"; break;
            case "12": str1="大雾"; break;
            case "13": str1="霾"; break;
            case "14": str1="道路结冰"; break;
            case "15": str1="森林火灾"; break;
            case "16": str1="雷雨大风"; break;
          default:str1="未知";
        }
        switch (str2){
            case "01":str2="蓝色";break;
            case "02":str2="黄色";break;
            case "03":str2="橙色"; break;
            case "04":str2="红色";break;
        }
       // Log.i("tag", "getalert: "+str1+str2+"预警");
        return str1+str2+"预警";
    }
    //预警字体颜色
    public static String getcolor(String string){
        Log.i("tag", "getcolor: "+string);
        if (string.contains("蓝色")){
            return "#63B8FF";
        }else if (string.contains("黄色")){
            return "#f9ec57";
        }else if (string.contains("橙色")){
            return "#ffb90f";
        }else {
            return "#bc2421";
        }

    }
    public  static String getwindpower(Double doub){
        if (doub<1){
            return "无风";
        }else if (doub>=1&&doub<6){
            return "软风";

        }else if (doub>=6&&doub<12){
            return "轻风";

        }else if (doub>=12&&doub<20){
            return "微风";

        }else if (doub>=20&&doub<38){
            return "和风";

        }else if (doub>=38&&doub<61){
            return "强风";

        } else if (doub>=61&&doub<88){
            return "大风";

        }else if (doub>=89&&doub<117){
            return "暴风";

        }else {
            return "台风";
        }

    }
    /*
        获取空气质量
     */
    public static String getaqi(int aqi){

        if (aqi<=50){
            return "优";
        }else if (aqi>50&&aqi<=100){
            return "良";
        }else if (aqi>100&&aqi<=150){
            return "轻度";
        }else if (aqi>150&&aqi<=200){
            return "中度";
        }else if (aqi>200&&aqi<=300){
            return "重度";
        }else if (aqi>300){
            return "严重";
        }else {
            return "未知";
        }

    }
    /**
     *  @author Administrator
     *  @date   2017/8/14
     *  @time   20:15
     *  @describe 获取天气图片索引
     */
    public  static  int getimg(String value){
        switch (value){
            case "CLEAR_DAY": return 0;

            case "CLEAR_NIGHT": return 0;

            case "PARTLY_CLOUDY_DAY": return 1;

            case "PARTLY_CLOUDY_NIGHT":  return 1;

            case "CLOUDY":  return 2;

            case "RAIN": return 3;

            case "SNOW":  return 4;

            case "WIND": return 5;

            case "FOG": return 6;

            default:
              return 0;
        }
    }
    //获得星期
    public static String getWeek(String pTime) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String[] weekDays = {"","星期一", "星期二", "星期三", "星期四", "星期五", "星期六","星期日"};
        String week="";
        Calendar c = Calendar.getInstance();
        c.setTime(format.parse(pTime));
        int dayForWeek = 0;
        if(c.get(Calendar.DAY_OF_WEEK)==1){
            week=weekDays[7];
        }else{
            week =weekDays[ c.get(Calendar.DAY_OF_WEEK) - 1];
        }
        return week;
    }
    /**
     *  @author Administrator
     *  @date   2017/8/14
     *  @time   20:40
     *  @describe 温度拼接
     */
    public static  String getTemp(int max,int min){
        return min+"°~"+max+"°";
    }
}
