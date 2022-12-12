package model;

/**
 * @author Kidibule
 *
 */
public class Locaux {
	
	static int si_Nb_local = 0;
	
	private int Id_Local;
	private String NomL;
	private Boolean SupprimerL;
	
	//Constructeur par defaut 
	
	public Locaux() 
	{
		this.Id_Local=si_Nb_local;
		this.NomL = "Inconnu";
		this.SupprimerL = false;

		si_Nb_local++;
	}

	/**
	 * @param id_Local
	 * @param nomL
	 * @param supprimerL
	 */
	public Locaux(int id_Local, String nomL, Boolean supprimerL) {
		
		Id_Local = id_Local;
		NomL = nomL;
		SupprimerL = supprimerL;
		
		si_Nb_local++;
	}

	/**
	 * @return the si_Nb_local
	 */
	public static int getSi_Nb_local() {
		return si_Nb_local;
	}

	/**
	 * @return the nomL
	 */
	public String getNomL() {
		return NomL;
	}

	/**
	 * @param nomL the nomL to set
	 */
	public void setNomL(String nomL) {
		NomL = nomL;
	}

	/**
	 * @return the supprimerL
	 */
	public Boolean getSupprimerL() {
		return SupprimerL;
	}

	/**
	 * @param supprimerL the supprimerL to set
	 */
	public void setSupprimerL(Boolean supprimerL) {
		SupprimerL = supprimerL;
	}

	/**
	 * @return the id_Local
	 */
	public int getId_Local() {
		return Id_Local;
	}

	@Override
	public String toString() {
		return "Locaux [Id_Local=" + Id_Local + ", NomL=" + NomL + ", SupprimerL=" + SupprimerL + "]";
	}

	
	

}
