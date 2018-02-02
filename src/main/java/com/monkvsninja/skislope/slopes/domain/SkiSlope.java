package com.monkvsninja.skislope.slopes.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@JsonSerialize
@RequiredArgsConstructor
public class SkiSlope {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@JsonProperty
	private Integer id;
	@JsonProperty
	private final String name;
	@JsonProperty
	private final String address;
	
}
