package Utils;

import Entity.Car;
import Entity.Person;
import com.google.common.io.Resources;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class GetList {
    public static List<Person> getPeople() throws IOException {
        InputStream inputStream = Resources.getResource("resources/people_sample.json").openStream();
        String json = IOUtils.toString(inputStream, StandardCharsets.UTF_8);
        Type listType = new TypeToken<ArrayList<Person>>() {
        }.getType();
        return new Gson().fromJson(json, listType);
    }

    public static List<Car> getCars() throws IOException {
        InputStream inputStream = Resources.getResource("resources/car_sample.json").openStream();
        String json = IOUtils.toString(inputStream, StandardCharsets.UTF_8);
        Type listType = new TypeToken<ArrayList<Car>>() {
        }.getType();
        return new Gson().fromJson(json, listType);
    }
}
