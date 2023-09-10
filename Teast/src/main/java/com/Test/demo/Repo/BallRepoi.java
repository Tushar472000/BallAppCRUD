package com.Test.demo.Repo;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.ResponseBody;

import com.Test.demo.controller.model.Ball;
import com.Test.demo.controller.model.SpecificData;


@ResponseBody
public interface BallRepoi extends JpaRepository<Ball, Integer>{

	@Query(value ="select ball_color as BallColor, count(ball_color) as count"
			+ " from ball group by ball_color",nativeQuery = true)
	List<SpecificData> getAllInformation();
	
}
