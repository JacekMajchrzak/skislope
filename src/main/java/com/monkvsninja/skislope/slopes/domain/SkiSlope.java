package com.monkvsninja.skislope.slopes.domain;

import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@RequiredArgsConstructor
public class SkiSlope {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private final Integer id;
	private final String name;
	private final String address;
	
}
