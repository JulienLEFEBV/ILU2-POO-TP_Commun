package model;

public class Restaurant {
	
	private static final int NB_TABLE_MAX=10;
	
	private CentraleDeReservation<EntiteReservable<FormulaireRestaurant>,FormulaireRestaurant> centrale;
	
	private static class Table extends EntiteReservable<FormulaireRestaurant> {

		private CalendrierAnnuel calendrierDeuxiemeService = new CalendrierAnnuel();
		private int nbChaises;
		
		private Table(int nbChaises) {
			super();
			this.nbChaises=nbChaises;
		}
		
		@Override
		public boolean compatible(FormulaireRestaurant formulaire) {
			int nbChaiseVoulue=formulaire.nombrePersonnes;
			boolean compatibleChaise= nbChaiseVoulue==nbChaises || nbChaiseVoulue==(nbChaises-1);
			if(formulaire.getNumService()==1) {
				return compatibleChaise;
			}
			else{
				return compatibleChaise;
			}
		}
		
		@Override
		public Reservation reservation(FormulaireRestaurant formulaire) {
			if(compatible(formulaire)) {
				if(formulaire.numService==1) {
					calendrierPersonnel.reserver(formulaire.getJour(), formulaire.getMois());
				}
				else {
					calendrierDeuxiemeService.reserver(formulaire.getJour(), formulaire.getMois());
				}
				return new ReservationRestaurant(formulaire.getJour(), formulaire.getMois(), formulaire.getNumService(), super.getNumero());
			}
			else return null;
		}
		
	}
	
	public Restaurant() {
		centrale = new CentraleDeReservation<>(new Table[NB_TABLE_MAX]);
	}
	
	public void ajouterTable(int nbChaise) {
		Table table = new Table(nbChaise);
		centrale.ajouterEntite(table);
	}
	
	public int[] donnerPossibilites(FormulaireRestaurant formulaire) {
		return centrale.donnerPossibilites(formulaire);
	}
	
	public Reservation reserver(int num,FormulaireRestaurant formulaire) {
		return centrale.reserver(num, formulaire);
	}
}
