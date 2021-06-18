package Coin.GetAPI;


import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import org.json.JSONObject;

import java.io.IOException;

public class GetApi {

    public void a() throws IOException {
        String getUrl = "https://api.exchangeratesapi.io/v1/latest?access_key=ab82906dcfe6d4ee863b9464e77050eb";
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(getUrl)
                .build();
        Response response = client.newCall(request).execute();
        String jsonData = response.body().string();
        // parse JSON
        JSONObject mainJsonObject = new JSONObject(jsonData);
        // get Json object
//        JSONObject resultsJson = mainJsonObject.getJSONObject("USD_ILS");
//        double val = resultsJson.getDouble("val");
        System.out.println(mainJsonObject);

    }
}
