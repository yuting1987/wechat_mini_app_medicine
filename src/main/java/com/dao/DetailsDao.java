package com.dao;

import com.details.Detail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface DetailsDao extends JpaRepository<Detail, Long> {

    List<Detail> findByType(String type);

    Detail findById(Long id);

//    Details findByNameAndAge(String name, Integer age);

//    @Query("from User u where u.name=:name")
//    Details findUser(@Param("name") String name);
}