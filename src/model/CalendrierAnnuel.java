package model;

public class CalendrierAnnuel {
	
	private Mois[] calendrier = new Mois[12];
	
	private static class Mois{
		private String nom;
		private boolean[] jours;
		
		private Mois(String nom, int nbJours) {
			this.nom=nom;
			jours=new boolean[nbJours];
			for(int i=0;i<nbJours;i++) {
				jours[i]=false;
			}
		}
		
		private boolean estLibre(int jour) {
			return !jours[jour-1];
		}
		
		private void reserver(int jour) {
			if (jours[jour-1]) throw new IllegalStateException();
			jours[jour-1]=true;
		}
	}

	public CalendrierAnnuel() {
		calendrier[0]=new Mois("Janvier",31);
		calendrier[1]=new Mois("F�vrier",28);
		calendrier[2]=new Mois("Mars",31);
		calendrier[3]=new Mois("Avril",30);
		calendrier[4]=new Mois("Mai",31);
		calendrier[5]=new Mois("Juin",30);
		calendrier[6]=new Mois("Juillet",31);
		calendrier[7]=new Mois("Ao�t",31);
		calendrier[8]=new Mois("Septembre",30);
		calendrier[9]=new Mois("Octobre",31);
		calendrier[10]=new Mois("Novembre",30);
		calendrier[11]=new Mois("D�cembre",31);
	}
	
	public boolean estLibre(int jour,int mois) {
		return calendrier[mois-1].estLibre(jour);
	}
	
	public boolean reserver(int jour,int mois) {
		boolean reservationPossible=calendrier[mois-1].estLibre(jour);
		if(reservationPossible) calendrier[mois-1].reserver(jour);
		return reservationPossible;
	}
}
