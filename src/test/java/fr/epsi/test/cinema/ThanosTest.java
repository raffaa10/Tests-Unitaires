package fr.epsi.test.cinema;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ThanosTest {

	@Test
	void testThanos() {
		Thanos sut = new Thanos(3);
		
		int resultat = sut.getNbPierreInfinite();
		assertEquals(3, resultat);
	}
	
	@Test
	void testThanos2() {
		Thanos sut = new Thanos(7);
		
		int resultat = sut.getNbPierreInfinite();
		assertEquals(6, resultat);
	}
	
	@Test
	void testThanos3() {
		Thanos sut = new Thanos(-1);
		
		int resultat = sut.getNbPierreInfinite();
		assertEquals(-1, resultat);
	}
	

	@Test
	void testGagnePierre() {
		Thanos sut = new Thanos(0);
		
		int res = sut.getNbPierreInfinite();
		assertEquals(0, res);	
	}
	
	@Test
	void testGagnePierre2() {
		Thanos sut = new Thanos(7);
		
		int res = sut.getNbPierreInfinite();
		assertEquals(6, res);
	}
	
	@Test
	void testClaquementDeDoigts() {
		Thanos sut = new Thanos(0);
		
		int res = sut.claquementDeDoigts(7700000);
		assertEquals(7700000, res);
	}
	
	@Test
	void testClaquementDeDoigts2() {
		Thanos sut = new Thanos(6);
		
		int res = sut.claquementDeDoigts(7700000);
		assertEquals(3850000, res);
	}
	
	@Test
	void testToString() {
		Thanos sut = new Thanos(0);
		
		String str = "Thanos [nbPierreInfinite=0, missionReussi=false]";
		String ss = sut.toString();
		assertEquals(str, ss);
	}
	
	@Test
	void testEquals() {
		Thanos sut = new Thanos(0);
		Thanos sut2 = new Thanos(0);
		
		boolean t = sut.equals(sut2);		
		assertTrue(t);
	}
	
//	@Test
//	void testEquals2() {
//		Thanos sut = new Thanos(0);
//		Thanos sut2 = new Thanos(0);
//		
//		boolean t = sut.equals(sut2);
//		
//		assertFalse(t);
//	}
	
}
