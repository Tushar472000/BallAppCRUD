package com.Test.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Test.demo.Repo.BallRepoi;
import com.Test.demo.controller.model.Ball;
import com.Test.demo.controller.model.SpecificData;
import com.Test.demo.service.MyService;


@Component
public class ServiceImplement implements MyService{

	@Autowired
	BallRepoi ballrep;
	
	@Override
	public void addBallInDetabase(Ball ball) {
		
	    ballrep.save(ball);
	    
	}

	public List<SpecificData> getData()
	{
		return ballrep.getAllInformation();
		
	}
	

	

	
}
