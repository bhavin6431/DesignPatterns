package org.hariom.designpatterns.builder;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Pizza {
	private String crust;
	private String size;
	private String sauce;
	private boolean extraCheese;
	private boolean hasPinaple;
}
