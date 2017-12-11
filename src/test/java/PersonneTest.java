import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

public class PersonneTest {

	@Test
	public void testPersonne() {
		Personne p = new Personne("Renard", "Dylan", new Date(96,3,8));
		
		assertEquals("Nom Prenom","Renard Dylan",p.obtenirNomComplet());
	}

	@Test
	public void testEstClient() {
		Personne p = new Personne("Dylan", "Renard", new Date(96,3,8));
		
		assertEquals("estClient",false,p.estClient());
		
		p.creerContrat("Auto");
		
		assertEquals("estClient",true,p.estClient());
	}

	@Test
	public void testCreerContrat() {
		Personne p = new Personne("Dylan", "Renard", new Date(96,3,8));
		
		p.creerContrat("Auto");
		
		assertEquals("Contrat",ContratAuto.class,p.getContratEnCour().get(0).getClass());
		
		p.creerContrat("MRH");
		
		assertEquals("Contrat",ContratMRH.class,p.getContratEnCour().get(1).getClass());
	}

}
