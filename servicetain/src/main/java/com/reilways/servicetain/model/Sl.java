package com.reilways.servicetain.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Sl {
	private List<Integer> coach;

	public Sl(List<Integer> coach) {
		super();
		this.coach = coach;
	}

	public Sl() {
		super();
	}
	
}
