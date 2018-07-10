package android.coolweather.com.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by yzy on 2018/7/10.
 */

public class Country extends DataSupport {
    private int id;
    private int cityId;
    private String countryName;
    private String ewatherId;

}
