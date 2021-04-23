package com.demo.junit.utils;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

//parameterized test 
@RunWith(Parameterized.class)
public class ValidationEmailTest {
	
	@Parameters
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object [][]{
			{"amar@gmail.com", true}, {"#sdadfd@@gmail.com", true}
		});
	}

	private final String email;
	private final boolean expected;
	
	public ValidationEmailTest(String email, boolean expected) {
		this.email = email;
		this.expected = expected;
		
	}
	
	@Test
	public void testEmail_ShouldReturnExpected() {
		boolean isValidEmail = ValidationUtil.isValidEmailId(email);
		assertEquals(expected, isValidEmail);
	}
}
