/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.matchbox.client.forms;

import com.sun.glass.events.KeyEvent;
import de.matchbox.client.Control;
import de.matchbox.communication.MessageObject;
import de.matchbox.communication.contentobjects.client.CreateRoomContentObject;
import de.matchbox.communication.enumeration.MessageType;
import java.awt.Toolkit;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author Name
 */
public class RoomCreationDialog extends javax.swing.JDialog {

    /**
     * Creates new form RoomCreation
     */
    private Control control;

    public RoomCreationDialog(java.awt.Frame parent, boolean modal, Control pControl) {
        super(parent, modal);
        initComponents();
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/de/matchbox/client/Resources/Icon.png")));
        jButtonCreate.setEnabled(false);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.control = pControl;
        this.initEvent();

    }
    private void initEvent() {
        jTextFieldRoomName.getDocument().addDocumentListener(new DocumentListener() {
            public void changedUpdate(DocumentEvent e) {
                checkName();
            }

            @Override
            public void insertUpdate(DocumentEvent e) {
                checkName();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                checkName();
            }
        });
    }
    private void checkName()
    {
        if (!jTextFieldRoomName.getText().isEmpty()) {
            jButtonCreate.setEnabled(true);
        } else {
            jButtonCreate.setEnabled(false);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonCreate = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jTextFieldRoomName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButtonCreate.setText("Create");
        jButtonCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCreateActionPerformed(evt);
            }
        });

        jButtonCancel.setText("Cancel");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        jTextFieldRoomName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldRoomNameKeyPressed(evt);
            }
        });

        jLabel1.setText("Please Enter the Room Name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButtonCreate)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonCancel))
                        .addComponent(jTextFieldRoomName, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldRoomName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCreate)
                    .addComponent(jButtonCancel))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreateActionPerformed

        this.control.send(new MessageObject(MessageType.CREATE_ROOM, new CreateRoomContentObject(jTextFieldRoomName.getText())));
        this.setVisible(false);

    }//GEN-LAST:event_jButtonCreateActionPerformed

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        jTextFieldRoomName.setText("");
        this.setVisible(false);

    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jTextFieldRoomNameKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jTextFieldRoomNameKeyPressed
    {//GEN-HEADEREND:event_jTextFieldRoomNameKeyPressed
        if (!jTextFieldRoomName.getText().isEmpty() && evt.getKeyCode() == KeyEvent.VK_ENTER) {
            this.jButtonCreateActionPerformed(null);
        }
    }//GEN-LAST:event_jTextFieldRoomNameKeyPressed

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonCreate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextFieldRoomName;
    // End of variables declaration//GEN-END:variables
}
