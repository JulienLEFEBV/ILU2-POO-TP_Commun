/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dialog;


import java.awt.EventQueue;
import java.time.LocalDate;

import interface_noyau_fonctionnel.AdaptateurDuNoyauFonctionnel;
import presentation.FrameReservation;

public class DialogReservation {

    private FrameReservation frameReservation;
    private AdaptateurDuNoyauFonctionnel inf;
    private int jour;
    private int mois;
    private int annee;
    private String time;
    private int nbPersons;
    private int numTable;

    public DialogReservation(AdaptateurDuNoyauFonctionnel inf) {
        this.inf = inf;
    }

    public void initDialog() {
        frameReservation = new FrameReservation();
        frameReservation.initFrame();
        frameReservation.setDialog(this);
        frameReservation.setVisible(true);
    }

    public void handleDateSelectedEvent(LocalDate date) {
        jour=date.getDayOfMonth();
        mois=date.getMonthValue();
        annee=date.getYear();
    }

    public void handleTimeSelectedEvent(String time) {
        this.time=time;
    }

    public void handleNumOfPersonsSelectedEvent(int nbPersons) {
        this.nbPersons=nbPersons;
    }

    public void handleTableSelectedEvent(int numTable) {
        this.numTable=numTable;
    }

    public void handleCancelEvent() {
        jour=0;
        mois=0;
        annee=0;
        time=null;
        nbPersons=0;
        numTable=0;
    }

    public void handleValidationEvent() {
        jour=0;
        mois=0;
        annee=0;
        time=null;
        nbPersons=0;
        numTable=0;
    }
    
    public String[] trouverTableDisponible(){
        return inf.trouverTableDisponible(jour, mois, nbPersons, time);
    }
    
    
}
