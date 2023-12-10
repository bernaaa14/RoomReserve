/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.roomreserve;
import java.util.Random;
import javax.swing.UIManager;
import javax.swing.ImageIcon;
public class OrderReceipt extends javax.swing.JFrame
{
    public OrderReceipt() 
    {
        initComponents();
        setTitle("Thank you for booking with us!");
        int receiptNum = generateReceiptNum(100000,200000);
        int telNum = generateReceiptNum(1000000000,2000000000);
        lblRecNo.setText("Cash Receipt: #" + receiptNum);
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
        LogoLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        black_background = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        setSize(new java.awt.Dimension(215, 444));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        headingLbl.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        headingLbl.setForeground(new java.awt.Color(255, 255, 255));
        headingLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headingLbl.setText("OFFICIAL RECEIPT");
        getContentPane().add(headingLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, -1));

        addressLbl.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        addressLbl.setForeground(new java.awt.Color(255, 255, 255));
        addressLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addressLbl.setText("Address: Lorem ipsum");
        getContentPane().add(addressLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 174, -1));

        numLbl.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        numLbl.setForeground(new java.awt.Color(255, 255, 255));
        numLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numLbl.setText("Tel. No: 12345");
        getContentPane().add(numLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 140, -1));

        lblRecNo.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        lblRecNo.setForeground(new java.awt.Color(255, 255, 255));
        lblRecNo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRecNo.setText("Cash Receipt:");
        getContentPane().add(lblRecNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        checkInLbl.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        checkInLbl.setForeground(new java.awt.Color(255, 255, 255));
        checkInLbl.setText("Check-in:");
        getContentPane().add(checkInLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        checkOutLbl.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        checkOutLbl.setForeground(new java.awt.Color(255, 255, 255));
        checkOutLbl.setText("Check-out:");
        getContentPane().add(checkOutLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        roomLbl.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        roomLbl.setForeground(new java.awt.Color(255, 255, 255));
        roomLbl.setText("Room Type:");
        getContentPane().add(roomLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        totalLbl.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        totalLbl.setForeground(new java.awt.Color(255, 255, 255));
        totalLbl.setText("Total: ");
        getContentPane().add(totalLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        closeBtn.setBackground(new java.awt.Color(204, 0, 0));
        closeBtn.setForeground(new java.awt.Color(255, 255, 255));
        closeBtn.setText("Close");
        closeBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        closeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBtnActionPerformed(evt);
            }
        });
        getContentPane().add(closeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, 80, 30));

        LogoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RR-removebg-preview.png"))); // NOI18N
        getContentPane().add(LogoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 90, 50));
        LogoLabel.getAccessibleContext().setAccessibleName("LogoLabel");

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("-------------------------------------------------------------");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 310, -1));

        black_background.setBackground(new java.awt.Color(0, 0, 0));
        black_background.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                black_backgroundActionPerformed(evt);
            }
        });
        getContentPane().add(black_background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtnActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_closeBtnActionPerformed

    private void black_backgroundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_black_backgroundActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_black_backgroundActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        String str = "com.formdev.flatlaf.themes.FlatMacDarkLaf";
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
    private javax.swing.JLabel LogoLabel;
    private javax.swing.JLabel addressLbl;
    private javax.swing.JTextField black_background;
    public javax.swing.JLabel checkInLbl;
    public javax.swing.JLabel checkOutLbl;
    private javax.swing.JButton closeBtn;
    private javax.swing.JLabel headingLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblRecNo;
    private javax.swing.JLabel numLbl;
    public javax.swing.JLabel roomLbl;
    public javax.swing.JLabel totalLbl;
    // End of variables declaration//GEN-END:variables
}
