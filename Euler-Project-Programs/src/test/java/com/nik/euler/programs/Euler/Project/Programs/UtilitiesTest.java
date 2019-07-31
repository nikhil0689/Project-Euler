package com.nik.euler.programs.Euler.Project.Programs;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.nik.euler.programs.utilities.Utilities;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UtilitiesTest {
	
	@Autowired
	Utilities utilities;
	
	@Before
	public void setup() {
		System.out.println("in set up : before");
	}
	
	
	@Test
	public void testIsPrime() {
		int n = 11;
		boolean prime = utilities.isPrime(n);
		assertTrue(prime);
	}
	
}
