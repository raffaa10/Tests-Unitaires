package fr.epsi.test.cinema;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SugarRushTest {

	@Test
	void testSelectionJoueur() {
		
		SugarRush rush= new SugarRush();
		
		assertEquals(new Joueur("Sa sucrerie"), rush.selectionJoueur("Sa sucrerie"));
		assertNull(rush.selectionJoueur("Ralph"));		
		assertEquals(new Joueur("Vaneloppe"), rush.selectionJoueur("Vaneloppe"));
		
		
		// Faut enlever  || nom == "Vaneloppe" de la ligne 34 de la Classe Jouer
		
		// Bon pratique est de séparer les méthodes assert... etc en tests differents
		// @Test
		// void testSelectionJoueur1(), void testSelectionJoueur2(), ... etc
	}

}
