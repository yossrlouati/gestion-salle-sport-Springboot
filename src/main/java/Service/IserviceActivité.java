package Service;

import java.util.List;
import java.util.Optional;

import tn.enicarthage.Entite.Activité;

public interface IserviceActivité {

	Activité insertActivité(Activité a);

	void deletetActivité(String nom_act);
	
	Optional<Activité> searchActivité(String nom_act);

	List<Activité> getActivité();
}
