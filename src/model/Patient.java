package model;

public class Patient {
	
	private int idPatient;
	private String NomP;
	private String PrenomP;
	private String TelephoneP;
	private String MailP;
	private String RueP;
	private String VilleP;
	private String CodePostalP;
	private String NumeroP;
	private String NumeroImP;
	private String RegistreNational;
	private boolean Deceder;
	private String MDP;

	private int IdContact;
	private int IdContact2;
	
	/**
	 * @param idPatient
	 * @param nomP
	 * @param prenomP
	 * @param telephoneP
	 * @param mailP
	 * @param rueP
	 * @param villeP
	 * @param codePostalP
	 * @param numeroP
	 * @param numeroImP
	 * @param deceder
	 * @param mDP
	 * @param idContact
	 * @param idContact2
	 */
	public Patient(String nomP, String prenomP, String telephoneP, String mailP, String rueP,
			String villeP, String codePostalP, String numeroP, String numeroImP, String registreNational, boolean deceder, String mDP,
			int idContact, int idContact2) {
		super();
		NomP = nomP;
		PrenomP = prenomP;
		TelephoneP = telephoneP;
		MailP = mailP;
		RueP = rueP;
		VilleP = villeP;
		CodePostalP = codePostalP;
		NumeroP = numeroP;
		NumeroImP = numeroImP;
		RegistreNational = registreNational;
		Deceder = deceder;
		MDP = mDP;
		IdContact = idContact;
		IdContact2 = idContact2;
		idPatient++;
	}

	
	/**
	 * @return the nomP
	 */
	public String getNomP() {
		return NomP;
	}
	/**
	 * @param nomP the nomP to set
	 */
	public void setNomP(String nomP) {
		NomP = nomP;
	}
	/**
	 * @return the prenomP
	 */
	public String getPrenomP() {
		return PrenomP;
	}
	/**
	 * @param prenomP the prenomP to set
	 */
	public void setPrenomP(String prenomP) {
		PrenomP = prenomP;
	}
	/**
	 * @return the telephoneP
	 */
	public String getTelephoneP() {
		return TelephoneP;
	}
	/**
	 * @param telephoneP the telephoneP to set
	 */
	public void setTelephoneP(String telephoneP) {
		TelephoneP = telephoneP;
	}
	/**
	 * @return the mailP
	 */
	public String getMailP() {
		return MailP;
	}
	/**
	 * @param mailP the mailP to set
	 */
	public void setMailP(String mailP) {
		MailP = mailP;
	}
	/**
	 * @return the rueP
	 */
	public String getRueP() {
		return RueP;
	}
	/**
	 * @param rueP the rueP to set
	 */
	public void setRueP(String rueP) {
		RueP = rueP;
	}
	/**
	 * @return the villeP
	 */
	public String getVilleP() {
		return VilleP;
	}
	/**
	 * @param villeP the villeP to set
	 */
	public void setVilleP(String villeP) {
		VilleP = villeP;
	}
	/**
	 * @return the codePostalP
	 */
	public String getCodePostalP() {
		return CodePostalP;
	}
	/**
	 * @param codePostalP the codePostalP to set
	 */
	public void setCodePostalP(String codePostalP) {
		CodePostalP = codePostalP;
	}
	/**
	 * @return the numeroP
	 */
	public String getNumeroP() {
		return NumeroP;
	}
	/**
	 * @param numeroP the numeroP to set
	 */
	public void setNumeroP(String numeroP) {
		NumeroP = numeroP;
	}
	/**
	 * @return the numeroImP
	 */
	public String getNumeroImP() {
		return NumeroImP;
	}
	/**
	 * @param numeroImP the numeroImP to set
	 */
	public void setNumeroImP(String numeroImP) {
		NumeroImP = numeroImP;
	}
	/**
	 * @return the registreNational
	 */
	public String getRegistreNational() {
		return RegistreNational;
	}
	/**
	 * @param registreNational the registreNational to set
	 */
	public void setRegistreNational(String registreNational) {
		this.RegistreNational = registreNational;
	}
	/**
	 * @return the deceder
	 */
	public boolean isDeceder() {
		return Deceder;
	}
	/**
	 * @param deceder the deceder to set
	 */
	public void setDeceder(boolean deceder) {
		Deceder = deceder;
	}
	/**
	 * @return the mDP
	 */
	public String getMDP() {
		return MDP;
	}
	/**
	 * @param mDP the mDP to set
	 */
	public void setMDP(String mDP) {
		MDP = mDP;
	}
	/**
	 * @return the idContact
	 */
	public int getIdContact() {
		return IdContact;
	}
	/**
	 * @param idContact the idContact to set
	 */
	public void setIdContact(int idContact) {
		IdContact = idContact;
	}
	/**
	 * @return the idContact2
	 */
	public int getIdContact2() {
		return IdContact2;
	}
	/**
	 * @param idContact2 the idContact2 to set
	 */
	public void setIdContact2(int idContact2) {
		IdContact2 = idContact2;
	}
	/**
	 * @return the idPatient
	 */
	public int getIdPatient() {
		return idPatient;
	}

}
