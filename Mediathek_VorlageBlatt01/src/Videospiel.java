/**
 * Ein {@link Videospiel} ist ein Medium. Zusätzlich zu den Eigenschaften eines
 * {@link Medium}s erfasst sie Informationen zum System auf dem es läuft.
 * 
 * @author Tom Krause, Tarek Jakobeit
 * @version SoSe 2018
 * 
 */
class Videospiel implements Medium
{
    

    /**
     * Das System auf dem das Spiel läuft.
     */
    private String _system;

    /**
     * Ein Kommentar zum Medium
     */
    private String _kommentar;

    /**
     * Der Titel des Mediums
     * 
     */
    private String _titel;

    /**
     * Initialisiert ein neues Videospiel mit den gegebenen Daten.
     * 
     * @param titel Der Titel des Videospiels.
     * @param kommentar Ein Kommentar zu dem Videospiel.
     * @param system Das System auf dem das Videospiel läuft.
     * 
     * @require titel != null
     * @require kommentar != null
     * @require system != null
     * 
     * @ensure getTitel() == titel
     * @ensure getKommentar() == kommentar
     * @ensure getSystem() == system
     */
    public Videospiel(String titel, String kommentar, String system)
    {
        assert titel != null : "Vorbedingung verletzt: titel != null";
        assert kommentar != null : "Vorbedingung verletzt: kommentar != null";
        assert system != null : "Vorbedingung verletzt: system != null";
        _titel = titel;
        _kommentar = kommentar;
        _system = system;
    }



    @Override
    public String getMedienBezeichnung()
    {
        return "Videospiel";
    }

    /**
     * Gibt das System des Spiels wieder.
     * 
     * @return Das System des Spiels
     * 
     * @ensure result != null
     */
    public String getSystem()
    {
        assert _system != null : "Nachbedingung verletzt: result !=null";
        return _system;
    }

    @Override
    public String getKommentar()
    {
        return _kommentar;
    }

    @Override
    public String getTitel()
    {
        return _titel;
    }
    
    /**
     * 
     * @ensure result == typisierterString 
     */  
    @Override
    public String getFormatiertenString()
    {
    	String text = "";
    	text = text +"Medium: "+getMedienBezeichnung()
			+"\nTitel: "+getTitel()
			+"\nSystem: "+getSystem()
			+"\nKommentar: "+getKommentar();
    	
    	return text;
    }

}
