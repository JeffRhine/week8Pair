package com.techelevator.ssg.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.techelevator.ssg.model.AlienAgeCalculator;
import com.techelevator.ssg.model.AlienWeightCalculator;

import java.math.BigDecimal;

@Controller
public class WeightController {

	@RequestMapping("/weightCalculatorInput")
	public String showWeightCalculatorInputPage() {
		return "weightCalculatorInput";
	}
	
	@RequestMapping("/weightCalculatorResult")
	public String showWeightCalculatorResultPage(@RequestParam String planet, @RequestParam int weight, ModelMap modelHolder) {
		AlienWeightCalculator calc = new AlienWeightCalculator(weight, planet);
		modelHolder.put("calculator", calc);
		return "weightCalculatorResult";
	}
	}
//}