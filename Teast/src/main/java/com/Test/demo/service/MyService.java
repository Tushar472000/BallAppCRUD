package com.Test.demo.service;




import java.util.List;

import org.springframework.stereotype.Service;

import com.Test.demo.controller.model.Ball;
import com.Test.demo.controller.model.SpecificData;
@Service
public interface MyService {

	public void addBallInDetabase(Ball ball);
	public List<SpecificData> getData();
}
