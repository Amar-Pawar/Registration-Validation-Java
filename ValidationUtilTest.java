package com.demo.junit.utils;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ValidationUtilTest {
	
	//positive test to check first name
	@Test
	public void testfirstName_shouldReturnTrue() {
		String firstName = "Amar";
		boolean isValidFirstName = ValidationUtil.isValidFirstName(firstName);
		assertTrue(isValidFirstName);
	}

	//failed test to check first name
	@Test
	public void testfirstName_shouldReturnFalse() {
		String firstName = "amAr";
		boolean isValidFirstName = ValidationUtil.isValidFirstName(firstName);
		assertTrue(isValidFirstName);
	}

	//positive test to check last name
	@Test
	public void testlastName_shouldReturnTrue() {
		String lastName = "Pawar";
		boolean isValidLastName = ValidationUtil.isValidLastName(lastName);
		assertTrue(isValidLastName);
	}
	
	//failed test to check last name
	@Test
	public void testlastName_shouldReturnFalse() {
		String lastName = "paWar";
		boolean isValidLastName = ValidationUtil.isValidLastName(lastName);
		assertTrue(isValidLastName);
	}
	
	//positive test to check email id
	@Test
	public void testemail_shouldReturnTrue() {
		String email = "pawaramar.pawar@gmail.com";
		boolean isValidEmailId = ValidationUtil.isValidEmailId(email);
		assertTrue(isValidEmailId);
	}
	
	//failed test to check email id
	@Test
	public void testemail_shouldReturnFalse() {
		String email = "#amar#@@gmail.com";
		boolean isValidEmailId = ValidationUtil.isValidEmailId(email);
		assertTrue(isValidEmailId);
	}
	
	//positive test to check password
	@Test
	public void testpassword_shouldReturnTrue() {
		String password = "Amar@_234ssadf";
		boolean isValidPassword = ValidationUtil.isValidPassword(password);
		assertTrue(isValidPassword);
	}
	
	//failed test to check password
	@Test
	public void testpassword_shouldReturnFlase() {
		String password = "Annk@1";
		boolean isValidPassword = ValidationUtil.isValidPassword(password);
		assertTrue(isValidPassword);
	}	
}
