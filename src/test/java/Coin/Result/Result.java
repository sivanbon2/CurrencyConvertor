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

    //Trying to work on Bonus number 3
    public static void sendHttpGetRequest(String fromCode, String toCode, double amount, int accessKey) throws IOException {
        String getUrl = "https://api.exchangeratesapi.io/v1/convert?access_key=" +
                accessKey + "from=" + fromCode + "to=" + toCode + "amount" + amount;
        //https://api.exchangeratesapi.io/v1/convert?access_key=ab82906dcfe6d4ee863b9464e77050eb
        // &from=USD&to=EUR&amount=25

        URL url = new URL(getUrl);
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setRequestMethod("GET");
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode == httpURLConnection.HTTP_OK) { //success
            BufferedReader in = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }in.close();

            JSONObject obj = new JSONObject(response.toString());
            Double ex =obj.getJSONObject("rate").getDouble(fromCode);
            System.out.println(ex);

        }

    }
}
