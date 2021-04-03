package com.reilways.servicetain.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
public class Ac {
	private List<Integer> coach;

	public Ac(List<Integer> coach) {
		super();
		this.coach = coach;
	}

	public Ac() {
		super();
	}
	
}
