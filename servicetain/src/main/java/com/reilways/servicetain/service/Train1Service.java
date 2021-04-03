package com.reilways.servicetain.service;

import java.util.List;
import java.util.Optional;

import com.reilways.servicetain.database.TrainDataBase;
import com.reilways.servicetain.exception.NotFoundException;
import com.reilways.servicetain.interfaces.Train1interface;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.reilways.servicetain.model.Train;

@Service
public class Train1Service implements Train1interface{
	/*
	 * private TrainDataBase tdb;
	 * 
	 * @Autowired public Train1Service(TrainDataBase tdb) { super(); this.tdb = tdb;
	 * }
	 */
	@Autowired
	private TrainDataBase tdb;
	@Override
	public List<Train> getListOfTrain(){
		return tdb.findAll();
	}
	@Override
	public Train getSelectedidTrain(String n){
		Optional<Train> addOn = tdb.findById(n);
		if(!addOn.isPresent())
			throw new NotFoundException("AddOn with the id "+ n + "not exist");
		return addOn.get();
	}
	@Override
	public Train getSelectednameTrain(String n){
		Optional<Train> addOn = tdb.findById(n);
		if(!addOn.isPresent())
			throw new NotFoundException("AddOn with the name "+ n + "not exist");
		return addOn.get();
	}
	@Override
	public String deleteidTrain(String name) {
		Optional<Train> addOn = tdb.findById(name);
		if(!addOn.isPresent())
			throw new NotFoundException("AddOn with the id "+ name + "not exist");
		tdb.deleteById(name);
		return "Train removed Successfully!!";
	}
	@Override
	public String deletenameTrain(String n){
		Optional<Train> addOn = tdb.findById(n);
		if(!addOn.isPresent())
			throw new NotFoundException("AddOn with the name "+ n + "not exist");
		tdb.deleteById(n);
		return "Train removed Successfully!!";
	}
	@Override
	public String addNewTrain(Train s) {
		tdb.insert(s);
		return "Train added Successfully!!";
	}
	@Override
	public String updateTrain(Train t, String s) {
		Optional<Train> saved = tdb.findById(s);
		if(!saved.isPresent())
			throw new NotFoundException("AddOn with the id "+ s + "not exist");
		tdb.save(t);
		return "Train Updated Successfully!!";
	}

	
}
