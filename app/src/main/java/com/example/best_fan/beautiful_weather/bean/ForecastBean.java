package com.example.best_fan.beautiful_weather.bean;

import java.util.List;

/**
 * Created by Administrator on 2017/8/12.
 */

public class ForecastBean {

    /**
     * status : ok
     * lang : zh_CN
     * result : {"hourly":{"status":"ok","description":"未来24小时晴","skycon":[{"value":"CLEAR_DAY","datetime":"2017-08-10 15:00"},{"value":"CLEAR_DAY","datetime":"2017-08-10 16:00"},{"value":"CLEAR_DAY","datetime":"2017-08-10 17:00"},{"value":"CLEAR_DAY","datetime":"2017-08-10 18:00"},{"value":"CLEAR_NIGHT","datetime":"2017-08-10 19:00"},{"value":"CLEAR_NIGHT","datetime":"2017-08-10 20:00"},{"value":"CLEAR_NIGHT","datetime":"2017-08-10 21:00"},{"value":"CLEAR_NIGHT","datetime":"2017-08-10 22:00"},{"value":"CLEAR_NIGHT","datetime":"2017-08-10 23:00"},{"value":"CLEAR_NIGHT","datetime":"2017-08-11 00:00"},{"value":"CLEAR_NIGHT","datetime":"2017-08-11 01:00"},{"value":"CLEAR_NIGHT","datetime":"2017-08-11 02:00"},{"value":"CLEAR_NIGHT","datetime":"2017-08-11 03:00"},{"value":"CLEAR_NIGHT","datetime":"2017-08-11 04:00"},{"value":"CLEAR_DAY","datetime":"2017-08-11 05:00"},{"value":"CLEAR_DAY","datetime":"2017-08-11 06:00"},{"value":"CLEAR_DAY","datetime":"2017-08-11 07:00"},{"value":"CLEAR_DAY","datetime":"2017-08-11 08:00"},{"value":"CLEAR_DAY","datetime":"2017-08-11 09:00"},{"value":"CLEAR_DAY","datetime":"2017-08-11 10:00"},{"value":"CLEAR_DAY","datetime":"2017-08-11 11:00"},{"value":"CLEAR_DAY","datetime":"2017-08-11 12:00"},{"value":"CLEAR_DAY","datetime":"2017-08-11 13:00"},{"value":"CLEAR_DAY","datetime":"2017-08-11 14:00"},{"value":"PARTLY_CLOUDY_DAY","datetime":"2017-08-11 15:00"},{"value":"PARTLY_CLOUDY_DAY","datetime":"2017-08-11 16:00"},{"value":"PARTLY_CLOUDY_DAY","datetime":"2017-08-11 17:00"},{"value":"CLOUDY","datetime":"2017-08-11 18:00"},{"value":"CLOUDY","datetime":"2017-08-11 19:00"},{"value":"CLOUDY","datetime":"2017-08-11 20:00"},{"value":"CLOUDY","datetime":"2017-08-11 21:00"},{"value":"CLOUDY","datetime":"2017-08-11 22:00"},{"value":"CLOUDY","datetime":"2017-08-11 23:00"},{"value":"CLOUDY","datetime":"2017-08-12 00:00"},{"value":"CLOUDY","datetime":"2017-08-12 01:00"},{"value":"CLOUDY","datetime":"2017-08-12 02:00"},{"value":"CLOUDY","datetime":"2017-08-12 03:00"},{"value":"CLOUDY","datetime":"2017-08-12 04:00"},{"value":"CLOUDY","datetime":"2017-08-12 05:00"},{"value":"CLOUDY","datetime":"2017-08-12 06:00"},{"value":"CLOUDY","datetime":"2017-08-12 07:00"},{"value":"CLOUDY","datetime":"2017-08-12 08:00"},{"value":"CLOUDY","datetime":"2017-08-12 09:00"},{"value":"CLOUDY","datetime":"2017-08-12 10:00"},{"value":"RAIN","datetime":"2017-08-12 11:00"},{"value":"RAIN","datetime":"2017-08-12 12:00"},{"value":"RAIN","datetime":"2017-08-12 13:00"},{"value":"RAIN","datetime":"2017-08-12 14:00"}],"cloudrate":[{"value":0,"datetime":"2017-08-10 15:00"},{"value":0,"datetime":"2017-08-10 16:00"},{"value":0,"datetime":"2017-08-10 17:00"},{"value":0,"datetime":"2017-08-10 18:00"},{"value":0,"datetime":"2017-08-10 19:00"},{"value":0,"datetime":"2017-08-10 20:00"},{"value":0,"datetime":"2017-08-10 21:00"},{"value":0,"datetime":"2017-08-10 22:00"},{"value":0,"datetime":"2017-08-10 23:00"},{"value":0,"datetime":"2017-08-11 00:00"},{"value":0,"datetime":"2017-08-11 01:00"},{"value":0,"datetime":"2017-08-11 02:00"},{"value":0,"datetime":"2017-08-11 03:00"},{"value":0,"datetime":"2017-08-11 04:00"},{"value":0,"datetime":"2017-08-11 05:00"},{"value":0,"datetime":"2017-08-11 06:00"},{"value":0,"datetime":"2017-08-11 07:00"},{"value":0,"datetime":"2017-08-11 08:00"},{"value":0.01,"datetime":"2017-08-11 09:00"},{"value":0.02,"datetime":"2017-08-11 10:00"},{"value":0,"datetime":"2017-08-11 11:00"},{"value":0,"datetime":"2017-08-11 12:00"},{"value":0,"datetime":"2017-08-11 13:00"},{"value":0,"datetime":"2017-08-11 14:00"},{"value":0.21,"datetime":"2017-08-11 15:00"},{"value":0.49,"datetime":"2017-08-11 16:00"},{"value":0.72,"datetime":"2017-08-11 17:00"},{"value":0.82,"datetime":"2017-08-11 18:00"},{"value":0.85,"datetime":"2017-08-11 19:00"},{"value":0.85,"datetime":"2017-08-11 20:00"},{"value":0.89,"datetime":"2017-08-11 21:00"},{"value":0.94,"datetime":"2017-08-11 22:00"},{"value":0.99,"datetime":"2017-08-11 23:00"},{"value":1,"datetime":"2017-08-12 00:00"},{"value":1,"datetime":"2017-08-12 01:00"},{"value":0.99,"datetime":"2017-08-12 02:00"},{"value":0.99,"datetime":"2017-08-12 03:00"},{"value":0.99,"datetime":"2017-08-12 04:00"},{"value":1,"datetime":"2017-08-12 05:00"},{"value":1,"datetime":"2017-08-12 06:00"},{"value":1,"datetime":"2017-08-12 07:00"},{"value":1,"datetime":"2017-08-12 08:00"},{"value":0.98,"datetime":"2017-08-12 09:00"},{"value":0.98,"datetime":"2017-08-12 10:00"},{"value":1,"datetime":"2017-08-12 11:00"},{"value":1,"datetime":"2017-08-12 12:00"},{"value":1,"datetime":"2017-08-12 13:00"},{"value":1,"datetime":"2017-08-12 14:00"}],"aqi":[{"value":59,"datetime":"2017-08-10 15:00"},{"value":42,"datetime":"2017-08-10 16:00"},{"value":41,"datetime":"2017-08-10 17:00"},{"value":42,"datetime":"2017-08-10 18:00"},{"value":43,"datetime":"2017-08-10 19:00"},{"value":45,"datetime":"2017-08-10 20:00"},{"value":49,"datetime":"2017-08-10 21:00"},{"value":53,"datetime":"2017-08-10 22:00"},{"value":57,"datetime":"2017-08-10 23:00"},{"value":61,"datetime":"2017-08-11 00:00"},{"value":63,"datetime":"2017-08-11 01:00"},{"value":63,"datetime":"2017-08-11 02:00"},{"value":63,"datetime":"2017-08-11 03:00"},{"value":63,"datetime":"2017-08-11 04:00"},{"value":63,"datetime":"2017-08-11 05:00"},{"value":64,"datetime":"2017-08-11 06:00"},{"value":67,"datetime":"2017-08-11 07:00"},{"value":69,"datetime":"2017-08-11 08:00"},{"value":71,"datetime":"2017-08-11 09:00"},{"value":69,"datetime":"2017-08-11 10:00"},{"value":67,"datetime":"2017-08-11 11:00"},{"value":62,"datetime":"2017-08-11 12:00"},{"value":56,"datetime":"2017-08-11 13:00"},{"value":50,"datetime":"2017-08-11 14:00"},{"value":46,"datetime":"2017-08-11 15:00"},{"value":43,"datetime":"2017-08-11 16:00"},{"value":42,"datetime":"2017-08-11 17:00"},{"value":43,"datetime":"2017-08-11 18:00"},{"value":46,"datetime":"2017-08-11 19:00"},{"value":50,"datetime":"2017-08-11 20:00"},{"value":53,"datetime":"2017-08-11 21:00"},{"value":56,"datetime":"2017-08-11 22:00"},{"value":57,"datetime":"2017-08-11 23:00"},{"value":58,"datetime":"2017-08-12 00:00"},{"value":62,"datetime":"2017-08-12 01:00"},{"value":64,"datetime":"2017-08-12 02:00"},{"value":67,"datetime":"2017-08-12 03:00"},{"value":69,"datetime":"2017-08-12 04:00"},{"value":71,"datetime":"2017-08-12 05:00"},{"value":72,"datetime":"2017-08-12 06:00"},{"value":73,"datetime":"2017-08-12 07:00"},{"value":72,"datetime":"2017-08-12 08:00"},{"value":71,"datetime":"2017-08-12 09:00"},{"value":67,"datetime":"2017-08-12 10:00"},{"value":63,"datetime":"2017-08-12 11:00"},{"value":61,"datetime":"2017-08-12 12:00"},{"value":61,"datetime":"2017-08-12 13:00"},{"value":62,"datetime":"2017-08-12 14:00"}],"humidity":[{"value":0.25,"datetime":"2017-08-10 15:00"},{"value":0.24,"datetime":"2017-08-10 16:00"},{"value":0.27,"datetime":"2017-08-10 17:00"},{"value":0.34,"datetime":"2017-08-10 18:00"},{"value":0.42,"datetime":"2017-08-10 19:00"},{"value":0.51,"datetime":"2017-08-10 20:00"},{"value":0.58,"datetime":"2017-08-10 21:00"},{"value":0.62,"datetime":"2017-08-10 22:00"},{"value":0.65,"datetime":"2017-08-10 23:00"},{"value":0.65,"datetime":"2017-08-11 00:00"},{"value":0.65,"datetime":"2017-08-11 01:00"},{"value":0.65,"datetime":"2017-08-11 02:00"},{"value":0.65,"datetime":"2017-08-11 03:00"},{"value":0.66,"datetime":"2017-08-11 04:00"},{"value":0.66,"datetime":"2017-08-11 05:00"},{"value":0.66,"datetime":"2017-08-11 06:00"},{"value":0.63,"datetime":"2017-08-11 07:00"},{"value":0.59,"datetime":"2017-08-11 08:00"},{"value":0.52,"datetime":"2017-08-11 09:00"},{"value":0.44,"datetime":"2017-08-11 10:00"},{"value":0.37,"datetime":"2017-08-11 11:00"},{"value":0.31,"datetime":"2017-08-11 12:00"},{"value":0.28,"datetime":"2017-08-11 13:00"},{"value":0.26,"datetime":"2017-08-11 14:00"},{"value":0.25,"datetime":"2017-08-11 15:00"},{"value":0.27,"datetime":"2017-08-11 16:00"},{"value":0.31,"datetime":"2017-08-11 17:00"},{"value":0.38,"datetime":"2017-08-11 18:00"},{"value":0.47,"datetime":"2017-08-11 19:00"},{"value":0.56,"datetime":"2017-08-11 20:00"},{"value":0.63,"datetime":"2017-08-11 21:00"},{"value":0.7,"datetime":"2017-08-11 22:00"},{"value":0.75,"datetime":"2017-08-11 23:00"},{"value":0.78,"datetime":"2017-08-12 00:00"},{"value":0.8,"datetime":"2017-08-12 01:00"},{"value":0.81,"datetime":"2017-08-12 02:00"},{"value":0.81,"datetime":"2017-08-12 03:00"},{"value":0.8,"datetime":"2017-08-12 04:00"},{"value":0.78,"datetime":"2017-08-12 05:00"},{"value":0.75,"datetime":"2017-08-12 06:00"},{"value":0.71,"datetime":"2017-08-12 07:00"},{"value":0.68,"datetime":"2017-08-12 08:00"},{"value":0.67,"datetime":"2017-08-12 09:00"},{"value":0.67,"datetime":"2017-08-12 10:00"},{"value":0.68,"datetime":"2017-08-12 11:00"},{"value":0.68,"datetime":"2017-08-12 12:00"},{"value":0.68,"datetime":"2017-08-12 13:00"},{"value":0.64,"datetime":"2017-08-12 14:00"}],"pm25":[{"value":31,"datetime":"2017-08-10 15:00"},{"value":29,"datetime":"2017-08-10 16:00"},{"value":28,"datetime":"2017-08-10 17:00"},{"value":29,"datetime":"2017-08-10 18:00"},{"value":30,"datetime":"2017-08-10 19:00"},{"value":31,"datetime":"2017-08-10 20:00"},{"value":34,"datetime":"2017-08-10 21:00"},{"value":37,"datetime":"2017-08-10 22:00"},{"value":40,"datetime":"2017-08-10 23:00"},{"value":43,"datetime":"2017-08-11 00:00"},{"value":45,"datetime":"2017-08-11 01:00"},{"value":45,"datetime":"2017-08-11 02:00"},{"value":45,"datetime":"2017-08-11 03:00"},{"value":45,"datetime":"2017-08-11 04:00"},{"value":45,"datetime":"2017-08-11 05:00"},{"value":46,"datetime":"2017-08-11 06:00"},{"value":48,"datetime":"2017-08-11 07:00"},{"value":50,"datetime":"2017-08-11 08:00"},{"value":51,"datetime":"2017-08-11 09:00"},{"value":50,"datetime":"2017-08-11 10:00"},{"value":48,"datetime":"2017-08-11 11:00"},{"value":44,"datetime":"2017-08-11 12:00"},{"value":39,"datetime":"2017-08-11 13:00"},{"value":35,"datetime":"2017-08-11 14:00"},{"value":32,"datetime":"2017-08-11 15:00"},{"value":30,"datetime":"2017-08-11 16:00"},{"value":29,"datetime":"2017-08-11 17:00"},{"value":30,"datetime":"2017-08-11 18:00"},{"value":32,"datetime":"2017-08-11 19:00"},{"value":35,"datetime":"2017-08-11 20:00"},{"value":37,"datetime":"2017-08-11 21:00"},{"value":39,"datetime":"2017-08-11 22:00"},{"value":40,"datetime":"2017-08-11 23:00"},{"value":41,"datetime":"2017-08-12 00:00"},{"value":44,"datetime":"2017-08-12 01:00"},{"value":46,"datetime":"2017-08-12 02:00"},{"value":48,"datetime":"2017-08-12 03:00"},{"value":50,"datetime":"2017-08-12 04:00"},{"value":51,"datetime":"2017-08-12 05:00"},{"value":52,"datetime":"2017-08-12 06:00"},{"value":53,"datetime":"2017-08-12 07:00"},{"value":52,"datetime":"2017-08-12 08:00"},{"value":51,"datetime":"2017-08-12 09:00"},{"value":48,"datetime":"2017-08-12 10:00"},{"value":45,"datetime":"2017-08-12 11:00"},{"value":43,"datetime":"2017-08-12 12:00"},{"value":43,"datetime":"2017-08-12 13:00"},{"value":44,"datetime":"2017-08-12 14:00"}],"precipitation":[{"value":0,"datetime":"2017-08-10 15:00"},{"value":0,"datetime":"2017-08-10 16:00"},{"value":0,"datetime":"2017-08-10 17:00"},{"value":0,"datetime":"2017-08-10 18:00"},{"value":0,"datetime":"2017-08-10 19:00"},{"value":0,"datetime":"2017-08-10 20:00"},{"value":0,"datetime":"2017-08-10 21:00"},{"value":0,"datetime":"2017-08-10 22:00"},{"value":0,"datetime":"2017-08-10 23:00"},{"value":0,"datetime":"2017-08-11 00:00"},{"value":0,"datetime":"2017-08-11 01:00"},{"value":0,"datetime":"2017-08-11 02:00"},{"value":0,"datetime":"2017-08-11 03:00"},{"value":0,"datetime":"2017-08-11 04:00"},{"value":0,"datetime":"2017-08-11 05:00"},{"value":0,"datetime":"2017-08-11 06:00"},{"value":0,"datetime":"2017-08-11 07:00"},{"value":0,"datetime":"2017-08-11 08:00"},{"value":0,"datetime":"2017-08-11 09:00"},{"value":0,"datetime":"2017-08-11 10:00"},{"value":0,"datetime":"2017-08-11 11:00"},{"value":0,"datetime":"2017-08-11 12:00"},{"value":0,"datetime":"2017-08-11 13:00"},{"value":0,"datetime":"2017-08-11 14:00"},{"value":0,"datetime":"2017-08-11 15:00"},{"value":0,"datetime":"2017-08-11 16:00"},{"value":0,"datetime":"2017-08-11 17:00"},{"value":0,"datetime":"2017-08-11 18:00"},{"value":0,"datetime":"2017-08-11 19:00"},{"value":0,"datetime":"2017-08-11 20:00"},{"value":0,"datetime":"2017-08-11 21:00"},{"value":0,"datetime":"2017-08-11 22:00"},{"value":0.0441,"datetime":"2017-08-11 23:00"},{"value":0.0433,"datetime":"2017-08-12 00:00"},{"value":0,"datetime":"2017-08-12 01:00"},{"value":0,"datetime":"2017-08-12 02:00"},{"value":0,"datetime":"2017-08-12 03:00"},{"value":0,"datetime":"2017-08-12 04:00"},{"value":0,"datetime":"2017-08-12 05:00"},{"value":0,"datetime":"2017-08-12 06:00"},{"value":0,"datetime":"2017-08-12 07:00"},{"value":0,"datetime":"2017-08-12 08:00"},{"value":0,"datetime":"2017-08-12 09:00"},{"value":0.0515,"datetime":"2017-08-12 10:00"},{"value":0.0868,"datetime":"2017-08-12 11:00"},{"value":0.1203,"datetime":"2017-08-12 12:00"},{"value":0.1405,"datetime":"2017-08-12 13:00"},{"value":0.1346,"datetime":"2017-08-12 14:00"}],"wind":[{"direction":151.82,"speed":9.86,"datetime":"2017-08-10 15:00"},{"direction":144.94,"speed":10.26,"datetime":"2017-08-10 16:00"},{"direction":139.74,"speed":11.39,"datetime":"2017-08-10 17:00"},{"direction":139.01,"speed":13.35,"datetime":"2017-08-10 18:00"},{"direction":141.4,"speed":15.35,"datetime":"2017-08-10 19:00"},{"direction":145.78,"speed":16.48,"datetime":"2017-08-10 20:00"},{"direction":152.38,"speed":16.18,"datetime":"2017-08-10 21:00"},{"direction":161.02,"speed":15.12,"datetime":"2017-08-10 22:00"},{"direction":170.2,"speed":14.09,"datetime":"2017-08-10 23:00"},{"direction":177.28,"speed":13.43,"datetime":"2017-08-11 00:00"},{"direction":181.61,"speed":12.96,"datetime":"2017-08-11 01:00"},{"direction":183.63,"speed":12.53,"datetime":"2017-08-11 02:00"},{"direction":183.95,"speed":12.13,"datetime":"2017-08-11 03:00"},{"direction":183.44,"speed":11.82,"datetime":"2017-08-11 04:00"},{"direction":183.1,"speed":11.7,"datetime":"2017-08-11 05:00"},{"direction":183.7,"speed":11.85,"datetime":"2017-08-11 06:00"},{"direction":184.64,"speed":12.29,"datetime":"2017-08-11 07:00"},{"direction":185.04,"speed":13.02,"datetime":"2017-08-11 08:00"},{"direction":184.27,"speed":13.98,"datetime":"2017-08-11 09:00"},{"direction":182,"speed":14.94,"datetime":"2017-08-11 10:00"},{"direction":177.91,"speed":15.63,"datetime":"2017-08-11 11:00"},{"direction":171.64,"speed":15.98,"datetime":"2017-08-11 12:00"},{"direction":163.94,"speed":16.4,"datetime":"2017-08-11 13:00"},{"direction":156.35,"speed":17.28,"datetime":"2017-08-11 14:00"},{"direction":150.6,"speed":18.7,"datetime":"2017-08-11 15:00"},{"direction":147.85,"speed":20.24,"datetime":"2017-08-11 16:00"},{"direction":148.63,"speed":21.4,"datetime":"2017-08-11 17:00"},{"direction":153.03,"speed":21.9,"datetime":"2017-08-11 18:00"},{"direction":159.37,"speed":21.85,"datetime":"2017-08-11 19:00"},{"direction":165.83,"speed":21.19,"datetime":"2017-08-11 20:00"},{"direction":171.13,"speed":19.72,"datetime":"2017-08-11 21:00"},{"direction":175.41,"speed":17.7,"datetime":"2017-08-11 22:00"},{"direction":178.74,"speed":15.55,"datetime":"2017-08-11 23:00"},{"direction":180.88,"speed":13.65,"datetime":"2017-08-12 00:00"},{"direction":182.41,"speed":11.93,"datetime":"2017-08-12 01:00"},{"direction":184.78,"speed":10.26,"datetime":"2017-08-12 02:00"},{"direction":189.72,"speed":8.67,"datetime":"2017-08-12 03:00"},{"direction":195.2,"speed":7.58,"datetime":"2017-08-12 04:00"},{"direction":195.43,"speed":7.34,"datetime":"2017-08-12 05:00"},{"direction":187.44,"speed":8.17,"datetime":"2017-08-12 06:00"},{"direction":177.91,"speed":9.5,"datetime":"2017-08-12 07:00"},{"direction":170.21,"speed":10.22,"datetime":"2017-08-12 08:00"},{"direction":162.91,"speed":9.42,"datetime":"2017-08-12 09:00"},{"direction":150.94,"speed":7.83,"datetime":"2017-08-12 10:00"},{"direction":129.76,"speed":7,"datetime":"2017-08-12 11:00"},{"direction":108.72,"speed":8.25,"datetime":"2017-08-12 12:00"},{"direction":98.19,"speed":10.58,"datetime":"2017-08-12 13:00"},{"direction":94.85,"speed":12.55,"datetime":"2017-08-12 14:00"}],"temperature":[{"value":33,"datetime":"2017-08-10 15:00"},{"value":33.5,"datetime":"2017-08-10 16:00"},{"value":34,"datetime":"2017-08-10 17:00"},{"value":31.5,"datetime":"2017-08-10 18:00"},{"value":30,"datetime":"2017-08-10 19:00"},{"value":27.1,"datetime":"2017-08-10 20:00"},{"value":27.2,"datetime":"2017-08-10 21:00"},{"value":26.8,"datetime":"2017-08-10 22:00"},{"value":25.8,"datetime":"2017-08-10 23:00"},{"value":25.5,"datetime":"2017-08-11 00:00"},{"value":24.8,"datetime":"2017-08-11 01:00"},{"value":24.3,"datetime":"2017-08-11 02:00"},{"value":24.2,"datetime":"2017-08-11 03:00"},{"value":24.1,"datetime":"2017-08-11 04:00"},{"value":24,"datetime":"2017-08-11 05:00"},{"value":24.1,"datetime":"2017-08-11 06:00"},{"value":25.6,"datetime":"2017-08-11 07:00"},{"value":27,"datetime":"2017-08-11 08:00"},{"value":28.5,"datetime":"2017-08-11 09:00"},{"value":30,"datetime":"2017-08-11 10:00"},{"value":31.6,"datetime":"2017-08-11 11:00"},{"value":32.9,"datetime":"2017-08-11 12:00"},{"value":34.3,"datetime":"2017-08-11 13:00"},{"value":35.7,"datetime":"2017-08-11 14:00"},{"value":37,"datetime":"2017-08-11 15:00"},{"value":37,"datetime":"2017-08-11 16:00"},{"value":37,"datetime":"2017-08-11 17:00"},{"value":36.89,"datetime":"2017-08-11 18:00"},{"value":36.2,"datetime":"2017-08-11 19:00"},{"value":35.11,"datetime":"2017-08-11 20:00"},{"value":33.81,"datetime":"2017-08-11 21:00"},{"value":32.4,"datetime":"2017-08-11 22:00"},{"value":30.94,"datetime":"2017-08-11 23:00"},{"value":29.45,"datetime":"2017-08-12 00:00"},{"value":27.93,"datetime":"2017-08-12 01:00"},{"value":26.42,"datetime":"2017-08-12 02:00"},{"value":26.05,"datetime":"2017-08-12 03:00"},{"value":25.89,"datetime":"2017-08-12 04:00"},{"value":26.09,"datetime":"2017-08-12 05:00"},{"value":26.69,"datetime":"2017-08-12 06:00"},{"value":27.49,"datetime":"2017-08-12 07:00"},{"value":28.68,"datetime":"2017-08-12 08:00"},{"value":29.49,"datetime":"2017-08-12 09:00"},{"value":30.03,"datetime":"2017-08-12 10:00"},{"value":30.44,"datetime":"2017-08-12 11:00"},{"value":30.83,"datetime":"2017-08-12 12:00"},{"value":31.32,"datetime":"2017-08-12 13:00"},{"value":31.37,"datetime":"2017-08-12 14:00"}]},"alert":{"status":"ok","content":[{"province":"河南","status":"预警中","code":"0501","description":"安阳市气象台2017年8月9日16时15分发布雷暴大风蓝色预警信号：预计未来3小时内，我市受雷暴大风影响，局部地区阵风风力达7级以上，局地伴有短时强降水和冰雹等强对流天气，请注意防范。","alertId":"41050041600000_20170809161408","city":"安阳","pubtimestamp":1502265600,"latlon":[36.103442,114.352482],"county":"安阳","request_status":"ok","location":"河南安阳安阳","title":"河南省安阳市气象台发布蓝色雷暴大风预警","regionId":"101180201"}]},"minutely":{"status":"ok","description":"未来两小时不会下雨，放心出门吧","probability":[0.066013962,0.0913456678,0.1362040639,0.1477408707],"datasource":"radar","precipitation_2h":[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0],"precipitation":[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]},"daily":{"status":"ok","coldRisk":[{"index":"4","desc":"极易发","datetime":"2017-08-10"},{"index":"4","desc":"极易发","datetime":"2017-08-11"},{"index":"4","desc":"极易发","datetime":"2017-08-12"},{"index":"4","desc":"极易发","datetime":"2017-08-13"},{"index":"4","desc":"极易发","datetime":"2017-08-14"}],"temperature":[{"date":"2017-08-10","max":34,"avg":29.88,"min":23},{"date":"2017-08-11","max":37,"avg":30.54,"min":24},{"date":"2017-08-12","max":33,"avg":28.74,"min":23.6},{"date":"2017-08-13","max":32,"avg":27.17,"min":23},{"date":"2017-08-14","max":33,"avg":28.05,"min":23}],"skycon":[{"date":"2017-08-10","value":"CLEAR_DAY"},{"date":"2017-08-11","value":"PARTLY_CLOUDY_DAY"},{"date":"2017-08-12","value":"PARTLY_CLOUDY_DAY"},{"date":"2017-08-13","value":"CLEAR_DAY"},{"date":"2017-08-14","value":"CLEAR_DAY"}],"cloudrate":[{"date":"2017-08-10","max":0,"avg":0,"min":0},{"date":"2017-08-11","max":0.99,"avg":0.28,"min":0},{"date":"2017-08-12","max":1,"avg":0.7,"min":0.05},{"date":"2017-08-13","max":0.61,"avg":0.18,"min":0},{"date":"2017-08-14","max":0.02,"avg":0,"min":0}],"aqi":[{"date":"2017-08-10","max":59,"avg":47.89,"min":41},{"date":"2017-08-11","max":71,"avg":57.79,"min":42},{"date":"2017-08-12","max":73,"avg":61.08,"min":46},{"date":"2017-08-13","max":69,"avg":59.21,"min":50},{"date":"2017-08-14","max":75,"avg":63.58,"min":53}],"humidity":[{"date":"2017-08-10","max":0.65,"avg":0.43,"min":0.24},{"date":"2017-08-11","max":0.75,"avg":0.51,"min":0.25},{"date":"2017-08-12","max":0.81,"avg":0.68,"min":0.46},{"date":"2017-08-13","max":0.78,"avg":0.6,"min":0.38},{"date":"2017-08-14","max":0.81,"avg":0.59,"min":0.31}],"astro":[{"date":"2017-08-10","sunset":{"time":"19:17"},"sunrise":{"time":"05:37"}},{"date":"2017-08-11","sunset":{"time":"19:16"},"sunrise":{"time":"05:37"}},{"date":"2017-08-12","sunset":{"time":"19:15"},"sunrise":{"time":"05:38"}},{"date":"2017-08-13","sunset":{"time":"19:14"},"sunrise":{"time":"05:39"}},{"date":"2017-08-14","sunset":{"time":"19:12"},"sunrise":{"time":"05:40"}}],"ultraviolet":[{"index":"4","desc":"强","datetime":"2017-08-10"},{"index":"4","desc":"强","datetime":"2017-08-11"},{"index":"1","desc":"最弱","datetime":"2017-08-12"},{"index":"4","desc":"强","datetime":"2017-08-13"},{"index":"4","desc":"强","datetime":"2017-08-14"}],"pm25":[{"date":"2017-08-10","max":40,"avg":32.11,"min":28},{"date":"2017-08-11","max":51,"avg":40.96,"min":29},{"date":"2017-08-12","max":53,"avg":43.42,"min":32},{"date":"2017-08-13","max":50,"avg":41.88,"min":35},{"date":"2017-08-14","max":55,"avg":45.38,"min":37}],"dressing":[{"index":"2","desc":"很热","datetime":"2017-08-10"},{"index":"3","desc":"热","datetime":"2017-08-11"},{"index":"2","desc":"很热","datetime":"2017-08-12"},{"index":"2","desc":"很热","datetime":"2017-08-13"},{"index":"2","desc":"很热","datetime":"2017-08-14"}],"carWashing":[{"index":"1","desc":"适宜","datetime":"2017-08-10"},{"index":"3","desc":"较不适宜","datetime":"2017-08-11"},{"index":"3","desc":"较不适宜","datetime":"2017-08-12"},{"index":"1","desc":"适宜","datetime":"2017-08-13"},{"index":"1","desc":"适宜","datetime":"2017-08-14"}],"precipitation":[{"date":"2017-08-10","max":0,"avg":0,"min":0},{"date":"2017-08-11","max":0.0441,"avg":0.0018,"min":0},{"date":"2017-08-12","max":0.1405,"avg":0.0298,"min":0},{"date":"2017-08-13","max":0,"avg":0,"min":0},{"date":"2017-08-14","max":0,"avg":0,"min":0}],"wind":[{"date":"2017-08-10","max":{"direction":145.78,"speed":16.48},"avg":{"direction":164.12,"speed":8.82},"min":{"direction":156.94,"speed":2.53}},{"date":"2017-08-11","max":{"direction":153.03,"speed":21.9},"avg":{"direction":169.85,"speed":16.01},"min":{"direction":183.1,"speed":11.7}},{"date":"2017-08-12","max":{"direction":180.88,"speed":13.65},"avg":{"direction":139.12,"speed":9.83},"min":{"direction":203.94,"speed":3}},{"date":"2017-08-13","max":{"direction":18.22,"speed":18.21},"avg":{"direction":19.39,"speed":11.58},"min":{"direction":94.42,"speed":2.49}},{"date":"2017-08-14","max":{"direction":16.24,"speed":19.18},"avg":{"direction":27.48,"speed":11.31},"min":{"direction":335.81,"speed":0.98}}]},"primary":0}
     * server_time : 1502351336
     * api_status : active
     * tzshift : 28800
     * api_version : v2.2
     * unit : metric
     * location : [35.5712,114.5391]
     */

