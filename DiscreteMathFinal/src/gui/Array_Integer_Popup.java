/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;


/**
 *
 * @author Kelvin Bonilla
 */
public class Array_Integer_Popup extends javax.swing.JFrame
{

    private final javax.swing.JFrame MAIN_MENU;
    /**
     * Creates new form Array_Integer_Popup
     */
    public Array_Integer_Popup(javax.swing.JFrame mainMenu) {
        initComponents();
        MAIN_MENU = mainMenu;
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        arrayIntegerTxt = new javax.swing.JTextField();
        arrayBtn = new javax.swing.JButton();
        intBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Array or Integer?");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                windowClosingEvt(evt);
            }
        });

        arrayIntegerTxt.setEditable(false);
        arrayIntegerTxt.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        arrayIntegerTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        arrayIntegerTxt.setText("Are you storing an array or an integer?");
        arrayIntegerTxt.setBorder(null);

        arrayBtn.setText("Array");
        arrayBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arrayBtnActionPerformed(evt);
            }
        });

        intBtn.setText("Integer");
        intBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                intBtnActionPerformed(evt);
            }
        });

        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(arrayIntegerTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(arrayBtn)
                        .addGap(26, 26, 26)
                        .addComponent(intBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(backBtn)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(arrayIntegerTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(intBtn)
                    .addComponent(backBtn)
                    .addComponent(arrayBtn))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void arrayBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arrayBtnActionPerformed
        TitleFrameApp.displayFrame(new StoreArrayFrame(MAIN_MENU), this);
        dispose();
    }//GEN-LAST:event_arrayBtnActionPerformed

    private void intBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_intBtnActionPerformed
        TitleFrameApp.displayFrame(new StoreIntFrame(MAIN_MENU), this);
        dispose();
    }//GEN-LAST:event_intBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        TitleFrameApp.displayFrame(MAIN_MENU, this);
        dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    private void windowClosingEvt(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_windowClosingEvt
        TitleFrameApp.displayFrame(MAIN_MENU, this);
        dispose();
    }//GEN-LAST:event_windowClosingEvt


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton arrayBtn;
    private javax.swing.JTextField arrayIntegerTxt;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton intBtn;
    // End of variables declaration//GEN-END:variables
}
