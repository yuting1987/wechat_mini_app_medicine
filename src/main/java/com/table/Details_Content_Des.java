package com.table;

import org.springframework.stereotype.Component;

import javax.persistence.*;

/**
 * Created by yuting on 2017/3/1.
 */
@Component
@Entity
@Table(name = "details_content_des")
public class Details_Content_Des {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    public Long contentId;

    @Column(nullable = false)
    public String des;
}
