package tn.edu.espritCs.aFreeCan.tests;


import junit.framework.Assert;

import org.junit.Test;

import tn.edu.espritCs.aFreeCan.dao.DonationDao;
import tn.edu.espritCs.aFreeCan.domain.Donation;
import tn.edu.espritCs.aFreeCan.dao.ActionDao;
import tn.edu.espritCs.aFreeCan.domain.Action;
import tn.edu.espritCs.aFreeCan.technical.UtilJdbc;
public class TestRealPlatforme {
	private ActionDao actionDao = new ActionDao();
	private DonationDao donationDao = new DonationDao();
	

	@Test
	public void testAddAction() {
		Action action = new Action("Ecole", "aide", "03/02/2014", "15000");
		Assert.assertTrue(actionDao.addAction(action));
	}
	
	@Test
	public void testAddDonation() {
		Donation donation = new Donation("Money", "Karim", 95876256, "05/02/2012", 2, 1000);
		Assert.assertTrue( donationDao.addDonation(donation));
	}

	@Test
	public void testHetliConnetionMrigle() {
		UtilJdbc utilJdbc = new UtilJdbc();
		utilJdbc.hetliConnetionMrigla();
	}

	@Test
	public void testFindActionById() {
		Action action = actionDao.findActionById(2);
		Assert.assertEquals("Ecole", action.getNameAction());
	}
	@Test
	public void testFindDonationById() {
		Donation donation = donationDao.findDonationById(1);
		Assert.assertEquals("Money", donation.getTypeDonation());
	}

	@Test
	public void testDeleteActionById() {
		Action action = actionDao.findActionById(2);
		System.out.println(action.getNameAction());
		Assert.assertTrue(actionDao.deleteActionById(2));
	}
	@Test
	public void testDeleteDonationById() {
		Donation donation = donationDao.findDonationById(1);
		System.out.println(donation.getTypeDonation());
		Assert.assertTrue(donationDao.deleteDonationById(1));
	}
	//@Test
	public void testUpdateDonation() {
		Donation donation = donationDao.findDonationById(1);
		System.out.println("old one :"+donation.getTypeDonation());
		donation.setTypeDonation("new look");
		System.out.println("new one :"+donation.getTypeDonation());
		Assert.assertTrue(donationDao.updateDonation(donation));
	}

}
