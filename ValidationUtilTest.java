package com.demo.junit.utils;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.demo.junit.utilitis.InvalidDetailException;
//import com.demo.junit.utilitis.customException;

public class ValidationUtilTest {
	
	//positive test to check first name
	@Test
	public void testfirstName_shouldReturnTrue() throws InvalidDetailException {
		String firstName = "Amar";
		boolean isValidFirstName = ValidationUtil.isValidFirstName(firstName);
		assertTrue(isValidFirstName);
	}
	

	//failed test to check first name
	@Test
	public void testfirstName_shouldReturnFalse() throws InvalidDetailException {
		String firstName = "amAr";
//		try {
		boolean isValidFirstName = ValidationUtil.isValidFirstName(firstName);
		assertFalse(isValidFirstName);

//		}
//		catch (customException e) {
//			System.out.println(e);
//		}
	}

	//positive test to check last name
	@Test
	public void testlastName_shouldReturnTrue() throws InvalidDetailException {
		String lastName = "Pawar";
		boolean isValidLastName = ValidationUtil.isValidLastName(lastName);
		assertTrue(isValidLastName);
	}
	
	//failed test to check last name
	@Test
	public void testlastName_shouldReturnFalse() throws InvalidDetailException{
		String lastName = "paWar";
		boolean isValidLastName = ValidationUtil.isValidLastName(lastName);
		assertFalse(isValidLastName);
	}
	
	//positive test to check email id
	@Test
	public void testemail_shouldReturnTrue() throws InvalidDetailException{
		String email = "pawaramar.pawar@gmail.com";
		boolean isValidEmailId = ValidationUtil.isValidEmailId(email);
		assertTrue(isValidEmailId);
	}
	
	//failed test to check email id
	@Test
	public void testemail_shouldReturnFalse() throws InvalidDetailException{
		String email = "#amar#@@gmail.com";
		boolean isValidEmailId = ValidationUtil.isValidEmailId(email);
		assertFalse(isValidEmailId);
	}
	
	//positive test to check password
	@Test
	public void testpassword_shouldReturnTrue() throws InvalidDetailException{
		String password = "amarA@1234";
		boolean isValidPassword = ValidationUtil.isValidPassword(password);
		assertFalse(isValidPassword);
	}
	
	//failed test to check password
	@Test
	public void testpassword_shouldReturnFlase() throws InvalidDetailException {
		String password = "Annk@1";
		boolean isValidPassword = ValidationUtil.isValidPassword(password);
		assertFalse(isValidPassword);
	}	
}
