package frontiere;

import java.util.Scanner;

import control.ControlReserverTable;
import model.Reservation;

public class BoundaryReserverTable {
	private ControlReserverTable controlReserverTable;
	private Scanner scanner = new Scanner(System.in);

	public BoundaryReserverTable(ControlReserverTable controlReserverTable) {
		this.controlReserverTable = controlReserverTable;
	}
	
	public Reservation reserverTable(int numClient) {
		System.out.println("Quand souhaitez vous reservez ?");
		System.out.println("Pour quel mois ?");
		String stringMois = scanner.next();
		int mois=Integer.parseInt(stringMois);
		System.out.println("Pour quel jour ?");
		String stringJour = scanner.next();
		int jour=Integer.parseInt(stringJour);
		System.out.println("Pour combien de personnes ?");
		String stringNbPers = scanner.next();
		int nbPers=Integer.parseInt(stringNbPers);
		System.out.println("Pour quel service ?");
		String stringService = scanner.next();
		int service=Integer.parseInt(stringService);
		int [] possibilites=controlReserverTable.trouverPossibilite(jour, mois, nbPers, service);
		for(int i=1;i<possibilites.length;i++) {
			System.out.println("numéro de table : "+ possibilites[i]);
		}
		int table;
		do {
			System.out.println("Choisissez votre table ?");
			String stringTable = scanner.next();
			table=Integer.parseInt(stringTable);
		}while(!isPossible(table,possibilites));
		return controlReserverTable.reserver(numClient, table, possibilites[0]);
	
	}
	
	
	private boolean isPossible(int table,int [] possibilites) {
		for(int i=1;i<possibilites.length;i++) {
			if (possibilites[i]==table) return true;
		}
		return false;
	}
}
