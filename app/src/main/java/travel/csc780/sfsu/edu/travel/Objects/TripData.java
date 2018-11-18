package travel.csc780.sfsu.edu.travel.Objects;

import com.google.gson.annotations.SerializedName;

public class TripData {
    //@SerializedName("TRIP_CITY")
    private int id;
    private String TRIP_CITY;
    private String TRIP_NAME;
    private String TRAVEL_DATE;
    private String TRIP_ITINERARY;

    public TripData(int id, String trip_name, String trip_city, String travel_date, String itinerary){
        this.id = id;
        this.TRIP_NAME = trip_name;
        this.TRIP_CITY = trip_city;
        this.TRAVEL_DATE = travel_date;
        this.TRIP_ITINERARY = itinerary;
    }
}
