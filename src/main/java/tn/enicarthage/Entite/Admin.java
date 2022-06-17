package tn.enicarthage.Entite;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="admin")
public class Admin {
	
	@Column(name = "nomad", nullable = false)
	private String NomA;
	@Column(name = "prénomad", nullable = false)
	private String PrénomA;
	@Id
	@Column(name = "email", unique=true,nullable = false)
	private String Email ;
	@Column(name="password",nullable = false)
	private String password;
	

	public Admin(String nom,String prénom,String email,String password) {
		this.NomA=nom;
		this.PrénomA=prénom;
		this.Email=email;
		this.password=password;
		
		
	}


	public String getNom() {
		return NomA;
	}


	public void setNom(String nom) {
		NomA = nom;
	}


	public String getPrénom() {
		return PrénomA;
	}


	public void setPrénom(String prénom) {
		PrénomA = prénom;
	}


	public String getEmail() {
		return Email;
	}


	public void setEmail(String email) {
		Email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public int hashCode() {
		return Objects.hash(Email, NomA, PrénomA, password);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Admin other = (Admin) obj;
		return Objects.equals(Email, other.Email) && Objects.equals(NomA, other.NomA)
				&& Objects.equals(PrénomA, other.PrénomA) && Objects.equals(password, other.password);
	}


	@Override
	public String toString() {
		return "Admin [Nom=" + NomA + ", Prénom=" + PrénomA + ", Email=" + Email + ", password=" + password + "]";
	}




}
