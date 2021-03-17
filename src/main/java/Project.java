import utilities.HttpRequest;
import utilities.Url;

public class Project {

    public Project() {

        System.out.println("hello World");

        String url = new Url("kaunas").getWeatherStackUrl();
        String json = new HttpRequest(url).toString();
        System.out.println(json);
    }
}
