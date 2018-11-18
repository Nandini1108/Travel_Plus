package travel.csc780.sfsu.edu.travel.views;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import travel.csc780.sfsu.edu.travel.R;

public class HomePage extends AppCompatActivity{

        Button searchCity;
        Button planTrip;
        Button editTrip;

    private static final String TAG = "HomePage";

        @Override
        protected void onStart() {
            super.onStart();

        }

    public void showMyLocation(View view) {
        Log.d(TAG,"Travel+: Came here");
        startActivity(new Intent(getApplicationContext(), MapsActivity.class));
    }

    public void planTrip(View view) {
        Log.d(TAG,"Travel+: Came here2");
        startActivity(new Intent(getApplicationContext(), PlanTrip.class));
    }

    public void showTrip(View view) {
        Log.d(TAG,"Travel+: Came here3");
        startActivity(new Intent(getApplicationContext(), MyTrips.class));
    }

    public void exit(View view) {
        startActivity(new Intent(getApplicationContext(), LogOut.class));
    }

    @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_homepage);
            Log.d(TAG,"Travel+: Came in onCreate"); }
            };
