package Service;

import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.enicarthage.Entite.Membre;
import tn.enicarthage.Repository.membreRepository;
import tn.enicarthage.Entite.Membre;

public class servicemembre implements IserviceMembre {

	@Autowired
	membreRepository rep;
	private static final Logger L = LogManager.getLogger(servicemembre.class);

	public void insertmember(Membre m) {
		rep.save(m);
		L.info("Member Inserted successfully : "+m.toString());

	}

	public List<Membre> getMembre() {
		return (List<Membre>) rep.findAll();
	}
	@Override
	public Optional<Membre> searchtMembre(Long id) {
		// TODO Auto-generated method stub
		return rep.findById(id);
	}

	@Override
	public void deletetMembre(Long id) {
		// TODO Auto-generated method stub
		rep.deleteById(id);
		
	}
	@Override
	public Membre authenticate(String login, String password) {
		// TODO Auto-generated method stub
		return rep.authenticate(login, password);
	}

	public void mettreAjourEmailByIDM(String email, Long IdM) {
		// TODO Auto-generated method stub
		rep.mettreAjourEmailByIdM(email,IdM);
		
	}
	public void affecterMembreActivité(int IdM, String nom_act) {
		// TODO Auto-generated method stub
		rep.affecterMembreActivité(IdM, nom_act);
		
	}
	public void desaffecterMembreActivité(int IdM, String nom_act) {
		// TODO Auto-generated method stub
		rep.desaffecterMembreActivité(IdM, nom_act);
		
	}
	public String getMembrePrenomById(int IdM) {
		// TODO Auto-generated method stub
		return rep.findById(IdM).get().getPrénom();
	}

	public void deleteMembreById(int IdM) {
		// TODO Auto-generated method stub
		rep.deleteById(IdM);
		
	}
	@Override
	public int getNombreMembreJPQL() {
		// TODO Auto-generated method stub
		return rep.getNombreMembreJPQL();
	}

	public List<String> getAllMembreNamesJPQL() {
		// TODO Auto-generated method stub
		return rep.getAllMembreNamesJPQL();
	}
	@Override
	public List<Membre> getAllMembre() {
		// TODO Auto-generated method stub
		return (List<Membre>) rep.findAll();
	}

	@Override
	public Membre addOrUpdateEmploye(Membre m) {
		// TODO Auto-generated method stub
		return rep.save(m);
	}

	@Override
	public void mettreAjourEmailByMembreIdJPQL(String email, int IdM) {
		// TODO Auto-generated method stub
		 rep.mettreAjourEmailByIdM(email, IdM);
	}

	@Override
	public void deleteMembreById(Long IdM) {
		// TODO Auto-generated method stub
		
	}
}
