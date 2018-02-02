package com.monkvsninja.skislope.slopes.api;

import com.google.common.collect.Lists;
import com.monkvsninja.skislope.slopes.domain.SkiSlope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/skislopes", produces = "application/json;charset=UTF-8")
public class SkiSlopesApi {

	@RequestMapping(method = RequestMethod.GET)
	public List<SkiSlope> list(){
		return Lists.newArrayList(new SkiSlope("name", "address"));
	}
	
}
