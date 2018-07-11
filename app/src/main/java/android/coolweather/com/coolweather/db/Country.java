package android.coolweather.com.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by yzy on 2018/7/10.
 */

public class Country extends DataSupport {
    private int id;
    private int cityId;
    private String countryName;
    private String weatherId;

    public int getId() {
        return id;
    }

    public int getCityId() {
        return cityId;
    }

    public String getCountryName() {
        return countryName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public void setWeatherId(String ewatherId) {
        this.weatherId = ewatherId;
    }
}
