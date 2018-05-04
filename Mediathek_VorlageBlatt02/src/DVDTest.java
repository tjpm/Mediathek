import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class DVDTest extends AbstractMediumTest
{
    
    private static final int LAENGE = 100;
    private static final String REGISSEUR = "DVD Regisseur";
    protected static final String BEZEICHNUNG = "DVD";

    public DVDTest()
    {
    	_medium1 = getMedium();
    	_medium2 = getMedium();
    }

    @Test
	public void testGetMedienBezeichnung()
	{
		String bezeichnung = BEZEICHNUNG;
		assertEquals(bezeichnung, _medium1.getMedienBezeichnung());
	}

    @Test
    public void testKonstruktor()
    {
        super.testKonstruktor();
        assertEquals(LAENGE, ((DVD) _medium1).getLaufzeit());
        assertEquals(REGISSEUR, ((DVD) _medium1).getRegisseur());
    }

    @Test
    public final void testSetter()
    {
        super.testSetter();
        ((DVD) _medium1).setLaufzeit(90);
        assertEquals(90, ((DVD) _medium1).getLaufzeit());
        ((DVD) _medium1).setRegisseur("Regisseur2");
        assertEquals("Regisseur2", ((DVD) _medium1).getRegisseur());
    }

    

    protected DVD getMedium()
    {
        return new DVD(TITEL, KOMMENTAR, REGISSEUR, LAENGE);
    }

}
