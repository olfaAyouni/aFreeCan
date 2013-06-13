package tn.edu.espritCs.aFreeCan.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import tn.edu.espritCs.aFreeCan.domain.Action;
import tn.edu.espritCs.aFreeCan.technical.UtilJdbc;

public class ActionDao {
	private UtilJdbc utilJdbc = new UtilJdbc();

	public boolean addAction(Action action) {
		boolean b = false;
		try {
			Statement statement = utilJdbc.hetliConnetionMrigla()
					.createStatement();
			String sql = "insert into action (nameAction,typeAction,dateAction,budget) values('"
					+ action.getNameAction() 
					+"','" 
					+ action.getTypeAction() 
					+ "','" 
					+ action.getDateAction()
					+ "','" 
					+ action.getBudget() +"')";				
			statement.executeUpdate(sql);
			System.out.println("youppy action added ...");
			b = true;
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		return b;
	}

	public  Action findActionById(int idAction) {
		Action actionTMP = new Action();
		try {
			Statement statement = utilJdbc.hetliConnetionMrigla()
					.createStatement();
			String sql = "select * from action where idAction=" + idAction;
			ResultSet resultSet = statement.executeQuery(sql);

			while (resultSet.next()) {
				actionTMP.setIdAction(resultSet.getInt("idAction"));
				actionTMP.setNameAction(resultSet.getString("nameAction"));
				System.out.println("l9inaha hakel action ...");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return actionTMP;
	}

	public boolean deleteActionById(int idAction) {
		boolean b = false;
		try {
			Statement statement = utilJdbc.hetliConnetionMrigla()
					.createStatement();
			String sql = "delete from action where idAction=" + idAction;
			statement.executeUpdate(sql);
			System.out.println("youppy action deleted ...");
			b = true;
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		return b;
	}

	public boolean updateAction(Action action) {
		boolean b = false;
		try {
			Statement statement = utilJdbc.hetliConnetionMrigla()
					.createStatement();
			String sql = "update action set nameAction='"
					+ action.getNameAction() + "' where idAction="
					+ action.getIdAction();
			statement.executeUpdate(sql);
			System.out.println("youppy action modified ...");
			b = true;
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		return b;
	}
}
