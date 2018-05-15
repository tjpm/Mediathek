
abstract class AbstractMedium implements Medium
{
	/**
     * Ein Kommentar zum Medium
     */
	private String _kommentar;
    
    /**
     * Der Titel des Mediums
     */
    
    
	private String _titel;
	
	protected AbstractMedium(String titel, String kommentar)
	{
		assert titel != null : "Vorbedingung verletzt: titel != null";
        assert kommentar != null : "Vorbedingung verletzt: kommentar != null";
		_kommentar = kommentar;
		_titel = titel;
	}
   
    /**
     * Ändert den Kommentar
     * 
     * @param kommentar Ein Kommentar zum Medium
     * 
     * @require kommentar != null
     * @ensure getKommentar() == kommentar
     */
    
    public void setKommentar(String kommentar)
    {
        assert kommentar != null : "Vorbedingung verletzt: kommentar != null";
        _kommentar = kommentar;
    }
    
    public Geldbetrag berechneMietgebuehr(int mietTage)
    {
    	return Geldbetrag.get(mietTage * 300);
    }
    
    public String getKommentar()
    {
        return _kommentar;
    }
    
    
    public String toString()
    {
        return getFormatiertenString();
    }
    
    public String getTitel()
    {
        return _titel;
    }
    
    /**
     * Ändert den Titel
     * 
     * @param titel Der Titel des Mediums
     * 
     * @require titel != null
     * @ensure getTitel() == titel
     */
    
    public void setTitel(String titel)
    {
        assert titel != null : "Vorbedingung verletzt: titel != null";
        _titel = titel;
    }
    
    public String getMedienBezeichnung()
    {
        return "AbstractMedium";
    }
    
    public String getFormatiertenString()
    {
        return getMedienBezeichnung() + ":\n" + "    " + "Titel: " + _titel
                + "\n" + "    " + "Kommentar: " + _kommentar + "\n" + "    ";
                
    }
}
