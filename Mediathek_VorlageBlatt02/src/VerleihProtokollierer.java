import java.io.FileWriter;
import java.io.IOException;

public class VerleihProtokollierer
{

	/**
	 * Protokolliert die jeweiligen Ausleihen und Rückgaben.
	 * 
	 * @param ereignis gibt das Ereignis wider
	 * @param verleihkarte die entsprechende Verleihkarte für das Ereignis, darf nicht null sein
	 * @throws IOException 
	 * 
	 * @require verleihkarte != null
	 * @require ereignis != null
	 */
	
	public void protokolliere(String ereignis, Verleihkarte verleihkarte) throws ProtokollierException, IOException
	{
		assert verleihkarte != null : "Vorbedingung verletzt: verleihkarte != null";
		assert ereignis != null : "Vorbedingung verletzt: ereignis != null";
		FileWriter fw = new FileWriter("./protokoll.txt", true);
		try
		{
			
			fw.write(ereignis +" "+ Datum.heute().toString() + " " + "\r\n\r\n"+ verleihkarte.toString() +"\r\n");
			fw.write("\r\n");
			
		}
		catch(IOException e)
		{
			
			throw new ProtokollierException(e.toString());
			//System.err.println(e.toString());
		}
		finally
		{
			fw.close();
		}
		
		
		//System.out.println(ereignis +" "+ Datum.heute().toString() + "\n\n"+ verleihkarte.toString());
	}
	
}
