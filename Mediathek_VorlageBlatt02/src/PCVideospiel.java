
public class PCVideospiel extends AbstractVideospiel
{

	public PCVideospiel(String titel, String kommentar, String system)
	{
		super(titel,kommentar,system);
	}
	
	@Override
	protected int getPreisNachTagen(int mietTage)
	{
		if(mietTage <= 7)
			return 0;
		int varBetrag = (mietTage-7 +4) / 5;
		
		
		
		
		return (varBetrag * 500);
	}

}
