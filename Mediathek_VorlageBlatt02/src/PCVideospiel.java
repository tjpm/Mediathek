
public class PCVideospiel extends AbstractVideospiel
{

	public PCVideospiel(String titel, String kommentar, String system)
	{
		super(titel,kommentar,system);
	}
	
	@Override
	protected int getPreisNachTagen(int mietTage)
	{
		int varBetrag = mietTage / 5;
		if(mietTage < 8)
			varBetrag = 0;
		
		return (varBetrag * 500);
	}
	
	@Override
	public Geldbetrag berechneMietgebuehr(int mietTage)
    {
		
		return Geldbetrag.get(BASISPREIS + getPreisNachTagen(mietTage));
    }
}
