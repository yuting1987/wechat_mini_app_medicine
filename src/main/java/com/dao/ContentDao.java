package com.dao;

import com.details.Content;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ContentDao extends JpaRepository<Content, Long> {

    List<Content> findByDetailId(Long detailId);

}