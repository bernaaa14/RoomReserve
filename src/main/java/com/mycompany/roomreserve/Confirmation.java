package com.mycompany.roomreserve;
import javax.swing.UIManager;
import java.math.*;
public class Confirmation extends javax.swing.JFrame 
{
    public Confirmation()
    {
        initComponents();
        setTitle("Thank you for booking with us!");
        int receiptNum = generateReceiptNum(100000,200000);
        jLabel1.setText("Receipt #"+receiptNum);
    }
    public static int generateReceiptNum(int min, int max)
    {
        int range = (max-min) + 1;
        return (int)(Math.random()*range)+min;
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        checkInLbl = new javax.swing.JLabel();
        checkOutLbl = new javax.swing.JLabel();
        roomLbl = new javax.swing.JLabel();
        totalLbl = new javax.swing.JLabel();
        closeBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(234, 300));
        setResizable(false);
        setSize(new java.awt.Dimension(234, 300));

        jLabel1.setText("Reciept");

        checkInLbl.setText("Check in:");

        checkOutLbl.setText("Check out:");

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
                    .addComponent(checkInLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkOutLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roomLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(closeBtn)))
                .addGap(4, 4, 4))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(checkInLbl)
                .addGap(14, 14, 14)
                .addComponent(checkOutLbl)
                .addGap(14, 14, 14)
                .addComponent(roomLbl)
                .addGap(14, 14, 14)
                .addComponent(totalLbl)
                .addGap(40, 40, 40)
                .addComponent(closeBtn)
                .addContainerGap(71, Short.MAX_VALUE))
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
    public static void main(String args[]) 
    {
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
                new Confirmation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel checkInLbl;
    public javax.swing.JLabel checkOutLbl;
    private javax.swing.JButton closeBtn;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel roomLbl;
    public javax.swing.JLabel totalLbl;
    // End of variables declaration//GEN-END:variables
}
