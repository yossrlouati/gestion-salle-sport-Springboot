package Service;

import java.util.List;
import java.util.Optional;

import tn.enicarthage.Entite.Payement;

public interface IservicePayement {

	List<Payement> getpayement();

	Optional<Payement> searchpayement(int idp);

	Payement insertPayement(Payement p);

	void deletetpayement(int idp);
}
