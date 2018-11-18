package travel.csc780.sfsu.edu.travel.Objects;

import android.provider.BaseColumns;

public class CheckListDetails {
        public static final String DB_NAME = "travel.edu.sfsu.csc780.travel";
        public static final int DB_VERSION = 1;

        public class CheckListEntry implements BaseColumns {
            public static final String TABLE = "tasks";
            public static final String COL_TASK_TITLE = "title";
        }
    }

