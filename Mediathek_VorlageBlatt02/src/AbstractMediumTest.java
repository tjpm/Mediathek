import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public abstract class AbstractMediumTest
{

	protected static final String KOMMENTAR = "Kommentar";
	protected static final String TITEL = "Titel";
	protected Medium _medium1;
	protected Medium _medium2;

	public AbstractMediumTest()
	    {
		_medium1 = getMedium();
		_medium2 = getMedium();
	    }

	

	@Test
	public void testKonstruktor()
	{
		assertEquals(TITEL, _medium1.getTitel());
		assertEquals(KOMMENTAR, _medium1.getKommentar());
		
	}

	@Test
	public void testSetter()
	{
		_medium1.setTitel("Titel2");
		assertEquals(_medium1.getTitel(), "Titel2");
		_medium1.setKommentar("Kommentar2");
		assertEquals(_medium1.getKommentar(), "Kommentar2");
		
	}

	@Test
	/*
	 * Von ein und der selben CD kann es mehrere Exemplare geben, die von
	 * unterschiedlichen Personen ausgeliehen werden können.
	 */
	public void testEquals()
	{
		assertFalse("Mehrere Exemplare der gleichen CD sind ungleich",
				_medium1.equals(_medium2));
		assertTrue("Dasselbe Exemplare der gleichen CD ist gleich",
				_medium1.equals(_medium1));
	}

	@Test
	public final void testGetFormatiertenString()
	{
		Medium medium = getMedium();
		assertNotNull(medium.getFormatiertenString());
	}

	protected abstract Medium getMedium();
	

	@Test
	public void testMietkostenTest()
	{
		assertEquals(_medium1.berechneMietgebuehr(5), Geldbetrag.get(1500));
		assertEquals(_medium1.berechneMietgebuehr(0), Geldbetrag.get(0));
		assertEquals(_medium1.berechneMietgebuehr(3), Geldbetrag.get(900));
		assertEquals(_medium1.berechneMietgebuehr(99), Geldbetrag.get(29700));
	}

}
