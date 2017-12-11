import java.util.ArrayList;

public abstract class Contrat 
{
	protected String numeroContrat;
	protected boolean contratValide;
	
	public abstract void creationContrat();
	
	public abstract ArrayList<String> determinerGaranties();
	
	public abstract double determinerCotisation();
	
	public String getNumeroContrat() {return numeroContrat;}
	
}
