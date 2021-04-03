package com.reilways.servicetain.interfaces;

import java.util.List;

import com.reilways.servicetain.model.Train;

public interface Train1interface {
	public List<Train> getListOfTrain();
	public Train getSelectedidTrain(String n);
	public Train getSelectednameTrain(String n);
	public String deleteidTrain(String name);
	public String deletenameTrain(String n);
	public String addNewTrain(Train s);
	public String updateTrain(Train t, String s);
}
