package com.sj.Utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FileDateUtils {
    public static String fileDateName(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddhhmmss");
        return simpleDateFormat.format(new Date());
    }

}
