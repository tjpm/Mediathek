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
    private DVD _medium1;
    private DVD _medium2;
    
    public DVDTest()
    {
    	_medium1 = new DVD(TITEL, KOMMENTAR, REGISSEUR, LAENGE);
    	_medium2 = new DVD(TITEL, KOMMENTAR, REGISSEUR, LAENGE);
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
        assertEquals(LAENGE, _medium1.getLaufzeit());
        assertEquals(REGISSEUR, _medium1.getRegisseur());
    }

    @Test
    public final void testSetter()
    {
        super.testSetter();
        _medium1.setLaufzeit(90);
        assertEquals(90, _medium1.getLaufzeit());
        _medium1.setRegisseur("Regisseur2");
        assertEquals("Regisseur2", _medium1.getRegisseur());
    }

    

    protected DVD getMedium()
    {
        return _medium1;
    }
    
    protected DVD getMedium2()
    {
        return _medium2;
    }

}
