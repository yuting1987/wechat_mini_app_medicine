package com.details;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.List;

/**
 * Created by yuting on 2017/3/1.
 */

@Component
@Entity
@Table(name = "details_content")
public class Content {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    public Long detailId;

    @Column(nullable = false)
    public String title;

    @Column(nullable = true)
    public String image;

    public Long getId() {
        return id;
    }

    public void setDes(List<Des> des) {
        this.des = des;
    }

    public List<Des> des;

    public Content() {}

    public Content(Long detailId, String title, String image) {
        this.detailId = detailId;
        this.title = title;
        this.image = image;
    }
}
