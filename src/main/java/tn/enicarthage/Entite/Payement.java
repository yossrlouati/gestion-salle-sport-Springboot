package tn.enicarthage.Entite;
import tn.enicarthage.Entite.Activité;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table(name="payement")
public class Payement {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idp", unique = true, nullable = false)
	private Long idP;
	@ManyToOne
    @JoinColumn(name="idM", nullable = false)
	private Membre mbr;
	@Column(name = "total")
	private  int total;
    @Column(name="type")
	@Enumerated(EnumType.STRING)
	private TypePay typ_payement;
	@Temporal(TemporalType.DATE)
	@Column(name = "datepay")
	private Date datepay;
	@OneToOne
	@JoinColumn(name="prix")
	private Activité act;
	public Long getIdP() {
		return idP;
	}
	public void setIdP(Long idP) {
		this.idP = idP;
	}/*
	public Long getIdabp() {
		return idabp;
	}
	public void setIdabp(Long idabp) {
		this.idabp = idabp;
	}*/
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public TypePay getTyp_payement() {
		return typ_payement;
	}
	public void setTyp_payement(TypePay typ_payement) {
		this.typ_payement = typ_payement;
	}
	public Date getDatepay() {
		return datepay;
	}
	public void setDatepay(Date datepay) {
		this.datepay = datepay;
	}/*
	public Activité getAct() {
		return act;
	}
	public void setAct(Activité act) {
		this.act = act;
	}/*
	@Override
	public int hashCode() {
		return Objects.hash(act, datepay, idP, idabp, total, typ_payement);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Payement other = (Payement) obj;
		return Objects.equals(act, other.act) && Objects.equals(datepay, other.datepay) && idP == other.idP
				&& idabp == other.idabp && total == other.total && typ_payement == other.typ_payement;
	}
	@Override
	public String toString() {
		return "Payement [idP=" + idP + ", idabp=" + idabp + ", total=" + total + ", typ_payement=" + typ_payement
				+ ", datepay=" + datepay + ", act=" + act + "]";
	}*/
	public Payement(Long idP, Long idabp, int total, TypePay typ_payement, Date datepay, Activité act) {
		
		this.idP = idP;
		
		this.total = total;
		this.typ_payement = typ_payement;
		this.datepay = datepay;
		this.act = act;
	}


}