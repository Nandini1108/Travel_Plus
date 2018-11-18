package travel.csc780.sfsu.edu.travel.Utils;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;

import travel.csc780.sfsu.edu.travel.Objects.TripData;


public class SaveTrip extends AppCompatActivity {

    private static final String TAG = "Save Trip";
    private ArrayList<TripData> trips;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG,"Travel+: save trip details in saveTrip class");
        saveToDB();
        Toast.makeText(getApplicationContext(), "Trip Saved!",Toast.LENGTH_LONG).show();
    }
    private void saveToDB(){
        SharedPreferences sharedPreferences = getSharedPreferences("My Shared Preference",MODE_PRIVATE);
        SharedPreferences.Editor editor =  sharedPreferences.edit();
        trips  = AddTrip();
        Gson gson = new Gson();
        Log.d(TAG,"Travel+ " + trips.toString());
        String json = gson.toJson(trips);
        Log.d(TAG,"Travel+: nnnnn" );
        editor.putString("TripData", json);
       // Log.d(TAG,"Travel+: save to DB json");
        editor.apply();
        Log.d(TAG,"Travel+ in save trip:  " + json);
    }

    private ArrayList<TripData> AddTrip()
    {
        ArrayList<TripData> trips  = new ArrayList<>();
        TripData trip1 = new TripData(1,"Mumbai Trip","Mumbai", "11/17/2018","A");
        TripData trip2 = new TripData(2,"Delhi Trip","Delhi", "11/17/2018","B");
        TripData trip3 = new TripData(3,"Bangalore Trip","Bangalore", "11/17/2018","C");
        TripData trip4 = new TripData(4,"Pune Trip","Pune", "11/17/2018","D");
        trips.add(trip1);
        trips.add(trip2);
        trips.add(trip3);
        trips.add(trip4);
        return trips;
    }
}
