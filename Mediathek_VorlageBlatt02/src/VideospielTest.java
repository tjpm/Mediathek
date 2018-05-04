

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 */
public class VideospielTest extends AbstractMediumTest
{
    private static final String SYSTEM = "System";
    protected static final String BEZEICHNUNG = "Videospiel";

    public VideospielTest()
    {
        _medium1 = getMedium();
    }

    @Test
	public void testGetMedienBezeichnung()
	{
		String bezeichnung = BEZEICHNUNG;
		assertEquals(bezeichnung, _medium1.getMedienBezeichnung());
	}
    
    @Test
    public void testMietkostenTest()
    {
    	assertEquals(_medium1.berechneMietgebuehr(5), Geldbetrag.get(200));
    	assertEquals(_medium1.berechneMietgebuehr(0), Geldbetrag.get(200));
    	assertEquals(_medium1.berechneMietgebuehr(3), Geldbetrag.get(200));
    	assertEquals(_medium1.berechneMietgebuehr(99), Geldbetrag.get(200));
    }
    
    
    @Test
    public void testKonstruktor()
    {
        super.testKonstruktor();
        assertEquals(SYSTEM, ((Videospiel) _medium1).getSystem());
    }

   

    protected Videospiel getMedium()
    {
        return new Videospiel(TITEL, KOMMENTAR, SYSTEM);
    }

    

    

}
