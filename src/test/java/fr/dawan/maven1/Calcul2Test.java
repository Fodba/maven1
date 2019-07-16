package fr.dawan.maven1;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;

public class Calcul2Test extends TestCase {

	@Test
	public void testMultiplier() {
		assertEquals(10, Calcul2.multiplier(2, 5));
		assertNotEquals(3, Calcul2.multiplier(5, 1));
	}

}
