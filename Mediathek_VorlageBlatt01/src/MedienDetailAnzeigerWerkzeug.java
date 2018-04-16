

import java.util.List;

import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;

/**
 * Ein MedienDetailAnzeigerWerkzeug ist ein Werkzeug um die Details von Medien
 * anzuzeigen.
 * 
 * @author SE2-Team, PM2-Team
 * @version SoSe 2018
 */
class MedienDetailAnzeigerWerkzeug
{
    private MedienDetailAnzeigerUI _ui;

    /**
     * Initialisiert ein neues MedienDetailAnzeigerWerkzeug.
     */
    public MedienDetailAnzeigerWerkzeug()
    {
        _ui = new MedienDetailAnzeigerUI();
    }

    /**
     * Setzt die Liste der Medien deren Details angezeigt werden sollen.
     * 
     * @param medien Eine Liste von Medien.
     * 
     * @require (medien != null)
     */
    public void setMedien(List<Medium> medien)
    {
        assert medien != null : "Vorbedingung verletzt: (medien != null)";
        TextArea selectedMedienTextArea = _ui.getMedienAnzeigerTextArea();
        String text = "";       
        for (Medium medium : medien)
        {
        	text = mediumBezeichnungFormat(text);
        	text = text + medium.getFormatiertenString();
        }
        selectedMedienTextArea.setText(text);
    }
    
    /*
    public void setMedien(List<Medium> medien)
    {
        assert medien != null : "Vorbedingung verletzt: (medien != null)";
        TextArea selectedMedienTextArea = _ui.getMedienAnzeigerTextArea();
        String text = "";
        for (Medium medium : medien)
        {
        	if(medium instanceof CD)
        	{
        		CD cd = (CD)medium;
        		text = mediumBezeichnungFormat(text);
        		text = text +"Medium: "+cd.getMedienBezeichnung()
               			+"\nInterpret: "+cd.getInterpret()
               			+"\nTitel: "+cd.getTitel()
               			+"\nSpiellänge: "+cd.getSpiellaenge() + " Minuten"
               			+"\nKommentar: "+cd.getKommentar();
        	}
        	else if(medium instanceof DVD)
        	{
        		DVD dvd = (DVD) medium;
        		text = mediumBezeichnungFormat(text);
        		text = text +"Medium: "+dvd.getMedienBezeichnung()
               			+"\nRegisseur: "+dvd.getRegisseur()
               			+"\nTitel: "+dvd.getTitel()
               			+"\nSpiellänge: "+dvd.getLaufzeit() + " Minuten"
               			+"\nKommentar: "+dvd.getKommentar();
        	
        	}
        	else if(medium instanceof Videospiel)
        	{
        		Videospiel videospiel = (Videospiel) medium;
        		text = mediumBezeichnungFormat(text);
        		text = text +"Medium: "+videospiel.getMedienBezeichnung()
		       			+"\nTitel: "+videospiel.getTitel()
		       			+"\nSystem: "+videospiel.getSystem()
		       			+"\nKommentar: "+videospiel.getKommentar();
        	}
        }
        selectedMedienTextArea.setText(text);
    }
    */
    
    
    private String mediumBezeichnungFormat(String text)
    {
    	String ergebnis = text;
    	if(!ergebnis.equals(""))
		{
    		ergebnis = ergebnis + "\n\n";
		}
    	return ergebnis;
    }

    /**
     * Gibt das Panel dieses Subwerkzeugs zurück.
     * 
     * @ensure result != null
     */
    public Pane getUIPane()
    {
        return _ui.getUIPane();
    }
}
