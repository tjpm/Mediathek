

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 */
public class PCVideospielTest extends AbstractVideospielTest
{
    

    public PCVideospielTest()
    {
        _videoSpiel = getMedium();
    }

    
    @Test
    public void testMietkostenTest()
    {
    	assertEquals(_videoSpiel.berechneMietgebuehr(5), Geldbetrag.get(200));
    	assertEquals(_videoSpiel.berechneMietgebuehr(0), Geldbetrag.get(200));
    	assertEquals(_videoSpiel.berechneMietgebuehr(3), Geldbetrag.get(200));
    	assertEquals(_videoSpiel.berechneMietgebuehr(8), Geldbetrag.get(700));
    	assertEquals(_videoSpiel.berechneMietgebuehr(14), Geldbetrag.get(1200));
    	assertEquals(_videoSpiel.berechneMietgebuehr(7), Geldbetrag.get(200));
    	assertEquals(_videoSpiel.berechneMietgebuehr(99), Geldbetrag.get(9700));
    }
    
    @Test
    public void testeVideospiel()
    {
        assertEquals(TITEL, _videoSpiel.getTitel());
        assertEquals(KOMMENTAR, _videoSpiel.getKommentar());
        assertEquals(SYSTEM, ((PCVideospiel) (_videoSpiel)).getSystem());
    }
    

    
    
    @Override
    protected PCVideospiel getMedium()
    {
        return new PCVideospiel(TITEL, KOMMENTAR, SYSTEM);
    }

    

    

}
