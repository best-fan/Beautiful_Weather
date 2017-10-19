package com.example.best_fan.beautiful_weather.bean;

import java.util.List;

/**
 * Created by Administrator on 2017/8/9.
 */

public class NowBean {


    /**
     * status : ok
     * lang : zh_CN
     * server_time : 1502273381
     * tzshift : 28800
     * location : [35.5712,114.5391]
     * unit : metric
     * result : {"status":"ok","temperature":31,"skycon":"CLEAR_DAY","cloudrate":0.01,"aqi":59,"humidity":0.39,"pm25":31,"precipitation":{"nearest":{"status":"ok","distance":2.08,"intensity":0.25},"local":{"status":"ok","intensity":0.0222,"datasource":"radar"}},"wind":{"direction":52.54,"speed":11.22}}
     */

    public String status;
    public String lang;
    public int server_time;

    public int tzshift;
    public String unit;
    public ResultBean result;
    public List<Double> location;

    public static class ResultBean {
        /**
         * status : ok
         * temperature : 31
         * skycon : CLEAR_DAY
         * cloudrate : 0.01
         * aqi : 59
         * humidity : 0.39
         * pm25 : 31
         * precipitation : {"nearest":{"status":"ok","distance":2.08,"intensity":0.25},"local":{"status":"ok","intensity":0.0222,"datasource":"radar"}}
         * wind : {"direction":52.54,"speed":11.22}
         */

        public String status;
        public int temperature;
        public String skycon;
        public double cloudrate;
        public int aqi;
        public double humidity;
        public int pm25;
        public PrecipitationBean precipitation;
        public WindBean wind;

        public static class PrecipitationBean {
            /**
             * nearest : {"status":"ok","distance":2.08,"intensity":0.25}
             * local : {"status":"ok","intensity":0.0222,"datasource":"radar"}
             */

            public NearestBean nearest;
            public LocalBean local;

            public static class NearestBean {
                /**
                 * status : ok
                 * distance : 2.08
                 * intensity : 0.25
                 */

                public String status;
                public double distance;
                public double intensity;
            }

            public static class LocalBean {
                /**
                 * status : ok
                 * intensity : 0.0222
                 * datasource : radar
                 */

                public String status;
                public double intensity;
                public String datasource;
            }
        }

        public static class WindBean {
            /**
             * direction : 52.54
             * speed : 11.22
             */

            public double direction;
            public double speed;
        }
    }
}
