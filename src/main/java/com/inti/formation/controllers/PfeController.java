package com.inti.formation.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.inti.formation.metier.IPfeMetier;
import com.inti.formation.models.Pfe;

@Controller
public class PfeController {
	@Autowired
	private IPfeMetier metier;
	
	@RequestMapping("/")
	public String showPage(Model model) {
		model.addAttribute("pfes",metier.findAll());
		
		
		return "welcolme";
	}
 
	
	@RequestMapping("/enreg")
	public String enregPfe(@ModelAttribute Pfe pfe) {
		
 
	metier.saveOrUpdate(pfe);
		return"redirect:/auth";
	}
	
	@RequestMapping("/ad/{id}")
	public String deletePfe(@PathVariable long id) {
		
		return "redirect:/";
	}
	
	@RequestMapping("/led/{id}")
	public ModelAndView editPfe(@PathVariable long id) {
		ModelAndView mav = new ModelAndView("editpfe");
		Pfe pfe = metier.get(id);
		mav.addObject("pfe",pfe);
		return mav;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
