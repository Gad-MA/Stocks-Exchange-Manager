
package frontend.start;

import frontend.Components.PanelCover;
import java.awt.Image;
import javax.swing.ImageIcon;

import backend.StocksDB;
import backend.UsersDB;
import frontend.Components.*;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        UsersDB.initialize();
        StocksDB.initialize();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JLayeredPane();
        panelCover1 = new PanelCover();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jPasswordField1 = new javax.swing.JPasswordField();
        button2 = new Button();
        Register = new Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("StockPulse");

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setOpaque(true);

        jLabel2.setFont(new java.awt.Font("Simplified Arabic", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 192, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frontend/start/Icons/Icon.png"))); // NOI18N
        jLabel2.setLabelFor(jLabel1);
        jLabel2.setText("StockPulse - Invest Now!");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel2.setFocusable(false);
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel2.setIconTextGap(-30);
        jLabel2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout panelCover1Layout = new javax.swing.GroupLayout(panelCover1);
        panelCover1.setLayout(panelCover1Layout);
        panelCover1Layout.setHorizontalGroup(
            panelCover1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCover1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
        );
        panelCover1Layout.setVerticalGroup(
            panelCover1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCover1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        jLabel1.setText("Email Address");

        jLabel3.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Welcome Back!");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jTextField1.setForeground(new java.awt.Color(204, 204, 204));
        jTextField1.setText("ex:Yourname@example.com");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        jLabel4.setText("Password ");

        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("Forgot Your Password ?");

        jCheckBox1.setText("Remember me ");
        jCheckBox1.setFocusPainted(false);
        jCheckBox1.setFocusable(false);

        button2.setText("Log In");
        button2.setBorderPainted(false);
        button2.setFocusPainted(false);
        button2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        button2.setRadius(40);
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        Register.setText("Register");
        Register.setBorderPainted(false);
        Register.setFocusPainted(false);
        Register.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Register.setRadius(40);
        Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterActionPerformed(evt);
            }
        });

        bg.setLayer(panelCover1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        bg.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        bg.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        bg.setLayer(jTextField1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        bg.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        bg.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        bg.setLayer(jCheckBox1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        bg.setLayer(jPasswordField1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        bg.setLayer(button2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        bg.setLayer(Register, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(panelCover1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCheckBox1))
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(bgLayout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addComponent(jLabel5))
                                    .addGroup(bgLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Register, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 20, Short.MAX_VALUE))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(panelCover1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jCheckBox1))
                .addGap(38, 38, 38)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Register, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jTextField1ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_button2ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_button2ActionPerformed

    private void RegisterActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_RegisterActionPerformed
        if (evt.getSource() == Register) {
            Registration reg = new Registration();
            reg.setVisible(true);
            this.dispose();
        }
    }// GEN-LAST:event_RegisterActionPerformed

    private void Button2ActionPerformed(java.awt.event.ActionEvent evt) {
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Button Register;
    private javax.swing.JLayeredPane bg;
    private Button button2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private PanelCover panelCover1;
    // End of variables declaration//GEN-END:variables
}
