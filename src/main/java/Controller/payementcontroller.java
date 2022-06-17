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

import Service.IservicePayement;
import tn.enicarthage.Entite.Payement;

@CrossOrigin

@RestController
public class payementcontroller {
	@Autowired
	IservicePayement pay ;
	@GetMapping("/getAllpayement")
	public List<Payement> getAllpayement(){
		List<Payement>  list = pay.getpayement();
		return list;
	}
	
	@GetMapping("/getPayementById/{payementId}")
	public Optional<Payement> getPayementById(@PathVariable("payement-id")int idp){
		
		return pay.searchpayement(idp);
	}
	
	
	@PostMapping("/savePayement")
	@ResponseBody
	public Payement savePayement(@RequestBody Payement p)
	{	return pay.insertPayement(p);
	}
	
	@DeleteMapping("deletePayement/{PayementId}")
	public void deleteMembre(@PathVariable("payement_idp")int idp) {
		
		pay.deletetpayement(idp);
		
	}
}
