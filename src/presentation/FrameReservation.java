/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentation;

import com.github.lgooddatepicker.optionalusertools.DateChangeListener;
import com.github.lgooddatepicker.zinternaltools.DateChangeEvent;
import dialog.DialogReservation;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListModel;

@SuppressWarnings("serial")
public class FrameReservation extends javax.swing.JFrame {

    private DialogReservation dialog;

    public FrameReservation() {
    }

    public void initFrame() {
        initComponents();
    }

    public void setDialog(DialogReservation dialog) {
        this.dialog = dialog;
    }

    // /!\ /!\ /!\ ATTENTION /!\ /!\ /!\
    // ce code est auto généré et ne doit PAS être modifié
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dateTimePanel = new javax.swing.JPanel();
        datePicker = new com.github.lgooddatepicker.components.DatePicker();
        datePicker.addDateChangeListener(new DateChangeListener(){
            public void dateChanged(DateChangeEvent dateEvent) {
                datePickerDateChanged(dateEvent);
            }
        });
        choixDateLabel = new javax.swing.JLabel();
        choixHeureLabel = new javax.swing.JLabel();
        choixHeureComboBox = new javax.swing.JComboBox<>();
        nbPersonsPanel = new javax.swing.JPanel();
        nbPersonnesLabel = new javax.swing.JLabel();
        nbPersonnesComboBox = new javax.swing.JComboBox<>();
        pickTablePanel = new javax.swing.JPanel();
        tablesImage = new javax.swing.JLabel();
        choixTableLabel = new javax.swing.JLabel();
        choixTableScrollPane = new javax.swing.JScrollPane();
        choixTableList = new javax.swing.JList<>();
        annulerButton = new javax.swing.JButton();
        validerButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Réservez une table");

        dateTimePanel.setBorder(javax.swing.BorderFactory.createLineBorder(null));

