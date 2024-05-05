package frontend.Components;

import java.awt.*;

public class PanelCover extends javax.swing.JPanel {

    public PanelCover() {
        initComponents();
        setOpaque(false);
    }

    @SuppressWarnings("unchecked")
    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        GradientPaint gra = new GradientPaint(0, 0, new Color(0, 133, 254), 0, getHeight(), new Color(0, 87, 254));
        g2.setPaint(gra);
        g2.fillRect(0, 0, getWidth(), getHeight());
        super.paintComponent(grphcs);

    }

    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();

        jLabel1.setText("Home");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 116,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(236, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(jLabel1)
                                .addContainerGap(213, Short.MAX_VALUE)));
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
