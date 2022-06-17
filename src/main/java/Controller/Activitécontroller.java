package Controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import Service.IserviceActivité;
import tn.enicarthage.Entite.Activité;
@CrossOrigin

@RestController
public class Activitécontroller {

	@Autowired
	IserviceActivité act ;
	@GetMapping("/getAllActivities")
	public List<Activité> getAllActivities(){
		List<Activité>  list = act.getActivité();
		return list;
	}
	
	@GetMapping("/getActivitéByname/{Activité-name}")
	public Optional<Activité> getActivitéByname(@PathVariable("activité-name")String nom_act){
		
		return act.searchActivité(nom_act);
	}
	
	
	@PostMapping("/saveActivité")
	@ResponseBody
	public Activité saveActivité(@RequestBody Activité a)
	{	return act.insertActivité(a);
	}
	
	
	@DeleteMapping("deleteActivité/{Activité-name}")
	public void deleteMembre(@PathVariable("Activité-nam")String nom_act) {
		
		act.deletetActivité(nom_act);
		
	}
	
	

   /* @PostMapping("/Activité/edit/{name}")
    public String editActivité(@PathVariable("nom_act") String nom_act, @ModelAttribute("ActivitéForm") Activité ActivitéForm, BindingResult bindingResult, Model model){
        act.validate(ActivitéForm, bindingResult);

        if (bindingResult.hasErrors()) {
            logger.error(String.valueOf(bindingResult.getFieldError()));
            model.addAttribute("method", "edit");
            return "activité";
        }
        serviceActivité.edit(nom_act, ActivitéForm);
        logger.debug(String.format("Product with name: %s has been successfully edited.", nom_act));

        return "redirect:/home";
    }
*/
}