        choixDateLabel.setText("1. Choisissez la date");
        choixDateLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        choixHeureLabel.setText("2. Choisissez l'heure");
        choixHeureLabel.setEnabled(false);
        choixHeureLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        choixHeureComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "11h30", "12h00", "12h30", "13h00", "13h30" }));
        choixHeureComboBox.setSelectedIndex(-1);
        choixHeureComboBox.setEnabled(false);
        choixHeureComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choixHeureComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dateTimePanelLayout = new javax.swing.GroupLayout(dateTimePanel);
        dateTimePanel.setLayout(dateTimePanelLayout);
        dateTimePanelLayout.setHorizontalGroup(
            dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dateTimePanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(datePicker, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(choixDateLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addGroup(dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(choixHeureComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(choixHeureLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE))
                .addGap(40, 40, 40))
        );

        dateTimePanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {choixDateLabel, choixHeureComboBox, choixHeureLabel, datePicker});

        dateTimePanelLayout.setVerticalGroup(
            dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dateTimePanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(choixDateLabel)
                    .addComponent(choixHeureLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(choixHeureComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        datePicker.getAccessibleContext().setAccessibleName("");
        datePicker.getAccessibleContext().setAccessibleDescription("");

        nbPersonsPanel.setBorder(javax.swing.BorderFactory.createLineBorder(null));

        nbPersonnesLabel.setText("3. Indiquez le nombre de personnes");
        nbPersonnesLabel.setEnabled(false);
        nbPersonnesLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        nbPersonnesComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "3", "4", "5", "6", "7", "8" }));
        nbPersonnesComboBox.setSelectedIndex(-1);
        nbPersonnesComboBox.setEnabled(false);
        nbPersonnesComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nbPersonnesComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout nbPersonsPanelLayout = new javax.swing.GroupLayout(nbPersonsPanel);
        nbPersonsPanel.setLayout(nbPersonsPanelLayout);
        nbPersonsPanelLayout.setHorizontalGroup(
            nbPersonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nbPersonsPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(nbPersonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nbPersonnesLabel)
                    .addComponent(nbPersonnesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        nbPersonsPanelLayout.setVerticalGroup(
            nbPersonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nbPersonsPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(nbPersonnesLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nbPersonnesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pickTablePanel.setBorder(javax.swing.BorderFactory.createLineBorder(null));

        tablesImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Plan_tables.jpg"))); // NOI18N
        tablesImage.setEnabled(false);

        choixTableLabel.setText("4. Choisissez votre table");
        choixTableLabel.setEnabled(false);
        choixTableLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        choixTableList.setEnabled(false);
        choixTableList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                choixTableListValueChanged(evt);
            }
        });
        choixTableScrollPane.setViewportView(choixTableList);

        javax.swing.GroupLayout pickTablePanelLayout = new javax.swing.GroupLayout(pickTablePanel);
        pickTablePanel.setLayout(pickTablePanelLayout);
        pickTablePanelLayout.setHorizontalGroup(
            pickTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pickTablePanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pickTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(choixTableLabel)
                    .addGroup(pickTablePanelLayout.createSequentialGroup()
                        .addComponent(tablesImage, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(choixTableScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pickTablePanelLayout.setVerticalGroup(
            pickTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pickTablePanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(choixTableLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pickTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pickTablePanelLayout.createSequentialGroup()
                        .addComponent(choixTableScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(tablesImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        annulerButton.setText("Annuler");
        annulerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                annulerButtonActionPerformed(evt);
            }
        });

        validerButton.setText("Valider");
        validerButton.setEnabled(false);
        validerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validerButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateTimePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nbPersonsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pickTablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(validerButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(annulerButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(dateTimePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(nbPersonsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pickTablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(validerButton)
                    .addComponent(annulerButton))
                .addGap(0, 8, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private LocalDate date;
    private int nbPersonne;
    private String heure;
    private String table;
    
    private void annulerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annulerButtonActionPerformed
        dialog.handleCancelEvent();
        disableAll();
    }//GEN-LAST:event_annulerButtonActionPerformed

    private void nbPersonnesComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nbPersonnesComboBoxActionPerformed
        int indice = nbPersonnesComboBox.getSelectedIndex();
        if(indice!=-1){
            String nbPersonnesString = nbPersonnesComboBox.getItemAt(indice);
            nbPersonne = Integer.parseInt(nbPersonnesString);
            actualiserTableList();
            setEnableChoixTable(true);
            validerButton.setEnabled(false);
        }
    }//GEN-LAST:event_nbPersonnesComboBoxActionPerformed

    private void choixHeureComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choixHeureComboBoxActionPerformed
        int indice=choixHeureComboBox.getSelectedIndex();
        if(indice!=-1){
            heure = choixHeureComboBox.getItemAt(indice);
            dialog.handleTimeSelectedEvent(heure);
            setEnableChoixNbPersonnes(true);
            validerButton.setEnabled(false);
            if(choixTableList.isEnabled()){
                actualiserTableList();
            }
        }
    }//GEN-LAST:event_choixHeureComboBoxActionPerformed

    private void choixTableListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_choixTableListValueChanged
       table=choixTableList.getSelectedValue();
       if (table!=null){
       int numTable = Integer.parseInt(table,6, table.length(), 10);
       dialog.handleTableSelectedEvent(numTable);
       validerButton.setEnabled(true);
       }
    }//GEN-LAST:event_choixTableListValueChanged

    private void validerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validerButtonActionPerformed

        String message="Réservation validée pour le " + date.getDayOfMonth() +" "+ date.getMonth().getDisplayName(TextStyle.FULL, Locale.FRANCE) + " " + date.getYear();
        message += " à "+heure+" pour "+nbPersonne+" personnes à la "+table+".";
        JOptionPane.showMessageDialog(nbPersonsPanel, message);
        disableAll();
        dialog.handleValidationEvent();
    }//GEN-LAST:event_validerButtonActionPerformed

    public void datePickerDateChanged(DateChangeEvent dateEvent) {
        date = dateEvent.getNewDate();
        if(date!=null){
            dialog.handleDateSelectedEvent(date);
            setEnableHeure(true);
            validerButton.setEnabled(false);
            if(choixTableList.isEnabled()){
                actualiserTableList();
            }
        }
    }
    
    private void setEnableHeure(boolean value){
        choixHeureLabel.setEnabled(value);
        choixHeureComboBox.setEnabled(value);
    }
    
    private void setEnableChoixNbPersonnes(boolean value){
        nbPersonnesComboBox.setEnabled(value);
        nbPersonnesLabel.setEnabled(value);
    }
    
    private void setEnableChoixTable(boolean value){
        tablesImage.setEnabled(value);
        choixTableLabel.setEnabled(value);
        choixTableList.setEnabled(value);
    }
    
    private void actualiserTableList(){
        dialog.handleNumOfPersonsSelectedEvent(nbPersonne);
        String [] tablesDispo = dialog.trouverTableDisponible();
        DefaultListModel model = new DefaultListModel();
        for(int i=0;i<tablesDispo.length;i++){
            model.addElement(tablesDispo[i]);
        }
        choixTableList.setModel(model);
    }
    
    private void disableAll(){
        setEnableChoixTable(false);
        setEnableChoixNbPersonnes(false);
        setEnableHeure(false);
        validerButton.setEnabled(false);
        datePicker.clear();
        choixHeureComboBox.setSelectedIndex(-1);
        nbPersonnesComboBox.setSelectedIndex(-1);
        choixTableList.setModel(new DefaultListModel());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton annulerButton;
    private javax.swing.JLabel choixDateLabel;
    private javax.swing.JComboBox<String> choixHeureComboBox;
    private javax.swing.JLabel choixHeureLabel;
    private javax.swing.JLabel choixTableLabel;
    private javax.swing.JList<String> choixTableList;
    private javax.swing.JScrollPane choixTableScrollPane;
    private com.github.lgooddatepicker.components.DatePicker datePicker;
    private javax.swing.JPanel dateTimePanel;
    private javax.swing.JComboBox<String> nbPersonnesComboBox;
    private javax.swing.JLabel nbPersonnesLabel;
    private javax.swing.JPanel nbPersonsPanel;
    private javax.swing.JPanel pickTablePanel;
    private javax.swing.JLabel tablesImage;
    private javax.swing.JButton validerButton;
    // End of variables declaration//GEN-END:variables

}
