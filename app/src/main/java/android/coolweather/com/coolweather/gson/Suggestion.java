package android.coolweather.com.coolweather.gson;

/**
 * Created by yzy on 2018/7/11.
 */

import com.google.gson.annotations.SerializedName;

/**
 *  json格式：
 *
 *  "suggestion": {
 *      "comf":{
 *          "txt":"..." *
 *      },
 *      cw":{
 *          "txt":"..."
 *      },
 *      "sport":{
 *          "txt":"..."
 *      }
 *  }
 * */

public class Suggestion {

    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public Carwash carwash;

    @SerializedName("sport")
    public Sport sport;

    public class Comfort {
        @SerializedName("txt")
        public String info;
    }

    public class Carwash {
        @SerializedName("txt")
        public String info;
    }

    public class Sport {
        @SerializedName("txt")
        public String info;
    }
}
