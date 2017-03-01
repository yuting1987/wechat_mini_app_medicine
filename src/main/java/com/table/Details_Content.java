package com.table;

import org.springframework.stereotype.Component;

import javax.persistence.*;

/**
 * Created by yuting on 2017/3/1.
 */

@Component
@Entity
@Table(name = "details_content")
public class Details_Content {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    public Long detailId;

    @Column(nullable = false)
    public String title;

    @Column(nullable = true)
    public String image;

    public Details_Content() {}

    public Details_Content(Long detailId, String title, String image) {
        this.detailId = detailId;
        this.title = title;
        this.image = image;
    }
}

