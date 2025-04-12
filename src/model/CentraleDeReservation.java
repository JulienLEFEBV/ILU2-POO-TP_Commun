package model;

public class CentraleDeReservation <P extends Formulaire> {
	private EntiteReservable<P>[] entitesAReserver;
	private int nbEntite=0;
	
	public CentraleDeReservation(EntiteReservable<P>[] entitesAReserver) {
		this.entitesAReserver = entitesAReserver;
	}
	
	public int ajouterEntite(EntiteReservable<P> entite) {
		entitesAReserver[nbEntite]=entite;
		nbEntite++;
		entite.setNumero(nbEntite);
		return nbEntite;
	}
	
	public int[] donnerPossibilites(P formulaire) {
		int[] disponibilite = new int[nbEntite];
		for(int i=0;i<nbEntite;i++) {
			if(entitesAReserver[i].compatible(formulaire)) {
				disponibilite[i]=entitesAReserver[i].getNumero();
			}
			else {
				disponibilite[i]=0;
			}
		}
		return disponibilite;
	}
	
	public Reservation reserver(int num,P formulaire) {
		EntiteReservable<P> entite=null;
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
