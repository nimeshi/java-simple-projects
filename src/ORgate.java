
import java.awt.Color;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class ORgate extends javax.swing.JFrame {
int input1;
int input2;
int output;
    /**
     * Creates new form ORgate
     */
    public ORgate() {
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

        jLabel1 = new javax.swing.JLabel();
        lblInput1 = new javax.swing.JLabel();
        lblInput2 = new javax.swing.JLabel();
        lblOutput = new javax.swing.JLabel();
        btnExecute = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Pictures\\java.class\\Logic-gate-or-us (2).jpg")); // NOI18N
        jLabel1.setText("jLabel1");

        lblInput1.setText("jLabel2");
        lblInput1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblInput1MouseClicked(evt);
            }
        });

        lblInput2.setText("jLabel2");
        lblInput2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblInput2MouseClicked(evt);
            }
        });

        lblOutput.setText("jLabel2");

        btnExecute.setText("OR-execute");
        btnExecute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExecuteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblInput1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblInput2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblOutput)
                .addGap(22, 22, 22))
            .addGroup(layout.createSequentialGroup()
                .addGap(211, 211, 211)
                .addComponent(btnExecute)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(btnExecute)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblOutput)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(lblInput1)
                        .addGap(96, 96, 96)
                        .addComponent(lblInput2)))
                .addContainerGap(101, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblInput1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInput1MouseClicked
     input1++;
     if(input1%2==1){
     lblInput1.setText("1");
     lblInput1.setBackground(Color.green);
     lblInput1.setOpaque(true);
    }
     else {
     lblInput1.setText("0");
     lblInput1.setBackground(Color.red );
     lblInput1.setOpaque(true);           
    }
     
    }//GEN-LAST:event_lblInput1MouseClicked

    private void lblInput2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInput2MouseClicked
             input2++;
     if(input2%2==1){
     lblInput2.setText("1");
     lblInput2.setBackground(Color.green);
     lblInput2.setOpaque(true);
    }
     else {
     lblInput2.setText("0");
     lblInput2.setBackground(Color.red );
     lblInput2.setOpaque(true);           
    }
     
    }//GEN-LAST:event_lblInput2MouseClicked

    private void btnExecuteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExecuteActionPerformed
      if( (input1%2==0) && (input2%2==0)){
      lblOutput.setText("0");
      lblOutput.setBackground(Color.red);
      lblOutput.setOpaque(true);
      }
      else{
        lblOutput.setText("1");
        lblOutput.setBackground(Color.green);
        lblOutput.setOpaque(true);
      }
    }//GEN-LAST:event_btnExecuteActionPerformed

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
            java.util.logging.Logger.getLogger(ORgate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ORgate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ORgate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ORgate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ORgate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExecute;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblInput1;
    private javax.swing.JLabel lblInput2;
    private javax.swing.JLabel lblOutput;
    // End of variables declaration//GEN-END:variables
}