import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CDTest extends AbstractMediumTest
{
    
    private static final String INTERPRET = "CD Interpret";
    private static final int LAENGE = 100;
    protected static final String BEZEICHNUNG = "CD";
    

    public CDTest()
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
        assertEquals(LAENGE, ((CD) _medium1).getSpiellaenge());
        assertEquals(INTERPRET, ((CD) _medium1).getInterpret());
    }

    @Test
    public final void testSetter()
    {
        super.testSetter();
        ((CD) _medium1).setInterpret("Interpret2");
        assertEquals(((CD) _medium1).getInterpret(), "Interpret2");
        ((CD) _medium1).setSpiellaenge(99);
        assertEquals(((CD) _medium1).getSpiellaenge(), 99);
    }

    

    

    protected CD getMedium()
    {
        return new CD(TITEL, KOMMENTAR, INTERPRET, LAENGE);
    }
    
    
    

}
