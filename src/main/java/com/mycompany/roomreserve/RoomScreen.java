package com.mycompany.roomreserve;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.UIManager;

public class RoomScreen extends javax.swing.JFrame
{
 
    public RoomScreen() {
        initComponents();
        Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\aaron\\Documents\\NetBeansProjects\\RoomReserve\\src\\main\\resources\\icon.png");    
        setIconImage(icon);
        setTitle("Rooms");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        mainLogo = new javax.swing.JLabel();
        standardContainer = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        familyContainer = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        executiveContainer = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        poolContainer = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        headerText1 = new javax.swing.JLabel();
        headerText2 = new javax.swing.JLabel();
        bookButton = new javax.swing.JButton();
        familyRoomLbl = new javax.swing.JLabel();
        familyPrice = new javax.swing.JLabel();
        standardRoomLbl = new javax.swing.JLabel();
        standardPrice = new javax.swing.JLabel();
        executiveRoomLbl = new javax.swing.JLabel();
        execPrice = new javax.swing.JLabel();
        poolRoomLbl = new javax.swing.JLabel();
        poolPrice = new javax.swing.JLabel();
        homeBtn = new javax.swing.JLabel();
        roomBtn = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/room_assets/Standard.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 742));
        setResizable(false);
        setSize(new java.awt.Dimension(1280, 742));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RR-removebg-preview.png"))); // NOI18N
        getContentPane().add(mainLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, 70));

        standardContainer.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.darkGray, java.awt.Color.darkGray));
        standardContainer.setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/room_assets/StandardR.jpg"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51)));
        standardContainer.add(jLabel2);
        jLabel2.setBounds(0, 0, 250, 150);

        getContentPane().add(standardContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 250, 150));

        familyContainer.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.darkGray, java.awt.Color.darkGray));
        familyContainer.setLayout(null);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/room_assets/familyR.jpg"))); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51)));
        familyContainer.add(jLabel3);
        jLabel3.setBounds(0, 0, 250, 150);

        getContentPane().add(familyContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, 250, 150));

        executiveContainer.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.darkGray, java.awt.Color.darkGray));
        executiveContainer.setLayout(null);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/room_assets/ExecutiveR.jpg"))); // NOI18N
        jLabel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51)));
        executiveContainer.add(jLabel4);
        jLabel4.setBounds(0, 0, 250, 150);

        getContentPane().add(executiveContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 290, 250, 150));

        poolContainer.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.darkGray, java.awt.Color.darkGray));
        poolContainer.setLayout(null);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/room_assets/PoolSideR.jpg"))); // NOI18N
        jLabel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51)));
        poolContainer.add(jLabel5);
        jLabel5.setBounds(0, 0, 250, 150);

        getContentPane().add(poolContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 290, 250, 150));

        headerText1.setFont(new java.awt.Font("Quicksand SemiBold", 1, 36)); // NOI18N
        headerText1.setForeground(new java.awt.Color(255, 255, 255));
        headerText1.setText("Explore our best list");
        getContentPane().add(headerText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 370, -1));

        headerText2.setFont(new java.awt.Font("Quicksand SemiBold", 1, 36)); // NOI18N
        headerText2.setForeground(new java.awt.Color(255, 255, 255));
        headerText2.setText("of Rooms!");
        getContentPane().add(headerText2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 260, 30));

        bookButton.setBackground(new java.awt.Color(51, 51, 51));
        bookButton.setFont(new java.awt.Font("Quicksand SemiBold", 0, 24)); // NOI18N
        bookButton.setForeground(new java.awt.Color(255, 255, 255));
        bookButton.setText("Book now!");
        bookButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bookButton.setMaximumSize(new java.awt.Dimension(440, 160));
        bookButton.setMinimumSize(new java.awt.Dimension(440, 160));
        bookButton.setPreferredSize(new java.awt.Dimension(440, 160));
        bookButton.setRequestFocusEnabled(false);
        bookButton.setRolloverEnabled(false);
        bookButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bookButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bookButtonMouseExited(evt);
            }
        });
        bookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookButtonActionPerformed(evt);
            }
        });
        getContentPane().add(bookButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 590, 290, 90));

        familyRoomLbl.setFont(new java.awt.Font("Quicksand", 0, 32)); // NOI18N
        familyRoomLbl.setForeground(new java.awt.Color(255, 255, 255));
        familyRoomLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        familyRoomLbl.setText("Pool-side Suite");
        getContentPane().add(familyRoomLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 440, 250, 50));

        familyPrice.setFont(new java.awt.Font("Quicksand", 0, 24)); // NOI18N
        familyPrice.setForeground(new java.awt.Color(255, 255, 255));
        familyPrice.setText("₱15,000 per night");
        getContentPane().add(familyPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 490, 200, 40));

        standardRoomLbl.setFont(new java.awt.Font("Quicksand", 0, 32)); // NOI18N
        standardRoomLbl.setForeground(new java.awt.Color(255, 255, 255));
        standardRoomLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        standardRoomLbl.setText("Standard Room");
        getContentPane().add(standardRoomLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 250, 50));

        standardPrice.setFont(new java.awt.Font("Quicksand", 0, 24)); // NOI18N
        standardPrice.setForeground(new java.awt.Color(255, 255, 255));
        standardPrice.setText("₱3,000 per night");
        getContentPane().add(standardPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, 200, 40));

        executiveRoomLbl.setFont(new java.awt.Font("Quicksand", 0, 32)); // NOI18N
        executiveRoomLbl.setForeground(new java.awt.Color(255, 255, 255));
        executiveRoomLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        executiveRoomLbl.setText("Family Room");
        getContentPane().add(executiveRoomLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 440, 250, 50));

        execPrice.setFont(new java.awt.Font("Quicksand", 0, 24)); // NOI18N
        execPrice.setForeground(new java.awt.Color(255, 255, 255));
        execPrice.setText("₱5,000 per night");
        getContentPane().add(execPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 490, 200, 40));

        poolRoomLbl.setFont(new java.awt.Font("Quicksand", 0, 32)); // NOI18N
        poolRoomLbl.setForeground(new java.awt.Color(255, 255, 255));
        poolRoomLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        poolRoomLbl.setText("Executive Suite");
        getContentPane().add(poolRoomLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 440, 250, 50));

        poolPrice.setFont(new java.awt.Font("Quicksand", 0, 24)); // NOI18N
        poolPrice.setForeground(new java.awt.Color(255, 255, 255));
        poolPrice.setText("₱10,000 per night");
        getContentPane().add(poolPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 490, 200, 40));

        homeBtn.setFont(new java.awt.Font("Quicksand", 0, 18)); // NOI18N
        homeBtn.setForeground(new java.awt.Color(255, 255, 255));
        homeBtn.setText("Home");
        homeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homeBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                homeBtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                homeBtnMousePressed(evt);
            }
        });
        getContentPane().add(homeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 10, -1, 30));

        roomBtn.setBackground(new java.awt.Color(51, 51, 51));
        roomBtn.setFont(new java.awt.Font("Quicksand", 0, 18)); // NOI18N
        roomBtn.setForeground(new java.awt.Color(51, 51, 51));
        roomBtn.setText("Rooms");
        roomBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                roomBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                roomBtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                roomBtnMousePressed(evt);
            }
        });
        getContentPane().add(roomBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 10, 60, 30));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/room_assets/bgR.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 740));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookButtonActionPerformed
        MainScreen m = new MainScreen();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bookButtonActionPerformed

    private void bookButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookButtonMouseEntered
        // TODO add your handling code here:
        this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_bookButtonMouseEntered

    private void bookButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookButtonMouseExited
        // TODO add your handling code here:
        this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_bookButtonMouseExited

    private void homeBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeBtnMouseEntered
        // TODO add your handling code here:
        this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_homeBtnMouseEntered

    private void homeBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeBtnMouseExited
        // TODO add your handling code here:
        this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_homeBtnMouseExited

    private void homeBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeBtnMousePressed
        // TODO add your handling code here:
        MainScreen m = new MainScreen();
        m.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_homeBtnMousePressed

    private void roomBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roomBtnMouseEntered
        // TODO add your handling code here:
        this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_roomBtnMouseEntered

    private void roomBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roomBtnMouseExited
        // TODO add your handling code here:
        this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_roomBtnMouseExited

    private void roomBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roomBtnMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_roomBtnMousePressed

    private void homeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeBtnMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_homeBtnMouseClicked

 
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
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RoomScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton bookButton;
    private javax.swing.JLabel execPrice;
    private javax.swing.JPanel executiveContainer;
    private javax.swing.JLabel executiveRoomLbl;
    private javax.swing.JPanel familyContainer;
    private javax.swing.JLabel familyPrice;
    private javax.swing.JLabel familyRoomLbl;
    private javax.swing.JLabel headerText1;
    private javax.swing.JLabel headerText2;
    private javax.swing.JLabel homeBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel mainLogo;
    private javax.swing.JPanel poolContainer;
    private javax.swing.JLabel poolPrice;
    private javax.swing.JLabel poolRoomLbl;
    private javax.swing.JLabel roomBtn;
    private javax.swing.JPanel standardContainer;
    private javax.swing.JLabel standardPrice;
    private javax.swing.JLabel standardRoomLbl;
    // End of variables declaration//GEN-END:variables
}
