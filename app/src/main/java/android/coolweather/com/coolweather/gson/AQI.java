package android.coolweather.com.coolweather.gson;

/**
 * Created by yzy on 2018/7/11.
 */

/**
 *  json格式：
 *
 *  "aqi": {
 *      "city":{
 *          "aqi":"44",
 *          "pm25":"13"
 *      }
 *  }
 * */

public class AQI {
    public AQICity city;
    public class  AQICity {
        public String aqi;
        public String pm25;
    }
}
