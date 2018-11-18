package travel.csc780.sfsu.edu.travel.views;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import travel.csc780.sfsu.edu.travel.Utils.CheckList;
import travel.csc780.sfsu.edu.travel.R;
import travel.csc780.sfsu.edu.travel.Utils.SaveTrip;

public class PlanTrip extends AppCompatActivity {

    private EditText dateTimeDisplay;
    private Calendar calendar;
    private SimpleDateFormat dateFormat;
    private String date;
    private static final String TAG = "PlanTrip";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plan_trip);
        Log.d("plan trip", "Travel+: Came in planTrip");

        dateTimeDisplay = (EditText) findViewById(R.id.travelDate);
        calendar = Calendar.getInstance();
        dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        date = dateFormat.format(calendar.getTime());
        dateTimeDisplay.setText(date);
    }

    public void loadCheckList(View view) {
        Log.d(TAG,"loadCheckList Page");
        startActivity(new Intent(getApplicationContext(), CheckList.class));
    }

    public void saveTrip(View view) {
        Log.d(TAG,"Travel+: save trip details");
        startActivity(new Intent(getApplicationContext(), SaveTrip.class));
    }
};

