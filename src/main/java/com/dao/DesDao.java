package com.dao;

import com.table.Details_Content_Des;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DesDao extends JpaRepository<Details_Content_Des, Long> {

    List<Details_Content_Des> findByContentId(Long contentId);

}