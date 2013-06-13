package tn.edu.espritCs.aFreeCan.domain;

public class Action {
	
	private int idAction;
	private String nameAction;
	private String typeAction;
	private String dateAction;
	private String budget;

	public int getIdAction() {
		return idAction;
	}

	public void setIdAction(int idAction) {
		this.idAction = idAction;
	}

	public String getNameAction() {
		return nameAction;
	}

	public void setNameAction(String nameAction) {
		this.nameAction = nameAction;
	}

	public String getTypeAction() {
		return typeAction;
	}

	public void setTypeAction(String typeAction) {
		this.typeAction = typeAction;
	}

	public String getDateAction() {
		return dateAction;
	}

	public void setDateAction(String dateAction) {
		this.dateAction = dateAction;
	}

	public String getBudget() {
		return budget;
	}

	public void setBudget(String budget) {
		this.budget = budget;
	}

	public Action() {
		// TODO Auto-generated constructor stub
	}

	
	public Action( String nameAction, String typeAction,
			String dateAction, String budget) {
		super();
		
		this.nameAction = nameAction;
		this.typeAction = typeAction;
		this.dateAction = dateAction;
		this.budget = budget;
	}

	

}
