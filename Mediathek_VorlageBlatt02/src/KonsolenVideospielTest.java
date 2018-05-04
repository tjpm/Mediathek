

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 */
public class KonsolenVideospielTest extends AbstractVideospielTest
{
    

    public KonsolenVideospielTest()
    {
        _videoSpiel = getMedium();
    }

    
    @Test
    public void testMietkostenTest()
    {
    	assertEquals(_videoSpiel.berechneMietgebuehr(5), Geldbetrag.get(900));
    	assertEquals(_videoSpiel.berechneMietgebuehr(0), Geldbetrag.get(200));
    	assertEquals(_videoSpiel.berechneMietgebuehr(3), Geldbetrag.get(900));
    	assertEquals(_videoSpiel.berechneMietgebuehr(8), Geldbetrag.get(1600));
    	assertEquals(_videoSpiel.berechneMietgebuehr(11), Geldbetrag.get(2300));
    	assertEquals(_videoSpiel.berechneMietgebuehr(6), Geldbetrag.get(1600));
    	assertEquals(_videoSpiel.berechneMietgebuehr(99), Geldbetrag.get(23300));
    }
    
    @Test
    public void testeVideospiel()
    {
        assertEquals(TITEL, _videoSpiel.getTitel());
        assertEquals(KOMMENTAR, _videoSpiel.getKommentar());
        assertEquals(SYSTEM, ((KonsolenVideospiel) (_videoSpiel)).getSystem());
    }
    

    
    
    @Override
    protected KonsolenVideospiel getMedium()
    {
        return new KonsolenVideospiel(TITEL, KOMMENTAR, SYSTEM);
    }
}
