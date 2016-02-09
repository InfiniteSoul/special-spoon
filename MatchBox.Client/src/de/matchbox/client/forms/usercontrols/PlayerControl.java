/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.matchbox.client.forms.usercontrols;

import de.matchbox.communication.classmodels.PlayerModel;
import java.awt.Dimension;
import java.awt.Rectangle;
import javax.swing.Scrollable;

/**
 *
 * @author Pascal
 */
public class PlayerControl extends javax.swing.JPanel implements Scrollable {

    private final PlayerModel playerModel;

    /**
     * Creates new form PlayerControl
     *
     * @param pPlayerModel
     */
    public PlayerControl(PlayerModel pPlayerModel) {
        this.playerModel = pPlayerModel;
        initComponents();
    }

    @Override
    public Dimension getPreferredScrollableViewportSize() {
        return this.getPreferredSize();
    }

    @Override
    public int getScrollableBlockIncrement(Rectangle pVisibleRect, int pOrientation, int pDirection) {
        return 1;
    }

    @Override
    public boolean getScrollableTracksViewportHeight() {
        return true;
    }

    @Override
    public boolean getScrollableTracksViewportWidth() {
        return true;
    }

    @Override
    public int getScrollableUnitIncrement(Rectangle pVisibleRect, int pOrientation, int pDirection) {
        return 1;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelUsername = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabelPoints = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelUsername.setText(this.playerModel.getUsername());

        jLabel1.setText("Punkte:");

        jLabelPoints.setText(String.valueOf(this.playerModel.getPoints()));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelUsername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(4, 4, 4)
                .addComponent(jLabelPoints)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUsername)
                    .addComponent(jLabel1)
                    .addComponent(jLabelPoints))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelPoints;
    private javax.swing.JLabel jLabelUsername;
    // End of variables declaration//GEN-END:variables
}