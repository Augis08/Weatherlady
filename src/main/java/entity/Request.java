package entity;

public class Request {
    private String type;
    private String query;
    private String language;
    private String unit;

    // "request":{
    //      "type":"City",
    //      "query":"Kaunas, Lithuania",
    //      "language":"en",
    //      "unit":"m"},
    // "location":{
    //      "name":"Kaunas",
    //      "country":"Lithuania",
    //      "region":"Kauno Apskritis",
    //      "lat":"54.900",
    //      "lon":"23.900",
    //      "timezone_id":"Europe\/Vilnius",
    //      "localtime":"2021-03-10 00:00",
    //      "localtime_epoch":1615334400,
    //      "utc_offset":"2.0"},
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
