package com.details;

import java.util.Date;
import java.util.List;

/**
 * Created by yuting on 2017/3/1.
 */
public class D {

    public Date date;
    public String vendor;
    public String imgUrl;
    public String iconUrl;
    public String des;
    public String title;
    public String type;

    public List<Content> getContent() {
        return content;
    }

    public void setContent(List<Content> content) {
        this.content = content;
    }

    public List<Content> content;

    public D() {
    }

    public D(Detail detail, List<Content> content){
        this.type = detail.type;
        this.title = detail.title;
        this.des = detail.des;
        this.iconUrl = detail.iconUrl;
        this.imgUrl = detail.imgUrl;
        this.vendor = detail.vendor;
        this.date = detail.date;
        this.content = content;
    }
}
