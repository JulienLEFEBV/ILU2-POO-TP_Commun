package model;

public abstract class EntiteReservable<P extends Formulaire> {
	private CalendrierAnnuel calendrierPersonnel = new CalendrierAnnuel();
	private int numero;

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public boolean estLibre(P formulaire) {
		return calendrierPersonnel.estLibre(formulaire.getJour(), formulaire.getMois());
	}

	public abstract boolean compatible(P formulaire);

	public abstract Reservation reservation(P formulaire);
}
