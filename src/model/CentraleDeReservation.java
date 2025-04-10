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
}