    public String status;
    public String lang;
    public ResultBean result;
    public int server_time;
    public String api_status;
    public int tzshift;
    public String api_version;
    public String unit;
    public List<Double> location;

    public static class ResultBean {
        /**
         * hourly : {"status":"ok","description":"未来24小时晴","skycon":[{"value":"CLEAR_DAY","datetime":"2017-08-10 15:00"},{"value":"CLEAR_DAY","datetime":"2017-08-10 16:00"},{"value":"CLEAR_DAY","datetime":"2017-08-10 17:00"},{"value":"CLEAR_DAY","datetime":"2017-08-10 18:00"},{"value":"CLEAR_NIGHT","datetime":"2017-08-10 19:00"},{"value":"CLEAR_NIGHT","datetime":"2017-08-10 20:00"},{"value":"CLEAR_NIGHT","datetime":"2017-08-10 21:00"},{"value":"CLEAR_NIGHT","datetime":"2017-08-10 22:00"},{"value":"CLEAR_NIGHT","datetime":"2017-08-10 23:00"},{"value":"CLEAR_NIGHT","datetime":"2017-08-11 00:00"},{"value":"CLEAR_NIGHT","datetime":"2017-08-11 01:00"},{"value":"CLEAR_NIGHT","datetime":"2017-08-11 02:00"},{"value":"CLEAR_NIGHT","datetime":"2017-08-11 03:00"},{"value":"CLEAR_NIGHT","datetime":"2017-08-11 04:00"},{"value":"CLEAR_DAY","datetime":"2017-08-11 05:00"},{"value":"CLEAR_DAY","datetime":"2017-08-11 06:00"},{"value":"CLEAR_DAY","datetime":"2017-08-11 07:00"},{"value":"CLEAR_DAY","datetime":"2017-08-11 08:00"},{"value":"CLEAR_DAY","datetime":"2017-08-11 09:00"},{"value":"CLEAR_DAY","datetime":"2017-08-11 10:00"},{"value":"CLEAR_DAY","datetime":"2017-08-11 11:00"},{"value":"CLEAR_DAY","datetime":"2017-08-11 12:00"},{"value":"CLEAR_DAY","datetime":"2017-08-11 13:00"},{"value":"CLEAR_DAY","datetime":"2017-08-11 14:00"},{"value":"PARTLY_CLOUDY_DAY","datetime":"2017-08-11 15:00"},{"value":"PARTLY_CLOUDY_DAY","datetime":"2017-08-11 16:00"},{"value":"PARTLY_CLOUDY_DAY","datetime":"2017-08-11 17:00"},{"value":"CLOUDY","datetime":"2017-08-11 18:00"},{"value":"CLOUDY","datetime":"2017-08-11 19:00"},{"value":"CLOUDY","datetime":"2017-08-11 20:00"},{"value":"CLOUDY","datetime":"2017-08-11 21:00"},{"value":"CLOUDY","datetime":"2017-08-11 22:00"},{"value":"CLOUDY","datetime":"2017-08-11 23:00"},{"value":"CLOUDY","datetime":"2017-08-12 00:00"},{"value":"CLOUDY","datetime":"2017-08-12 01:00"},{"value":"CLOUDY","datetime":"2017-08-12 02:00"},{"value":"CLOUDY","datetime":"2017-08-12 03:00"},{"value":"CLOUDY","datetime":"2017-08-12 04:00"},{"value":"CLOUDY","datetime":"2017-08-12 05:00"},{"value":"CLOUDY","datetime":"2017-08-12 06:00"},{"value":"CLOUDY","datetime":"2017-08-12 07:00"},{"value":"CLOUDY","datetime":"2017-08-12 08:00"},{"value":"CLOUDY","datetime":"2017-08-12 09:00"},{"value":"CLOUDY","datetime":"2017-08-12 10:00"},{"value":"RAIN","datetime":"2017-08-12 11:00"},{"value":"RAIN","datetime":"2017-08-12 12:00"},{"value":"RAIN","datetime":"2017-08-12 13:00"},{"value":"RAIN","datetime":"2017-08-12 14:00"}],"cloudrate":[{"value":0,"datetime":"2017-08-10 15:00"},{"value":0,"datetime":"2017-08-10 16:00"},{"value":0,"datetime":"2017-08-10 17:00"},{"value":0,"datetime":"2017-08-10 18:00"},{"value":0,"datetime":"2017-08-10 19:00"},{"value":0,"datetime":"2017-08-10 20:00"},{"value":0,"datetime":"2017-08-10 21:00"},{"value":0,"datetime":"2017-08-10 22:00"},{"value":0,"datetime":"2017-08-10 23:00"},{"value":0,"datetime":"2017-08-11 00:00"},{"value":0,"datetime":"2017-08-11 01:00"},{"value":0,"datetime":"2017-08-11 02:00"},{"value":0,"datetime":"2017-08-11 03:00"},{"value":0,"datetime":"2017-08-11 04:00"},{"value":0,"datetime":"2017-08-11 05:00"},{"value":0,"datetime":"2017-08-11 06:00"},{"value":0,"datetime":"2017-08-11 07:00"},{"value":0,"datetime":"2017-08-11 08:00"},{"value":0.01,"datetime":"2017-08-11 09:00"},{"value":0.02,"datetime":"2017-08-11 10:00"},{"value":0,"datetime":"2017-08-11 11:00"},{"value":0,"datetime":"2017-08-11 12:00"},{"value":0,"datetime":"2017-08-11 13:00"},{"value":0,"datetime":"2017-08-11 14:00"},{"value":0.21,"datetime":"2017-08-11 15:00"},{"value":0.49,"datetime":"2017-08-11 16:00"},{"value":0.72,"datetime":"2017-08-11 17:00"},{"value":0.82,"datetime":"2017-08-11 18:00"},{"value":0.85,"datetime":"2017-08-11 19:00"},{"value":0.85,"datetime":"2017-08-11 20:00"},{"value":0.89,"datetime":"2017-08-11 21:00"},{"value":0.94,"datetime":"2017-08-11 22:00"},{"value":0.99,"datetime":"2017-08-11 23:00"},{"value":1,"datetime":"2017-08-12 00:00"},{"value":1,"datetime":"2017-08-12 01:00"},{"value":0.99,"datetime":"2017-08-12 02:00"},{"value":0.99,"datetime":"2017-08-12 03:00"},{"value":0.99,"datetime":"2017-08-12 04:00"},{"value":1,"datetime":"2017-08-12 05:00"},{"value":1,"datetime":"2017-08-12 06:00"},{"value":1,"datetime":"2017-08-12 07:00"},{"value":1,"datetime":"2017-08-12 08:00"},{"value":0.98,"datetime":"2017-08-12 09:00"},{"value":0.98,"datetime":"2017-08-12 10:00"},{"value":1,"datetime":"2017-08-12 11:00"},{"value":1,"datetime":"2017-08-12 12:00"},{"value":1,"datetime":"2017-08-12 13:00"},{"value":1,"datetime":"2017-08-12 14:00"}],"aqi":[{"value":59,"datetime":"2017-08-10 15:00"},{"value":42,"datetime":"2017-08-10 16:00"},{"value":41,"datetime":"2017-08-10 17:00"},{"value":42,"datetime":"2017-08-10 18:00"},{"value":43,"datetime":"2017-08-10 19:00"},{"value":45,"datetime":"2017-08-10 20:00"},{"value":49,"datetime":"2017-08-10 21:00"},{"value":53,"datetime":"2017-08-10 22:00"},{"value":57,"datetime":"2017-08-10 23:00"},{"value":61,"datetime":"2017-08-11 00:00"},{"value":63,"datetime":"2017-08-11 01:00"},{"value":63,"datetime":"2017-08-11 02:00"},{"value":63,"datetime":"2017-08-11 03:00"},{"value":63,"datetime":"2017-08-11 04:00"},{"value":63,"datetime":"2017-08-11 05:00"},{"value":64,"datetime":"2017-08-11 06:00"},{"value":67,"datetime":"2017-08-11 07:00"},{"value":69,"datetime":"2017-08-11 08:00"},{"value":71,"datetime":"2017-08-11 09:00"},{"value":69,"datetime":"2017-08-11 10:00"},{"value":67,"datetime":"2017-08-11 11:00"},{"value":62,"datetime":"2017-08-11 12:00"},{"value":56,"datetime":"2017-08-11 13:00"},{"value":50,"datetime":"2017-08-11 14:00"},{"value":46,"datetime":"2017-08-11 15:00"},{"value":43,"datetime":"2017-08-11 16:00"},{"value":42,"datetime":"2017-08-11 17:00"},{"value":43,"datetime":"2017-08-11 18:00"},{"value":46,"datetime":"2017-08-11 19:00"},{"value":50,"datetime":"2017-08-11 20:00"},{"value":53,"datetime":"2017-08-11 21:00"},{"value":56,"datetime":"2017-08-11 22:00"},{"value":57,"datetime":"2017-08-11 23:00"},{"value":58,"datetime":"2017-08-12 00:00"},{"value":62,"datetime":"2017-08-12 01:00"},{"value":64,"datetime":"2017-08-12 02:00"},{"value":67,"datetime":"2017-08-12 03:00"},{"value":69,"datetime":"2017-08-12 04:00"},{"value":71,"datetime":"2017-08-12 05:00"},{"value":72,"datetime":"2017-08-12 06:00"},{"value":73,"datetime":"2017-08-12 07:00"},{"value":72,"datetime":"2017-08-12 08:00"},{"value":71,"datetime":"2017-08-12 09:00"},{"value":67,"datetime":"2017-08-12 10:00"},{"value":63,"datetime":"2017-08-12 11:00"},{"value":61,"datetime":"2017-08-12 12:00"},{"value":61,"datetime":"2017-08-12 13:00"},{"value":62,"datetime":"2017-08-12 14:00"}],"humidity":[{"value":0.25,"datetime":"2017-08-10 15:00"},{"value":0.24,"datetime":"2017-08-10 16:00"},{"value":0.27,"datetime":"2017-08-10 17:00"},{"value":0.34,"datetime":"2017-08-10 18:00"},{"value":0.42,"datetime":"2017-08-10 19:00"},{"value":0.51,"datetime":"2017-08-10 20:00"},{"value":0.58,"datetime":"2017-08-10 21:00"},{"value":0.62,"datetime":"2017-08-10 22:00"},{"value":0.65,"datetime":"2017-08-10 23:00"},{"value":0.65,"datetime":"2017-08-11 00:00"},{"value":0.65,"datetime":"2017-08-11 01:00"},{"value":0.65,"datetime":"2017-08-11 02:00"},{"value":0.65,"datetime":"2017-08-11 03:00"},{"value":0.66,"datetime":"2017-08-11 04:00"},{"value":0.66,"datetime":"2017-08-11 05:00"},{"value":0.66,"datetime":"2017-08-11 06:00"},{"value":0.63,"datetime":"2017-08-11 07:00"},{"value":0.59,"datetime":"2017-08-11 08:00"},{"value":0.52,"datetime":"2017-08-11 09:00"},{"value":0.44,"datetime":"2017-08-11 10:00"},{"value":0.37,"datetime":"2017-08-11 11:00"},{"value":0.31,"datetime":"2017-08-11 12:00"},{"value":0.28,"datetime":"2017-08-11 13:00"},{"value":0.26,"datetime":"2017-08-11 14:00"},{"value":0.25,"datetime":"2017-08-11 15:00"},{"value":0.27,"datetime":"2017-08-11 16:00"},{"value":0.31,"datetime":"2017-08-11 17:00"},{"value":0.38,"datetime":"2017-08-11 18:00"},{"value":0.47,"datetime":"2017-08-11 19:00"},{"value":0.56,"datetime":"2017-08-11 20:00"},{"value":0.63,"datetime":"2017-08-11 21:00"},{"value":0.7,"datetime":"2017-08-11 22:00"},{"value":0.75,"datetime":"2017-08-11 23:00"},{"value":0.78,"datetime":"2017-08-12 00:00"},{"value":0.8,"datetime":"2017-08-12 01:00"},{"value":0.81,"datetime":"2017-08-12 02:00"},{"value":0.81,"datetime":"2017-08-12 03:00"},{"value":0.8,"datetime":"2017-08-12 04:00"},{"value":0.78,"datetime":"2017-08-12 05:00"},{"value":0.75,"datetime":"2017-08-12 06:00"},{"value":0.71,"datetime":"2017-08-12 07:00"},{"value":0.68,"datetime":"2017-08-12 08:00"},{"value":0.67,"datetime":"2017-08-12 09:00"},{"value":0.67,"datetime":"2017-08-12 10:00"},{"value":0.68,"datetime":"2017-08-12 11:00"},{"value":0.68,"datetime":"2017-08-12 12:00"},{"value":0.68,"datetime":"2017-08-12 13:00"},{"value":0.64,"datetime":"2017-08-12 14:00"}],"pm25":[{"value":31,"datetime":"2017-08-10 15:00"},{"value":29,"datetime":"2017-08-10 16:00"},{"value":28,"datetime":"2017-08-10 17:00"},{"value":29,"datetime":"2017-08-10 18:00"},{"value":30,"datetime":"2017-08-10 19:00"},{"value":31,"datetime":"2017-08-10 20:00"},{"value":34,"datetime":"2017-08-10 21:00"},{"value":37,"datetime":"2017-08-10 22:00"},{"value":40,"datetime":"2017-08-10 23:00"},{"value":43,"datetime":"2017-08-11 00:00"},{"value":45,"datetime":"2017-08-11 01:00"},{"value":45,"datetime":"2017-08-11 02:00"},{"value":45,"datetime":"2017-08-11 03:00"},{"value":45,"datetime":"2017-08-11 04:00"},{"value":45,"datetime":"2017-08-11 05:00"},{"value":46,"datetime":"2017-08-11 06:00"},{"value":48,"datetime":"2017-08-11 07:00"},{"value":50,"datetime":"2017-08-11 08:00"},{"value":51,"datetime":"2017-08-11 09:00"},{"value":50,"datetime":"2017-08-11 10:00"},{"value":48,"datetime":"2017-08-11 11:00"},{"value":44,"datetime":"2017-08-11 12:00"},{"value":39,"datetime":"2017-08-11 13:00"},{"value":35,"datetime":"2017-08-11 14:00"},{"value":32,"datetime":"2017-08-11 15:00"},{"value":30,"datetime":"2017-08-11 16:00"},{"value":29,"datetime":"2017-08-11 17:00"},{"value":30,"datetime":"2017-08-11 18:00"},{"value":32,"datetime":"2017-08-11 19:00"},{"value":35,"datetime":"2017-08-11 20:00"},{"value":37,"datetime":"2017-08-11 21:00"},{"value":39,"datetime":"2017-08-11 22:00"},{"value":40,"datetime":"2017-08-11 23:00"},{"value":41,"datetime":"2017-08-12 00:00"},{"value":44,"datetime":"2017-08-12 01:00"},{"value":46,"datetime":"2017-08-12 02:00"},{"value":48,"datetime":"2017-08-12 03:00"},{"value":50,"datetime":"2017-08-12 04:00"},{"value":51,"datetime":"2017-08-12 05:00"},{"value":52,"datetime":"2017-08-12 06:00"},{"value":53,"datetime":"2017-08-12 07:00"},{"value":52,"datetime":"2017-08-12 08:00"},{"value":51,"datetime":"2017-08-12 09:00"},{"value":48,"datetime":"2017-08-12 10:00"},{"value":45,"datetime":"2017-08-12 11:00"},{"value":43,"datetime":"2017-08-12 12:00"},{"value":43,"datetime":"2017-08-12 13:00"},{"value":44,"datetime":"2017-08-12 14:00"}],"precipitation":[{"value":0,"datetime":"2017-08-10 15:00"},{"value":0,"datetime":"2017-08-10 16:00"},{"value":0,"datetime":"2017-08-10 17:00"},{"value":0,"datetime":"2017-08-10 18:00"},{"value":0,"datetime":"2017-08-10 19:00"},{"value":0,"datetime":"2017-08-10 20:00"},{"value":0,"datetime":"2017-08-10 21:00"},{"value":0,"datetime":"2017-08-10 22:00"},{"value":0,"datetime":"2017-08-10 23:00"},{"value":0,"datetime":"2017-08-11 00:00"},{"value":0,"datetime":"2017-08-11 01:00"},{"value":0,"datetime":"2017-08-11 02:00"},{"value":0,"datetime":"2017-08-11 03:00"},{"value":0,"datetime":"2017-08-11 04:00"},{"value":0,"datetime":"2017-08-11 05:00"},{"value":0,"datetime":"2017-08-11 06:00"},{"value":0,"datetime":"2017-08-11 07:00"},{"value":0,"datetime":"2017-08-11 08:00"},{"value":0,"datetime":"2017-08-11 09:00"},{"value":0,"datetime":"2017-08-11 10:00"},{"value":0,"datetime":"2017-08-11 11:00"},{"value":0,"datetime":"2017-08-11 12:00"},{"value":0,"datetime":"2017-08-11 13:00"},{"value":0,"datetime":"2017-08-11 14:00"},{"value":0,"datetime":"2017-08-11 15:00"},{"value":0,"datetime":"2017-08-11 16:00"},{"value":0,"datetime":"2017-08-11 17:00"},{"value":0,"datetime":"2017-08-11 18:00"},{"value":0,"datetime":"2017-08-11 19:00"},{"value":0,"datetime":"2017-08-11 20:00"},{"value":0,"datetime":"2017-08-11 21:00"},{"value":0,"datetime":"2017-08-11 22:00"},{"value":0.0441,"datetime":"2017-08-11 23:00"},{"value":0.0433,"datetime":"2017-08-12 00:00"},{"value":0,"datetime":"2017-08-12 01:00"},{"value":0,"datetime":"2017-08-12 02:00"},{"value":0,"datetime":"2017-08-12 03:00"},{"value":0,"datetime":"2017-08-12 04:00"},{"value":0,"datetime":"2017-08-12 05:00"},{"value":0,"datetime":"2017-08-12 06:00"},{"value":0,"datetime":"2017-08-12 07:00"},{"value":0,"datetime":"2017-08-12 08:00"},{"value":0,"datetime":"2017-08-12 09:00"},{"value":0.0515,"datetime":"2017-08-12 10:00"},{"value":0.0868,"datetime":"2017-08-12 11:00"},{"value":0.1203,"datetime":"2017-08-12 12:00"},{"value":0.1405,"datetime":"2017-08-12 13:00"},{"value":0.1346,"datetime":"2017-08-12 14:00"}],"wind":[{"direction":151.82,"speed":9.86,"datetime":"2017-08-10 15:00"},{"direction":144.94,"speed":10.26,"datetime":"2017-08-10 16:00"},{"direction":139.74,"speed":11.39,"datetime":"2017-08-10 17:00"},{"direction":139.01,"speed":13.35,"datetime":"2017-08-10 18:00"},{"direction":141.4,"speed":15.35,"datetime":"2017-08-10 19:00"},{"direction":145.78,"speed":16.48,"datetime":"2017-08-10 20:00"},{"direction":152.38,"speed":16.18,"datetime":"2017-08-10 21:00"},{"direction":161.02,"speed":15.12,"datetime":"2017-08-10 22:00"},{"direction":170.2,"speed":14.09,"datetime":"2017-08-10 23:00"},{"direction":177.28,"speed":13.43,"datetime":"2017-08-11 00:00"},{"direction":181.61,"speed":12.96,"datetime":"2017-08-11 01:00"},{"direction":183.63,"speed":12.53,"datetime":"2017-08-11 02:00"},{"direction":183.95,"speed":12.13,"datetime":"2017-08-11 03:00"},{"direction":183.44,"speed":11.82,"datetime":"2017-08-11 04:00"},{"direction":183.1,"speed":11.7,"datetime":"2017-08-11 05:00"},{"direction":183.7,"speed":11.85,"datetime":"2017-08-11 06:00"},{"direction":184.64,"speed":12.29,"datetime":"2017-08-11 07:00"},{"direction":185.04,"speed":13.02,"datetime":"2017-08-11 08:00"},{"direction":184.27,"speed":13.98,"datetime":"2017-08-11 09:00"},{"direction":182,"speed":14.94,"datetime":"2017-08-11 10:00"},{"direction":177.91,"speed":15.63,"datetime":"2017-08-11 11:00"},{"direction":171.64,"speed":15.98,"datetime":"2017-08-11 12:00"},{"direction":163.94,"speed":16.4,"datetime":"2017-08-11 13:00"},{"direction":156.35,"speed":17.28,"datetime":"2017-08-11 14:00"},{"direction":150.6,"speed":18.7,"datetime":"2017-08-11 15:00"},{"direction":147.85,"speed":20.24,"datetime":"2017-08-11 16:00"},{"direction":148.63,"speed":21.4,"datetime":"2017-08-11 17:00"},{"direction":153.03,"speed":21.9,"datetime":"2017-08-11 18:00"},{"direction":159.37,"speed":21.85,"datetime":"2017-08-11 19:00"},{"direction":165.83,"speed":21.19,"datetime":"2017-08-11 20:00"},{"direction":171.13,"speed":19.72,"datetime":"2017-08-11 21:00"},{"direction":175.41,"speed":17.7,"datetime":"2017-08-11 22:00"},{"direction":178.74,"speed":15.55,"datetime":"2017-08-11 23:00"},{"direction":180.88,"speed":13.65,"datetime":"2017-08-12 00:00"},{"direction":182.41,"speed":11.93,"datetime":"2017-08-12 01:00"},{"direction":184.78,"speed":10.26,"datetime":"2017-08-12 02:00"},{"direction":189.72,"speed":8.67,"datetime":"2017-08-12 03:00"},{"direction":195.2,"speed":7.58,"datetime":"2017-08-12 04:00"},{"direction":195.43,"speed":7.34,"datetime":"2017-08-12 05:00"},{"direction":187.44,"speed":8.17,"datetime":"2017-08-12 06:00"},{"direction":177.91,"speed":9.5,"datetime":"2017-08-12 07:00"},{"direction":170.21,"speed":10.22,"datetime":"2017-08-12 08:00"},{"direction":162.91,"speed":9.42,"datetime":"2017-08-12 09:00"},{"direction":150.94,"speed":7.83,"datetime":"2017-08-12 10:00"},{"direction":129.76,"speed":7,"datetime":"2017-08-12 11:00"},{"direction":108.72,"speed":8.25,"datetime":"2017-08-12 12:00"},{"direction":98.19,"speed":10.58,"datetime":"2017-08-12 13:00"},{"direction":94.85,"speed":12.55,"datetime":"2017-08-12 14:00"}],"temperature":[{"value":33,"datetime":"2017-08-10 15:00"},{"value":33.5,"datetime":"2017-08-10 16:00"},{"value":34,"datetime":"2017-08-10 17:00"},{"value":31.5,"datetime":"2017-08-10 18:00"},{"value":30,"datetime":"2017-08-10 19:00"},{"value":27.1,"datetime":"2017-08-10 20:00"},{"value":27.2,"datetime":"2017-08-10 21:00"},{"value":26.8,"datetime":"2017-08-10 22:00"},{"value":25.8,"datetime":"2017-08-10 23:00"},{"value":25.5,"datetime":"2017-08-11 00:00"},{"value":24.8,"datetime":"2017-08-11 01:00"},{"value":24.3,"datetime":"2017-08-11 02:00"},{"value":24.2,"datetime":"2017-08-11 03:00"},{"value":24.1,"datetime":"2017-08-11 04:00"},{"value":24,"datetime":"2017-08-11 05:00"},{"value":24.1,"datetime":"2017-08-11 06:00"},{"value":25.6,"datetime":"2017-08-11 07:00"},{"value":27,"datetime":"2017-08-11 08:00"},{"value":28.5,"datetime":"2017-08-11 09:00"},{"value":30,"datetime":"2017-08-11 10:00"},{"value":31.6,"datetime":"2017-08-11 11:00"},{"value":32.9,"datetime":"2017-08-11 12:00"},{"value":34.3,"datetime":"2017-08-11 13:00"},{"value":35.7,"datetime":"2017-08-11 14:00"},{"value":37,"datetime":"2017-08-11 15:00"},{"value":37,"datetime":"2017-08-11 16:00"},{"value":37,"datetime":"2017-08-11 17:00"},{"value":36.89,"datetime":"2017-08-11 18:00"},{"value":36.2,"datetime":"2017-08-11 19:00"},{"value":35.11,"datetime":"2017-08-11 20:00"},{"value":33.81,"datetime":"2017-08-11 21:00"},{"value":32.4,"datetime":"2017-08-11 22:00"},{"value":30.94,"datetime":"2017-08-11 23:00"},{"value":29.45,"datetime":"2017-08-12 00:00"},{"value":27.93,"datetime":"2017-08-12 01:00"},{"value":26.42,"datetime":"2017-08-12 02:00"},{"value":26.05,"datetime":"2017-08-12 03:00"},{"value":25.89,"datetime":"2017-08-12 04:00"},{"value":26.09,"datetime":"2017-08-12 05:00"},{"value":26.69,"datetime":"2017-08-12 06:00"},{"value":27.49,"datetime":"2017-08-12 07:00"},{"value":28.68,"datetime":"2017-08-12 08:00"},{"value":29.49,"datetime":"2017-08-12 09:00"},{"value":30.03,"datetime":"2017-08-12 10:00"},{"value":30.44,"datetime":"2017-08-12 11:00"},{"value":30.83,"datetime":"2017-08-12 12:00"},{"value":31.32,"datetime":"2017-08-12 13:00"},{"value":31.37,"datetime":"2017-08-12 14:00"}]}
         * alert : {"status":"ok","content":[{"province":"河南","status":"预警中","code":"0501","description":"安阳市气象台2017年8月9日16时15分发布雷暴大风蓝色预警信号：预计未来3小时内，我市受雷暴大风影响，局部地区阵风风力达7级以上，局地伴有短时强降水和冰雹等强对流天气，请注意防范。","alertId":"41050041600000_20170809161408","city":"安阳","pubtimestamp":1502265600,"latlon":[36.103442,114.352482],"county":"安阳","request_status":"ok","location":"河南安阳安阳","title":"河南省安阳市气象台发布蓝色雷暴大风预警","regionId":"101180201"}]}
         * minutely : {"status":"ok","description":"未来两小时不会下雨，放心出门吧","probability":[0.066013962,0.0913456678,0.1362040639,0.1477408707],"datasource":"radar","precipitation_2h":[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0],"precipitation":[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]}
         * daily : {"status":"ok","coldRisk":[{"index":"4","desc":"极易发","datetime":"2017-08-10"},{"index":"4","desc":"极易发","datetime":"2017-08-11"},{"index":"4","desc":"极易发","datetime":"2017-08-12"},{"index":"4","desc":"极易发","datetime":"2017-08-13"},{"index":"4","desc":"极易发","datetime":"2017-08-14"}],"temperature":[{"date":"2017-08-10","max":34,"avg":29.88,"min":23},{"date":"2017-08-11","max":37,"avg":30.54,"min":24},{"date":"2017-08-12","max":33,"avg":28.74,"min":23.6},{"date":"2017-08-13","max":32,"avg":27.17,"min":23},{"date":"2017-08-14","max":33,"avg":28.05,"min":23}],"skycon":[{"date":"2017-08-10","value":"CLEAR_DAY"},{"date":"2017-08-11","value":"PARTLY_CLOUDY_DAY"},{"date":"2017-08-12","value":"PARTLY_CLOUDY_DAY"},{"date":"2017-08-13","value":"CLEAR_DAY"},{"date":"2017-08-14","value":"CLEAR_DAY"}],"cloudrate":[{"date":"2017-08-10","max":0,"avg":0,"min":0},{"date":"2017-08-11","max":0.99,"avg":0.28,"min":0},{"date":"2017-08-12","max":1,"avg":0.7,"min":0.05},{"date":"2017-08-13","max":0.61,"avg":0.18,"min":0},{"date":"2017-08-14","max":0.02,"avg":0,"min":0}],"aqi":[{"date":"2017-08-10","max":59,"avg":47.89,"min":41},{"date":"2017-08-11","max":71,"avg":57.79,"min":42},{"date":"2017-08-12","max":73,"avg":61.08,"min":46},{"date":"2017-08-13","max":69,"avg":59.21,"min":50},{"date":"2017-08-14","max":75,"avg":63.58,"min":53}],"humidity":[{"date":"2017-08-10","max":0.65,"avg":0.43,"min":0.24},{"date":"2017-08-11","max":0.75,"avg":0.51,"min":0.25},{"date":"2017-08-12","max":0.81,"avg":0.68,"min":0.46},{"date":"2017-08-13","max":0.78,"avg":0.6,"min":0.38},{"date":"2017-08-14","max":0.81,"avg":0.59,"min":0.31}],"astro":[{"date":"2017-08-10","sunset":{"time":"19:17"},"sunrise":{"time":"05:37"}},{"date":"2017-08-11","sunset":{"time":"19:16"},"sunrise":{"time":"05:37"}},{"date":"2017-08-12","sunset":{"time":"19:15"},"sunrise":{"time":"05:38"}},{"date":"2017-08-13","sunset":{"time":"19:14"},"sunrise":{"time":"05:39"}},{"date":"2017-08-14","sunset":{"time":"19:12"},"sunrise":{"time":"05:40"}}],"ultraviolet":[{"index":"4","desc":"强","datetime":"2017-08-10"},{"index":"4","desc":"强","datetime":"2017-08-11"},{"index":"1","desc":"最弱","datetime":"2017-08-12"},{"index":"4","desc":"强","datetime":"2017-08-13"},{"index":"4","desc":"强","datetime":"2017-08-14"}],"pm25":[{"date":"2017-08-10","max":40,"avg":32.11,"min":28},{"date":"2017-08-11","max":51,"avg":40.96,"min":29},{"date":"2017-08-12","max":53,"avg":43.42,"min":32},{"date":"2017-08-13","max":50,"avg":41.88,"min":35},{"date":"2017-08-14","max":55,"avg":45.38,"min":37}],"dressing":[{"index":"2","desc":"很热","datetime":"2017-08-10"},{"index":"3","desc":"热","datetime":"2017-08-11"},{"index":"2","desc":"很热","datetime":"2017-08-12"},{"index":"2","desc":"很热","datetime":"2017-08-13"},{"index":"2","desc":"很热","datetime":"2017-08-14"}],"carWashing":[{"index":"1","desc":"适宜","datetime":"2017-08-10"},{"index":"3","desc":"较不适宜","datetime":"2017-08-11"},{"index":"3","desc":"较不适宜","datetime":"2017-08-12"},{"index":"1","desc":"适宜","datetime":"2017-08-13"},{"index":"1","desc":"适宜","datetime":"2017-08-14"}],"precipitation":[{"date":"2017-08-10","max":0,"avg":0,"min":0},{"date":"2017-08-11","max":0.0441,"avg":0.0018,"min":0},{"date":"2017-08-12","max":0.1405,"avg":0.0298,"min":0},{"date":"2017-08-13","max":0,"avg":0,"min":0},{"date":"2017-08-14","max":0,"avg":0,"min":0}],"wind":[{"date":"2017-08-10","max":{"direction":145.78,"speed":16.48},"avg":{"direction":164.12,"speed":8.82},"min":{"direction":156.94,"speed":2.53}},{"date":"2017-08-11","max":{"direction":153.03,"speed":21.9},"avg":{"direction":169.85,"speed":16.01},"min":{"direction":183.1,"speed":11.7}},{"date":"2017-08-12","max":{"direction":180.88,"speed":13.65},"avg":{"direction":139.12,"speed":9.83},"min":{"direction":203.94,"speed":3}},{"date":"2017-08-13","max":{"direction":18.22,"speed":18.21},"avg":{"direction":19.39,"speed":11.58},"min":{"direction":94.42,"speed":2.49}},{"date":"2017-08-14","max":{"direction":16.24,"speed":19.18},"avg":{"direction":27.48,"speed":11.31},"min":{"direction":335.81,"speed":0.98}}]}
         * primary : 0
         */

