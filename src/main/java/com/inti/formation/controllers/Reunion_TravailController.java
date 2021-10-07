package com.inti.formation.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.inti.formation.metier.IReunion_TravailMetier;
import com.inti.formation.models.Reunion_Travail;
 

@Controller
public class Reunion_TravailController {
	@Autowired
	private IReunion_TravailMetier metier;

	@RequestMapping("/re")
	public String showPage(Model model) {

		model.addAttribute("reunion_travails",metier.findAll() );

		return "reunion";
	}
	@RequestMapping("/reun")
   public String RedirectSave(Model model) {
		
		model.addAttribute("reunion_travail", new Reunion_Travail ());
		
		return"reun";
	}
	@RequestMapping("/enregistre")
	public String saveReunion_Travail(@ModelAttribute Reunion_Travail  reunion_travail) {
		
		metier.saveOrUpdate(reunion_travail);
		
		return"redirect:/re";
	}
	@RequestMapping("/supresssion/{id}")
	public String deleteReunion_Travail (@PathVariable long id) {
		
	metier.delete(id);
	return"reunion";
	}
	@RequestMapping("/modification/{id}")
	public ModelAndView editReunion_Travail(@PathVariable long id) {
		
		ModelAndView mav = new ModelAndView("eidtereunion");
		Reunion_Travail reunion_travail=metier.get(id);
		mav.addObject("reunion_travail",reunion_travail);
		
		return mav;
	}
	
	
	
}
