package com.details;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.Date;

@Component
@Entity
@Table(name = "details")
public class Detail {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    public String type;

    @Column(nullable = false)
    public String title;

    @Column(nullable = false)
    public String des;

    @Column(nullable = false)
    public String iconUrl;

    @Column(nullable = true)
    public String imgUrl;

    @Column(nullable = false)
    public String vendor;

    @Column(nullable = true)
    public Date date;

    public Detail() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
