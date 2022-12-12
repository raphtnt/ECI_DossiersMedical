package model;

import java.util.Date;

public class Actes {
	
	private int idActe;
	private double PrixActe;
	private Date DateDebut;
	private Date DateFin;
	private String Duree;
	private int idPatient;
	private int idLocal;
	private int idSpecialisation;
	private int idEmploye;
	
	
	/**
	 * @param idActe
	 * @param prixActe
	 * @param dateDebut
	 * @param dateFin
	 * @param duree
	 * @param idPatient
	 * @param idLocal
	 * @param idSpecialisation
	 * @param idEmploye
	 */
	public Actes(double prixActe, Date dateDebut, Date dateFin, String duree, int idPatient, int idLocal,
			int idSpecialisation, int idEmploye) {
		super();
		PrixActe = prixActe;
		DateDebut = dateDebut;
		DateFin = dateFin;
		Duree = duree;
		this.idPatient = idPatient;
		this.idLocal = idLocal;
		this.idSpecialisation = idSpecialisation;
		this.idEmploye = idEmploye;
		idActe++;
	}
		

	/**
	 * @return the idSpecialisation
	 */
	public int getIdSpecialisation() {
		return idSpecialisation;
	}
	/**
	 * @param idSpecialisation the idSpecialisation to set
	 */
	public void setIdSpecialisation(int idSpecialisation) {
		this.idSpecialisation = idSpecialisation;
	}
	/**
	 * @return the idEmploye
	 */
	public int getIdEmploye() {
		return idEmploye;
	}
	/**
	 * @param idEmploye the idEmploye to set
	 */
	public void setIdEmploye(int idEmploye) {
		this.idEmploye = idEmploye;
	}
	
	
	/**
	 * @return the prixActe
	 */
	public double getPrixActe() {
		return PrixActe;
	}
	/**
	 * @param prixActe the prixActe to set
	 */
	public void setPrixActe(double prixActe) {
		PrixActe = prixActe;
	}
	/**
	 * @return the dateDebut
	 */
	public Date getDateDebut() {
		return DateDebut;
	}
	/**
	 * @param dateDebut the dateDebut to set
	 */
	public void setDateDebut(Date dateDebut) {
		DateDebut = dateDebut;
	}
	/**
	 * @return the dateFin
	 */
	public Date getDateFin() {
		return DateFin;
	}
	/**
	 * @param dateFin the dateFin to set
	 */
	public void setDateFin(Date dateFin) {
		DateFin = dateFin;
	}
	/**
	 * @return the duree
	 */
	public String getDuree() {
		return Duree;
	}
	/**
	 * @param duree the duree to set
	 */
	public void setDuree(String duree) {
		Duree = duree;
	}

	/**
	 * @return the idPatient
	 */
	public int getIdPatient() {
		return idPatient;
	}
	/**
	 * @param idPatient the idPatient to set
	 */
	public void setIdPatient(int idPatient) {
		this.idPatient = idPatient;
	}
	/**
	 * @return the idLocal
	 */
	public int getIdLocal() {
		return idLocal;
	}
	/**
	 * @param idLocal the idLocal to set
	 */
	public void setIdLocal(int idLocal) {
		this.idLocal = idLocal;
	}
	/**
	 * @return the idActe
	 */
	public int getIdActe() {
		return idActe;
	}
		
}
