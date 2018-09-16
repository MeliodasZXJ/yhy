package com.sj.Utils;

public class FileStringUtils {
    public static String subFileName(String fileName){
        return fileName.substring(fileName.indexOf("."),fileName.length());
    }
}
