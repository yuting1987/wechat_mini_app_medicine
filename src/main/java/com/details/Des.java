package com.details;

/**
 * Created by yuting on 2017/3/1.
 */

import org.springframework.stereotype.Component;

import javax.persistence.*;

@Component
@Entity
@Table(name = "details_content_des")
public class Des {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    public Long contentId;

    @Column(nullable = false)
    public String des;

    public Des() {}

    public Des(Long contentId, String des) {
        this.contentId = contentId;
        this.des = des;
    }
}

