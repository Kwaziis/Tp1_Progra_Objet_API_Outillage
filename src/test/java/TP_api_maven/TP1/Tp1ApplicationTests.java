package TP_api_maven.TP1;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Tp1ApplicationTests {

	@Test
	void testDepassementTaille() {
		Zoo z=new Zoo();
		assertEquals(z.getLimiteVisiteur(),z.visiteurs);
		assertThrows(LimiteVisiteurExeption.class,() -> {
			// execution
			z.nouveauVisiteur();
		});
	}
	@Test
	void testChienBonEndroit(){
		Zoo z=new Zoo();
		Chien clebar =new Chien();
		clebar.setNomAnimal("medor");
		z.ajouterSecteur(TypeAnimal.Chien);

		try {
			z.nouvelAnimal(clebar);
		} catch (AnimalDansMauvaisSecteurException e) {
			throw new RuntimeException(e);
		}
		assertEquals(1,z.nombreAnimaux());
		assertEquals(z.secteurAnimaux.get(0).getAnimauxDansSecteur().get(0).getNomAnimal(),"medor");
	}
	@Test
	void testTypeAnimal(){
		Zoo z =new Zoo();
		z.ajouterSecteur(TypeAnimal.Poulet);
		Animal a = new Animal();
		a.setNomAnimal("George");
		a.setTypeAnimal(TypeAnimal.Poulet);

		try {
			z.nouvelAnimal(a);
		} catch (AnimalDansMauvaisSecteurException e) {
			throw new RuntimeException(e);
		}
		assertEquals(z.secteurAnimaux.get(0).getAnimauxDansSecteur().get(0).getTypeAnimal(),TypeAnimal.Poulet);
	}



}
