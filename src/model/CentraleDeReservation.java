package model;

public class CentraleDeReservation <E extends EntiteReservable<F>, F extends Formulaire> {
	private E[] entitesAReserver;
	private int nbEntite=0;
	
	public CentraleDeReservation(E[] entitesAReserver) {
		this.entitesAReserver = entitesAReserver;
	}
	
	public int ajouterEntite(E entite) {
		entitesAReserver[nbEntite]=entite;
		nbEntite++;
		entite.setNumero(nbEntite);
		return nbEntite;
	}
	
	public int[] donnerPossibilites(F formulaire) {
		int[] disponibilite = new int[nbEntite];
		for(int i=0;i<nbEntite;i++) {
			if(entitesAReserver[i].compatible(formulaire) && entitesAReserver[i].estLibre(formulaire)) {
				disponibilite[i]=entitesAReserver[i].getNumero();
			}
			else {
				disponibilite[i]=0;
			}
		}
		return disponibilite;
	}
	
	public Reservation reserver(int num,F formulaire) {
		E entite=null;
		int i=0;
		do {
			if(entitesAReserver[i].getNumero()==num)
				entite = entitesAReserver[i];
			i++;
		} while(entite==null && i<nbEntite);
		formulaire.setIdentificationEntite(num);
		return entite.reservation(formulaire);
	}
}
