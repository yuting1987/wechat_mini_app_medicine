package com.input;

import java.util.Date;

public class Detail {

    private Long id;

    public String type;

    public String title;

    public String des;

    public String iconUrl;

    public String imgUrl;

    public String vendor;

    public Date date;

    public Detail(){

    }

    public Detail(String type, String title, String des, String iconUrl, String imgUrl, String vendor , Date date) {
        this.type = type;
        this.title = title;
        this.des = des;
        this.iconUrl = iconUrl;
        this.imgUrl = imgUrl;
        this.vendor = vendor;
        this.date = date;
    }
}
