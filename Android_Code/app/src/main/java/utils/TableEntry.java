package utils;

import android.provider.BaseColumns;

/**
 * Created by Team SDC on 20/03/18.
 * <p>
 * Constants for database column names
 */
public abstract class TableEntry implements BaseColumns {
    public static final String TABLE_NAME = "events_new";
    public static final String COLUMN_NAME_ID = "id";
    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_NAME_ISDONE = "isdone";
}

