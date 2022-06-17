package tn.enicarthage.Entite;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import java.util.Date;
import java.util.Objects;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
@Entity
@Table(name="membre")
public class Membre {

	@Column(name = "nomMem", nullable = false)
	private String Nom;
	@Column(name = "prénomMem",  nullable = false)
	private String Prénom;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idM", unique = true, nullable = false)
   
	private int IdM;
	/*@OneToMany(
	            mappedBy = "idabp",
	            fetch = FetchType.LAZY,
	            cascade = CascadeType.ALL)
	private Set<Payement> payements;*/
	@Column(name = "abonnementpayé")
	private String abon_payé;
	@Temporal(TemporalType.DATE)
	@Column(name = "activation")
	private Date activation;
	@Temporal(TemporalType.DATE)
	@Column(name = "expiration")
	private Date  expiration;
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public String getPrénom() {
		return Prénom;
	}
	public void setPrénom(String prénom) {
		Prénom = prénom;
	}
	public int getIdM() {
		return IdM;
	}
	public void setIdM(int idM) {
		IdM = idM;
	}
	/*public Set<Payement> getPayements() {
		return payements;
	}
	public void setPayements(Set<Payement> payements) {
		this.payements = payements;
	}*/
	public String getAbon_payé() {
		return abon_payé;
	}
	public void setAbon_payé(String abon_payé) {
		this.abon_payé = abon_payé;
	}
	public Date getActivation() {
		return activation;
	}
	public void setActivation(Date activation) {
		this.activation = activation;
	}
	public Date getExpiration() {
		return expiration;
	}
	public void setExpiration(Date expiration) {
		this.expiration = expiration;
	}
	/*@Override
	public int hashCode() {
		return Objects.hash(IdM, Nom, Prénom, abon_payé, activation, expiration, payements);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Membre other = (Membre) obj;
		return IdM == other.IdM && Objects.equals(Nom, other.Nom) && Objects.equals(Prénom, other.Prénom)
				&& Objects.equals(abon_payé, other.abon_payé) && Objects.equals(activation, other.activation)
				&& Objects.equals(expiration, other.expiration) && Objects.equals(payements, other.payements);
	}
	@Override
	public String toString() {
		return "Membre [Nom=" + Nom + ", Prénom=" + Prénom + ", IdM=" + IdM + ", payements=" + payements
				+ ", abon_payé=" + abon_payé + ", activation=" + activation + ", expiration=" + expiration + "]";
	}*/
	public Membre(String nom, String prénom, int idM,  String abon_payé, Date activation,
			Date expiration) {
		
		this.Nom = nom;
		this.Prénom = prénom;
		this.IdM = idM;
		
		this.abon_payé = abon_payé;
		this.activation = activation;
		this.expiration = expiration;
	}

	
}