
public class KonsolenVideospiel extends AbstractVideospiel
{
	public KonsolenVideospiel(String titel, String kommentar, String system)
	{
		super(titel, kommentar, system);
	}

	@Override
	protected int getPreisNachTagen(int mietTage)
	{

		int varBetrag = mietTage / 3;

		return (varBetrag * 700);
	}

	@Override
	public Geldbetrag berechneMietgebuehr(int mietTage)
	{
		

		return Geldbetrag.get(BASISPREIS + getPreisNachTagen(mietTage));
	}
}
