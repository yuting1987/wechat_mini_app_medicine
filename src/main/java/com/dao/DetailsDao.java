package com.dao;

import com.table.Details;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DetailsDao extends JpaRepository<Details, Long> {

    List<Details> findByType(String type);

    Details findById(Long id);

    @Query("from Details d where d.title like %:title%")
    List<Details> findByTitleLike(@Param("title") String title);

    @Query("from Details d where d.type=:type and d.title like %:title%")
    List<Details> findByTypeAndTitleLike(@Param("type") String type, @Param("title") String title);
}