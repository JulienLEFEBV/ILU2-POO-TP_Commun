package test_fonctionnel;

import control.ControlConnecterClient;
import control.ControlCreerClient;
import control.ControlReserverTable;
import control.ControlVisualiserCarnetClientele;
import frontiere.BoundaryConnecterClient;
import frontiere.BoundaryCreerClient;
import frontiere.BoundaryReserverTable;
import model.CarnetClientele;
import model.Reservation;
import model.Restaurant;

public class TestReserverTable {
	public static void main(String[] args) {
		System.out.println("---------- CREER CLIENT ----------");
		// ENTITE : Creation du carnet de clientele
		CarnetClientele carnetClientele = new CarnetClientele();
		//

		ControlCreerClient controlCreerClient = new ControlCreerClient(carnetClientele);
		BoundaryCreerClient boundaryCreerClient = new BoundaryCreerClient(controlCreerClient);
		boundaryCreerClient.creerClient();

		System.out.println("\n---------- CONNECTER CLIENT ----------");
		ControlConnecterClient controlConnecterClient = new ControlConnecterClient(carnetClientele);
		BoundaryConnecterClient boundaryConnecterClient = new BoundaryConnecterClient(controlConnecterClient);
		int numClient = boundaryConnecterClient.connecterClient();

		// Creation et configuration du restaurant
		Restaurant restaurant = new Restaurant();
		restaurant.ajouterTable(2);
		restaurant.ajouterTable(4);
		restaurant.ajouterTable(4);
		restaurant.ajouterTable(4);
		restaurant.ajouterTable(4);
		restaurant.ajouterTable(8);
		//

		System.out.println("\n---------- RESERVER TABLE ----------");
		ControlReserverTable controlReserverTable = new ControlReserverTable(restaurant, carnetClientele);
		BoundaryReserverTable boundaryReserverTable = new BoundaryReserverTable(controlReserverTable);
		Reservation reservation = boundaryReserverTable.reserverTable(numClient);
		
		
		System.out.println("\n\n---------- CONTROLE DES DONNEES ----------");
		System.out.println("Client :");
		System.out.println(carnetClientele.getClient(numClient));
		System.out.println("Reservation :");
		System.out.println(reservation);
	}
}
