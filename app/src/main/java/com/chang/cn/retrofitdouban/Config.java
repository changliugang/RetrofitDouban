package com.chang.cn.retrofitdouban;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chang on 2016/7/15.
 */
public class Config {

    public final static int COMING_SOON = 1;


    public final static int PAGE_SIZE = 10;



    public static List<String> stringList(){
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add("String"+i);
        }
        return list;
    }

}

