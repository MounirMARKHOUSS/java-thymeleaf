package com.inti.formation.controllers;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
 
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.inti.formation.metier.IEtudiantMetier;
import com.inti.formation.metier.IPfeMetier;
import com.inti.formation.metier.ISectionMetier;
import com.inti.formation.models.Enseignant;
import com.inti.formation.models.Etudiant;
import com.inti.formation.models.Pfe;
import com.inti.formation.models.Section;

@Controller
public class EtudiantController {
	@Autowired
	private ISectionMetier secMetier;
	@Autowired
	private IEtudiantMetier metier;
	@Autowired
	private IPfeMetier metierr;

	@RequestMapping("/et")
	public String showPage(Model model) {

		model.addAttribute("etudiants", metier.findAll());
		List<Section> listSection = secMetier.findAll();
		model.addAttribute("sections", listSection);
		return "etudiant";
	}

	@RequestMapping("/r")
	public String shown(Model model) {

		return "welcolme";

	}

	@RequestMapping("/auth")
	public String reSave(Model model , Pfe pfe) {
	 
   model.addAttribute("pfe", new Pfe());
	 

		return "auth";
	}

	@RequestMapping("/enrrrr")

	public String saveEnseignant(@ModelAttribute Pfe pfe ) {

	 
		
		 
		metierr.saveOrUpdate(pfe) ;

		return "redirect:/e";
	}

	@RequestMapping("/etud")
	public String redirectSave(Model model) {

		model.addAttribute("etudiant", new Etudiant());
		List<Section> listSection = secMetier.findAll();
		model.addAttribute("sections", listSection);
		return "etud";
	}

	@RequestMapping("/save")
	public String saveEtudiant(@ModelAttribute Etudiant etudiant, Model model) {

		metier.saveOrUpdate(etudiant);
		List<Section> listSection = secMetier.findAll();
		model.addAttribute("sections", metier.findAll());

		return "redirect:/et";
	}

	@RequestMapping("/delete/{id}")
	public String deleteEtudiant(@PathVariable long id) {
		metier.delete(id);
		return "etudiant";
	}

	@RequestMapping("/edit/{id}")
	public ModelAndView editEtudiant(@PathVariable long id) {

		ModelAndView mav = new ModelAndView("editeetud");
		Etudiant etudiant = metier.get(id);
		mav.addObject("etudiant", etudiant);
		return mav;
	}

	@RequestMapping(value = "/aut")
	public String get(@RequestParam("x") String email, @RequestParam("y") String password, Model model) {

		boolean result = metier.login(email, password);
		if (result == false) {

			return "welcolme";
		} else {

			return "pfe";

		}
	}
}
