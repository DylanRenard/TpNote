import java.util.Date;
import java.util.Scanner;

public class Main 
{

	@SuppressWarnings("deprecation")
	public static void main(String[] args) 
	{
		CompagnieAssurance cieAss = new CompagnieAssurance();
		
		Personne p1 = new Personne ("Renard", "Dylan", new Date(96,3,8));
		p1.creerContrat("Auto");
		
		Personne p2 = new Personne ("Mugiwara", "Luffy", new Date(96,0,1));
		
		Personne p3 = new Personne ("Charlotte", "Pudding", new Date(96,10,20));
		
		Personne p4 = new Personne ("Nico", "Robine", new Date(96,6,10));
		p4.creerContrat("Prevoyance");
		p4.creerContrat("MRH");
		
		cieAss.ajouterPersonne(p1);
		cieAss.ajouterPersonne(p2);
		cieAss.ajouterPersonne(p3);
		cieAss.ajouterPersonne(p4);
		
		Scanner s = new Scanner(System.in);
		String line=s.nextLine();
		System.out.println(line);
	}

}
