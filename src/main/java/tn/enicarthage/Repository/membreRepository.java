package tn.enicarthage.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.enicarthage.Entite.Membre;


@Repository
public interface membreRepository extends CrudRepository<Membre,Long> {

	@Query(value = "SELECT * FROM Membre m WHERE m.login =: login and  m.password = password" , nativeQuery = true)
	public Membre authenticate(String login, String password);
    
	@Query(value = "update Membre m set m.email =: email WHERE m.id =: IdM " , nativeQuery = true)
	void mettreAjourEmailByIdM(String email, Long idM);
	 
	@Query(value = "insert into Membre_activité values(IdM,nom_act) " , nativeQuery = true)
	void affecterMembreActivité(int idM, String nom_act);

	@Query(value = "delete from Membre_activité where membre_id := IdM" , nativeQuery = true)
	void desaffecterMembreActivité(int idM, String nom_act);
   
	@Query(value="select from Membre where membre_id:= IdM ", nativeQuery = true)
	Optional<Membre> findById(int idM);

	@Query(value="delete from Membre where membre_id:= IdM ", nativeQuery = true)
	void deleteById(int idM);
 
	@Query(value = "select count(*) from Membre" , nativeQuery = true)
	int getNombreMembreJPQL();

	@Query(value = "select nom from Membre" , nativeQuery = true)
	List<String> getAllMembreNamesJPQL();

	@Query(value = "update Membre m set m.email =: email WHERE m.id =: IdM " , nativeQuery = true)
	void mettreAjourEmailByIdM(String email, int idM);

}
