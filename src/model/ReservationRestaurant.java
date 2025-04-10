package model;

public class ReservationRestaurant extends Reservation {
	private int service;
	private int table;
	public ReservationRestaurant(int jour, int mois,int service,int table) {
		super(jour, mois);
		this.service=service;
		this.table=table;
	}
	
	@Override
	public String toString() {
		String valDeRetour=super.toString() + "Table "+table+" pour le ";
		if(service==1) valDeRetour+="premier";
		else valDeRetour+="deuxième";
		valDeRetour+=" service.";
		return valDeRetour;
	}
}