        public HourlyBean hourly;
        public AlertBean alert;
        public MinutelyBean minutely;
        public DailyBean daily;
        public int primary;

        public static class HourlyBean {
            /**
             * status : ok
             * description : 未来24小时晴
             * skycon : [{"value":"CLEAR_DAY","datetime":"2017-08-10 15:00"},{"value":"CLEAR_DAY","datetime":"2017-08-10 16:00"},{"value":"CLEAR_DAY","datetime":"2017-08-10 17:00"},{"value":"CLEAR_DAY","datetime":"2017-08-10 18:00"},{"value":"CLEAR_NIGHT","datetime":"2017-08-10 19:00"},{"value":"CLEAR_NIGHT","datetime":"2017-08-10 20:00"},{"value":"CLEAR_NIGHT","datetime":"2017-08-10 21:00"},{"value":"CLEAR_NIGHT","datetime":"2017-08-10 22:00"},{"value":"CLEAR_NIGHT","datetime":"2017-08-10 23:00"},{"value":"CLEAR_NIGHT","datetime":"2017-08-11 00:00"},{"value":"CLEAR_NIGHT","datetime":"2017-08-11 01:00"},{"value":"CLEAR_NIGHT","datetime":"2017-08-11 02:00"},{"value":"CLEAR_NIGHT","datetime":"2017-08-11 03:00"},{"value":"CLEAR_NIGHT","datetime":"2017-08-11 04:00"},{"value":"CLEAR_DAY","datetime":"2017-08-11 05:00"},{"value":"CLEAR_DAY","datetime":"2017-08-11 06:00"},{"value":"CLEAR_DAY","datetime":"2017-08-11 07:00"},{"value":"CLEAR_DAY","datetime":"2017-08-11 08:00"},{"value":"CLEAR_DAY","datetime":"2017-08-11 09:00"},{"value":"CLEAR_DAY","datetime":"2017-08-11 10:00"},{"value":"CLEAR_DAY","datetime":"2017-08-11 11:00"},{"value":"CLEAR_DAY","datetime":"2017-08-11 12:00"},{"value":"CLEAR_DAY","datetime":"2017-08-11 13:00"},{"value":"CLEAR_DAY","datetime":"2017-08-11 14:00"},{"value":"PARTLY_CLOUDY_DAY","datetime":"2017-08-11 15:00"},{"value":"PARTLY_CLOUDY_DAY","datetime":"2017-08-11 16:00"},{"value":"PARTLY_CLOUDY_DAY","datetime":"2017-08-11 17:00"},{"value":"CLOUDY","datetime":"2017-08-11 18:00"},{"value":"CLOUDY","datetime":"2017-08-11 19:00"},{"value":"CLOUDY","datetime":"2017-08-11 20:00"},{"value":"CLOUDY","datetime":"2017-08-11 21:00"},{"value":"CLOUDY","datetime":"2017-08-11 22:00"},{"value":"CLOUDY","datetime":"2017-08-11 23:00"},{"value":"CLOUDY","datetime":"2017-08-12 00:00"},{"value":"CLOUDY","datetime":"2017-08-12 01:00"},{"value":"CLOUDY","datetime":"2017-08-12 02:00"},{"value":"CLOUDY","datetime":"2017-08-12 03:00"},{"value":"CLOUDY","datetime":"2017-08-12 04:00"},{"value":"CLOUDY","datetime":"2017-08-12 05:00"},{"value":"CLOUDY","datetime":"2017-08-12 06:00"},{"value":"CLOUDY","datetime":"2017-08-12 07:00"},{"value":"CLOUDY","datetime":"2017-08-12 08:00"},{"value":"CLOUDY","datetime":"2017-08-12 09:00"},{"value":"CLOUDY","datetime":"2017-08-12 10:00"},{"value":"RAIN","datetime":"2017-08-12 11:00"},{"value":"RAIN","datetime":"2017-08-12 12:00"},{"value":"RAIN","datetime":"2017-08-12 13:00"},{"value":"RAIN","datetime":"2017-08-12 14:00"}]
             * cloudrate : [{"value":0,"datetime":"2017-08-10 15:00"},{"value":0,"datetime":"2017-08-10 16:00"},{"value":0,"datetime":"2017-08-10 17:00"},{"value":0,"datetime":"2017-08-10 18:00"},{"value":0,"datetime":"2017-08-10 19:00"},{"value":0,"datetime":"2017-08-10 20:00"},{"value":0,"datetime":"2017-08-10 21:00"},{"value":0,"datetime":"2017-08-10 22:00"},{"value":0,"datetime":"2017-08-10 23:00"},{"value":0,"datetime":"2017-08-11 00:00"},{"value":0,"datetime":"2017-08-11 01:00"},{"value":0,"datetime":"2017-08-11 02:00"},{"value":0,"datetime":"2017-08-11 03:00"},{"value":0,"datetime":"2017-08-11 04:00"},{"value":0,"datetime":"2017-08-11 05:00"},{"value":0,"datetime":"2017-08-11 06:00"},{"value":0,"datetime":"2017-08-11 07:00"},{"value":0,"datetime":"2017-08-11 08:00"},{"value":0.01,"datetime":"2017-08-11 09:00"},{"value":0.02,"datetime":"2017-08-11 10:00"},{"value":0,"datetime":"2017-08-11 11:00"},{"value":0,"datetime":"2017-08-11 12:00"},{"value":0,"datetime":"2017-08-11 13:00"},{"value":0,"datetime":"2017-08-11 14:00"},{"value":0.21,"datetime":"2017-08-11 15:00"},{"value":0.49,"datetime":"2017-08-11 16:00"},{"value":0.72,"datetime":"2017-08-11 17:00"},{"value":0.82,"datetime":"2017-08-11 18:00"},{"value":0.85,"datetime":"2017-08-11 19:00"},{"value":0.85,"datetime":"2017-08-11 20:00"},{"value":0.89,"datetime":"2017-08-11 21:00"},{"value":0.94,"datetime":"2017-08-11 22:00"},{"value":0.99,"datetime":"2017-08-11 23:00"},{"value":1,"datetime":"2017-08-12 00:00"},{"value":1,"datetime":"2017-08-12 01:00"},{"value":0.99,"datetime":"2017-08-12 02:00"},{"value":0.99,"datetime":"2017-08-12 03:00"},{"value":0.99,"datetime":"2017-08-12 04:00"},{"value":1,"datetime":"2017-08-12 05:00"},{"value":1,"datetime":"2017-08-12 06:00"},{"value":1,"datetime":"2017-08-12 07:00"},{"value":1,"datetime":"2017-08-12 08:00"},{"value":0.98,"datetime":"2017-08-12 09:00"},{"value":0.98,"datetime":"2017-08-12 10:00"},{"value":1,"datetime":"2017-08-12 11:00"},{"value":1,"datetime":"2017-08-12 12:00"},{"value":1,"datetime":"2017-08-12 13:00"},{"value":1,"datetime":"2017-08-12 14:00"}]
             * aqi : [{"value":59,"datetime":"2017-08-10 15:00"},{"value":42,"datetime":"2017-08-10 16:00"},{"value":41,"datetime":"2017-08-10 17:00"},{"value":42,"datetime":"2017-08-10 18:00"},{"value":43,"datetime":"2017-08-10 19:00"},{"value":45,"datetime":"2017-08-10 20:00"},{"value":49,"datetime":"2017-08-10 21:00"},{"value":53,"datetime":"2017-08-10 22:00"},{"value":57,"datetime":"2017-08-10 23:00"},{"value":61,"datetime":"2017-08-11 00:00"},{"value":63,"datetime":"2017-08-11 01:00"},{"value":63,"datetime":"2017-08-11 02:00"},{"value":63,"datetime":"2017-08-11 03:00"},{"value":63,"datetime":"2017-08-11 04:00"},{"value":63,"datetime":"2017-08-11 05:00"},{"value":64,"datetime":"2017-08-11 06:00"},{"value":67,"datetime":"2017-08-11 07:00"},{"value":69,"datetime":"2017-08-11 08:00"},{"value":71,"datetime":"2017-08-11 09:00"},{"value":69,"datetime":"2017-08-11 10:00"},{"value":67,"datetime":"2017-08-11 11:00"},{"value":62,"datetime":"2017-08-11 12:00"},{"value":56,"datetime":"2017-08-11 13:00"},{"value":50,"datetime":"2017-08-11 14:00"},{"value":46,"datetime":"2017-08-11 15:00"},{"value":43,"datetime":"2017-08-11 16:00"},{"value":42,"datetime":"2017-08-11 17:00"},{"value":43,"datetime":"2017-08-11 18:00"},{"value":46,"datetime":"2017-08-11 19:00"},{"value":50,"datetime":"2017-08-11 20:00"},{"value":53,"datetime":"2017-08-11 21:00"},{"value":56,"datetime":"2017-08-11 22:00"},{"value":57,"datetime":"2017-08-11 23:00"},{"value":58,"datetime":"2017-08-12 00:00"},{"value":62,"datetime":"2017-08-12 01:00"},{"value":64,"datetime":"2017-08-12 02:00"},{"value":67,"datetime":"2017-08-12 03:00"},{"value":69,"datetime":"2017-08-12 04:00"},{"value":71,"datetime":"2017-08-12 05:00"},{"value":72,"datetime":"2017-08-12 06:00"},{"value":73,"datetime":"2017-08-12 07:00"},{"value":72,"datetime":"2017-08-12 08:00"},{"value":71,"datetime":"2017-08-12 09:00"},{"value":67,"datetime":"2017-08-12 10:00"},{"value":63,"datetime":"2017-08-12 11:00"},{"value":61,"datetime":"2017-08-12 12:00"},{"value":61,"datetime":"2017-08-12 13:00"},{"value":62,"datetime":"2017-08-12 14:00"}]
             * humidity : [{"value":0.25,"datetime":"2017-08-10 15:00"},{"value":0.24,"datetime":"2017-08-10 16:00"},{"value":0.27,"datetime":"2017-08-10 17:00"},{"value":0.34,"datetime":"2017-08-10 18:00"},{"value":0.42,"datetime":"2017-08-10 19:00"},{"value":0.51,"datetime":"2017-08-10 20:00"},{"value":0.58,"datetime":"2017-08-10 21:00"},{"value":0.62,"datetime":"2017-08-10 22:00"},{"value":0.65,"datetime":"2017-08-10 23:00"},{"value":0.65,"datetime":"2017-08-11 00:00"},{"value":0.65,"datetime":"2017-08-11 01:00"},{"value":0.65,"datetime":"2017-08-11 02:00"},{"value":0.65,"datetime":"2017-08-11 03:00"},{"value":0.66,"datetime":"2017-08-11 04:00"},{"value":0.66,"datetime":"2017-08-11 05:00"},{"value":0.66,"datetime":"2017-08-11 06:00"},{"value":0.63,"datetime":"2017-08-11 07:00"},{"value":0.59,"datetime":"2017-08-11 08:00"},{"value":0.52,"datetime":"2017-08-11 09:00"},{"value":0.44,"datetime":"2017-08-11 10:00"},{"value":0.37,"datetime":"2017-08-11 11:00"},{"value":0.31,"datetime":"2017-08-11 12:00"},{"value":0.28,"datetime":"2017-08-11 13:00"},{"value":0.26,"datetime":"2017-08-11 14:00"},{"value":0.25,"datetime":"2017-08-11 15:00"},{"value":0.27,"datetime":"2017-08-11 16:00"},{"value":0.31,"datetime":"2017-08-11 17:00"},{"value":0.38,"datetime":"2017-08-11 18:00"},{"value":0.47,"datetime":"2017-08-11 19:00"},{"value":0.56,"datetime":"2017-08-11 20:00"},{"value":0.63,"datetime":"2017-08-11 21:00"},{"value":0.7,"datetime":"2017-08-11 22:00"},{"value":0.75,"datetime":"2017-08-11 23:00"},{"value":0.78,"datetime":"2017-08-12 00:00"},{"value":0.8,"datetime":"2017-08-12 01:00"},{"value":0.81,"datetime":"2017-08-12 02:00"},{"value":0.81,"datetime":"2017-08-12 03:00"},{"value":0.8,"datetime":"2017-08-12 04:00"},{"value":0.78,"datetime":"2017-08-12 05:00"},{"value":0.75,"datetime":"2017-08-12 06:00"},{"value":0.71,"datetime":"2017-08-12 07:00"},{"value":0.68,"datetime":"2017-08-12 08:00"},{"value":0.67,"datetime":"2017-08-12 09:00"},{"value":0.67,"datetime":"2017-08-12 10:00"},{"value":0.68,"datetime":"2017-08-12 11:00"},{"value":0.68,"datetime":"2017-08-12 12:00"},{"value":0.68,"datetime":"2017-08-12 13:00"},{"value":0.64,"datetime":"2017-08-12 14:00"}]
             * pm25 : [{"value":31,"datetime":"2017-08-10 15:00"},{"value":29,"datetime":"2017-08-10 16:00"},{"value":28,"datetime":"2017-08-10 17:00"},{"value":29,"datetime":"2017-08-10 18:00"},{"value":30,"datetime":"2017-08-10 19:00"},{"value":31,"datetime":"2017-08-10 20:00"},{"value":34,"datetime":"2017-08-10 21:00"},{"value":37,"datetime":"2017-08-10 22:00"},{"value":40,"datetime":"2017-08-10 23:00"},{"value":43,"datetime":"2017-08-11 00:00"},{"value":45,"datetime":"2017-08-11 01:00"},{"value":45,"datetime":"2017-08-11 02:00"},{"value":45,"datetime":"2017-08-11 03:00"},{"value":45,"datetime":"2017-08-11 04:00"},{"value":45,"datetime":"2017-08-11 05:00"},{"value":46,"datetime":"2017-08-11 06:00"},{"value":48,"datetime":"2017-08-11 07:00"},{"value":50,"datetime":"2017-08-11 08:00"},{"value":51,"datetime":"2017-08-11 09:00"},{"value":50,"datetime":"2017-08-11 10:00"},{"value":48,"datetime":"2017-08-11 11:00"},{"value":44,"datetime":"2017-08-11 12:00"},{"value":39,"datetime":"2017-08-11 13:00"},{"value":35,"datetime":"2017-08-11 14:00"},{"value":32,"datetime":"2017-08-11 15:00"},{"value":30,"datetime":"2017-08-11 16:00"},{"value":29,"datetime":"2017-08-11 17:00"},{"value":30,"datetime":"2017-08-11 18:00"},{"value":32,"datetime":"2017-08-11 19:00"},{"value":35,"datetime":"2017-08-11 20:00"},{"value":37,"datetime":"2017-08-11 21:00"},{"value":39,"datetime":"2017-08-11 22:00"},{"value":40,"datetime":"2017-08-11 23:00"},{"value":41,"datetime":"2017-08-12 00:00"},{"value":44,"datetime":"2017-08-12 01:00"},{"value":46,"datetime":"2017-08-12 02:00"},{"value":48,"datetime":"2017-08-12 03:00"},{"value":50,"datetime":"2017-08-12 04:00"},{"value":51,"datetime":"2017-08-12 05:00"},{"value":52,"datetime":"2017-08-12 06:00"},{"value":53,"datetime":"2017-08-12 07:00"},{"value":52,"datetime":"2017-08-12 08:00"},{"value":51,"datetime":"2017-08-12 09:00"},{"value":48,"datetime":"2017-08-12 10:00"},{"value":45,"datetime":"2017-08-12 11:00"},{"value":43,"datetime":"2017-08-12 12:00"},{"value":43,"datetime":"2017-08-12 13:00"},{"value":44,"datetime":"2017-08-12 14:00"}]
             * precipitation : [{"value":0,"datetime":"2017-08-10 15:00"},{"value":0,"datetime":"2017-08-10 16:00"},{"value":0,"datetime":"2017-08-10 17:00"},{"value":0,"datetime":"2017-08-10 18:00"},{"value":0,"datetime":"2017-08-10 19:00"},{"value":0,"datetime":"2017-08-10 20:00"},{"value":0,"datetime":"2017-08-10 21:00"},{"value":0,"datetime":"2017-08-10 22:00"},{"value":0,"datetime":"2017-08-10 23:00"},{"value":0,"datetime":"2017-08-11 00:00"},{"value":0,"datetime":"2017-08-11 01:00"},{"value":0,"datetime":"2017-08-11 02:00"},{"value":0,"datetime":"2017-08-11 03:00"},{"value":0,"datetime":"2017-08-11 04:00"},{"value":0,"datetime":"2017-08-11 05:00"},{"value":0,"datetime":"2017-08-11 06:00"},{"value":0,"datetime":"2017-08-11 07:00"},{"value":0,"datetime":"2017-08-11 08:00"},{"value":0,"datetime":"2017-08-11 09:00"},{"value":0,"datetime":"2017-08-11 10:00"},{"value":0,"datetime":"2017-08-11 11:00"},{"value":0,"datetime":"2017-08-11 12:00"},{"value":0,"datetime":"2017-08-11 13:00"},{"value":0,"datetime":"2017-08-11 14:00"},{"value":0,"datetime":"2017-08-11 15:00"},{"value":0,"datetime":"2017-08-11 16:00"},{"value":0,"datetime":"2017-08-11 17:00"},{"value":0,"datetime":"2017-08-11 18:00"},{"value":0,"datetime":"2017-08-11 19:00"},{"value":0,"datetime":"2017-08-11 20:00"},{"value":0,"datetime":"2017-08-11 21:00"},{"value":0,"datetime":"2017-08-11 22:00"},{"value":0.0441,"datetime":"2017-08-11 23:00"},{"value":0.0433,"datetime":"2017-08-12 00:00"},{"value":0,"datetime":"2017-08-12 01:00"},{"value":0,"datetime":"2017-08-12 02:00"},{"value":0,"datetime":"2017-08-12 03:00"},{"value":0,"datetime":"2017-08-12 04:00"},{"value":0,"datetime":"2017-08-12 05:00"},{"value":0,"datetime":"2017-08-12 06:00"},{"value":0,"datetime":"2017-08-12 07:00"},{"value":0,"datetime":"2017-08-12 08:00"},{"value":0,"datetime":"2017-08-12 09:00"},{"value":0.0515,"datetime":"2017-08-12 10:00"},{"value":0.0868,"datetime":"2017-08-12 11:00"},{"value":0.1203,"datetime":"2017-08-12 12:00"},{"value":0.1405,"datetime":"2017-08-12 13:00"},{"value":0.1346,"datetime":"2017-08-12 14:00"}]
             * wind : [{"direction":151.82,"speed":9.86,"datetime":"2017-08-10 15:00"},{"direction":144.94,"speed":10.26,"datetime":"2017-08-10 16:00"},{"direction":139.74,"speed":11.39,"datetime":"2017-08-10 17:00"},{"direction":139.01,"speed":13.35,"datetime":"2017-08-10 18:00"},{"direction":141.4,"speed":15.35,"datetime":"2017-08-10 19:00"},{"direction":145.78,"speed":16.48,"datetime":"2017-08-10 20:00"},{"direction":152.38,"speed":16.18,"datetime":"2017-08-10 21:00"},{"direction":161.02,"speed":15.12,"datetime":"2017-08-10 22:00"},{"direction":170.2,"speed":14.09,"datetime":"2017-08-10 23:00"},{"direction":177.28,"speed":13.43,"datetime":"2017-08-11 00:00"},{"direction":181.61,"speed":12.96,"datetime":"2017-08-11 01:00"},{"direction":183.63,"speed":12.53,"datetime":"2017-08-11 02:00"},{"direction":183.95,"speed":12.13,"datetime":"2017-08-11 03:00"},{"direction":183.44,"speed":11.82,"datetime":"2017-08-11 04:00"},{"direction":183.1,"speed":11.7,"datetime":"2017-08-11 05:00"},{"direction":183.7,"speed":11.85,"datetime":"2017-08-11 06:00"},{"direction":184.64,"speed":12.29,"datetime":"2017-08-11 07:00"},{"direction":185.04,"speed":13.02,"datetime":"2017-08-11 08:00"},{"direction":184.27,"speed":13.98,"datetime":"2017-08-11 09:00"},{"direction":182,"speed":14.94,"datetime":"2017-08-11 10:00"},{"direction":177.91,"speed":15.63,"datetime":"2017-08-11 11:00"},{"direction":171.64,"speed":15.98,"datetime":"2017-08-11 12:00"},{"direction":163.94,"speed":16.4,"datetime":"2017-08-11 13:00"},{"direction":156.35,"speed":17.28,"datetime":"2017-08-11 14:00"},{"direction":150.6,"speed":18.7,"datetime":"2017-08-11 15:00"},{"direction":147.85,"speed":20.24,"datetime":"2017-08-11 16:00"},{"direction":148.63,"speed":21.4,"datetime":"2017-08-11 17:00"},{"direction":153.03,"speed":21.9,"datetime":"2017-08-11 18:00"},{"direction":159.37,"speed":21.85,"datetime":"2017-08-11 19:00"},{"direction":165.83,"speed":21.19,"datetime":"2017-08-11 20:00"},{"direction":171.13,"speed":19.72,"datetime":"2017-08-11 21:00"},{"direction":175.41,"speed":17.7,"datetime":"2017-08-11 22:00"},{"direction":178.74,"speed":15.55,"datetime":"2017-08-11 23:00"},{"direction":180.88,"speed":13.65,"datetime":"2017-08-12 00:00"},{"direction":182.41,"speed":11.93,"datetime":"2017-08-12 01:00"},{"direction":184.78,"speed":10.26,"datetime":"2017-08-12 02:00"},{"direction":189.72,"speed":8.67,"datetime":"2017-08-12 03:00"},{"direction":195.2,"speed":7.58,"datetime":"2017-08-12 04:00"},{"direction":195.43,"speed":7.34,"datetime":"2017-08-12 05:00"},{"direction":187.44,"speed":8.17,"datetime":"2017-08-12 06:00"},{"direction":177.91,"speed":9.5,"datetime":"2017-08-12 07:00"},{"direction":170.21,"speed":10.22,"datetime":"2017-08-12 08:00"},{"direction":162.91,"speed":9.42,"datetime":"2017-08-12 09:00"},{"direction":150.94,"speed":7.83,"datetime":"2017-08-12 10:00"},{"direction":129.76,"speed":7,"datetime":"2017-08-12 11:00"},{"direction":108.72,"speed":8.25,"datetime":"2017-08-12 12:00"},{"direction":98.19,"speed":10.58,"datetime":"2017-08-12 13:00"},{"direction":94.85,"speed":12.55,"datetime":"2017-08-12 14:00"}]
             * temperature : [{"value":33,"datetime":"2017-08-10 15:00"},{"value":33.5,"datetime":"2017-08-10 16:00"},{"value":34,"datetime":"2017-08-10 17:00"},{"value":31.5,"datetime":"2017-08-10 18:00"},{"value":30,"datetime":"2017-08-10 19:00"},{"value":27.1,"datetime":"2017-08-10 20:00"},{"value":27.2,"datetime":"2017-08-10 21:00"},{"value":26.8,"datetime":"2017-08-10 22:00"},{"value":25.8,"datetime":"2017-08-10 23:00"},{"value":25.5,"datetime":"2017-08-11 00:00"},{"value":24.8,"datetime":"2017-08-11 01:00"},{"value":24.3,"datetime":"2017-08-11 02:00"},{"value":24.2,"datetime":"2017-08-11 03:00"},{"value":24.1,"datetime":"2017-08-11 04:00"},{"value":24,"datetime":"2017-08-11 05:00"},{"value":24.1,"datetime":"2017-08-11 06:00"},{"value":25.6,"datetime":"2017-08-11 07:00"},{"value":27,"datetime":"2017-08-11 08:00"},{"value":28.5,"datetime":"2017-08-11 09:00"},{"value":30,"datetime":"2017-08-11 10:00"},{"value":31.6,"datetime":"2017-08-11 11:00"},{"value":32.9,"datetime":"2017-08-11 12:00"},{"value":34.3,"datetime":"2017-08-11 13:00"},{"value":35.7,"datetime":"2017-08-11 14:00"},{"value":37,"datetime":"2017-08-11 15:00"},{"value":37,"datetime":"2017-08-11 16:00"},{"value":37,"datetime":"2017-08-11 17:00"},{"value":36.89,"datetime":"2017-08-11 18:00"},{"value":36.2,"datetime":"2017-08-11 19:00"},{"value":35.11,"datetime":"2017-08-11 20:00"},{"value":33.81,"datetime":"2017-08-11 21:00"},{"value":32.4,"datetime":"2017-08-11 22:00"},{"value":30.94,"datetime":"2017-08-11 23:00"},{"value":29.45,"datetime":"2017-08-12 00:00"},{"value":27.93,"datetime":"2017-08-12 01:00"},{"value":26.42,"datetime":"2017-08-12 02:00"},{"value":26.05,"datetime":"2017-08-12 03:00"},{"value":25.89,"datetime":"2017-08-12 04:00"},{"value":26.09,"datetime":"2017-08-12 05:00"},{"value":26.69,"datetime":"2017-08-12 06:00"},{"value":27.49,"datetime":"2017-08-12 07:00"},{"value":28.68,"datetime":"2017-08-12 08:00"},{"value":29.49,"datetime":"2017-08-12 09:00"},{"value":30.03,"datetime":"2017-08-12 10:00"},{"value":30.44,"datetime":"2017-08-12 11:00"},{"value":30.83,"datetime":"2017-08-12 12:00"},{"value":31.32,"datetime":"2017-08-12 13:00"},{"value":31.37,"datetime":"2017-08-12 14:00"}]
             */

