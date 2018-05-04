
public abstract class AbstractVideospiel extends AbstractMedium
		implements Medium
{

	/**
	 * Das System, auf dem das Spiel lauffähig ist
	 */
	protected String _system;
	protected static final int BASISPREIS = 200;
	

	/**
     * Initialisiert ein neues Videospiel.
     * 
     * @param titel Der Titel des Spiels
     * @param kommentar Ein Kommentar zum Spiel
     * @param system Die Bezeichnung des System
     * 
     * @require titel != null
     * @require kommentar != null
     * @require system != null
     * 
     * @ensure getTitel() == titel
     * @ensure getKommentar() == kommentar
     * @ensure getSystem() == system
     */
    protected AbstractVideospiel(String titel, String kommentar, String system)
    {
    	assert titel != null : "Vorbedingung verletzt: titel != null";
        assert kommentar != null : "Vorbedingung verletzt: kommentar != null";
        assert system != null : "Vorbedingung verletzt: system != null";
        _titel = titel;
        _kommentar = kommentar;
        _system = system;
    }

    protected abstract int getPreisNachTagen(int mietTage);
    
    
	@Override
	public String getMedienBezeichnung()
	{
		return "Videospiel";
	}

	/**
	 * Gibt das System zurück, auf dem das Spiel lauffähig ist.
	 * 
	 * @return Das System, auf dem das Spiel ausgeführt werden kann.
	 * 
	 * @ensure result != null
	 */
	public String getSystem()
	{
		return _system;
	}

	@Override
	public String getFormatiertenString()
	{
		return super.getFormatiertenString() + "System: " + _system + "\n";
	}

	@Override
	public Geldbetrag berechneMietgebuehr(int mietTage)
	{
		return Geldbetrag.get(200 * mietTage);
	}

}
