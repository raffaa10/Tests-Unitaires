package fr.epsi.test.cinema;

public class Main {

	public static void main(String[] args) {

		Poudlard sut = new Poudlard();

		//sut.arriveDesHeros();
		
		//System.out.println(sut.maisonsEleves.get(Maison.Griffondor).contains("Hermionne Granger"));
		
//		sut.inscriptionEleve("Lucius Malefoy", Maison.Serpentard);
//		
//		System.out.println(sut.maisonsEleves.get(Maison.Serpentard).get(0));
		
		sut.inscriptionEleve("Lucius Malefoy", Maison.Serpentard);
		
		System.out.println(sut.maisonsEleves.get(Maison.Serpentard));

	}

}
