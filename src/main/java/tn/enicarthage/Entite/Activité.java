package tn.enicarthage.Entite;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="activité")
public class Activité {
	@Id
	//@Column(name = "nomactivite", unique = true, nullable = false)
	private String nom_act;
	//@Column(name = "prixact", nullable = false)
	private int prix_mens;


	public Activité(String nom,int prix) {
		this.nom_act=nom;
		this.prix_mens=prix;
	}


	public String getNom_act() {
		return nom_act;
	}


	public void setNom_act(String nom_act) {
		this.nom_act = nom_act;
	}


	public int getPrix_mens() {
		return prix_mens;
	}


	public void setPrix_mens(int prix_mens) {
		this.prix_mens = prix_mens;
	}


	@Override
	public int hashCode() {
		return Objects.hash(nom_act, prix_mens);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Activité other = (Activité) obj;
		return Objects.equals(nom_act, other.nom_act) && prix_mens == other.prix_mens;
	}


	@Override
	public String toString() {
		return "Activité [nom_act=" + nom_act + ", prix_mens=" + prix_mens + "]";
	}
	

}
