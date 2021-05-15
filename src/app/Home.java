package app;

import controller.IOFile;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrator
 */
public class Home extends javax.swing.JFrame {

    private ArrayList<Students> list ;
    private IOFile file;
    DefaultTableModel model;
   
    public Home() {
        file = new IOFile();
        list = file.docSV();
        
        initComponents();
        setTitle("QUẢN LÝ SINH VIÊN");
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(951, 499);
        model = (DefaultTableModel) Table.getModel();
        
        H1();
    }

    public void H1() {
        model.setRowCount(0);
        for (Students sv: list) {
            model.addRow(sv.toObject());
        }
    }
    
    int i ;
    public void FillToTable() {
        i = Table.getSelectedRow();
        list.remove(i);
        file.ghi(list, "SV.txt");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtLop = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        CBnganh = new javax.swing.JComboBox<>();
        txtPhone = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnadd = new javax.swing.JButton();
        btnxoa = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnreset = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(51, 255, 255));

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("QUẢN LÍ SINH VIÊN");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(210, 0, 630, 50);
        jPanel1.add(txtName);
        txtName.setBounds(120, 70, 140, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Full Name :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 70, 100, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Date Of Birth :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 110, 100, 30);
        jPanel1.add(txtDate);
        txtDate.setBounds(120, 110, 140, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Class :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, 150, 110, 30);
        jPanel1.add(txtLop);
        txtLop.setBounds(120, 150, 140, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Chuyên Ngành :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(0, 200, 110, 30);

        CBnganh.setEditable(true);
        CBnganh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ĐTVT", "CNTT", "QTKD", "TKĐH" }));
        CBnganh.setToolTipText("");
        jPanel1.add(CBnganh);
        CBnganh.setBounds(120, 200, 140, 30);
        jPanel1.add(txtPhone);
        txtPhone.setBounds(120, 250, 140, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Phone:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(0, 250, 100, 30);

        btnadd.setText("ADD/SAVE");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });
        jPanel1.add(btnadd);
        btnadd.setBounds(70, 310, 120, 23);

        btnxoa.setText("DELETE");
        btnxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoaActionPerformed(evt);
            }
        });
        jPanel1.add(btnxoa);
        btnxoa.setBounds(70, 350, 120, 23);

        btnExit.setText("EXIT");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jPanel1.add(btnExit);
        btnExit.setBounds(70, 390, 120, 23);

        btnreset.setText("RESET");
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });
        jPanel1.add(btnreset);
        btnreset.setBounds(70, 430, 120, 23);

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Họ&Tên", "Ngày Sinh", "Class", "Chuyên Ngành", "Điện Thoại"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Table);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(270, 60, 660, 400);

        jTabbedPane1.addTab("Quản lý Sinh Viên", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 951, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
       System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        
        Students sv = new Students();
        sv.setName(txtName.getText());
        sv.setDate(txtDate.getText());
        sv.setLop(txtLop.getText());
        sv.setNganh((String) CBnganh.getSelectedItem());
        sv.setPhone(txtPhone.getText());
        
        list.add(sv);
        file.ghiSV(list);
        H1();
        
        txtName.setText("");
        txtDate.setText("");
        txtLop.setText("");
        txtPhone.setText("");
    }//GEN-LAST:event_btnaddActionPerformed

    private void btnxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxoaActionPerformed
        FillToTable();
        H1();
    }//GEN-LAST:event_btnxoaActionPerformed
 
    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
        JOptionPane.showConfirmDialog(this, "Reset sẽ xóa hết dữ liệu và không khôi phục được. Bạn có chắc chắn không?");
        if (this != null) {
            JOptionPane.showMessageDialog(this, "Không thể reset được! Bạn cần có quyền truy cập quản trị viên!");
        } 
    }//GEN-LAST:event_btnresetActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CBnganh;
    private javax.swing.JTable Table;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btnreset;
    private javax.swing.JButton btnxoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtLop;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    // End of variables declaration//GEN-END:variables
}
