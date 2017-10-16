package com.techelevator.ssg.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.techelevator.ssg.model.AlienAgeCalculator;

import java.math.BigDecimal;

@Controller
public class AlienAgeController {

	@RequestMapping("/ageCalculatorInput")
	public String showAgeCalculatorInputPage() {
		return "ageCalculatorInput";
	}
	@RequestMapping("/ageCalculatorResult")
	public String showAgeCalculatorResultPage(@RequestParam String planet, @RequestParam int age, ModelMap modelHolder) {
		AlienAgeCalculator calc = new AlienAgeCalculator(age, planet);
		modelHolder.put("calculator", calc);
		return "ageCalculatorResult";
	}
	
}