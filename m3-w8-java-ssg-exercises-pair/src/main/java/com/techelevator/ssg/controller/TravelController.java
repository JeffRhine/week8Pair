package com.techelevator.ssg.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.techelevator.ssg.model.AlienAgeCalculator;
import com.techelevator.ssg.model.AlienTravelCalculator;

import java.math.BigDecimal;
@Controller
public class TravelController {
	

	

	
	

		@RequestMapping("/travelCalculatorInput")
		public String showTravelCalculatorInputPage() {
			return "travelCalculatorInput";
		}
		@RequestMapping("/travelCalculatorResult")
		public String showAgeCalculatorResultPage(@RequestParam String planet, @RequestParam int age,@RequestParam String transport, ModelMap modelHolder) {
			AlienTravelCalculator calc = new AlienTravelCalculator(  age,  planet, transport);
			modelHolder.put("calculator", calc);
			return "travelCalculatorResult";
		}
		
	
}
