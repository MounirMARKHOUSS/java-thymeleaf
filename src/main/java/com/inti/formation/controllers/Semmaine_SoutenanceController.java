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
import com.inti.formation.metier.ISemmaine_SoutenanceMetier;
import com.inti.formation.models.Section;
import com.inti.formation.models.Semmaine_Soutenance;

@Controller
public class Semmaine_SoutenanceController {
	@Autowired
	  private ISectionMetier secMetier;
	@Autowired
	private ISemmaine_SoutenanceMetier metier;
	@RequestMapping("/SEM")
	public String showPage(Model model) {
		
		model.addAttribute("semmaine_soutenances",metier.findAll());
		List<Section> listSection = secMetier.findAll();
	   	model.addAttribute("sections",listSection);
		return"soutenance";
	}
	@RequestMapping("/sout")
	public String redirectSave(Model model) {
		
		model.addAttribute("semmaine_soutenance",new Semmaine_Soutenance());
		List<Section> listSection = secMetier.findAll();
	   	model.addAttribute("sections",listSection );
		return"sout";
	}
	@RequestMapping("/sa")
	public String saSemmaine_Soutenance (@ModelAttribute Semmaine_Soutenance semmaine_soutenance,Model model)
    {
		metier.saveOrUpdate(semmaine_soutenance );
		List<Section> listSection = secMetier.findAll();
	   	model.addAttribute("sections",metier.findAll());
		return"redirect:/SEM";
	}
 
	@RequestMapping("/de/{id}")
	
	public  String  deleteSemmaine_Soutenance(@PathVariable long id) {
		
		metier.delete(id);
		return "soutenance";
	}
	
	@RequestMapping("/ed/{id}")
	public ModelAndView  editSemmaine_Soutenance(@PathVariable long id) {
		ModelAndView mav = new ModelAndView("editsout");
		Semmaine_Soutenance semmaine_soutenance = metier.get(id);
		mav.addObject ("semmaine_soutenance",semmaine_soutenance);
		return mav;
	}
	
	
}