            public String status;
            public String description;
            public List<SkyconBean> skycon;
            public List<CloudrateBean> cloudrate;
            public List<AqiBean> aqi;
            public List<HumidityBean> humidity;
            public List<Pm25Bean> pm25;
            public List<PrecipitationBean> precipitation;
            public List<WindBean> wind;
            public List<TemperatureBean> temperature;

            public static class SkyconBean {
                /**
                 * value : CLEAR_DAY
                 * datetime : 2017-08-10 15:00
                 */

                public String value;
                public String datetime;
            }

            public static class CloudrateBean {
                /**
                 * value : 0
                 * datetime : 2017-08-10 15:00
                 */

                public int value;
                public String datetime;
            }

            public static class AqiBean {
                /**
                 * value : 59
                 * datetime : 2017-08-10 15:00
                 */

                public int value;
                public String datetime;
            }

            public static class HumidityBean {
                /**
                 * value : 0.25
                 * datetime : 2017-08-10 15:00
                 */

                public double value;
                public String datetime;
            }

            public static class Pm25Bean {
                /**
                 * value : 31
                 * datetime : 2017-08-10 15:00
                 */

                public int value;
                public String datetime;
            }

            public static class PrecipitationBean {
                /**
                 * value : 0
                 * datetime : 2017-08-10 15:00
                 */

