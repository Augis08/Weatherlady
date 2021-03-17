package entity;

public class CurrentWeather {

    private String observation_time;
    private double temperature;
    private Integer weather_code;
    private String weather_icons;
    private String weather_descriptions;
    private double windSpeed;
    private Integer wind_degree;
    private String windDirection; // wind_dir
    private double pressure;
    private int precip;
    private double humidity;

    // "current":{
    //      "observation_time":"10:00 PM",
    //      "temperature":-6,
    //      "weather_code":113,
    //      "weather_icons":["https:\/\/assets.weatherstack.com\/images\/wsymbols01_png_64\/wsymbol_0008_clear_sky_night.png"],
    //      "weather_descriptions":["Clear"],
    //      "wind_speed":7,
    //      "wind_degree":190,
    //      "wind_dir":"S",
    //      "pressure":1022,
    //      "precip":0,
    //      "humidity":68,
    //      "cloudcover":0,
    //      "feelslike":-11,
    //      "uv_index":1,
    //      "visibility":10,
    //      "is_day":"no"}

}
