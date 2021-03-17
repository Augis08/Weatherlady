package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "locations")
public class Location {

private String name;
private String country;
private String region;
private double lat;
private double lon;
private String timezone_id;
private String localtime;
private String localtime_epoch;
private String utc_offset;

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

}
