/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * CreateTerrainVisualPanel3.java
 *
 * Created on Jan 20, 2011, 5:15:12 PM
 */

package com.jme3.gde.terraineditor;

import javax.swing.JTextField;

/**
 *
 * @author sploreg
 */
public class CreateTerrainVisualPanel3 extends javax.swing.JPanel {

    /** Creates new form CreateTerrainVisualPanel3 */
    public CreateTerrainVisualPanel3() {
        initComponents();
    }

    protected void setDefaultImageSize(int size) {
        alphaBlendSize.setText(""+size);
    }

    public JTextField getAlphaBlendSize() {
        return alphaBlendSize;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        alphaBlendSize = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel1.setText(org.openide.util.NbBundle.getMessage(CreateTerrainVisualPanel3.class, "CreateTerrainVisualPanel3.jLabel1.text_1")); // NOI18N

        jLabel2.setText(org.openide.util.NbBundle.getMessage(CreateTerrainVisualPanel3.class, "CreateTerrainVisualPanel3.jLabel2.text_1")); // NOI18N

        alphaBlendSize.setText(org.openide.util.NbBundle.getMessage(CreateTerrainVisualPanel3.class, "CreateTerrainVisualPanel3.alphaBlendSize.text_1")); // NOI18N
        alphaBlendSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alphaBlendSizeActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setEditable(false);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText(org.openide.util.NbBundle.getMessage(CreateTerrainVisualPanel3.class, "CreateTerrainVisualPanel3.jTextArea1.text_1")); // NOI18N
        jTextArea1.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(alphaBlendSize, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(alphaBlendSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void alphaBlendSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alphaBlendSizeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alphaBlendSizeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alphaBlendSize;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables

}
