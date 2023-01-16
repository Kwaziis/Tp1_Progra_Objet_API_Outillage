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



}
