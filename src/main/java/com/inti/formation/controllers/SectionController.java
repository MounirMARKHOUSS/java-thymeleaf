package com.inti.formation.controllers;

 

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.inti.formation.metier.ISectionMetier;
 
import com.inti.formation.models.Section;
 
 

@Controller
public class SectionController {
	@Autowired
	private ISectionMetier secMetier;
	@Autowired
    private ISectionMetier metier;
	@RequestMapping("/s")
	public String showPage(Model model) {
		model.addAttribute("sections",metier.findAll());
		List<Section> listSection = secMetier.findAll();
	   	model.addAttribute("sections",listSection);
		return"section";
	}
	@RequestMapping("/sect")
	public String redirectSave(Model model) {
		model.addAttribute("section",new Section());
		List<Section> listSection = secMetier.findAll();
	   	model.addAttribute("sections",listSection );
		return"sect";
	}
 	@RequestMapping("/savee")
	
	public String saveeSection(@ModelAttribute Section section,Model model ) {
		metier.saveOrUpdate(section);
		List<Section> listSection = secMetier.findAll();
	   	model.addAttribute("sections",metier.findAll());
		return"redirect:/s";
	} 
 	@RequestMapping("/deletee/{id}")
 	public String deleteSection(@PathVariable long id) {
 		metier.delete(id);
 		return"section";
 	}
 	@RequestMapping("/edite/{id}")
 	public ModelAndView editSection(@PathVariable long id) {
 		ModelAndView mav= new ModelAndView("editsection");
 		Section section = metier.get(id);
 		mav.addObject("section",section);
 	    return mav;
 	}
}
