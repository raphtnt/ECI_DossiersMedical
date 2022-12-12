package model;

public class Specialisation {
	
	private int idSpecialisation;
	private int NomSpe;
	private boolean SupprimerS;
	

	/**
	 * @param idSpecialisation
	 * @param nomSpe
	 * @param supprimerS
	 */
	public Specialisation(int nomSpe, boolean supprimerS) {
		super();
		NomSpe = nomSpe;
		SupprimerS = supprimerS;
		idSpecialisation++;
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
	 * @return the nomSpe
	 */
	public int getNomSpe() {
		return NomSpe;
	}

	/**
	 * @param nomSpe the nomSpe to set
	 */
	public void setNomSpe(int nomSpe) {
		NomSpe = nomSpe;
	}

	/**
	 * @return the supprimerS
	 */
	public boolean isSupprimerS() {
		return SupprimerS;
	}

	/**
	 * @param supprimerS the supprimerS to set
	 */
	public void setSupprimerS(boolean supprimerS) {
		SupprimerS = supprimerS;
	}



}
