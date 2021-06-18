package Coin.Result;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Result {
   private String valueType;
   private  double value;

    //Result constructor
    public Result(double value, String valueType) {
        this.valueType = valueType;
        this.value = value;
    }

    // Getter
    public String getResult() {
        return valueType + value;
    }

}
