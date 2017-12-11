import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;

public class Personne implements Comparator<Personne>
{
	private boolean estUnClient ;
	private String nom;
	private String prenom;
	private Date dateDeNaissance;
	private ArrayList<Personne> personneDeLaFamille;
	private ArrayList<Contrat> contratEnCour;
	
	public Personne(String nom, String prenom, Date date)
	{
		this.estUnClient=false;
		this.nom=nom;
		this.prenom=prenom;
		this.dateDeNaissance=date;
		personneDeLaFamille=new ArrayList<Personne>();
		contratEnCour=new ArrayList<Contrat>();
	}
	
	public boolean estClient()
	{
		return estUnClient;
	}

	public String obtenirNomComplet()
	{
		return nom + " " + prenom;
	}
	
	public Date obtenirDateDeNaissance()
	{
		return dateDeNaissance;
	}
	
	public void creerContrat(String type)
	{
		Contrat c = null;
		
		if(type.equals("Auto")) c = new ContratAuto();
		else if (type.equals("Prevoyance")) c = new ContratPrevoyance();
		else if (type.equals("MRH")) c = new ContratMRH();
		
		contratEnCour.add(c);
		
		if(!estUnClient) estUnClient = !estUnClient;
	}
	
	public void resilierContrat(Contrat c)
	{
		contratEnCour.remove(c);
		
		if(contratEnCour.size()==0) estUnClient = !estUnClient;
	}
	
	public void resilierContrat(String num)
	{
		for (Contrat c : contratEnCour)
		{
			if(c.numeroContrat.equals(num))
			{
				contratEnCour.remove(c);
				if(contratEnCour.size()==0) estUnClient = !estUnClient;
				return;
			}
		}
	}
	
	public ArrayList<Contrat> obtenirContrats()
	{
		return contratEnCour;
	}
	
	public ArrayList<Contrat> obtenirContratsAuto()
	{
		ArrayList<Contrat> listeContratAuto = new ArrayList<Contrat>();
		
		for(Contrat c : contratEnCour)
		{
			if(c instanceof ContratAuto) listeContratAuto.add(c);
		}
		
		return listeContratAuto;
	}
	
	public ArrayList<Contrat> obtenirContratsMRH()
	{
		ArrayList<Contrat> listeContratMRH = new ArrayList<Contrat>();
		
		for(Contrat c : contratEnCour)
		{
			if(c instanceof ContratMRH) listeContratMRH.add(c);
		}
		
		return listeContratMRH;
	}
	
	public String toString()
	{
		String s = nom + " " + prenom + "\nListe des Contrats :\n";
		for(Contrat c : contratEnCour)
			s += c.getNumeroContrat() + "\n";
		
		return s;
	}
	
	public void ajouterFamille(Personne p)
	{
		this.personneDeLaFamille.add(p);
		p.personneDeLaFamille.add(this);
	}

	public int compare(Personne p1, Personne p2) {
		if(p1.contratEnCour.size()==p2.contratEnCour.size()) return 0;
		else if(p1.contratEnCour.size()<p2.contratEnCour.size()) return -1;
		else return 1;
	}
	
	public ArrayList<Contrat> getContratEnCour() {return contratEnCour;}
}
