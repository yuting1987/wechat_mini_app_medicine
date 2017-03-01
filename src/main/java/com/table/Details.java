package com.table;

/**
 * Created by yuting on 2017/3/1.
 */

import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.Date;

@Component
@Entity
@Table(name = "details")
public class Details {
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
}

