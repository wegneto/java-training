package com.wegneto.patterns.builder;

import lombok.Getter;
import lombok.Setter;

public class Pizza {
	@Getter @Setter private String dough;
	@Getter @Setter private String sauce;
	@Getter @Setter private String topping;
}
