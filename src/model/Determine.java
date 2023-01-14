package model;

public class Determine {
	
	
	private int idMedicament;
	private int idTraitement;
	
	
	/**
	 * @param idMedicament
	 * @param idTraitement
	 */
	public Determine(int idMedicament, int idTraitement) {
		super();
		this.idMedicament = idMedicament;
		this.idTraitement = idTraitement;
	}

	
	
	/**
	 * @return the idMedicament
	 */
	public int getIdMedicament() {
		return idMedicament;
	}
	/**
	 * @param idMedicament the idMedicament to set
	 */
	public void setIdMedicament(int idMedicament) {
		this.idMedicament = idMedicament;
	}
	/**
	 * @return the idTraitement
	 */
	public int getIdTraitement() {
		return idTraitement;
	}
	/**
	 * @param idTraitement the idTraitement to set
	 */
	public void setIdTraitement(int idTraitement) {
		this.idTraitement = idTraitement;
	}

}
