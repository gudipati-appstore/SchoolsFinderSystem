package com.gcoders.schoolinfo.schoolsfindersystem.utils;

public class SchoolUtils {

    public static boolean isThisInteger(String strInput) {
        try {
            Integer.parseInt(strInput);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }
}
