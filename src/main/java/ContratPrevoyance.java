import java.util.ArrayList;

public class ContratPrevoyance extends Contrat
{
	protected static int num = 0;

	public ContratPrevoyance()
	{
		super();
		creationContrat();
	}
	
	@Override
	public void creationContrat() 
	{
		contratValide = true;
		numeroContrat = "CP"+num;
		num++;
	}

	@Override
	public ArrayList<String> determinerGaranties() 
	{
		ArrayList<String> garanties = new ArrayList<String>();
		garanties.add("Accidents de la Vie");
		garanties.add("Maladie");
		garanties.add("Mutuelle");
		
		return garanties;
	}

	@Override
	public double determinerCotisation() 
	{
		return 75.0;
	}

}
