package model;

public class Impose {
	
	private int idActe;
	private int idTraitement;
	
	
	/**
	 * @param idActe
	 * @param idTraitement
	 */
	public Impose(int idActe, int idTraitement) {
		super();
		this.idActe = idActe;
		this.idTraitement = idTraitement;
	}
	
	/**
	 * @return the idActe
	 */
	public int getIdActe() {
		return idActe;
	}
	/**
	 * @param idActe the idActe to set
	 */
	public void setIdActe(int idActe) {
		this.idActe = idActe;
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
