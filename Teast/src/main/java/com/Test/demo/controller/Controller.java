package com.Test.demo.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Test.demo.controller.model.Ball;
import com.Test.demo.controller.model.SpecificData;
import com.Test.demo.service.MyService;

@CrossOrigin(origins = "*")
@RestController
public class Controller {

	@Autowired()
	MyService service;
	
	
	@PostMapping("addBall")
	public void addBall(@RequestBody Ball ball)
	{
		service.addBallInDetabase(ball);
	}
	
	@GetMapping("getData")
	public List<SpecificData> getdata()
	{
		return service.getData();
		
	}
	
	
}
