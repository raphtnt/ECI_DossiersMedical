package model;

/**
 * @author Kidibule
 *
 */
public class Rapports {

	static int si_Nb_Rapport=0;
	
	private int Id_Rapport;
	private int Id_typeR;
	private int Id_Acte;
	private int Id_patient;
	private String DateR;
	private String Rapport; 
	
	
	
	public Rapports() 
	{
		this.Id_Rapport=si_Nb_Rapport;
		this.Id_Acte = -1;
		this.Id_typeR = -1;
		this.Id_patient = -1;
		this.DateR = " ";
		this.Rapport = " ";

		si_Nb_Rapport++;
	}



	/**
	 * @param id_Rapport
	 * @param id_typeR
	 * @param id_Acte
	 * @param id_patient
	 * @param dateR
	 * @param rapport
	 */
	public Rapports(int id_Rapport, int id_typeR, int id_Acte, int id_patient, String dateR, String rapport) {
		
		Id_Rapport = id_Rapport;
		Id_typeR = id_typeR;
		Id_Acte = id_Acte;
		Id_patient = id_patient;
		DateR = dateR;
		Rapport = rapport;
		
		si_Nb_Rapport++;
	}



	/**
	 * @return the si_Nb_Rapport
	 */
	public static int getSi_Nb_Rapport() {
		return si_Nb_Rapport;
	}


	/**
	 * @return the dateR
	 */
	public String getDateR() {
		return DateR;
	}



	/**
	 * @param dateR the dateR to set
	 */
	public void setDateR(String dateR) {
		DateR = dateR;
	}



	/**
	 * @return the rapport
	 */
	public String getRapport() {
		return Rapport;
	}



	/**
	 * @param rapport the rapport to set
	 */
	public void setRapport(String rapport) {
		Rapport = rapport;
	}



	/**
	 * @param id_Rapport the id_Rapport to set
	 */
	public void setId_Rapport(int id_Rapport) {
		Id_Rapport = id_Rapport;
	}



	/**
	 * @param id_typeR the id_typeR to set
	 */
	public void setId_typeR(int id_typeR) {
		Id_typeR = id_typeR;
	}



	/**
	 * @param id_Acte the id_Acte to set
	 */
	public void setId_Acte(int id_Acte) {
		Id_Acte = id_Acte;
	}



	/**
	 * @param id_patient the id_patient to set
	 */
	public void setId_patient(int id_patient) {
		Id_patient = id_patient;
	}



	@Override
	public String toString() {
		return "Rapports [Id_Rapport=" + Id_Rapport + ", Id_typeR=" + Id_typeR + ", Id_Acte=" + Id_Acte
				+ ", Id_patient=" + Id_patient + ", DateR=" + DateR + ", Rapport=" + Rapport + "]";
	}



}
