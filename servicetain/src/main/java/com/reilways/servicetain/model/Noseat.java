package com.reilways.servicetain.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Noseat {
	private Ac ac;
	private Sl sl;
	public Noseat(Ac ac, Sl sl) {
		super();
		this.ac = ac;
		this.sl = sl;
	}
	public Noseat(Sl sl) {
		super();
		this.sl = sl;
	}
	public Noseat(Ac ac) {
		super();
		this.ac = ac;
	}
	public Noseat() {
		super();
	}
}
