/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soft252cw;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author akeyorekon
 */
public class adminl extends javax.swing.JFrame {

    /**
     * Creates new form adminl
     */
    public adminl() {
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
        SIGNADD = new javax.swing.JButton();
        ADD1 = new javax.swing.JTextField();
        CREEA = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        PASS1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("username");

        SIGNADD.setText("sign in");
        SIGNADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SIGNADDActionPerformed(evt);
            }
        });

        CREEA.setText("create account");
        CREEA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CREEAActionPerformed(evt);
            }
        });

        jLabel3.setText("Password");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(201, Short.MAX_VALUE)
                .addComponent(ADD1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(71, 71, 71)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(153, 153, 153)
                            .addComponent(CREEA))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(SIGNADD)
                                    .addGap(2, 2, 2)))
                            .addGap(63, 63, 63)
                            .addComponent(PASS1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(71, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(ADD1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(216, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(73, 73, 73)
                    .addComponent(jLabel1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(PASS1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(SIGNADD)
                        .addComponent(CREEA))
                    .addGap(71, 71, 71)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SIGNADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SIGNADDActionPerformed
        try {
            // TODO add your handling code here:
            FileReader fr = new FileReader("admin.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;

            while((line = br.readLine()) != null)
            {
                String username = line;
                String password = br.readLine();
                System.out.println(username);
                System.out.println(password);

                if(ADD1.getText().equals(username)&&(PASS1.getText().equals(password)))
                {
                    System.out.println("Welcome User");
                    signin sg = new signin();
                    sg.setVisible(true);
                }
            }
            br.close();
            fr.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(adminl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(adminl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SIGNADDActionPerformed

    private void CREEAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CREEAActionPerformed

        // TODO add your handling code here:
        logadmin l=new logadmin();
        l.setVisible(true);

    }//GEN-LAST:event_CREEAActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
    }          
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ADD1;
    private javax.swing.JButton CREEA;
    private javax.swing.JTextField PASS1;
    private javax.swing.JButton SIGNADD;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
