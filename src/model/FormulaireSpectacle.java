package model;

public class FormulaireSpectacle extends Formulaire{
	private int zone;

	public FormulaireSpectacle(int jour, int mois,int zone) {
		super(jour, mois);
		this.zone=zone;
	}

	public int getZone() {
		return zone;
	}
}
