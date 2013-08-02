/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kwa.cj.views;

import com.kwa.cittajaya.T010JpaController;
import com.kwa.cittajaya.Tpegawai;
import com.kwa.cittajaya.TpegawaiJpaController;
import com.kwa.core.KWAMesg;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.TableModel;
import org.eclipse.persistence.descriptors.TimestampLockingPolicy;

/**
 *
 * @author arinegara
 */
public class VPegawai extends javax.swing.JPanel {

    /**
     * Creates new form VPegawai
     */
    public VPegawai() {
        initComponents();
        initValues();
    }

    private void initTab() throws Exception{
                   pegp = new TpegawaiJpaController(null, null);
            modelPegawai mp = new modelPegawai(pegp);
            mp.searchAll();
              tabPegawai = new javax.swing.JTable();
            list = mp.getData();
            tabPegawai.setModel(mp); 
            

            
   
          
                  tabPegawai.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabPegawai.getSelectionModel().addListSelectionListener(new RowListener());
        tabPegawai.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabPegawai);
       
    }
    private void initValues() {
        try {
            initTab();


            T010JpaController t010p = new T010JpaController(pegp.getEmf(), pegp.getEm());
            T010CBModel t010cbmodel = new T010CBModel(t010p, "TSPG", "", "");
            cbStatus.setModel(t010cbmodel);
            cbStatus.setRenderer(new T010CBRender(t010p, "TSPG"));

        } catch (Exception ex) {
            Logger.getLogger(VPegawai.class.getName()).log(Level.SEVERE, null, ex);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tabPegawai = new javax.swing.JTable();
        jToolBar1 = new javax.swing.JToolBar();
        btnNew = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btnSave = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        btnDelete = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        btnSearch = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtKode = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cbStatus = new javax.swing.JComboBox();

        tabPegawai.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabPegawai.getSelectionModel().addListSelectionListener(new RowListener());
        tabPegawai.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabPegawai);

        jToolBar1.setRollover(true);

        btnNew.setText("new");
        btnNew.setFocusable(false);
        btnNew.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNew.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doNew(evt);
            }
        });
        jToolBar1.add(btnNew);
        jToolBar1.add(jSeparator1);

        btnSave.setText("save");
        btnSave.setFocusable(false);
        btnSave.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSave.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doSave(evt);
            }
        });
        jToolBar1.add(btnSave);
        jToolBar1.add(jSeparator2);

        btnDelete.setText("delete");
        btnDelete.setFocusable(false);
        btnDelete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDelete.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jToolBar1.add(btnDelete);
        jToolBar1.add(jSeparator3);

        btnSearch.setText("search");
        btnSearch.setFocusable(false);
        btnSearch.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSearch.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnSearch);

        jLabel1.setText("Kode :");

        jLabel2.setText("Nama :");

        jLabel3.setText("Status :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 658, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtKode, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(txtKode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void doNew(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doNew
        txtKode.setText("");
        txtNama.setText("");
        cbStatus.setSelectedItem("A");
    }//GEN-LAST:event_doNew

    private void doSave(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doSave
        peg = new Tpegawai(txtKode.getText().trim(),txtNama.getText().trim(), (String) cbStatus.getSelectedItem());
        // pegp.commitTrx();
        try{
           
            pegp = new TpegawaiJpaController(null,null);
            KWAMesg msg;
            pegp.initTrx();
            if(pegp.findTpegawai(txtKode.getText())==null){
                msg = pegp.create(peg);
                JOptionPane.showMessageDialog(null, msg.getMesg(),"Create",1);
            }else{
                msg = pegp.edit(peg);
                JOptionPane.showMessageDialog(null, msg.getMesg(),"Modify",1);
            }
            pegp.commitTrx();
            initTab();
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_doSave

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        peg = new Tpegawai(txtKode.getText().trim(),txtNama.getText().trim(), (String) cbStatus.getSelectedItem());
               try{
        pegp = new TpegawaiJpaController(null,null);
            KWAMesg msg;
            pegp.initTrx();
            
            msg = pegp.destroy(peg.getKode());
 pegp.commitTrx();
                JOptionPane.showMessageDialog(null, msg.getMesg(),"Delete",1);
                initTab();

                    }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox cbStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTable tabPegawai;
    private javax.swing.JTextField txtKode;
    private javax.swing.JTextField txtNama;
    // End of variables declaration//GEN-END:variables
    private Tpegawai peg;
    private TpegawaiJpaController pegp;
    private java.util.List<com.kwa.cittajaya.Tpegawai> list;

    private class RowListener implements ListSelectionListener {
        
        public void valueChanged(ListSelectionEvent event) {
            if (event.getValueIsAdjusting()) {
                return;
            }
            tabPegawai.getSelectedRow();
            modelPegawai modelpeg = (modelPegawai) tabPegawai.getModel();
            peg =  modelpeg.getData().get(tabPegawai.getSelectedRow());
            txtKode.setText(peg.getKode());
            txtNama.setText(peg.getNama());
            cbStatus.setSelectedItem(peg.getStatus());
        }
    }

}
