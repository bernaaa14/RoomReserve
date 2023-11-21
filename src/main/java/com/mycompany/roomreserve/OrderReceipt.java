/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.roomreserve;
import java.util.Random;
import javax.swing.UIManager;
public class OrderReceipt extends javax.swing.JFrame
{
    public OrderReceipt() 
    {
        initComponents();
        int receiptNum = generateReceiptNum(100000,200000);
        int telNum = generateReceiptNum(1000000000,2000000000);
        lblRecNo.setText("Cash Reciept: #" + receiptNum);
        numLbl.setText("Tel.no: " + telNum);
    }
    
    public static int generateReceiptNum(int min, int max)
    {
        int range = (max-min) + 1;
        return (int)(Math.random()*range)+min;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headingLbl = new javax.swing.JLabel();
        addressLbl = new javax.swing.JLabel();
        numLbl = new javax.swing.JLabel();
        lblRecNo = new javax.swing.JLabel();
        checkInLbl = new javax.swing.JLabel();
        checkOutLbl = new javax.swing.JLabel();
        roomLbl = new javax.swing.JLabel();
        totalLbl = new javax.swing.JLabel();
        closeBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        setSize(new java.awt.Dimension(215, 444));

        headingLbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        headingLbl.setForeground(new java.awt.Color(0, 0, 0));
        headingLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headingLbl.setText("Room Reserve");

        addressLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addressLbl.setText("Address: Lorem ipsum");

        numLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numLbl.setText("Tel. No: 12345");

        lblRecNo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRecNo.setText("CASH RECEIPT:");

        checkInLbl.setText("Check-in:");

        checkOutLbl.setText("Check-out:");

        roomLbl.setText("Room Type:");

        totalLbl.setText("Total: ");

        closeBtn.setText("Close");
        closeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addressLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(totalLbl)
                            .addComponent(checkOutLbl)
                            .addComponent(checkInLbl)
                            .addComponent(roomLbl)
                            .addComponent(lblRecNo)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(headingLbl))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(closeBtn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headingLbl)
                .addGap(4, 4, 4)
                .addComponent(addressLbl)
                .addGap(4, 4, 4)
                .addComponent(numLbl)
                .addGap(25, 25, 25)
                .addComponent(lblRecNo)
                .addGap(18, 18, 18)
                .addComponent(checkInLbl)
                .addGap(18, 18, 18)
                .addComponent(checkOutLbl)
                .addGap(18, 18, 18)
                .addComponent(roomLbl)
                .addGap(18, 18, 18)
                .addComponent(totalLbl)
                .addGap(18, 18, 18)
                .addComponent(closeBtn)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtnActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_closeBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        String str = "com.formdev.flatlaf.themes.FlatMacLightLaf";
        try
        {
            UIManager.setLookAndFeel(str);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrderReceipt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressLbl;
    public javax.swing.JLabel checkInLbl;
    public javax.swing.JLabel checkOutLbl;
    private javax.swing.JButton closeBtn;
    private javax.swing.JLabel headingLbl;
    private javax.swing.JLabel lblRecNo;
    private javax.swing.JLabel numLbl;
    public javax.swing.JLabel roomLbl;
    public javax.swing.JLabel totalLbl;
    // End of variables declaration//GEN-END:variables
}
