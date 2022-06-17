package Service;

import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import tn.enicarthage.Entite.Payement;
import tn.enicarthage.Repository.payementRepository;

public class servicepayement implements IservicePayement {


	@Autowired
     payementRepository prep;

	private static final Logger L = LogManager.getLogger(servicepayement.class);


	@Override
	public Payement insertPayement(Payement p) {
		// TODO Auto-generated method stub
		prep.save(p);
		L.info("payment Inserted successfully : "+p.toString());
		return p;
		
	}

	@Override
	public void deletetpayement(int idp) {
		// TODO Auto-generated method stub
		prep.deleteById((long) idp);
	}

	@Override
	public Optional<Payement> searchpayement(int idp) {
		// TODO Auto-generated method stub
		return prep.findById((long) idp);
	}

	@Override
	public List<Payement> getpayement() {
		// TODO Auto-generated method stub
		return (List<Payement>) prep.findAll();
	}


	

}
