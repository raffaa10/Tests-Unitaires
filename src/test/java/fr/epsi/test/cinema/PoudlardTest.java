package fr.epsi.test.cinema;

import static org.junit.jupiter.api.Assertions.*;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class PoudlardTest {
	
	@Test
	void testMaison() {
		Poudlard sut = new Poudlard();

//		int size = sut.maisonsEleves.size();
//		assertEquals(4, size);
//		assertNull(sut.maisonsEleves.get(0));
		
		assertThat(sut.getMaisonsEleves()).contains(entry(Maison.Griffondor, null),
				entry(Maison.Poufsoufle, null),
				entry(Maison.Serpentard, null),
				entry(Maison.Serdaigle, null));
		
	}

	@Test
	void testInscriptionEleve() {
		Poudlard sut = new Poudlard();
		sut.inscriptionEleve("Lucius Malefoy", Maison.Serpentard);
//		
//		String nom = sut.maisonsEleves.get(Maison.Serpentard).get(0);
//		assertEquals("Lucius Malefoy", nom);
		
		assertThat(sut.maisonsEleves.get(Maison.Serpentard).get(0)).isEqualTo("Lucius Malefoy");
		assertThat(sut.maisonsEleves.get(Maison.Serpentard)).containsOnly("Lucius Malefoy");
		assertThat(sut.maisonsEleves.get(Maison.Serpentard).get(0)).doesNotContain("Batman Malefoy");
		
		assertThat(sut.maisonsEleves.get(Maison.Griffondor)).isNull();
		
		assertThat(sut.maisonsEleves.get(Maison.Serpentard)).hasSize(1);
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"Harry Potter", "Ron Whisley", "Hermionne Granger"})
	void testArriveDesHeros(String str) {
		
		Poudlard sut = new Poudlard();
		sut.arriveDesHeros();
		
//		int size = sut.maisonsEleves.get(Maison.Griffondor).size();
//		String Harry = sut.maisonsEleves.get(Maison.Griffondor).get(0);
//		String Ron = sut.maisonsEleves.get(Maison.Griffondor).get(1);
		
//		assertEquals(3, size);
//		assertEquals("Harry Potter", Harry);
//		assertEquals("Ron Whisley", Ron);
		
//		assertThat(sut.maisonsEleves.get(Maison.Griffondor).get(0).equals("Harry Potter"));
//		assertThat(sut.maisonsEleves.get(Maison.Griffondor).get(1).equals("Ron Whisley"));
//		assertThat(sut.maisonsEleves.get(Maison.Griffondor).get(2).equals("Hermionne Granger"));
		
		// ********  AVEC assertThat  ********
		
		assertThat(sut.maisonsEleves.get(Maison.Griffondor)).contains(str);
			
		//assertThat(sut.maisonsEleves.get(Maison.Griffondor).get(0)).isEqualTo(str);		

	}
	
	
	@ParameterizedTest
	@ValueSource(strings = {"Harry Potter","Ron Whisley", "Hermionne Granger"})
	void testFindMaison(String str) {
		Poudlard sut = new Poudlard();
		sut.arriveDesHeros();
			
		Maison m =sut.findMaison(str);
		assertEquals(Maison.Griffondor, m,"Test de la maison de "+m);
		
//		assertTrue(sut.findMaison(str));
		
		
		
	}

}
