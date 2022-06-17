package Service;

import org.springframework.stereotype.Service;

import tn.enicarthage.Repository.adminRepository;
import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import tn.enicarthage.Entite.Admin;
@Service
public class serviceadmin  implements IserviceAdmin{

	@Autowired
	adminRepository adm ;
	private static final Logger L = LogManager.getLogger(serviceadmin.class);
	@Override
	public void insertadmin(Admin ad) {
		adm.save(ad);
		L.info("admin Inserted successfully : "+ad.toString());

	}
	public List<Admin> getadmin() {
		return (List<Admin>) adm.findAll();
	}
	/*@Override
	public Optional<Admin> searchtAdmin(String name) {
		// TODO Auto-generated method stub
		return adm.findByName(name);
	}*/
	

	/*public void deletetAdmin(String Nom) {
		// TODO Auto-generated method stub
		adm.deleteByName(Nom);
	}
	public Admin authenticate(String login, String password) {
		// TODO Auto-generated method stub
		return adm.authenticate(login, password);
	}*/
	/*@Override
	public List<Admin> getAdmin() {
		// TODO Auto-generated method stub
		return adm.findByname().getNom().getPrenom();
	}*/
	@Override
	public List<Admin> getAdmin() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Optional<Admin> findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Optional<Admin> searchtAdmin(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Admin> getAllAdmin() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Optional<Admin> searchAdmin(String nameA) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Admin addOrUpdateAdmin(Admin a) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void deleteAdminByName(String nameA) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deletetAdmin(String Nom) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Admin authenticate(String login, String password) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	

}
