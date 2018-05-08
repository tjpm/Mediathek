

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
    

    public AbstractVideospielTest()
    {
        
    }

    
    
    
    protected abstract Medium getMedium();
    
    

    @Test
    public void testGetMedienBezeichnung()
    {
        assertEquals(BEZEICHNUNG, getMedium().getMedienBezeichnung());
    }

    

    @Test
    public final void testSetKommentar()
    {
        
        getMedium().setKommentar("Kommentar2");
        assertEquals(getMedium().getKommentar(), "Kommentar2");
    }

    @Test
    public final void testSetTitel()
    {
    	
    	getMedium().setTitel("Titel2");
        assertEquals(getMedium().getTitel(), "Titel2");
    }

}
