/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kwa.cj.views;

import com.kwa.cj.modules.t010.T010CBModel;
import com.kwa.cj.modules.t010.T010CBRender;
import com.kwa.cj.modules.t010.T010JpaController;
import com.kwa.cittajaya.Tkatalog;
import com.kwa.cittajaya.TkatalogJpaController;
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
public class VKatalog extends javax.swing.JPanel {

    /**
     * Creates new form VKatalog
     */
    public VKatalog() {
        initComponents();
        initValues();
    }

    private void initTab() throws Exception{
                   katalogp = new TkatalogJpaController(null, null);
            modelKatalog mp = new modelKatalog(katalogp);
            mp.searchAll();
              tabKatalog = new javax.swing.JTable();
            list = mp.getData();
            tabKatalog.setModel(mp); 
            

            
   
          
                  tabKatalog.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabKatalog.getSelectionModel().addListSelectionListener(new RowListener());
        tabKatalog.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabKatalog);
       
    }
    private void initValues() {
        try {
            initTab();


            T010JpaController t010p = new T010JpaController(katalogp.getEmf(), katalogp.getEm());
            T010CBModel t010cbmodel = new T010CBModel(t010p, "TKMR", "", "");
            cbMerk.setModel(t010cbmodel);
            cbMerk.setRenderer(new T010CBRender(t010p, "TKMR"));

            
            t010cbmodel = new T010CBModel(t010p, "TKT", "", "");
            cbTipe.setModel(t010cbmodel);
            cbTipe.setRenderer(new T010CBRender(t010p, "TKT"));

            
        } catch (Exception ex) {
            Logger.getLogger(VKatalog.class.getName()).log(Level.SEVERE, null, ex);
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
        tabKatalog = new javax.swing.JTable();
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
        txtArtikel = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cbMerk = new javax.swing.JComboBox();
        cbTipe = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtUkuran = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtWarna = new javax.swing.JTextField();

        tabKatalog.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabKatalog.getSelectionModel().addListSelectionListener(new RowListener());
        tabKatalog.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabKatalog);

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

        jLabel2.setText("Artikel :");

        jLabel3.setText("Merk :");

        jLabel4.setText("Tipe :");

        jLabel5.setText("Ukuran :");

        jLabel6.setText("Warna :");

        txtWarna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWarnaActionPerformed(evt);
            }
        });

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtKode, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtUkuran, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtWarna, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbMerk, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbTipe, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtArtikel, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtKode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbMerk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtArtikel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtUkuran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtWarna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbTipe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void doNew(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doNew
        txtKode.setText("");
        cbMerk.setSelectedIndex(0);
        txtArtikel.setText("");
        txtUkuran.setText("");
        txtWarna.setText("");
        cbTipe.setSelectedItem("N");
        
        
    }//GEN-LAST:event_doNew

    private void doSave(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doSave
        katalog = new Tkatalog(txtKode.getText().trim(),(String) cbMerk.getSelectedItem(), txtArtikel.getText().trim(), txtUkuran.getText().trim(), txtWarna.getText(),(String) cbTipe.getSelectedItem(),null);
        // pegp.commitTrx();
        try{
           
            katalogp = new TkatalogJpaController(null,null);
            KWAMesg msg;
            katalogp.initTrx();
            if(katalogp.findTkatalog(txtKode.getText())==null){
                msg = katalogp.create(katalog);
                JOptionPane.showMessageDialog(null, msg.getMesg(),"Create",1);
            }else{
                msg = katalogp.edit(katalog);
                JOptionPane.showMessageDialog(null, msg.getMesg(),"Modify",1);
            }
            katalogp.commitTrx();
            initTab();
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_doSave

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        katalog = new Tkatalog(txtKode.getText().trim(),(String) cbMerk.getSelectedItem(), txtArtikel.getText().trim(), txtUkuran.getText().trim(), txtWarna.getText(),(String) cbTipe.getSelectedItem(),null);
               try{
        katalogp = new TkatalogJpaController(null,null);
            KWAMesg msg;
            katalogp.initTrx();
            
            msg = katalogp.destroy(katalog.getKode());
 katalogp.commitTrx();
                JOptionPane.showMessageDialog(null, msg.getMesg(),"Delete",1);
                initTab();

                    }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtWarnaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWarnaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWarnaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox cbMerk;
    private javax.swing.JComboBox cbTipe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTable tabKatalog;
    private javax.swing.JTextField txtArtikel;
    private javax.swing.JTextField txtKode;
    private javax.swing.JTextField txtUkuran;
    private javax.swing.JTextField txtWarna;
    // End of variables declaration//GEN-END:variables
    private Tkatalog katalog;
    private TkatalogJpaController katalogp;
    private java.util.List<com.kwa.cittajaya.Tkatalog> list;

    private class RowListener implements ListSelectionListener {
        
        public void valueChanged(ListSelectionEvent event) {
            if (event.getValueIsAdjusting()) {
                return;
            }
            tabKatalog.getSelectedRow();
            modelKatalog modelpeg = (modelKatalog) tabKatalog.getModel();
            katalog =  modelpeg.getData().get(tabKatalog.getSelectedRow());
            txtKode.setText(katalog.getKode());
         cbMerk.setSelectedItem(katalog.getMerk());
            txtArtikel.setText(katalog.getArtikel());
            txtUkuran.setText(katalog.getUkuran());
            txtWarna.setText(katalog.getWarna());
            cbTipe.setSelectedItem(katalog.getTipe());
            
        }
    }

}
