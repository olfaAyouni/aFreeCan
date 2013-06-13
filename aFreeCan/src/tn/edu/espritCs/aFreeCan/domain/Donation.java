package tn.edu.espritCs.aFreeCan.domain;

public class Donation {
	
	private int idDonation;
	private String typeDonation;
	private String nameDonor;
	private int phoneDonor;
	private String dateDonation;
	private int idAction;
	private int amount;
	
	
	
	public int getIdDonation() {
		return idDonation;
	}
	public void setIdDonation(int idDonation) {
		this.idDonation = idDonation;
	}
	public String getTypeDonation() {
		return typeDonation;
	}
	public void setTypeDonation(String typeDonation) {
		this.typeDonation = typeDonation;
	}
	public String getNameDonor() {
		return nameDonor;
	}
	public void setNameDonor(String nameDonor) {
		this.nameDonor = nameDonor;
	}
	public int getPhoneDonor() {
		return phoneDonor;
	}
	public void setPhoneDonor(int phoneDonor) {
		this.phoneDonor = phoneDonor;
	}
	public String getDateDonation() {
		return dateDonation;
	}
	public void setDateDonation(String dateDonation) {
		this.dateDonation = dateDonation;
	}
	public int getIdAction() {
		return idAction;
	}
	public void setIdAction(int idAction) {
		this.idAction = idAction;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public Donation() {
		// TODO Auto-generated constructor stub
	}
	
	public Donation( String typeDonation, String nameDonor,
			int phoneDonor, String dateDonation, int idAction, int amount) {
		super();
		this.idDonation = idDonation;
		this.typeDonation = typeDonation;
		this.nameDonor = nameDonor;
		this.phoneDonor = phoneDonor;
		this.dateDonation = dateDonation;
		this.idAction = idAction;
		this.amount = amount;
	}


}
