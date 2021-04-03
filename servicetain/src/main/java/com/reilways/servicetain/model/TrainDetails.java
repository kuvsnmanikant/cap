package com.reilways.servicetain.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class TrainDetails {
	
	private String Train_name;
	private String Train_type;
	private String Coach_type;
	private int Distance;
	private Noseat Noseats;
	
	public TrainDetails(String train_name, String train_type, String coach_type, int distance, Noseat noseats) {
		super();
		Train_name = train_name;
		Train_type = train_type;
		Coach_type = coach_type;
		Distance = distance;
		Noseats = noseats;
	}
	public TrainDetails() {
		super();
	}
	
	
	
}
