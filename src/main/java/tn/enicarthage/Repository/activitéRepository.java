package tn.enicarthage.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.enicarthage.Entite.Activité;


@Repository
public interface activitéRepository extends JpaRepository<Activité,Long>{
	@Query(value = "insert into activité values(nom_act,prix_mens) " , nativeQuery = true)
	void save(int idM, String nom_act);
    
	@Query(value="delete from Activité where act_name:= nom_act ", nativeQuery = true)
	void deleteByname(String nom_act);

	@Query(value="select from Activité where act_name:= nom_act ", nativeQuery = true)
	Optional<Activité> findByname(String nom_act);
}
