package com.inti.formation.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.inti.formation.metier.IEnseignantMetier;
import com.inti.formation.metier.IPfeMetier;
import com.inti.formation.models.Enseignant;
import com.inti.formation.models.Pfe;
 
@Controller
public class EnseignantController {
	@Autowired
	private IEnseignantMetier metier;
	@Autowired
	private IPfeMetier metierr;
	
	
	@RequestMapping("/rr")
	public String shown(Model model) {
		 return"welc";	 
	}
	
	@RequestMapping("/e")
	public String showPage(Model model) {
		model.addAttribute("enseignants", metier.findAll());

		return "enseignant";
	}
	@RequestMapping("/ppff")
	public String getshow(Model model) {
		model.addAttribute("pfes",metierr.findAll());
		return "pfeen";
	}
	

	@RequestMapping("/ense")
	public String redirectSave(Model model) {

		model.addAttribute("enseignant", new Enseignant());
		return "ense";
	}

	@RequestMapping("/z")
	public String reSave(Model model) {

		model.addAttribute("pfe", new Pfe());

		return "pz";
	}
	
 
	@RequestMapping("/saveeee")

	public String saveEnseignant(@ModelAttribute Pfe pfe) {
		Pfe pfeModified=metierr.getById(pfe.getId_pfe());
		pfe.setDescription(pfeModified.getDescription());
		pfe.setTitre(pfeModified.getTitre());
		    metierr.saveOrUpdate(pfe);
 
		return "redirect:/e";
	}
	@RequestMapping("/sppr/{id}")
	public String deleteEns(@PathVariable long id) {
		metier.delete(id);
		return "enseignant";
	}
	@RequestMapping("/moddi/{id}")
	public ModelAndView editEns(@PathVariable long id) {
		ModelAndView mav = new ModelAndView("editepfeen");
		Pfe  pfe  = metierr.get(id);
		mav.addObject("pfe",pfe );
		return mav;
	}
	
	////////
 

	@RequestMapping("/sav")

	public String savEnseignant(@ModelAttribute Enseignant enseignant) {

		metier.saveOrUpdate(enseignant);
		return "redirect:/";
	}

	@RequestMapping("/del/{id}")
	public String deleteEnseignant(@PathVariable long id) {
		metier.delete(id);
		return "redirect:/";
	}

	@RequestMapping("/edi/{id}")
	public ModelAndView editEnseignant(@PathVariable long id) {
		ModelAndView mav = new ModelAndView("editetudiant");
		Enseignant enseignant = metier.get(id);
		mav.addObject("enseignant", enseignant);
		return mav;
	}
 
	@RequestMapping(value ="/ppfff")
	public String gete(@RequestParam("M") String email, @RequestParam("N") String password, Model model) {

		boolean result = metier.login(email, password);
		if (result == false) {

			return "welc";
		} else {

			return "pfeen";

		}
	}

}
