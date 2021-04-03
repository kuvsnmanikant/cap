package com.reilways.servicetain.model;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Document
public class Details {
	@Indexed(name = "train_name")
	private String Train_name;
	private String Train_type;
	private String Coach_type;
	private int Distance;
	private Noseat seat;
	
	public Details(String train_name, String train_type, String coach_type, int distance, Noseat seat) {
		super();
		
		Train_name = train_name;
		Train_type = train_type;
		Coach_type = coach_type;
		Distance = distance;
		this.seat = seat;
	}

	public Details() {
		super();
	}
}
