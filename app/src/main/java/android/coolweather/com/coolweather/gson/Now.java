package android.coolweather.com.coolweather.gson;

/**
 * Created by yzy on 2018/7/11.
 */

import com.google.gson.annotations.SerializedName;

/**
 *  json格式：
 *
 *  "now": {
 *      "tmp":"29",
 *      "cond":{
 *          "txt":"阵雨"
 *      }
 *  }
 * */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}
