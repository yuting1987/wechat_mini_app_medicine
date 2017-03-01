package com.dao;

import com.table.Details_Content;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ContentDao extends JpaRepository<Details_Content, Long> {
    List<Details_Content> findByDetailId(Long detailId);
}