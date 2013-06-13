package tn.edu.espritCs.aFreeCan.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import tn.edu.espritCs.aFreeCan.domain.Action;
import tn.edu.espritCs.aFreeCan.domain.Donation;
import tn.edu.espritCs.aFreeCan.technical.UtilJdbc;

public class DonationDao {
	
	private UtilJdbc utilJdbc = new UtilJdbc();

	public boolean addDonation(Donation donation) {
		boolean b = false;
		try {
			Statement statement = utilJdbc.hetliConnetionMrigla()
					.createStatement();
			String sql = "insert into donation (typeDonation,nameDonor,phoneDonor,dateDonation,idAction,amount) values('"
					+ donation.getTypeDonation() 
					+"','" 
					+ donation.getNameDonor() 
					+ "','" 
					+ donation.getPhoneDonor()
					+ "','" 
					+ donation.getDateDonation() 
					+ "','" 
					+ donation.getIdAction()
					+ "','" 
					+ donation.getAmount()
					+"')";				
			statement.executeUpdate(sql);
			System.out.println("youppy donation added ...");
			b = true;
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		return b;
	}


public  Donation findDonationById(int idDonation) {
	Donation donationTMP = new Donation();
	try {
		Statement statement = utilJdbc.hetliConnetionMrigla()
				.createStatement();
		String sql = "select * from donation where idDonation=" + idDonation;
		ResultSet resultSet = statement.executeQuery(sql);

		while (resultSet.next()) {
			donationTMP.setIdDonation(resultSet.getInt("idDonation"));
			donationTMP.setTypeDonation(resultSet.getString("typeDonation"));
			System.out.println("l9inaha hakel Donation ...");
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return donationTMP;
}

public boolean deleteDonationById(int idDonation) {
	boolean b = false;
	try {
		Statement statement = utilJdbc.hetliConnetionMrigla()
				.createStatement();
		String sql = "delete from donation where idDonation=" + idDonation;
		statement.executeUpdate(sql);
		System.out.println("youppy donation deleted ...");
		b = true;
	} catch (SQLException e1) {
		e1.printStackTrace();
	}
	return b;
}

public boolean updateDonation(Donation donation) {
	boolean b = false;
	try {
		Statement statement = utilJdbc.hetliConnetionMrigla()
				.createStatement();
		String sql = "update donation set typeDonation='"
				+ donation.getTypeDonation() + "' where idDonation="
				+ donation.getIdDonation();
		statement.executeUpdate(sql);
		System.out.println("youppy donation modified ...");
		b = true;
	} catch (SQLException e1) {
		e1.printStackTrace();
	}
	return b;
}
}

