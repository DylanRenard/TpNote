import java.util.ArrayList;

public class CompagnieAssurance 
{
	private String nom;
	private ArrayList<Personne> listePersonne = new ArrayList<Personne>();

	public int obtenirNombreDeClient()
	{
		int nbClient = 0;
		
		for(Personne p : listePersonne)
			if(p.estClient()) nbClient++;
		return nbClient;
	}
	
	public int obtenirNombreDeProspects()
	{
		int nbProspects = 0;
		
		for(Personne p : listePersonne)
			if(!p.estClient()) nbProspects++;
		return nbProspects;
	}
	
	public int obtenirNombreDeContrats()
	{
		int nbContrats = 0;
		
		for(Personne p : listePersonne)
			if(p.estClient()) nbContrats += p.obtenirContrats().size(); 
		
		return nbContrats;
	}
	
	public void ajouterPersonne(Personne p)
	{
		listePersonne.add(p);
	}
	
	public Personne obtenirPlusGrosClient()
	{
		Personne pgc = listePersonne.get(0);
		for(Personne p : listePersonne)
			if(p.compare(pgc, p)<0) pgc=p;
		return pgc;
	}
}
