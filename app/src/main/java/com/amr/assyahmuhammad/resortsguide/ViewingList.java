package com.amr.assyahmuhammad.resortsguide;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;
import android.widget.Toast;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import java.util.List;

public class ViewingList extends AppCompatActivity {

    String resortNames, descriptions, services_s, resortNumbers, prices, paths;
    RecyclerView resortRecycler;
    List<ViewAdapter> resorts;
    TextView textView;
    String url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        textView= (TextView) findViewById(R.id.textView7);
        resortRecycler= (RecyclerView) findViewById(R.id.resortRecyclerView);
        resortRecycler.setLayoutManager(new LinearLayoutManager(this));

        url="http://192.168.1.13/AndroidProject/resortinfo.php";

        StringRequest postrequest=new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    JSONObject jsonObject = new JSONObject(response);
                    JSONArray jsonArray = jsonObject.getJSONArray("resorts");
                    resorts = new ArrayList<>();
                    for (int i = 0; i < jsonArray.length(); i++) {
                        JSONObject object = jsonArray.getJSONObject(i);
                        resortNames = object.getString("resortName");
                        descriptions = object.getString("description");
                        services_s = object.getString("services");
                        resortNumbers = object.getString("resortNumber");
                        prices = object.getString("prices");
                        paths = object.getString("path");
                        ViewAdapter viewAdapter = new ViewAdapter(resortNames, prices);
                        resorts.add(viewAdapter);
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                ListAdapter adapter = new ListAdapter(resorts);
                resortRecycler.setAdapter(adapter);
            }

            }, new Response.ErrorListener(){
            @Override
            public void onErrorResponse(VolleyError error) {
                    Toast.makeText(ViewingList.this,error.getMessage(),Toast.LENGTH_SHORT).show();
            }
        });
        Volley.newRequestQueue(this).add(postrequest);
    }
}