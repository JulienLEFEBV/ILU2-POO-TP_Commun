package model;

public class ReservationHotel extends Reservation {
	private int nbLitSimple;
	private int nbLitDouble;
	private int numChambre;
	public ReservationHotel(int jour, int mois,int nbLitSimple,int nbLitDouble,int numChambre) {
		super(jour, mois);
		this.nbLitSimple=nbLitSimple;
		this.nbLitDouble=nbLitDouble;
		this.numChambre=numChambre;
	}
	
	@Override
	public String toString() {
		return super.toString()+nbLitSimple+" lits simples "+nbLitDouble+ " lits doubles � la chambre "+numChambre;
	}
}
