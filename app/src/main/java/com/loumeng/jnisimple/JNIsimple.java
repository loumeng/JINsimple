package com.loumeng.jnisimple;

/**
 * Created by Administrator on 2017/9/27.
 */

public class JNIsimple{

    public  native  String getnString();

    static {
        System.loadLibrary("simple");
    }

}
