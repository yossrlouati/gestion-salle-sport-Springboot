package tn.enicarthage.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.enicarthage.Entite.Payement;



@Repository
public interface payementRepository extends CrudRepository<Payement,Long> {
	@Query(value="delete from Payement where pay_id:= idp ", nativeQuery = true)
	void deleteById(int idp);
	
	@Query(value="select from Payement where pay_id:= idp ", nativeQuery = true)
	Optional<Payement> findById(int idp);

}
