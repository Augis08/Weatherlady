package utilities;

public class Url {
    private String weatherStackUrl =
            "http://api.weatherstack.com/current?access_key=25dd9ed1d2d8debb5f350977670244b0&query=";

    public Url(String query) {
        this.weatherStackUrl = weatherStackUrl + query;
    }

    public String getWeatherStackUrl() {
        return weatherStackUrl;
    }

    public void setWeatherStackUrl(String weatherStackUrl) {
        this.weatherStackUrl = weatherStackUrl;
    }
}
