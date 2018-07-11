package android.coolweather.com.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by yzy on 2018/7/11.
 */

/**
 *  json格式：
 *
 *  "basic": {
 *      "city":"苏州",
 *      "id":"CN101109401",
 *      "update":{
 *          "loc":"2016-08-08 21:58"
 *      }
 *  }
 * */

public class Basic {
    // @SerializedName 将json中的city字段映射成cityName
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
