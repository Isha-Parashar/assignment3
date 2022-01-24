package com.example.assignment3.milestone.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.assignment3.milestone.model.Netflix;

public class NetflixRepository {

@Query ("select m from Netflix m") 
List<Netflix> findAll();

//	@Query("select m from Netflix m where m.type=:type")
//	List<Netflix> findByType(@Param("type") String type);
//
	
	
////	from service it will find the columns mentioned in the parameters
//
//	@Query("select m from Netflix m where m.listedIn like %:movieType% and m.type=:type")
//	List<Netflix> findByTypeAndMovieType(@Param("type") String type,@Param("movieType") String movieType);
//	
//	@Query("select m from Netflix m where m.type=:type and m.dateAdded<=:endDate and m.dateAdded>=:startDate")
//	List<Netflix> findUsingDate(@Param("type") String type,@Param("startDate") String startDate,@Param("endDate") String endDate);

}
