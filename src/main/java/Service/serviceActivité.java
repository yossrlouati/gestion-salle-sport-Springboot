package Service;
import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import tn.enicarthage.Entite.Activité;
import tn.enicarthage.Repository.activitéRepository;

public class serviceActivité implements IserviceActivité {

	@Autowired
    activitéRepository arep;

	private static final Logger L = LogManager.getLogger(serviceActivité.class);


	@Override
	public Activité insertActivité(Activité a) {
		// TODO Auto-generated method stub
		arep.save(a);
		L.info("Activity Inserted successfully : "+a.toString());
		return a;
		
	}

	@Override
	public void deletetActivité(String nom_act) {
		// TODO Auto-generated method stub
		arep.deleteByname(nom_act);
	}

	@Override
	public Optional<Activité> searchActivité(String nom_act) {
		// TODO Auto-generated method stub
		return arep.findByname(nom_act);
	}

	@Override
	public List<Activité> getActivité() {
		// TODO Auto-generated method stub
		return (List<Activité>) arep.findAll();
	}
}
