package tn.enicarthage.Entite;

import java.util.Objects;

public class Login {
	private String emailA;
	private String mdp;



	public Login(String emailA, String mdp) {
		
		this.emailA = emailA;
		this.mdp = mdp;
	}



	@Override
	public int hashCode() {
		return Objects.hash(emailA, mdp);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Login other = (Login) obj;
		return Objects.equals(emailA, other.emailA) && Objects.equals(mdp, other.mdp);
	}



	public String getEmailA() {
		return emailA;
	}



	public void setEmailA(String emailA) {
		this.emailA = emailA;
	}



	public String getMdp() {
		return mdp;
	}



	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
	

}
