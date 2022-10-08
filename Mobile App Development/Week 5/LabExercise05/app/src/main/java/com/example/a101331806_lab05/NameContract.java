package com.example.a101331806_lab05;

import android.provider.BaseColumns;

public final class NameContract {
    private NameContract() {}

    public static class NameEntry implements BaseColumns{
        public static final String TABLE_NAME = "names";
        public static final String COLUMN_NAME_NAME = "name";
    }

    public static final String SQL_CREATE =
            "CREATE TABLE" + NameEntry.TABLE_NAME+"("+
                    NameEntry._ID + "INTERGER PRIMARY KEY, "+
                    NameEntry.COLUMN_NAME_NAME + " TEXT)";

    public static final String SQL_DROP =
            "DROP TABLE IF EXISTS"+ NameEntry.TABLE_NAME;
}