                public int value;
                public String datetime;
            }

            public static class WindBean {
                /**
                 * direction : 151.82
                 * speed : 9.86
                 * datetime : 2017-08-10 15:00
                 */

                public double direction;
                public double speed;
                public String datetime;
            }

            public static class TemperatureBean {
                /**
                 * value : 33
                 * datetime : 2017-08-10 15:00
                 */

                public int value;
                public String datetime;
            }
        }

        public static class AlertBean {
            /**
             * status : ok
             * content : [{"province":"河南","status":"预警中","code":"0501","description":"安阳市气象台2017年8月9日16时15分发布雷暴大风蓝色预警信号：预计未来3小时内，我市受雷暴大风影响，局部地区阵风风力达7级以上，局地伴有短时强降水和冰雹等强对流天气，请注意防范。","alertId":"41050041600000_20170809161408","city":"安阳","pubtimestamp":1502265600,"latlon":[36.103442,114.352482],"county":"安阳","request_status":"ok","location":"河南安阳安阳","title":"河南省安阳市气象台发布蓝色雷暴大风预警","regionId":"101180201"}]
             */

            public String status;
            public List<ContentBean> content;

            public static class ContentBean {
                /**
                 * province : 河南
                 * status : 预警中
                 * code : 0501
                 * description : 安阳市气象台2017年8月9日16时15分发布雷暴大风蓝色预警信号：预计未来3小时内，我市受雷暴大风影响，局部地区阵风风力达7级以上，局地伴有短时强降水和冰雹等强对流天气，请注意防范。
                 * alertId : 41050041600000_20170809161408
                 * city : 安阳
                 * pubtimestamp : 1502265600
                 * latlon : [36.103442,114.352482]
                 * county : 安阳
                 * request_status : ok
                 * location : 河南安阳安阳
                 * title : 河南省安阳市气象台发布蓝色雷暴大风预警
                 * regionId : 101180201
                 */

