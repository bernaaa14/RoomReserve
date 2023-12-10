package com.mycompany.roomreserve;
import com.toedter.calendar.JTextFieldDateEditor;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author aaron
 */
public class MainScreen extends javax.swing.JFrame {
    
    public MainScreen() 
    {
        initComponents();  
        
      
     
        

    }
    
    public static int total = 0;
    public static int checkIn;
    public static int checkOut; 
    public static String room = "";
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        logoHeadingImg = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        footerPanel = new javax.swing.JPanel();
        bedIcon = new javax.swing.JLabel();
        roomTypeLbl = new javax.swing.JLabel();
        roomCmb = new javax.swing.JComboBox<>();
        checkInIcon = new javax.swing.JLabel();
        checkInLbl = new javax.swing.JLabel();
        checkOutChooser = new com.toedter.calendar.JDateChooser();
        checkOutIcon = new javax.swing.JLabel();
        checkOutLbl = new javax.swing.JLabel();
        checkInChooser = new com.toedter.calendar.JDateChooser();
        submitBtn = new javax.swing.JButton();
        homeLbl = new javax.swing.JLabel();
        roomLbl = new javax.swing.JLabel();
        hotelBg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Room Ready");
        setAlwaysOnTop(true);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setMinimumSize(new java.awt.Dimension(810, 478));
        setResizable(false);
        setSize(new java.awt.Dimension(810, 478));
        getContentPane().setLayout(null);

        logoHeadingImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RR-removebg-preview.png"))); // NOI18N
        logoHeadingImg.setLabelFor(logoHeadingImg);
        getContentPane().add(logoHeadingImg);
        logoHeadingImg.setBounds(10, 10, 100, 60);

        lbl1.setFont(new java.awt.Font("Quicksand SemiBold", 1, 24)); // NOI18N
        lbl1.setForeground(new java.awt.Color(255, 255, 255));
        lbl1.setText("Unlock Your Perfect Stay,");
        getContentPane().add(lbl1);
        lbl1.setBounds(40, 120, 349, 40);

        lbl2.setFont(new java.awt.Font("Quicksand SemiBold", 1, 24)); // NOI18N
        lbl2.setForeground(new java.awt.Color(255, 255, 255));
        lbl2.setText("Reserve with Ease Today!");
        getContentPane().add(lbl2);
        lbl2.setBounds(40, 170, 294, 32);

        lbl3.setFont(new java.awt.Font("Quicksand SemiBold", 0, 12)); // NOI18N
        lbl3.setForeground(new java.awt.Color(255, 255, 255));
        lbl3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl3.setText("Effortlessly book your dream room with just a few clicks. Discover a range of comfortable,");
        lbl3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(lbl3);
        lbl3.setBounds(40, 240, 520, 20);

        lbl4.setFont(new java.awt.Font("Quicksand SemiBold", 0, 12)); // NOI18N
        lbl4.setForeground(new java.awt.Color(255, 255, 255));
        lbl4.setText("stylish accommodations tailored to your preferences. Your perfect stay is just a reservation away!");
        getContentPane().add(lbl4);
        lbl4.setBounds(40, 260, 560, 20);

        footerPanel.setBackground(new java.awt.Color(254, 253, 253));
        footerPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        bedIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bedR.png"))); // NOI18N
        bedIcon.setLabelFor(bedIcon);

        roomTypeLbl.setFont(new java.awt.Font("Quicksand SemiBold", 0, 12)); // NOI18N
        roomTypeLbl.setForeground(new java.awt.Color(0, 0, 0));
        roomTypeLbl.setText("Room Type");

