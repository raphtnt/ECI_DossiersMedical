package model;

public class Employe {
	
	private int idEmploye;
	private String NomE;
	private String PrenomE;
	private String TelephoneE;
	private String MailE;
	private String RueE;
	private String VilleE;
	private String CodePostalE;
	private String NumeroE;
	private String NumeroImE;
	private int Role;
	private boolean supprimer;
	private String MDP;
	
	
	/**
	 * @param idEmploye
	 * @param nomE
	 * @param prenomE
	 * @param telephoneE
	 * @param mailE
	 * @param rueE
	 * @param villeE
	 * @param codePostalE
	 * @param numeroE
	 * @param numeroImE
	 * @param role
	 * @param supprimer
	 * @param mDP
	 */
	public Employe(String nomE, String prenomE, String telephoneE, String mailE, String rueE,
			String villeE, String codePostalE, String numeroE, String numeroImE, int role, boolean supprimer,
			String mDP) {
		super();
		NomE = nomE;
		PrenomE = prenomE;
		TelephoneE = telephoneE;
		MailE = mailE;
		RueE = rueE;
		VilleE = villeE;
		CodePostalE = codePostalE;
		NumeroE = numeroE;
		NumeroImE = numeroImE;
		Role = role;
		this.supprimer = supprimer;
		MDP = mDP;
		idEmploye++;
	}
	
	
	/**
	 * @return the nomE
	 */
	public String getNomE() {
		return NomE;
	}
	/**
	 * @param nomE the nomE to set
	 */
	public void setNomE(String nomE) {
		NomE = nomE;
	}
	/**
	 * @return the prenomE
	 */
	public String getPrenomE() {
		return PrenomE;
	}
	/**
	 * @param prenomE the prenomE to set
	 */
	public void setPrenomE(String prenomE) {
		PrenomE = prenomE;
	}
	/**
	 * @return the telephoneE
	 */
	public String getTelephoneE() {
		return TelephoneE;
	}
	/**
	 * @param telephoneE the telephoneE to set
	 */
	public void setTelephoneE(String telephoneE) {
		TelephoneE = telephoneE;
	}
	/**
	 * @return the mailE
	 */
	public String getMailE() {
		return MailE;
	}
	/**
	 * @param mailE the mailE to set
	 */
	public void setMailE(String mailE) {
		MailE = mailE;
	}
	/**
	 * @return the rueE
	 */
	public String getRueE() {
		return RueE;
	}
	/**
	 * @param rueE the rueE to set
	 */
	public void setRueE(String rueE) {
		RueE = rueE;
	}
	/**
	 * @return the villeE
	 */
	public String getVilleE() {
		return VilleE;
	}
	/**
	 * @param villeE the villeE to set
	 */
	public void setVilleE(String villeE) {
		VilleE = villeE;
	}
	/**
	 * @return the codePostalE
	 */
	public String getCodePostalE() {
		return CodePostalE;
	}
	/**
	 * @param codePostalE the codePostalE to set
	 */
	public void setCodePostalE(String codePostalE) {
		CodePostalE = codePostalE;
	}
	/**
	 * @return the numeroE
	 */
	public String getNumeroE() {
		return NumeroE;
	}
	/**
	 * @param numeroE the numeroE to set
	 */
	public void setNumeroE(String numeroE) {
		NumeroE = numeroE;
	}
	/**
	 * @return the numeroImE
	 */
	public String getNumeroImE() {
		return NumeroImE;
	}
	/**
	 * @param numeroImE the numeroImE to set
	 */
	public void setNumeroImE(String numeroImE) {
		NumeroImE = numeroImE;
	}
	/**
	 * @return the role
	 */
	public int getRole() {
		return Role;
	}
	/**
	 * @param role the role to set
	 */
	public void setRole(int role) {
		Role = role;
	}
	/**
	 * @return the supprimer
	 */
	public boolean isSupprimer() {
		return supprimer;
	}
	/**
	 * @param supprimer the supprimer to set
	 */
	public void setSupprimer(boolean supprimer) {
		this.supprimer = supprimer;
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
	 * @return the idEmploye
	 */
	public int getIdEmploye() {
		return idEmploye;
	}

}