                public String province;
                public String status;
                public String code;
                public String description;
                public String alertId;
                public String city;
                public int pubtimestamp;
                public String county;
                public String request_status;
                public String location;
                public String title;
                public String regionId;
                public List<Double> latlon;
            }
        }

        public static class MinutelyBean {
            /**
             * status : ok
             * description : 未来两小时不会下雨，放心出门吧
             * probability : [0.066013962,0.0913456678,0.1362040639,0.1477408707]
             * datasource : radar
             * precipitation_2h : [0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]
             * precipitation : [0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]
             */

            public String status;
            public String description;
            public String datasource;
            public List<Double> probability;
            public List<Integer> precipitation_2h;
            public List<Integer> precipitation;
        }

        public static class DailyBean {
            /**
             * status : ok
             * coldRisk : [{"index":"4","desc":"极易发","datetime":"2017-08-10"},{"index":"4","desc":"极易发","datetime":"2017-08-11"},{"index":"4","desc":"极易发","datetime":"2017-08-12"},{"index":"4","desc":"极易发","datetime":"2017-08-13"},{"index":"4","desc":"极易发","datetime":"2017-08-14"}]
             * temperature : [{"date":"2017-08-10","max":34,"avg":29.88,"min":23},{"date":"2017-08-11","max":37,"avg":30.54,"min":24},{"date":"2017-08-12","max":33,"avg":28.74,"min":23.6},{"date":"2017-08-13","max":32,"avg":27.17,"min":23},{"date":"2017-08-14","max":33,"avg":28.05,"min":23}]
             * skycon : [{"date":"2017-08-10","value":"CLEAR_DAY"},{"date":"2017-08-11","value":"PARTLY_CLOUDY_DAY"},{"date":"2017-08-12","value":"PARTLY_CLOUDY_DAY"},{"date":"2017-08-13","value":"CLEAR_DAY"},{"date":"2017-08-14","value":"CLEAR_DAY"}]
             * cloudrate : [{"date":"2017-08-10","max":0,"avg":0,"min":0},{"date":"2017-08-11","max":0.99,"avg":0.28,"min":0},{"date":"2017-08-12","max":1,"avg":0.7,"min":0.05},{"date":"2017-08-13","max":0.61,"avg":0.18,"min":0},{"date":"2017-08-14","max":0.02,"avg":0,"min":0}]
             * aqi : [{"date":"2017-08-10","max":59,"avg":47.89,"min":41},{"date":"2017-08-11","max":71,"avg":57.79,"min":42},{"date":"2017-08-12","max":73,"avg":61.08,"min":46},{"date":"2017-08-13","max":69,"avg":59.21,"min":50},{"date":"2017-08-14","max":75,"avg":63.58,"min":53}]
             * humidity : [{"date":"2017-08-10","max":0.65,"avg":0.43,"min":0.24},{"date":"2017-08-11","max":0.75,"avg":0.51,"min":0.25},{"date":"2017-08-12","max":0.81,"avg":0.68,"min":0.46},{"date":"2017-08-13","max":0.78,"avg":0.6,"min":0.38},{"date":"2017-08-14","max":0.81,"avg":0.59,"min":0.31}]
             * astro : [{"date":"2017-08-10","sunset":{"time":"19:17"},"sunrise":{"time":"05:37"}},{"date":"2017-08-11","sunset":{"time":"19:16"},"sunrise":{"time":"05:37"}},{"date":"2017-08-12","sunset":{"time":"19:15"},"sunrise":{"time":"05:38"}},{"date":"2017-08-13","sunset":{"time":"19:14"},"sunrise":{"time":"05:39"}},{"date":"2017-08-14","sunset":{"time":"19:12"},"sunrise":{"time":"05:40"}}]
             * ultraviolet : [{"index":"4","desc":"强","datetime":"2017-08-10"},{"index":"4","desc":"强","datetime":"2017-08-11"},{"index":"1","desc":"最弱","datetime":"2017-08-12"},{"index":"4","desc":"强","datetime":"2017-08-13"},{"index":"4","desc":"强","datetime":"2017-08-14"}]
             * pm25 : [{"date":"2017-08-10","max":40,"avg":32.11,"min":28},{"date":"2017-08-11","max":51,"avg":40.96,"min":29},{"date":"2017-08-12","max":53,"avg":43.42,"min":32},{"date":"2017-08-13","max":50,"avg":41.88,"min":35},{"date":"2017-08-14","max":55,"avg":45.38,"min":37}]
             * dressing : [{"index":"2","desc":"很热","datetime":"2017-08-10"},{"index":"3","desc":"热","datetime":"2017-08-11"},{"index":"2","desc":"很热","datetime":"2017-08-12"},{"index":"2","desc":"很热","datetime":"2017-08-13"},{"index":"2","desc":"很热","datetime":"2017-08-14"}]
             * carWashing : [{"index":"1","desc":"适宜","datetime":"2017-08-10"},{"index":"3","desc":"较不适宜","datetime":"2017-08-11"},{"index":"3","desc":"较不适宜","datetime":"2017-08-12"},{"index":"1","desc":"适宜","datetime":"2017-08-13"},{"index":"1","desc":"适宜","datetime":"2017-08-14"}]
             * precipitation : [{"date":"2017-08-10","max":0,"avg":0,"min":0},{"date":"2017-08-11","max":0.0441,"avg":0.0018,"min":0},{"date":"2017-08-12","max":0.1405,"avg":0.0298,"min":0},{"date":"2017-08-13","max":0,"avg":0,"min":0},{"date":"2017-08-14","max":0,"avg":0,"min":0}]
             * wind : [{"date":"2017-08-10","max":{"direction":145.78,"speed":16.48},"avg":{"direction":164.12,"speed":8.82},"min":{"direction":156.94,"speed":2.53}},{"date":"2017-08-11","max":{"direction":153.03,"speed":21.9},"avg":{"direction":169.85,"speed":16.01},"min":{"direction":183.1,"speed":11.7}},{"date":"2017-08-12","max":{"direction":180.88,"speed":13.65},"avg":{"direction":139.12,"speed":9.83},"min":{"direction":203.94,"speed":3}},{"date":"2017-08-13","max":{"direction":18.22,"speed":18.21},"avg":{"direction":19.39,"speed":11.58},"min":{"direction":94.42,"speed":2.49}},{"date":"2017-08-14","max":{"direction":16.24,"speed":19.18},"avg":{"direction":27.48,"speed":11.31},"min":{"direction":335.81,"speed":0.98}}]
             */

