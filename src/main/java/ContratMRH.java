import java.util.ArrayList;

public class ContratMRH extends Contrat
{
	protected static int num = 0;

	public ContratMRH()
	{
		super();
		creationContrat();
	}
	
	@Override
	public void creationContrat() 
	{
		contratValide = true;
		numeroContrat = "CMRH"+num;
		num++;
	}

	@Override
	public ArrayList<String> determinerGaranties() 
	{
		ArrayList<String> garanties = new ArrayList<String>();
		garanties.add("Incendies");
		garanties.add("Vitres");
		garanties.add("Innondations");
		garanties.add("Responsabilite Civile");
		
		return garanties;
	}

	@Override
	public double determinerCotisation() 
	{
		return 100.0;
	}

}
