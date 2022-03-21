package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeacherController {

	@GetMapping(path="/teachers")
	public String getTeacher() {
		List<String> list =Arrays.asList("ram","sam","stella");
		return list.toString();
	}
	@GetMapping(path ="/teachers/{dept}")
	public String getTeachersByDept(@PathVariable("dept") String dept) {
		
		List<String> list = Arrays.asList("ram","sam","stella");
		if(dept.equals("ece")) {
			list = Arrays.asList("Shankar","Salim","Simon");
		}
		return list.toString();
		
	}
}
