package model;

/**
 * @author Kidibule
 *
 */

public class Traitement {
	
	static int si_Nb_Traitement=0;
	
	
	private int Id_Traitement;
	private String DebutT;
	private String FinT;
	
	//Constructeur par defaut 
	
	public Traitement() 
	{
		this.Id_Traitement=si_Nb_Traitement;
		this.DebutT = " ";
		this.FinT = " ";

		si_Nb_Traitement++;
	}

	/**
	 * @param id_Traitement
	 * @param debutT
	 * @param finT
	 */
	public Traitement(int id_Traitement, String debutT, String finT, Boolean supprimerL) {
		Id_Traitement = id_Traitement;
		DebutT = debutT;
		FinT = finT;
		
		si_Nb_Traitement++;
	}

	/**
	 * @return the si_Nb_Traitement
	 */
	public static int getSi_Nb_Traitement() {
		return si_Nb_Traitement;
	}

	/**
	 * @return the debutT
	 */
	public String getDebutT() {
		return DebutT;
	}

	/**
	 * @param debutT the debutT to set
	 */
	public void setDebutT(String debutT) {
		DebutT = debutT;
	}

	/**
	 * @return the finT
	 */
	public String getFinT() {
		return FinT;
	}

	/**
	 * @param finT the finT to set
	 */
	public void setFinT(String finT) {
		FinT = finT;
	}

	/**
	 * @return the id_Traitement
	 */
	public int getId_Traitement() {
		return Id_Traitement;
	}

	@Override
	public String toString() {
		return "Traitement [Id_Traitement=" + Id_Traitement + ", DebutT=" + DebutT + ", FinT=" + FinT + "]";
	}

	

}
