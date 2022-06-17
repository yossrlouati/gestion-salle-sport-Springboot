package tn.enicarthage.Repository;

//import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Admin;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



import tn.enicarthage.Entite.Admin;
@Repository
public interface adminRepository extends CrudRepository<Admin,Long>{

}
