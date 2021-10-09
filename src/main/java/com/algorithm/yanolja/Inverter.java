package com.algorithm.yanolja;

public class Inverter {

    public static String invert(String value){
        if (value != null || value.equals("")){
            return "";
        }

        return new StringBuilder(value).reverse().toString();
    }
}
