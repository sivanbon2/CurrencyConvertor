package Coin.GetAPI;


import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import org.json.JSONObject;

import java.io.IOException;

public class GetApi {

    public static double GetCurrenciesApi(String rates, String currencies, String currency) throws IOException {
        String getUrl = "https://api.exchangeratesapi.io/v1/latest?access_key=ab82906dcfe6d4ee863b9464e77050eb&base=" + currency;
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(getUrl)
                .build();
        Response response = client.newCall(request).execute();
        if (response.isSuccessful()) {
            String jsonData = response.body().string();

            // parse JSON
            JSONObject mainJsonObject = new JSONObject(jsonData);
            mainJsonObject.getJSONObject("rates");
            // get Json result
            JSONObject resultsJson = mainJsonObject.getJSONObject(rates);

            double val = resultsJson.getDouble(currencies);
            System.out.println(val);
            return val;
        }else {
            System.out.println("Could Not Get Rate from API using default rate");
        }
      return client.getWriteTimeout();


    }
}
