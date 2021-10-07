package com.inti.formation.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.inti.formation.metier.IOrganigrameMetier;
import com.inti.formation.models.Organigrame;

@Controller
public class OrganigrameController {
	@Autowired
	 
private IOrganigrameMetier metier;	
	@RequestMapping("/o")
	public String showPage(Model model) {
		
	model.addAttribute("organigrames",metier.findAll());
		
	return "organigrame";
	}
	@RequestMapping("/org")
	public String redirectSave(Model model) {
		
		model.addAttribute("organigrame",new  Organigrame());
		return "org";
	}
	@RequestMapping("/savvvvv")
	public String saveOrganigrame(@ModelAttribute Organigrame organigrame) {
		metier.saveOrUpdate(organigrame);
		return"redirect:/o";
	}
	
	 	@RequestMapping("/dell/{id}")
	public String deleteOrganigrame(@PathVariable long id) {
		metier.delete(id);
		return"organigrame";
	}
	 @RequestMapping("/eddd/{id_Organigrame}")
	public ModelAndView editOrganigrame(@PathVariable("id_Organigrame") long id) {
		ModelAndView mav= new ModelAndView("editorganigrame");
		Organigrame organigrame = metier.get(id);
		mav.addObject("organigrame",organigrame);
	    return mav;
	} 
}
