package model;

/**
 * @author Kidibule
 *
 */
public class Type_Rapport {

	static int si_Nb_Type_R = 0;
	
	private int Id_Type_Rapport;
	private String Type_Rapport;
	private Boolean SupprimerTP;
	
	public Type_Rapport() 
	{
		this.Id_Type_Rapport=si_Nb_Type_R;
		this.Type_Rapport = "Inconnu";
		this.SupprimerTP = false;

		si_Nb_Type_R++;
	}

	/**
	 * @param Id_Type_Rapport
	 * @param Type_Rapport
	 * @param supprimerTP
	 */
	public Type_Rapport(int Id_Type_Rapport, String Type_Rapport, Boolean supprimerTP) {
		Id_Type_Rapport = Id_Type_Rapport;
		Type_Rapport = Type_Rapport;
		SupprimerTP = supprimerTP;
		
		si_Nb_Type_R++;
	}

	/**
	 * @return the si_Nb_Type_R
	 */
	public static int getSi_Nb_Type_R() {
		return si_Nb_Type_R;
	}

	/**
	 * @return the id_Type_Rapport
	 */
	public int getId_Type_Rapport() {
		return Id_Type_Rapport;
	}

	/**
	 * @param id_Type_Rapport the id_Type_Rapport to set
	 */
	public void setId_Type_Rapport(int id_Type_Rapport) {
		Id_Type_Rapport = id_Type_Rapport;
	}

	/**
	 * @return the Type_Rapport
	 */
	public String getType_Rapport() {
		return Type_Rapport;
	}

	/**
	 * @param Type_Rapport the Type_Rapport to set
	 */
	public void setType_Rapport(String Type_Rapport) {
		Type_Rapport = Type_Rapport;
	}

	/**
	 * @return the supprimerTP
	 */
	public Boolean getSupprimerTP() {
		return SupprimerTP;
	}

	/**
	 * @param supprimerTP the supprimerTP to set
	 */
	public void setSupprimerTP(Boolean supprimerTP) {
		SupprimerTP = supprimerTP;
	}

	@Override
	public String toString() {
		return "Type_Rapport [Id_Type_Rapport=" + Id_Type_Rapport + ", Type_Rapport=" + Type_Rapport + ", SupprimerTP=" + SupprimerTP
				+ "]";
	}


	
}
