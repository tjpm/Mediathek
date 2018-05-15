

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 */
public class PCVideospielTest extends AbstractVideospielTest
{
    private PCVideospiel _videoSpiel;

    public PCVideospielTest()
    {
        _videoSpiel = new PCVideospiel(TITEL, KOMMENTAR, SYSTEM);
    }

    
    @Test
    public void testMietkostenTest()
    {
    	assertEquals(_videoSpiel.berechneMietgebuehr(5), Geldbetrag.get(200));
    	assertEquals(_videoSpiel.berechneMietgebuehr(0), Geldbetrag.get(200));
    	assertEquals(_videoSpiel.berechneMietgebuehr(32), Geldbetrag.get(2700));
    	assertEquals(_videoSpiel.berechneMietgebuehr(8), Geldbetrag.get(700));
    	assertEquals(_videoSpiel.berechneMietgebuehr(14), Geldbetrag.get(1200));
    	assertEquals(_videoSpiel.berechneMietgebuehr(7), Geldbetrag.get(200));
    	assertEquals(_videoSpiel.berechneMietgebuehr(33), Geldbetrag.get(3200));
    }
    
    @Test
    public void testeVideospiel()
    {
        assertEquals(TITEL, _videoSpiel.getTitel());
        assertEquals(KOMMENTAR, _videoSpiel.getKommentar());
        assertEquals(SYSTEM, _videoSpiel.getSystem());
    }
    

    
    
    @Override
    protected PCVideospiel getMedium()
    {
        return _videoSpiel;
    }

    

    

}
