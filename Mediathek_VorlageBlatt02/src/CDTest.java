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
    
    private CD _medium1;
    private CD _medium2;
    
    public CDTest()
    {
    	_medium1 = new CD(TITEL, KOMMENTAR, INTERPRET, LAENGE);
    	_medium2 = new CD(TITEL, KOMMENTAR, INTERPRET, LAENGE);
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
        assertEquals(LAENGE, _medium1.getSpiellaenge());
        assertEquals(INTERPRET, _medium1.getInterpret());
    }

    @Test
    public final void testSetter()
    {
        super.testSetter();
        _medium1.setInterpret("Interpret2");
        assertEquals(_medium1.getInterpret(), "Interpret2");
        _medium1.setSpiellaenge(99);
        assertEquals(_medium1.getSpiellaenge(), 99);
    }

    

    

    protected CD getMedium()
    {
        return _medium1;
    }
    
    protected CD getMedium2()
    {
        return _medium2;
    }
    

}
