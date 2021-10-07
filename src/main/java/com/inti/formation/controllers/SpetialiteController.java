package com.inti.formation.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.inti.formation.metier.ISpetialiteMetier;
import com.inti.formation.models.Spetialite;

@Controller
public class SpetialiteController {
	@Autowired
	private ISpetialiteMetier metier;

	@RequestMapping("/spe")

	public String Showpage(Model model) {

		model.addAttribute("spetialites", metier.findAll());
		return "spetialite";
	}

	@RequestMapping("/speti")
	public String redirectSave(Model model) {
		model.addAttribute("spetialite", new Spetialite());
		return "speti";
	}
	@RequestMapping("/autosauv")
	public String enregistrer(@ModelAttribute Spetialite spetialite) {

		metier.saveOrUpdate(spetialite);

		return "redirect:/spe" ;
	}
	
	@RequestMapping("/asp/{id}")
	public String deletespetialite(@PathVariable long id) {
		metier.delete(id);
		return "spetialite";
	}
	
	
	@RequestMapping("/pas/{id}")
	public ModelAndView editespetialite(@PathVariable long id) {
		
		ModelAndView mav= new ModelAndView("editespetialite");
		Spetialite spetialite = metier.get(id);
		mav.addObject("spetialite",spetialite);
		return mav;
	}
	
	

}
