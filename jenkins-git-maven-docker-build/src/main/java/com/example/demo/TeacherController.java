package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeacherController {

	@GetMapping(path="/teachers")
	public String getTeacher() {
		List<String> list =Arrays.asList("ram","sam","stella");
		return list.toString();
	}
}
