package com.example.task3;

import java.io.IOException;

import org.json.JSONObject;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

public class Brandfetch {

    public static Company fetch(String brand) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("https://api.brandfetch.io/v2/brands/"+ brand +".com")
                .get()
                .addHeader("accept", "application/json")
                .addHeader("Authorization", "Bearer B+1Ac7EADnlIXXS7UylM12aUIdwsavX5HHieUzMGmb0=")
                .build();

        try {
            Response response = client.newCall(request).execute();
            JSONObject json = new JSONObject(response.body().string());

            System.out.println(json);
            return new Company(json.getJSONArray("logos").getJSONObject(0).getJSONArray("formats").getJSONObject(0).getString("src"), json.getString("domain"), json.getString("name"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new Company();
        
    }

}
