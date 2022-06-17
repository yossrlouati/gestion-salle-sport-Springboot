package Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import Service.IserviceMembre;
import tn.enicarthage.Entite.Membre;

@CrossOrigin


@RestController
public class membrecontroller {
	@Autowired
	IserviceMembre memb ;

	@GetMapping("/getAllEmployees")
	public List<Membre> getAllmember(){
		List<Membre>  list = memb.getAllMembre();
		return list;
	}
	@GetMapping("/getEmployeeById/{employee-id}")
	public Optional<Membre> getEmployeeById(@PathVariable("membre-id")Long IdM){
		
		return memb.searchtMembre(IdM);
	}
	
	
	@PostMapping("/saveEmployee")
	@ResponseBody
	public Membre saveMembre(@RequestBody Membre m)
	{	return memb.addOrUpdateEmploye(m);
	}
	
	@DeleteMapping("deleteEmploye/{employee-id}")
	public void deleteEmployee(@PathVariable("membre-id")Long IdM) {
		
		memb.deleteMembreById(IdM);
		
	}

}