        roomCmb.setBackground(new java.awt.Color(255, 255, 255));
        roomCmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Standard Room", "Family Suite", "Executive Suite", "Pool-side Suite" }));
        roomCmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomCmbActionPerformed(evt);
            }
        });

        checkInIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/check-inR.png"))); // NOI18N
        checkInIcon.setLabelFor(checkOutIcon);

        checkInLbl.setFont(new java.awt.Font("Quicksand SemiBold", 0, 12)); // NOI18N
        checkInLbl.setForeground(new java.awt.Color(0, 0, 0));
        checkInLbl.setText("Check-in");

        checkOutChooser.setBackground(new java.awt.Color(255, 255, 255));
        checkOutChooser.setFont(new java.awt.Font("Quicksand Light", 0, 12)); // NOI18N
        checkOutChooser.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                checkOutChooserPropertyChange(evt);
            }
        });

        checkOutIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/check-outR.png"))); // NOI18N
        checkOutIcon.setLabelFor(checkInIcon);

        checkOutLbl.setFont(new java.awt.Font("Quicksand SemiBold", 0, 12)); // NOI18N
        checkOutLbl.setForeground(new java.awt.Color(0, 0, 0));
        checkOutLbl.setText("Check-out");

        checkInChooser.setBackground(new java.awt.Color(255, 255, 255));
        checkInChooser.setForeground(new java.awt.Color(255, 255, 255));
        checkInChooser.setFont(new java.awt.Font("Quicksand Light", 0, 12)); // NOI18N
        checkInChooser.setMaxSelectableDate(new java.util.Date(2524582860000L));
        checkInChooser.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                checkInChooserPropertyChange(evt);
            }
        });

        submitBtn.setBackground(new java.awt.Color(0, 0, 0));
        submitBtn.setFont(new java.awt.Font("Quicksand", 1, 12)); // NOI18N
        submitBtn.setForeground(new java.awt.Color(255, 255, 255));
        submitBtn.setText("Submit");
        submitBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                submitBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                submitBtnMouseExited(evt);
            }
        });
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout footerPanelLayout = new javax.swing.GroupLayout(footerPanel);
        footerPanel.setLayout(footerPanelLayout);
        footerPanelLayout.setHorizontalGroup(
            footerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(footerPanelLayout.createSequentialGroup()
                .addGroup(footerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(footerPanelLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(bedIcon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(roomTypeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addComponent(checkOutIcon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(checkInLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(footerPanelLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(roomCmb, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(checkInChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(footerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(footerPanelLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(checkInIcon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(checkOutLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(footerPanelLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(checkOutChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        footerPanelLayout.setVerticalGroup(
            footerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(footerPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(footerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(footerPanelLayout.createSequentialGroup()
                        .addGroup(footerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bedIcon)
                            .addComponent(roomTypeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(roomCmb, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(footerPanelLayout.createSequentialGroup()
                        .addGroup(footerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkOutIcon)
                            .addComponent(checkInLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(checkInChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(footerPanelLayout.createSequentialGroup()
                        .addGroup(footerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkInIcon)
                            .addComponent(checkOutLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(checkOutChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(submitBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        getContentPane().add(footerPanel);
        footerPanel.setBounds(20, 310, 760, 110);

        homeLbl.setFont(new java.awt.Font("Quicksand Light", 0, 18)); // NOI18N
        homeLbl.setForeground(new java.awt.Color(0, 0, 0));
        homeLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        homeLbl.setText("Home");
        getContentPane().add(homeLbl);
        homeLbl.setBounds(620, 10, 60, 30);

        roomLbl.setFont(new java.awt.Font("Quicksand Light", 0, 18)); // NOI18N
        roomLbl.setForeground(new java.awt.Color(255, 255, 255));
        roomLbl.setText("Rooms");
        roomLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                roomLblMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                roomLblMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                roomLblMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                roomLblMousePressed(evt);
            }
        });
        getContentPane().add(roomLbl);
        roomLbl.setBounds(710, 10, 56, 30);

        hotelBg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel.jpg"))); // NOI18N
        getContentPane().add(hotelBg);
        hotelBg.setBounds(0, 0, 797, 440);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void roomCmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomCmbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roomCmbActionPerformed

    private void roomLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roomLblMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_roomLblMouseClicked

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        // TODO add your handling code here:
       compute();
       
    }//GEN-LAST:event_submitBtnActionPerformed

    private void roomLblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roomLblMouseEntered
        // TODO add your handling code here:
        this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_roomLblMouseEntered

    private void roomLblMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roomLblMousePressed
        // TODO add your handling code here:
        RoomScreen rs = new RoomScreen();
        rs.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_roomLblMousePressed

    private void roomLblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roomLblMouseExited
        // TODO add your handling code here:
        setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_roomLblMouseExited

    private void submitBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitBtnMouseExited
        // TODO add your handling code here:
        this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        submitBtn.setBackground(Color.BLACK);
        submitBtn.setForeground(Color.WHITE);
    }//GEN-LAST:event_submitBtnMouseExited

    private void submitBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitBtnMouseEntered
        // TODO add your handling code here:
        this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        submitBtn.setBackground(Color.WHITE);
        submitBtn.setForeground(Color.BLACK);
    }//GEN-LAST:event_submitBtnMouseEntered

    private void checkInChooserPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_checkInChooserPropertyChange
        // TODO add your handling code here:
        if ("date".equals(evt.getPropertyName()))
        {
            Date checkOutDate = checkOutChooser.getDate();
            Date checkInDate = (Date) evt.getNewValue();

            if (checkOutDate != null && checkInDate != null && checkInDate.after(checkOutDate))
            {
                // If the check-in date is after the current check-out date, update the check-out date to the check-in date
                checkOutChooser.setDate(checkInDate);
                JOptionPane.showMessageDialog(null, "Check-out date cannot be before the check-in date!");
            }
   
        }
    }//GEN-LAST:event_checkInChooserPropertyChange

    private void checkOutChooserPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_checkOutChooserPropertyChange
        // TODO add your handling code here:
        if ("date".equals(evt.getPropertyName())) 
        {
            Date checkInDate = checkInChooser.getDate();
            Date checkOutDate = (Date) evt.getNewValue();

            if (checkInDate != null && checkOutDate != null && checkInDate.after(checkOutDate))
            {
                // If the check-in date is after the new check-out date, reset the check-in date to the check-out date
                checkInChooser.setDate(checkOutDate);
                JOptionPane.showMessageDialog(null, "Check-in date cannot be after the check-out date!");
            }

        }
    }//GEN-LAST:event_checkOutChooserPropertyChange

    
    private void compute()
    {
        String checkInF = "";
        String checkOutF = "";

        Date checkInDate = checkInChooser.getDate();
        Date checkOutDate = checkOutChooser.getDate();

        if (checkInDate != null && checkOutDate != null) 
        {
            SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
            checkInF = dateFormat.format(checkInDate);
            checkOutF = dateFormat.format(checkOutDate);

            int checkIn = getDaysSinceReferenceDate(checkInDate);
            int checkOut = getDaysSinceReferenceDate(checkOutDate);
            int totalDays = checkOut - checkIn;

            getRoom();
            total *= totalDays;

            OrderReceipt c = new OrderReceipt();
            c.setVisible(true);
            c.checkInLbl.setText("Check In: " + checkInF);
            c.checkOutLbl.setText("Check Out: " + checkOutF);
            c.roomLbl.setText("Room type: " + room);
            c.totalLbl.setText("Total price: ₱" + total);
            this.dispose();
        }
        else 
        {
            JOptionPane.showMessageDialog(null, "Please select both check-in and check-out dates.");
        }

    }
     
    private void getRoom()
    {
        String roomType = roomCmb.getSelectedItem().toString();
        room = roomType;
        switch(roomType)
        {
            case "Standard Room":
                total = 3000;
                room = "Standard Room";
                break;
            case "Family Suite":
                total = 5000;
                room = "Family Suite";
                break;
            case "Executive Suite":
                total = 10000;
                room = "Executive Suite";
                break;
            case "Pool-side Suite":
                room = "Pool-side Suite";
                total = 15000;
                break;
        
        }      
    }
    
    private int getDaysSinceReferenceDate(Date date) {
        // Convert the Date to LocalDate
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        // Define a reference date (e.g., January 1, 1970)
        LocalDate referenceDate = LocalDate.of(1970, Month.JANUARY, 1);

        // Calculate days since reference date
        return (int) ChronoUnit.DAYS.between(referenceDate, localDate);
    }

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
                new MainScreen().setVisible(true);
            }
        });
       
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bedIcon;
    private com.toedter.calendar.JDateChooser checkInChooser;
    private javax.swing.JLabel checkInIcon;
    private javax.swing.JLabel checkInLbl;
    private com.toedter.calendar.JDateChooser checkOutChooser;
    private javax.swing.JLabel checkOutIcon;
    private javax.swing.JLabel checkOutLbl;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JPanel footerPanel;
    private javax.swing.JLabel homeLbl;
    private javax.swing.JLabel hotelBg;
    private static javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel logoHeadingImg;
    private javax.swing.JComboBox<String> roomCmb;
    private javax.swing.JLabel roomLbl;
    private javax.swing.JLabel roomTypeLbl;
    private javax.swing.JButton submitBtn;
    // End of variables declaration//GEN-END:variables

}