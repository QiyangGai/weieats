package com.imooc.sell.Utils;

import java.util.Random;

public class KeyUtil {
    /**
     *
     * Generate unique primary key
     * Type: Time + Random value
     * @Return
     *
     */
    public static synchronized String genUniqueKey() {
        Random rand = new Random();

        Integer a = rand.nextInt(900000) + 100000;

        return System.currentTimeMillis() + String.valueOf(a);

    }
}
