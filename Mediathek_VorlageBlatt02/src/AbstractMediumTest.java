import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public abstract class AbstractMediumTest
{

	protected static final String KOMMENTAR = "Kommentar";
	protected static final String TITEL = "Titel";


	@Test
	public void testKonstruktor()
	{
		assertEquals(TITEL, getMedium().getTitel());
		assertEquals(KOMMENTAR, getMedium().getKommentar());
		
	}

	@Test
	public void testSetter()
	{
		getMedium().setTitel("Titel2");
		assertEquals(getMedium().getTitel(), "Titel2");
		getMedium().setKommentar("Kommentar2");
		assertEquals(getMedium().getKommentar(), "Kommentar2");
		
	}

	@Test
	public void testEquals()
	{
		assertFalse("Mehrere Exemplare des gleichen Mediums sind ungleich",
				getMedium().equals(getMedium2()));
		assertTrue("Dasselbe Exemplar des gleichen Mediums ist gleich",
				getMedium().equals(getMedium()));
	}

	@Test
	public final void testGetFormatiertenString()
	{
		
		assertNotNull(getMedium().getFormatiertenString());
	}

	protected abstract Medium getMedium();
	protected abstract Medium getMedium2();

	@Test
	public void testMietkostenTest()
	{
		assertEquals(getMedium().berechneMietgebuehr(5), Geldbetrag.get(1500));
		assertEquals(getMedium().berechneMietgebuehr(0), Geldbetrag.get(0));
		assertEquals(getMedium().berechneMietgebuehr(3), Geldbetrag.get(900));
		assertEquals(getMedium().berechneMietgebuehr(99), Geldbetrag.get(29700));
	}

}
