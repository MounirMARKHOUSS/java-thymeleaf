package com.inti.formation.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.inti.formation.metier.IOrganigrameMetier;
import com.inti.formation.metier.IPersonnelMetier;
import com.inti.formation.models.Organigrame;
import com.inti.formation.models.Personnel;

@Controller
public class PersonnelController {
@Autowired
 private IPersonnelMetier metier;
@Autowired

private IOrganigrameMetier orgmetier;	


@RequestMapping("/p")
public String showPage(Model model) {
	model.addAttribute("personnels",metier.findAll());
	List<Organigrame> listOfOrganigrame = orgmetier.findAll();
	model.addAttribute("organigrames",listOfOrganigrame);
	return "personnel";
}
	
@RequestMapping("/perso")
public String redirectSave(Model model) {
	List<Organigrame> listOfOrganigrame = orgmetier.findAll();
	model.addAttribute("organigrames",listOfOrganigrame);
	model.addAttribute("personnel",new Personnel());
	return"perso";	
}
@RequestMapping("/av")
public String deletePersonnel (@ModelAttribute Personnel personnel, Model model ) {
metier.saveOrUpdate(personnel);	
List<Organigrame> listOfOrganigrame = orgmetier.findAll();
model.addAttribute("organigrames",listOfOrganigrame);
return"redirect:/p";
}
@RequestMapping("/supr/{id}")
public String deletePersonnel(@PathVariable long id) {
	metier.delete(id);
	return"personnel";
}
 @RequestMapping("/mod/{id}")
 public ModelAndView editPersonnel(@PathVariable("id")long id) {
	 
	 ModelAndView mav= new ModelAndView("editpersonnel");
	 Personnel personnel = metier.get(id);
	 mav.addObject("personnel",personnel);
	  return mav;
	 
 }



}
