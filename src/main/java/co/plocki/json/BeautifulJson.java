package co.plocki.json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class BeautifulJson {
    public String beautiful(String input) {
        return new GsonBuilder().setPrettyPrinting().create().toJson(new Gson().fromJson(input, Object.class));
    }
}
