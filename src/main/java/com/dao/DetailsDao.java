package com.dao;

import com.table.Details;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DetailsDao extends JpaRepository<Details, Long> {

    List<Details> findByType(String type);

    Details findById(Long id);

//    Details findByNameAndAge(String name, Integer age);

//    @Query("from User u where u.name=:name")
//    Details findUser(@Param("name") String name);

}