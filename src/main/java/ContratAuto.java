import java.util.ArrayList;

public class ContratAuto extends Contrat
{
	protected static int num = 0;
	
	public ContratAuto()
	{
		super();
		creationContrat();
	}
	
	@Override
	public void creationContrat() 
	{
		contratValide = true;
		numeroContrat = "CA"+num;
		num++;
	}

	@Override
	public ArrayList<String> determinerGaranties() 
	{
		ArrayList<String> garanties = new ArrayList<String>();
		garanties.add("Accidents");
		garanties.add("Bris de glace");
		garanties.add("Responsabilite Civile");
		
		return garanties;
	}

	@Override
	public double determinerCotisation() 
	{
		return 150.0;
	}

}
