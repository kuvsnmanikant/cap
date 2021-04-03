package com.reilways.servicetain.controllers.url;

import java.util.List;

import com.reilways.servicetain.model.Train;
import com.reilways.servicetain.service.Train1Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/train")
public class Traincontroller {

    @Autowired
	private Train1Service ts;
	
	@GetMapping("/getalltrains")
	public List<Train> getListOfTrain(){
		return ts.getListOfTrain();
	}
	@GetMapping("/sss")
	public String ge(){
		return "qwertyuiop";
	}
	/*
	@GetMapping("/gettid/{id}")
	public Train getSelectedidTrain(@PathVariable String id) {
		return ts.getSelectedidTrain(id);
	}
   */
}
