package com.example.swj.riceweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by swj on 2017/5/2.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info;

    }

}