

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 */
public abstract class AbstractVideospielTest
{
    protected static final String KOMMENTAR = "Kommentar";
    protected static final String TITEL = "Titel";
    protected static final String BEZEICHNUNG = "Videospiel";
    protected static final String SYSTEM = "System";
    protected Medium _videoSpiel;

    public AbstractVideospielTest()
    {
        _videoSpiel = getMedium();
    }

    
    
    
    protected abstract Medium getMedium();
    
    

    @Test
    public void testGetMedienBezeichnung()
    {
        assertEquals(BEZEICHNUNG, _videoSpiel.getMedienBezeichnung());
    }

    

    @Test
    public final void testSetKommentar()
    {
        Medium medium = getMedium();
        medium.setKommentar("Kommentar2");
        assertEquals(medium.getKommentar(), "Kommentar2");
    }

    @Test
    public final void testSetTitel()
    {
    	Medium medium = getMedium();
        medium.setTitel("Titel2");
        assertEquals(medium.getTitel(), "Titel2");
    }

}
