package Service;

import java.util.List;
import java.util.Optional;

import tn.enicarthage.Entite.Membre;

public interface IserviceMembre {

	void insertmember(Membre m);

	List<Membre> getMembre();

	Optional<Membre> searchtMembre(Long id);

	void deletetMembre(Long id);

	Membre authenticate(String login, String password);

	void mettreAjourEmailByIDM(String email, Long IdM);

	void affecterMembreActivité(int IdM, String nom_act);

	void desaffecterMembreActivité(int IdM, String nom_act);

	String getMembrePrenomById(int IdM);

	void deleteMembreById(Long IdM);

	int getNombreMembreJPQL();

	List<String> getAllMembreNamesJPQL();

	List<Membre> getAllMembre();

	Membre addOrUpdateEmploye(Membre m);

	void mettreAjourEmailByMembreIdJPQL(String email, int IdM);

}
