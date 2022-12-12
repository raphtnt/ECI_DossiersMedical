package model;

public class Contact {

	private int idContact;
	private String NomC;
	private String PrenomC;
	private String TelephoneC;
	
	/**
	 * @param idContact
	 * @param nomC
	 * @param prenomC
	 * @param telephoneC
	 */
	public Contact(String nomC, String prenomC, String telephoneC) {
		super();
		NomC = nomC;
		PrenomC = prenomC;
		TelephoneC = telephoneC;
		idContact++;
	}
	
	
	/**
	 * @return the nomC
	 */
	public String getNomC() {
		return NomC;
	}


	/**
	 * @param nomC the nomC to set
	 */
	public void setNomC(String nomC) {
		NomC = nomC;
	}


	/**
	 * @return the prenomC
	 */
	public String getPrenomC() {
		return PrenomC;
	}


	/**
	 * @param prenomC the prenomC to set
	 */
	public void setPrenomC(String prenomC) {
		PrenomC = prenomC;
	}


	/**
	 * @return the telephoneC
	 */
	public String getTelephoneC() {
		return TelephoneC;
	}


	/**
	 * @param telephoneC the telephoneC to set
	 */
	public void setTelephoneC(String telephoneC) {
		TelephoneC = telephoneC;
	}


	/**
	 * @return the idContact
	 */
	public int getIdContact() {
		return idContact;
	}


}
