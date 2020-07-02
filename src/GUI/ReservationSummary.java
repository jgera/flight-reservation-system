/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import Classes.*;
/**
 *
 * 
 */
public class ReservationSummary extends javax.swing.JInternalFrame {

    /**
     * Creates new form ReservationSummary
     */
    public ReservationSummary() {
        initComponents();
    }

    public ReservationSummary(Reservation reservation){
        initComponents();
//        String str = "Name : " + passenger1.getName().getFirstName() + "\t" + passenger1.getName().getLastName() +
//                "\n\nPostal Address : " + passenger1.getAddress().getStreet() + ", " + passenger1.getAddress().getCity() +
//                "\n\nContact Number : " + passenger1.getTelephoneNumber();

        String strPassenger = reservation.toString();
        //String strFlight = flight.
        passengerDetailsText.setText(strPassenger);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        passengerDetailsText = new javax.swing.JTextArea();

        setClosable(true);
        setResizable(true);
        setTitle("Reservation Summary");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Reservation Details");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Your reservation is succesfully completed!");

        passengerDetailsText.setColumns(20);
        passengerDetailsText.setRows(5);
        passengerDetailsText.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        passengerDetailsText.setEnabled(false);
        jScrollPane1.setViewportView(passengerDetailsText);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea passengerDetailsText;
    // End of variables declaration//GEN-END:variables
}
