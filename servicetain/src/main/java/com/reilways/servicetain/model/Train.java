package com.reilways.servicetain.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
@Document(collection = "Train")
public class Train {
	@Id
	private String Train_id;
	private String Train_fistday;
	//collection = "Train"
	private String Train_lastday;
	private String Arrival_time;
	private String Departure_time;
	private Details details;
	private String[] Stations;
	@PersistenceConstructor
	public Train(String train_id, String train_fistday, String train_lastday, String arrival_time,
			String departure_time, Details details, String[] stations) {
		super();
		Train_id = train_id;
		Train_fistday = train_fistday;
		Train_lastday = train_lastday;
		Arrival_time = arrival_time;
		Departure_time = departure_time;
		this.details = details;
		Stations = stations;
	}
	public Train() {
		super();
	}
	
	
	
	
	
}
