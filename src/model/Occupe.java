package model;

public class Occupe {
	
	private int idSpec;
	private int idEmployer;

	
	/**
	 * @param idSpec
	 * @param idEmployer
	 */
	public Occupe(int idSpec, int idEmployer) {
		super();
		this.idSpec = idSpec;
		this.idEmployer = idEmployer;
	}
	
	
	/**
	 * @return the idSpec
	 */
	public int getIdSpec() {
		return idSpec;
	}
	/**
	 * @param idSpec the idSpec to set
	 */
	public void setIdSpec(int idSpec) {
		this.idSpec = idSpec;
	}
	/**
	 * @return the idEmployer
	 */
	public int getIdEmployer() {
		return idEmployer;
	}
	/**
	 * @param idEmployer the idEmployer to set
	 */
	public void setIdEmployer(int idEmployer) {
		this.idEmployer = idEmployer;
	}

}
