/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javax.swing.DefaultListModel;
import javax.swing.JList;

/**
 *
 * @author Kelvin Bonilla
 */
public class mainMenuFrame extends javax.swing.JFrame {

    /**
     * Creates new form mainMenuFrame
     */
    public mainMenuFrame(String[] theAlgorithms) {
        initComponents();
        this.setVisible(false);
        this.setEnabled(false);
        populateAlgorithms(theAlgorithms);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        combinationLbl = new javax.swing.JLabel();
        storedDataLbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        storedDataLst = new javax.swing.JList<>();
        algoNameLbl = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        algoLst = new javax.swing.JList();
        backBtn = new javax.swing.JButton();
        nxtBtn = new javax.swing.JButton();
        checkDataBtn = new javax.swing.JButton();
        storeDataBtn = new javax.swing.JButton();
        delDataBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Main Menu");

        combinationLbl.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        combinationLbl.setText("Choose a Combination");

        storedDataLbl.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        storedDataLbl.setText("Stored Data");

        storedDataLst.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(storedDataLst);

        algoNameLbl.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        algoNameLbl.setText("Algorithms");

        algoLst.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(algoLst);

        backBtn.setText("Back");

        nxtBtn.setText("Next");

        checkDataBtn.setText("Check Data");

        storeDataBtn.setText("Store Data");
        storeDataBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                storeDataBtnActionPerformed(evt);
            }
        });

        delDataBtn.setText("Delete Data");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(storedDataLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(algoNameLbl)
                .addGap(68, 68, 68))
            .addGroup(layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(combinationLbl)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(storeDataBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(delDataBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(checkDataBtn)
                .addGap(12, 12, 12)
                .addComponent(nxtBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(backBtn)
                .addGap(14, 14, 14))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(combinationLbl)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(storedDataLbl)
                    .addComponent(algoNameLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backBtn)
                    .addComponent(nxtBtn)
                    .addComponent(checkDataBtn)
                    .addComponent(storeDataBtn)
                    .addComponent(delDataBtn))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void populateAlgorithms(String[] theArray)
    {
        DefaultListModel model = new DefaultListModel();
        for(int i = 0; i < theArray.length; i++)
            model.addElement(theArray[i]);
        algoLst = new JList(model);
    }
    private void storeDataBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_storeDataBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_storeDataBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList algoLst;
    private javax.swing.JLabel algoNameLbl;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton checkDataBtn;
    private javax.swing.JLabel combinationLbl;
    private javax.swing.JButton delDataBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton nxtBtn;
    private javax.swing.JButton storeDataBtn;
    private javax.swing.JLabel storedDataLbl;
    private javax.swing.JList<String> storedDataLst;
    // End of variables declaration//GEN-END:variables
}