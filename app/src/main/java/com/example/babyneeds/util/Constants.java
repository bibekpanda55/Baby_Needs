package com.example.babyneeds.util;

public class Constants {

    public static final int DB_VERSION = 1;
    public static final String DB_NAME = "babyList";
    public static final String TABLE_NAME = "baby_tbl";

    //Table columns
    public static final String KEY_ID = "id";
    public static final String KEY_BABY_ITEM = "baby_item";
    public static final String KEY_QTY_NUMBER = "quantity_number";
    public static final String KEY_COLOR = "color";
    public static final String KEY_ITEM_SIZE = "size";
    public static final String KEY_DATE_NAME = "date_added";
   public static final String CREATE_BABY_TABLE = "CREATE TABLE " + Constants.TABLE_NAME + "("
            + Constants.KEY_ID + " INTEGER PRIMARY KEY,"
            + Constants.KEY_BABY_ITEM + " INTEGER,"
            + Constants.KEY_COLOR + " TEXT,"
            + Constants.KEY_QTY_NUMBER + " INTEGER,"
            + Constants.KEY_ITEM_SIZE + " INTEGER,"
            + Constants.KEY_DATE_NAME + " LONG);";


}
