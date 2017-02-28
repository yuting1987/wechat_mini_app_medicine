package com.details;

import org.springframework.data.jpa.repository.JpaRepository;


public interface DetailsRepository extends JpaRepository<Details, Long> {

//    Details findByName(String name);

//    Details findByNameAndAge(String name, Integer age);

//    @Query("from User u where u.name=:name")
//    Details findUser(@Param("name") String name);
}