package android.coolweather.com.coolweather.gson;

/**
 * Created by yzy on 2018/7/11.
 */

import com.google.gson.annotations.SerializedName;

/**
 *  json格式：
 *
 *  "daily_forcast": [
 *      {
 *          "data":"2016-08-08",
 *          "cond":{
 *              "txt_d":"阵雨"
 *          },
 *          "tmp":{
 *              "max":"34"
 *              "min":"27"
 *          }
 *      },
 *      {
 *          "data":"2016-08-09",
 *          "cond":{
 *              "txt_d":"多云"
 *          },
 *          "tmp":{
 *              "max":"35"
 *              "min":"29"
 *          }
 *      },
 *      ...
 * */

public class Forecast {

    public String date;

    @SerializedName("cond")
    public More more;

    @SerializedName("tmp")
    public Temprature temprature;

    public class More {
        @SerializedName("txt_d")
        public String info;
    }

    public class Temprature {
        public String max;
        public String min;
    }
}
