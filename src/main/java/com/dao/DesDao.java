package com.dao;

import com.details.Des;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface DesDao extends JpaRepository<Des, Long> {

    List<Des> findByContentId(Long contentId);

}