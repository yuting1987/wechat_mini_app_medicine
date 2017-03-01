package com.output;

import com.table.Details_Content;

import java.util.List;

/**
 * Created by yuting on 2017/3/1.
 */

public class Content {

    public String title;

    public String image;

    public List<String> des;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getDes() {
        return des;
    }

    public void setDes(List<String> des) {
        this.des = des;
    }

    public Content(){}

    public Content(Details_Content content, List<String> des){
        this.title = content.title;
        this.image = content.image;
        this.des = des;
    }
}
