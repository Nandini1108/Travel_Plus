package travel.csc780.sfsu.edu.travel.Helper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import travel.csc780.sfsu.edu.travel.Objects.CheckListDetails;

import static travel.csc780.sfsu.edu.travel.Objects.CheckListDetails.DB_NAME;
import static travel.csc780.sfsu.edu.travel.Objects.CheckListDetails.DB_VERSION;

public class CheckListHelper extends SQLiteOpenHelper {

        public CheckListHelper(Context context) {
            super(context, DB_NAME, null, DB_VERSION);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            String createTable = "CREATE TABLE " + CheckListDetails.CheckListEntry.TABLE + " ( " +
                    CheckListDetails.CheckListEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    CheckListDetails.CheckListEntry.COL_TASK_TITLE + " TEXT NOT NULL);";

            db.execSQL(createTable);
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            db.execSQL("DROP TABLE IF EXISTS " + CheckListDetails.CheckListEntry.TABLE);
            onCreate(db);
        }
    }