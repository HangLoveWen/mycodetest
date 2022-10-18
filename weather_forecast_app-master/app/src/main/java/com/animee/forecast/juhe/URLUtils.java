package com.animee.forecast.juhe;

public class URLUtils {

    public static final  String KEY = "33ad7813ce6dcf065c2904ed859dadc4";
    public static String temp_url = "http://apis.juhe.cn/simpleWeather/query";

    public static String index_url = "http://apis.juhe.cn/simpleWeather/life";

    public static String getTemp_url(String city){
        String url = temp_url+"?city="+city+"&key="+KEY;
        return url;
    }

    public static String getIndex_url(String city){
        String url = index_url+"?city="+city+"&key="+KEY;
        return url;
    }
}
