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

import Service.IserviceAdmin;
import tn.enicarthage.Entite.Admin;

@CrossOrigin


@RestController
public class admincontroller {
	@Autowired
	IserviceAdmin ad;
    
	@GetMapping("/getAllAdmin")
	public List<Admin> getAllAdmin(){
		List<Admin>  list = ad.getAllAdmin();
		return list;
	}
	@GetMapping("/getAdminbyname/{Admin-name}")
	public Optional<Admin> getAdminByName(@PathVariable("Admin-name")String NameA){
		
		return ad.searchAdmin(NameA);
	}
	

	@PostMapping("/saveAdmin")
	@ResponseBody
	public Admin saveMembre(@RequestBody Admin a)
	{	return ad.addOrUpdateAdmin(a);
	}
	
	@DeleteMapping("deleteAdmin/{Admin-id}")
	public void deleteEmployee(@PathVariable("admin-id")String NameA) {
		
		ad.deleteAdminByName(NameA);
		
	}
}