            public String status;
            public List<ColdRiskBean> coldRisk;
            public List<TemperatureBeanX> temperature;
            public List<SkyconBeanX> skycon;
            public List<CloudrateBeanX> cloudrate;
            public List<AqiBeanX> aqi;
            public List<HumidityBeanX> humidity;
            public List<AstroBean> astro;
            public List<UltravioletBean> ultraviolet;
            public List<Pm25BeanX> pm25;
            public List<DressingBean> dressing;
            public List<CarWashingBean> carWashing;
            public List<PrecipitationBeanX> precipitation;
            public List<WindBeanX> wind;

            public static class ColdRiskBean {
                /**
                 * index : 4
                 * desc : 极易发
                 * datetime : 2017-08-10
                 */

                public String index;
                public String desc;
                public String datetime;
            }

            public static class TemperatureBeanX {
                /**
                 * date : 2017-08-10
                 * max : 34
                 * avg : 29.88
                 * min : 23
                 */

                public String date;
                public int max;
                public double avg;
                public int min;
            }

            public static class SkyconBeanX {
                /**
                 * date : 2017-08-10
                 * value : CLEAR_DAY
                 */

                public String date;
                public String value;
            }

            public static class CloudrateBeanX {
                /**
                 * date : 2017-08-10
                 * max : 0
                 * avg : 0
                 * min : 0
                 */

