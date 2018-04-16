import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class VideospielTest
{
    private static final String KOMMENTAR = "Kommentar";
    private static final String TITEL = "Titel";
    private static final String BEZEICHNUNG = "Videospiel";
    private static final String SYSTEM = "PS4";
    private Videospiel _spiel1;
    private Videospiel _spiel2;

    public VideospielTest()
    {
    	_spiel1 = getMedium();
    	_spiel2 = getMedium();
    }

    @Test
    public void testGetMedienBezeichnung()
    {
        String videospielBezeichnung = BEZEICHNUNG;
        assertEquals(videospielBezeichnung, _spiel1.getMedienBezeichnung());
    }

    @Test
    public void testKonstruktor()
    {
        assertEquals(TITEL, _spiel1.getTitel());
        assertEquals(KOMMENTAR, _spiel1.getKommentar());
        assertEquals(SYSTEM, _spiel1.getSystem());
    }

    @Test
    /*
     * Von ein und des selben Videospiels kann es mehrere Exemplare geben, die von
     * unterschiedlichen Personen ausgeliehen werden können.
     */
    public void testEquals()
    {
        assertFalse("Mehrere Exemplare der gleichen DVD sind gleich",
        		_spiel1.equals(_spiel2));
        assertTrue("Mehrere Exemplare der gleichen DVD sind ungleich",
        		_spiel1.equals(_spiel1));
    }
    
    @Test
    public void testSysteme()
    {
    	Videospiel videospiel1 = new Videospiel(TITEL, KOMMENTAR, "WII");
    	assertTrue("Spiel ist ein WII-Spiel",
    			videospiel1.getSystem() == "WII");
    	assertTrue("Spiel ist ein Xbox One-Spiel",
    			_spiel1.getSystem() == "PS4");
    	
    }

    protected Videospiel getMedium()
    {
        return new Videospiel(TITEL, KOMMENTAR, SYSTEM);
    }

}
