package com.dao;

import com.table.Details;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetailsDao extends JpaRepository<Details, Long> {

//    List<Detail> findByType(String type);

//    Detail findById(Long id);

//    Details findByNameAndAge(String name, Integer age);

//    @Query("from User u where u.name=:name")
//    Details findUser(@Param("name") String name);

}