                public String date;
                public int max;
                public int avg;
                public int min;
            }

            public static class AqiBeanX {
                /**
                 * date : 2017-08-10
                 * max : 59
                 * avg : 47.89
                 * min : 41
                 */

                public String date;
                public int max;
                public double avg;
                public int min;
            }

            public static class HumidityBeanX {
                /**
                 * date : 2017-08-10
                 * max : 0.65
                 * avg : 0.43
                 * min : 0.24
                 */

                public String date;
                public double max;
                public double avg;
                public double min;
            }

            public static class AstroBean {
                /**
                 * date : 2017-08-10
                 * sunset : {"time":"19:17"}
                 * sunrise : {"time":"05:37"}
                 */

                public String date;
                public SunsetBean sunset;
                public SunriseBean sunrise;

                public static class SunsetBean {
                    /**
                     * time : 19:17
                     */

                    public String time;
                }

                public static class SunriseBean {
                    /**
                     * time : 05:37
                     */

                    public String time;
                }
            }

            public static class UltravioletBean {
                /**
                 * index : 4
                 * desc : 强
                 * datetime : 2017-08-10
                 */

                public String index;
                public String desc;
                public String datetime;
            }

            public static class Pm25BeanX {
                /**
                 * date : 2017-08-10
                 * max : 40
                 * avg : 32.11
                 * min : 28
                 */

                public String date;
                public int max;
                public double avg;
                public int min;
            }

            public static class DressingBean {
                /**
                 * index : 2
                 * desc : 很热
                 * datetime : 2017-08-10
                 */

                public String index;
                public String desc;
                public String datetime;
            }

            public static class CarWashingBean {
                /**
                 * index : 1
                 * desc : 适宜
                 * datetime : 2017-08-10
                 */

                public String index;
                public String desc;
                public String datetime;
            }

            public static class PrecipitationBeanX {
                /**
                 * date : 2017-08-10
                 * max : 0
                 * avg : 0
                 * min : 0
                 */

                public String date;
                public int max;
                public int avg;
                public int min;
            }

            public static class WindBeanX {
                /**
                 * date : 2017-08-10
                 * max : {"direction":145.78,"speed":16.48}
                 * avg : {"direction":164.12,"speed":8.82}
                 * min : {"direction":156.94,"speed":2.53}
                 */

                public String date;
                public MaxBean max;
                public AvgBean avg;
                public MinBean min;

                public static class MaxBean {
                    /**
                     * direction : 145.78
                     * speed : 16.48
                     */

                    public double direction;
                    public double speed;
                }

                public static class AvgBean {
                    /**
                     * direction : 164.12
                     * speed : 8.82
                     */

                    public double direction;
                    public double speed;
                }

                public static class MinBean {
                    /**
                     * direction : 156.94
                     * speed : 2.53
                     */

                    public double direction;
                    public double speed;
                }
            }
        }
    }
}
