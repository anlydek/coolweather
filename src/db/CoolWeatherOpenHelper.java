package db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class CoolWeatherOpenHelper extends SQLiteOpenHelper {
	/**
	 * province表建表语句
	 */
	public static final String CREATE_PROVINCE="create table Province ("
			+"id integer primary key autoincrement, "
			+"province_name text, "
			+"province_code)" ;
	/**
	 * City表建表语句
	 */
	public static final String CREATE_CITY="create table City ("
			+"id integer primary key autoincrement, "
			+"city_name text, "
			+"city_code text)";
	/**
	 * County表建表语句
	 */
	public static final String CREATE_COUNTY="create table County("
			+"id integer primary key autoincrement, "
			+"county_name text,"
			+"county_code text)";
	
	public CoolWeatherOpenHelper(Context context,String name,CursorFactory factory,int version){
		super(context, name, factory, version);
	}
	@Override
	public void onCreate(SQLiteDatabase db){
		db.execSQL(CREATE_PROVINCE);//创建表如下也是
		db.execSQL(CREATE_CITY);
		db.execSQL(CREATE_COUNTY);
	}
	@Override
	public void onUpgrade(SQLiteDatabase db,int oldVersion,int newVersion){
		
	}
}
