package Service;

import java.util.List;
import java.util.Optional;

import tn.enicarthage.Entite.Admin;
public interface IserviceAdmin {


	void insertadmin(Admin ad);

	List<Admin> getAdmin();

	void deletetAdmin(String Nom);

	Admin authenticate(String login, String password);
	
	public Optional<Admin> findByName(String name);

	Optional<Admin> searchtAdmin(String name);

	List<Admin> getAllAdmin();

	Optional<Admin> searchAdmin(String nameA);

	Admin addOrUpdateAdmin(Admin a);

	void deleteAdminByName(String nameA);
}
