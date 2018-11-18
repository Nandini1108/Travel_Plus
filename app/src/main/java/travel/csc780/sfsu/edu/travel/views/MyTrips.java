package travel.csc780.sfsu.edu.travel.views;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.EditText;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import travel.csc780.sfsu.edu.travel.Objects.TripData;
import travel.csc780.sfsu.edu.travel.R;

public class MyTrips extends AppCompatActivity {

    private static final String TAG = "My Trips";
    EditText name;
    EditText city;
    EditText itinerary;
    private ArrayList<TripData> trips;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_trips);
        Log.d(TAG, "Travel+: Came in my trips");
        fillData();
    }

    private  void fillData()
    {
        name = (EditText) findViewById(R.id.Name);
        city = (EditText) findViewById(R.id.City);
        itinerary = (EditText) findViewById(R.id.Itinerary);
        name.setText("1");
        city.setText("1");
        itinerary.setText("1");
        SharedPreferences sharedPreferences = getSharedPreferences("My Shared Preference",MODE_PRIVATE);
        Gson gson = new Gson();
        Log.d(TAG, "Travel+: Gson");
        String json = sharedPreferences.getString("TripData",null);
        Type type = new TypeToken<ArrayList<TripData>>() {}.getType();
        trips = gson.fromJson(json,type);
        Log.d(TAG,"Travel+: load Data");
        Log.d(TAG,"Travel+ trips:  " + trips.toString());
        Log.d(TAG, "Travel+ json: " + json);
        }
}
