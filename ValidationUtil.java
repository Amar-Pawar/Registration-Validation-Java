package com.demo.junit.utils;

//import static org.junit.Assert.assertTrue;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

import com.demo.junit.utilitis.InvalidDetailException;
//import com.demo.junit.utilitis.customException;

public final class ValidationUtil {
	private  ValidationUtil() {}
	
	public static boolean isValidFirstName(String firstName) throws InvalidDetailException {
		final String regex = "^[A-Z]{1}[a-z]{2,}";
		final Pattern pattern = Pattern.compile(regex);
		boolean match = false;
		String message = "";

		try {
			Matcher matcher = pattern.matcher(firstName);
			match = matcher.matches();
			if(!match) {
				message = firstName+" is invalid first name";
				throw new InvalidDetailException(message);
			}
		}
		catch(InvalidDetailException e) {
			System.out.println(e);
		}
//		
		return match;

	}
	
	public static boolean isValidLastName(String lastName) {
		final String regex = "^[A-Z]{1}[a-z]{2,}";
		final Pattern pattern = Pattern.compile(regex);
		boolean match = false;
		String message = " ";
		try {
			Matcher matcher = pattern.matcher(lastName);
			match = matcher.matches();
			if(!match) {
				message = lastName + " is invalid last name";
				throw new InvalidDetailException(message);
			}
		}	
		catch(InvalidDetailException e) {
			System.out.println(e);
		}
		return match;
		
	}

	public static boolean isValidEmailId(String email) {
		final String regex =  "^[a-z]{1}[a-zA-Z0-9.+_-]+@[a-zA-Z0-9.]+[a-zA-z]{2,3}$";
		final Pattern pattern = Pattern.compile(regex);
		boolean match = false;
		String message = " ";
		try {
		Matcher matcher = pattern.matcher(email);
		match = matcher.matches();
			if(!match) {
				message = email + " is invalid email id";
				throw new InvalidDetailException(message);
			}
		}	
		catch(InvalidDetailException e) {
			System.out.println(e);
		}
		return match;
	}

	public static boolean isValidPassword(String password) {
		final String regex = "^(?=[0-9 A-Z a-z !@#$%^&*();:]{8,}$)(?=.*?[A-Z]{1,})(?=.*?[0-9]{1,})(?=.*?[!@#$%^&*();:]{1,}).*$";
		final Pattern pattern = Pattern.compile(regex);
		boolean match = false;
		String message = " ";
		try {
			Matcher matcher = pattern.matcher(password);
			matcher.matches();
			if(!match) {
				message = password + " is invalid password";
				throw new InvalidDetailException(message);
			}
		}	
		catch(InvalidDetailException e) {
			System.out.println(e);
		}
			
		return match;
	}
	

}
