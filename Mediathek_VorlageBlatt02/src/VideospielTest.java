

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 */
public class VideospielTest extends AbstractMediumTest
{
    private static final String SYSTEM = "System";
    protected static final String BEZEICHNUNG = "Videospiel";
    private Videospiel _medium1;
    private Videospiel _medium2;
    
    public VideospielTest()
    {
        _medium1 = new Videospiel(TITEL, KOMMENTAR, SYSTEM);
        _medium2 = new Videospiel(TITEL, KOMMENTAR, SYSTEM);
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
        assertEquals(SYSTEM, _medium1.getSystem());
    }

   

    protected Videospiel getMedium()
    {
        return _medium1;
    }

    protected Videospiel getMedium2()
    {
        return _medium2;
    }
    

    

}
