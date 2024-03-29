/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import dhis2datim.CSVLine;
import dhis2datim.CategoryComboType;
import dhis2datim.DataStructureDATIM;
import dhis2datim.Indicateur;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.SwingWorker.StateValue;
import dhis2datim.MyWorker;
import dhis2datim.Processor;
import dhis2datim.PropertyReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class FrmMain extends javax.swing.JFrame {

    /**
     * Creates new form FrmMain
     */
    public FrmMain() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        progress = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        logScreen = new javax.swing.JTextArea();
        btnprocess = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cbxYear = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cbxPeriodicity = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        lbldatafile = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        jTextField1.setText("jTextField1");

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DATIM Generator 1.1");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 178, 178)));

        progress.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        progress.setStringPainted(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(progress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(progress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9))
        );

        jLabel1.setFont(new java.awt.Font("Abyssinica SIL", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(13, 89, 205));
        jLabel1.setText("DATIM Generator 1.2");

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 178, 178)));

        logScreen.setEditable(false);
        logScreen.setBackground(new java.awt.Color(13, 9, 5));
        logScreen.setColumns(20);
        logScreen.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        logScreen.setForeground(new java.awt.Color(85, 210, 60));
        logScreen.setRows(5);
        logScreen.setText("Click \"start processing\" to run the processing");
        logScreen.setFocusable(false);
        jScrollPane1.setViewportView(logScreen);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        btnprocess.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        btnprocess.setForeground(new java.awt.Color(245, 2, 2));
        btnprocess.setText("Start processing");
        btnprocess.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnprocessMouseClicked(evt);
            }
        });
        btnprocess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprocessActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel2.setText("Period:");

        jLabel3.setFont(new java.awt.Font("Abyssinica SIL", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(13, 89, 205));
        jLabel3.setText("©IHAP HK/L");

        jLabel5.setToolTipText("");

        jLabel6.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel6.setText("Periodicity:");

        cbxPeriodicity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "QUARTER", "SEMI_ANNUAL", "ANNUAL" }));
        cbxPeriodicity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxPeriodicityActionPerformed(evt);
            }
        });

        jButton1.setText("Data file ...");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lbldatafile.setText("jLabel4");

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbxYear, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbxPeriodicity, 0, 121, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(btnprocess, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbldatafile, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbxPeriodicity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addComponent(btnprocess))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbxYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbldatafile, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    MyWorker worker;

    private static List<CSVLine> list;

    private static Processor processor;

    private static int count;

    private static String PERIOD = "";
    
    private static String PERIODICITY="";

    private List<DataStructureDATIM> lstData;

    private final static String ATTRIBUTE_COMBO = "JVafaPfopJf";

    private void btnprocessMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnprocessMouseClicked
        // TODO add your handling code here:

        if (cbxYear.getSelectedItem().toString().equals("")) {
            JOptionPane.showMessageDialog(null, "You should select a period");
            return;
        }
        PERIOD = cbxYear.getSelectedItem().toString();
        
        PERIODICITY=cbxPeriodicity.getSelectedItem().toString();
        
        try {
            props = new PropertyReader();
        } catch (IOException ex) {
            Logger.getLogger(FrmMain.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("STARTING DATIM GENERATOR ........");
        System.out.println();
        System.out.println();

        logScreen.setText("DATIM generator running...");

        List<DataStructureDATIM> lstData = new ArrayList<>();

        list = new ArrayList<>();

        System.out.println("Data element,Period,OrganisationUnit,CategorieCombo,CategorieComboUID, AttributeCombo,Value");

        //*************************
        //REMEMBER YOU DIDN'T TAKE INTO ACCOUNT THE TOTAL COLUMNS FOR HTS_TST (MUST BE DELETED OR CHANGE CODE
        //*************************
        
        for (CategoryComboType type : CategoryComboType.values()) {
            
            if(PERIODICITY.equals("QUARTER")){
                if (type.toString().equals("TX_PVLS") || type.toString().equals("EMR_SITE") ||
                        type.toString().equals("HTS_SELF")|| type.toString().equals("HTS_SELF_FAC")) {

                    processor = new Processor(type);

                    Indicateur ind = new Indicateur(type.toString());

                    lstData = new ArrayList<>();

                    lstData = processor.processPreprocessed(ind,lbldatafile.getText());

                    fillList(lstData, ind);
                }
            }
            
            if(PERIODICITY.equals("SEMI_ANNUAL") || PERIODICITY.equals("ANNUAL")){
                
                if (type.toString().equals("PP_PREV") || type.toString().equals("TB_PREV")
                        || type.toString().equals("TX_TB") || type.toString().equals("TX_ML")) {

                    processor = new Processor(type);

                    Indicateur ind = new Indicateur(type.toString());

                    lstData = processor.processPreprocessed(ind,lbldatafile.getText());
                    
                    fillList(lstData, ind);
                }
            }
            if(PERIODICITY.equals("ANNUAL")){
                
                if(type.toString().equals("EMR_SITE") || type.toString().equals("HRH_CURR") || 
                        type.toString().equals("GENDER_GBV") || type.toString().equals("PMTCT_FO") ||
                                type.toString().equals("LAB_PT_LAB")|| type.toString().equals("LAB_PT_POCT")){
                    processor = new Processor(type);
                    
                    Indicateur ind = new Indicateur(type.toString());
                    
                    lstData = processor.processPreprocessed(ind,lbldatafile.getText());
                    
                    fillList(lstData, ind);
                }
            }
        }

        logScreen.setText("Data processing started\n");

        worker = new MyWorker(logScreen, list);

        worker.addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {

                switch (evt.getPropertyName()) {

                    case "progress":
                        progress.setIndeterminate(false);
                        progress.setValue((Integer) evt.getNewValue());
                        btnprocess.setEnabled(false);
                        break;
                    case "state":
                        switch ((StateValue) evt.getNewValue()) {
                            case DONE:
                                progress.setValue(0);
                                try {
                                    final int count = worker.get();
                                    logScreen.append("\nDATIM file generated successfully with " + count + " lines");
                                    btnprocess.setEnabled(true);
                                } catch (final Exception e) {

                                }
                        }
                }
            }
        });
        worker.execute();

    }//GEN-LAST:event_btnprocessMouseClicked
    PropertyReader props;
    
    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        try {
            // TODO add your handling code here:
            cbxYear.addItem("");
            for (int i = 2018; i < 2023; i++) {
                for(int j=1; j <= 4; j++){
                    cbxYear.addItem(i+"Q"+j);
                }
            }
            props = new PropertyReader();
            //lbldatafile.setText(props.getDataFile());
           
        } catch (IOException ex) {
            Logger.getLogger(FrmMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_formWindowActivated

    private void btnprocessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprocessActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnprocessActionPerformed

    private void cbxPeriodicityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxPeriodicityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxPeriodicityActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        int res = chooser.showOpenDialog(this);

        if(res == JFileChooser.APPROVE_OPTION){
            String filename = chooser.getSelectedFile().getName();
            String path= chooser.getSelectedFile().getAbsolutePath();
            lbldatafile.setText(path);
        }else{

        }
    }//GEN-LAST:event_jButton1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMain().setVisible(true);

            }
        });
    }

    private static void fillList(List<DataStructureDATIM> lstData, Indicateur ind) {

        for (DataStructureDATIM ds : lstData) {

            String fosaUID = processor.getOrgUnitByKey(ds.getFosa().trim());

            if (fosaUID.equals("")) {
                System.err.println("FOSA " + ds.getFosa());
                continue;
            }
            count++;

            String dataelement = ds.getPorte();

            String dataelementUID = processor.getDataElementByKey(dataelement, ind);

            String categorieComboUID, categorieCombo = "";

            if (ind.getNom().equals("HTS_TST") || ind.getNom().equals("HTS_TST_2")) {

                categorieCombo = Processor.makeCategorieName(ds.getTranche(), ds.getGenre(), ds.getStatut());

            } else if (ind.getNom().equals("PMTCT_STAT")) {

                if (dataelement.contains("connues")) {

                    categorieCombo = Processor.makeCategorieName(ds.getTranche(), ds.getGenre(), "Known at Entry Positive");

                } else if (dataelement.contains("conseil")) {

                    categorieCombo = Processor.makeCategorieName(ds.getTranche(), ds.getGenre(), "Newly Identified " + ds.getStatut());

                } else {
                    categorieCombo = ds.getTranche() + ", " + ds.getGenre();
                }

            } else if (ind.getNom().equals("TB_STAT") || ind.getNom().equals("HTS_INDEX")) {

                if (dataelement.contains("HTS_cNombre")) {

                    categorieCombo = ds.getTranche() + ", Known at Entry Positive, " + ds.getGenre();

                } else if (dataelement.contains("HTS_nNombre")) {

                    categorieCombo = ds.getTranche() + ", Newly Identified " + ds.getStatut() + ", " + ds.getGenre();
                } else {
                    categorieCombo = ds.getTranche() + ", " + ds.getGenre();
                }

            } else if (ind.getNom().equals("TX_NEW")) {

                if (dataelement.contains("allaitante")) {

                    categorieCombo = "Breastfeeding, Positive";

                } else if (dataelement.contains("UDI")) {

                    categorieCombo = "PWID, Positive";

                } else if (dataelement.contains("MSM")) {

                    categorieCombo = "MSM, Positive";

                } else if (dataelement.contains("TRANSGE")) {

                    categorieCombo = "TG, Positive";

                } else if (dataelement.contains("PS")) {

                    categorieCombo = "FSW, Positive";

                } else if (dataelement.contains("PRISONNIER")) {

                    categorieCombo = "People in prisons and other enclosed settings, Positive";
                } else {
                    categorieCombo = ds.getTranche() + ", " + ds.getGenre() + ", Positive";
                }
            } else if (ind.getNom().equals("TX_CURR")) {

                categorieCombo = Processor.makeCategorieName(ds.getTranche(), ds.getGenre(), "Positive");

            } else if (ind.getNom().equals("PMTCT_ART")) {

                String cc = "";

                if (dataelement.contains("CPN1")) {
                    cc = "Life-long ART, Already";
                } else if (dataelement.contains("New")) {
                    cc = "Life-long ART, New";
                }

                categorieCombo = ds.getTranche() + ", " + cc + ", " + ds.getGenre() + ", " + ds.getStatut();

            } else if (ind.getNom().equals("TB_ART")) {

                String cc = "";

                if (dataelement.contains("Connu")) {
                    cc = "Life-long ART, Already";
                } else if (dataelement.contains("New")) {
                    cc = "Life-long ART, New";
                }

                categorieCombo = ds.getTranche() + ", " + ds.getGenre() + ", " + cc + ", " + ds.getStatut();

            }
            else if (ind.getNom().equals("PMTCT_HEI_POS")) {

                if (dataelement.contains("Positif EE 0-2")) {

                    categorieCombo = "<= 2 months, Positive";

                } else if (dataelement.contains("Positif EE 2-12")) {

                    categorieCombo = "2 - 12 months , Positive";

                } else if (dataelement.contains("TTT EE 0-2")) {

                    categorieCombo = "<= 2 months, Positive, Receiving ART";

                } else if (dataelement.contains("TTT EE 2-12")) {

                    categorieCombo = "2 - 12 months , Positive, Receiving ART";
                }
            } else if (ind.getNom().equals("PMTCT_EID")) {

                if (dataelement.contains("EE")) {

                    categorieCombo = "<= 2 months";

                } else {
                    categorieCombo = "2 - 12 months";
                }
            } else if (ind.getNom().equals("HTS_INDEX_COMM")) {

                if (ds.getStatut().equals("-")) {
                    categorieCombo = ds.getTranche() + ", " + ds.getGenre();
                } else {
                    categorieCombo = ds.getTranche() + ", Newly Identified " + ds.getStatut() + ", " + ds.getGenre();
                }

            } else if (ind.getNom().equals("HTS_TST_COMM")) {

                categorieCombo = ds.getTranche() + ", " + ds.getGenre() + ", " + ds.getStatut();
            } else if (ind.getNom().equals("TX_PVLS")) {

                if (ds.getGenre().equals("Unknown Sex")) {
                    categorieCombo = ds.getStatut() + ", " + ds.getTranche() + ", Positive";
                } else {
                    categorieCombo = ds.getTranche() + ", " + ds.getGenre() + ", " + ds.getStatut() + ", Positive";
                }
            }else if(ind.getNom().equals("PP_PREV")){
                
                //System.out.println(ds.getFosa());
                if(ds.getGenre().contains("Unknown")){
                    
                        //System.err.println(ds.getPorte()+ " UNKNOW");
                    
                        if(ds.getTranche().toLowerCase().contains("military")){
                            categorieCombo="Military & Other Uniformed Services";
                        }else if(ds.getTranche().toLowerCase().contains("mobile")){

                            categorieCombo="Mobile Population";
                        }else if(ds.getTranche().toLowerCase().contains("client")){

                            categorieCombo="Clients of Sex Workers";
                        }else if(ds.getTranche().toLowerCase().contains("deplaced")){

                            categorieCombo="Displaced Persons";
                        }else if(ds.getTranche().toLowerCase().contains("pecheur")){
                            categorieCombo="Fishing Communities";
                        }else if(ds.getTranche().toLowerCase().contains("udi")){
                            categorieCombo="Non-injecting Drug Users";
                        }else if(ds.getTranche().toLowerCase().contains("others")){
                            categorieCombo="Other Priority Population Types";
                        }else if(ds.getTranche().toLowerCase().contains("newly")){
                            categorieCombo="Newly Tested or Testing Referred";
                    }             
                }else{
                  categorieCombo=ds.getTranche()+", "+ds.getGenre();
                }
            }else if(ind.getNom().equals("TX_ML")){
                
               if(dataelement.toLowerCase().contains("ml_d")){
                   
                   categorieCombo="No Clinical Contact - Patient Died, "+ds.getGenre()+", "+ds.getTranche();
                   
               }else if(dataelement.toLowerCase().contains("ml_t")){
                   
                   categorieCombo="No Clinical Contact - Undocumented Patient Transfer, "+ds.getGenre()+", "+ds.getTranche();
                   
               }else if(dataelement.toLowerCase().contains("non retrouv")){
                   
                   categorieCombo="No Clinical Contact - Unable to Locate Patient, "+ds.getGenre()+", "+ds.getTranche();
                   
               }else if(dataelement.toLowerCase().contains("non recher")){
                   
                   categorieCombo="No Clinical Contact - No Attempt to Locate Patient, "+ds.getGenre()+", "+ds.getTranche();
               }
            }else if(ind.getNom().equals("TX_TB")){
                
                if(ds.getGenre().equals("Unknown Sex")){
                    
                    categorieCombo=ds.getTranche();
                    
                }else{
                    if(dataelement.contains("TB_Nouveaux cas sous ARV - PVVIH TB positifs so")){
                        
                        categorieCombo=ds.getTranche()+", "+ds.getGenre()+", "+"Life-long ART, New, Positive";
                        
                    }else if(dataelement.contains("TB_Anciens cas sous ARV - PVVIH TB positifs so")){
                        
                         categorieCombo=ds.getTranche()+", "+ds.getGenre()+", "+"Life-long ART, Already, Positive";
                         
                    }else if(dataelement.equals("TB_Nouveaux cas sous ARV avec un screening TB positif")){
                        
                         categorieCombo=ds.getTranche()+", "+ds.getGenre()+", TB Screen - Positive, Life-long ART, New, Positive";
                         
                    }else if(dataelement.equals("TB_Anciens cas sous ARV avec un screening TB positif")){
                        
                         categorieCombo=ds.getTranche()+", "+ds.getGenre()+", TB Screen - Positive, Life-long ART, Already, Positive";
                         
                    }else if(dataelement.contains("TB_Nouveaux cas sous ARV avec un screening TB N")){
                        
                         categorieCombo=ds.getTranche()+", "+ds.getGenre()+", TB Screen - Negative, Life-long ART, New, Positive";
                         
                    }else if(dataelement.contains("TB_Anciens cas sous ARV avec un screening TB N")){
                        
                         categorieCombo=ds.getTranche()+", "+ds.getGenre()+", TB Screen - Negative, Life-long ART, Already, Positive";
                    }
                }
            }else if(ind.getNom().equals("TB_PREV")){
                
                if(dataelement.contains("INH_Nouveaux cas")){
                    
                   categorieCombo=ds.getTranche()+", "+ds.getGenre()+", IPT, Life-long ART, New, Positive";
                            
                }else if(dataelement.contains("INH_Anciens cas")){
                    
                    categorieCombo=ds.getTranche()+", "+ds.getGenre()+", IPT, Life-long ART, Already, Positive";
                    
                }
            }else if(ind.getNom().equals("PMTCT_FO")){
                
              
                if(ds.getTranche().contains("FO_Nombre"))
                    categorieCombo="default";
                else if(ds.getTranche().contains("FO_EE Infec"))
                    categorieCombo = "HIV-infected";
                else if(ds.getTranche().contains("non infec"))
                    categorieCombo = "HIV-uninfected";
                else if(ds.getTranche().contains("FO_Status"))
                    categorieCombo = "HIV-final status unknown";
                else if(ds.getTranche().contains("FO_D"))
                    categorieCombo = "Other Outcomes: Died";
                
            }else if(ind.getNom().equals("EMR_SITE")){
                categorieCombo ="care and treatment";
                
            }else if(ind.getNom().equals("GENDER_GBV")){            
                if(dataelement.contains("PEP"))
                    categorieCombo=ds.getTranche()+", "+ds.getGenre()+"_GROUPE1";
                else
                    categorieCombo=ds.getTranche()+", "+ds.getGenre()+", Sexual Violence (Post-Rape Care)_GROUPE2";
                
            }else if(ind.getNom().equals("HRH_CURR")){
                
                String categ = "";
                switch(ds.getTranche().trim()){
                    case "Cliniciens":
                        categ = "Clinical";
                        break;
                    case "Pharmaciens":
                        categ = "Pharmacy";
                        break;
                    case "Laboratins":
                        categ = "Laboratory";
                        break;
                    case "Management":
                        categ = "Management";
                        break;
                    case "Service Social":
                        categ = "Social Service";
                        break;
                    case "Volontaires":
                        categ = "Lay";
                        break;
                    default:
                        categ = "Other";
                        break;
                }
                if(dataelement.contains("staffs par Cadre")){
                    categorieCombo = categ;
                }else if(dataelement.contains("staffs salari") || dataelement.contains("pour tous les salaires")){
                    categorieCombo = categ+", Salary";
                }else if(dataelement.contains("recevant des primes") || dataelement.contains("pour toutes les primes")){
                    categorieCombo = categ+", Stipend";
                }else if(dataelement.contains("recevant des des appuis")  || dataelement.contains("pour tous les appuis")){
                    categorieCombo = categ+", Non-Monetary";
                }
            }else if(ind.getNom().equals("LAB_PT_LAB")){
                categorieCombo = ds.getTranche();
                
            }else if(ind.getNom().equals("LAB_PT_POCT")){
                categorieCombo = ds.getTranche();
            }
            
            //Deal with HTS and HTS_TST sub-group
            if (ind.getNom().equals("HTS_TST") || ind.getNom().equals("HTS_TST_2")) {

                if (dataelement.contains("Pediatric") || dataelement.contains("malnouri")) {//GROUPE1
                    categorieCombo += "_GROUPE1";
                } else if (dataelement.contains("Post ANC1")) {//GROUPE 2
                    categorieCombo += "_GROUPE2";
                } else {//GROUPE3
                    categorieCombo += "_GROUPE3";
                }
            }
            if(ind.getNom().equals("HTS_SELF") || ind.getNom().equals("HTS_SELF_FAC")){
                
                categorieCombo = ds.getTranche() + ", " + ds.getGenre();
                //System.out.println(categorieCombo);
            }
            categorieComboUID = (!ind.getNom().startsWith("LAB"))? processor.getCategorieComboByKey(categorieCombo):categorieCombo;
            
            String valeur = "";
            
            valeur = ds.getValeur();
            

            System.out.println(count + " " + dataelement + ","+ dataelementUID + "," + PERIOD + "," + ds.getFosa() + "," + fosaUID + ","
                   + categorieCombo + "," +ds.getTranche()+","+ categorieComboUID + "," + ATTRIBUTE_COMBO + "," + ds.getValeur());

            list.add(new CSVLine(dataelementUID, PERIOD, fosaUID, categorieComboUID, ATTRIBUTE_COMBO, valeur));
        }
        System.out.println(count + " Lines added successfully!");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnprocess;
    private javax.swing.JComboBox<String> cbxPeriodicity;
    private javax.swing.JComboBox<String> cbxYear;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    public javax.swing.JLabel lbldatafile;
    private javax.swing.JTextArea logScreen;
    private javax.swing.JProgressBar progress;
    // End of variables declaration//GEN-END:variables
}
