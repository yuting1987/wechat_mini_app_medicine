package com.output;

import com.table.Details;

import java.util.Date;
import java.util.List;


public class Detail {

    public String type;

    public String title;

    public String des;

    public String iconUrl;

    public String imgUrl;

    public String vendor;

    public Date date;

    public List<Content> content;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Detail() {
    }

    public List<Content> getContent() {
        return content;
    }

    public void setContent(List<Content> content) {
        this.content = content;
    }

    public Detail(Details detail, List<Content> content){
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
