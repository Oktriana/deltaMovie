/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediaplayertest;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author Oktriana Sidik
 */
public class Register extends javax.swing.JFrame {
    
    Koneksi konek = new Koneksi();
    /**
     * Creates new form Register
     */
    public Register() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        retypePwd = new javax.swing.JPasswordField();
        email = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        question = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        answer = new javax.swing.JTextField();
        btn_Submit = new javax.swing.JButton();
        answerMessage = new javax.swing.JLabel();
        retypeMessage = new javax.swing.JLabel();
        pwdMessage = new javax.swing.JLabel();
        emailMessage = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        unameMessage = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTER");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 0, 170, 60));

        jPanel2.setBackground(new java.awt.Color(0, 0, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password             :");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));
        jPanel2.add(retypePwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 178, -1));

        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        jPanel2.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 180, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Retype-Password  :");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));
        jPanel2.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 178, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name                  :");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 110, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Security Question :");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        question.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Where is your mother born?", "Where is city of your childhood?", "What is your pet name?", "What is your favorite song?", "What is your favorite quote?" }));
        question.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                questionActionPerformed(evt);
            }
        });
        jPanel2.add(question, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Security Answers  :");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, 20));
        jPanel2.add(answer, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 178, -1));

        btn_Submit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_Submit.setText("SUBMIT");
        btn_Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SubmitActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, -1, -1));

        answerMessage.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        answerMessage.setForeground(new java.awt.Color(204, 0, 0));
        jPanel2.add(answerMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 180, 20));

        retypeMessage.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        retypeMessage.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(retypeMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 180, 20));

        pwdMessage.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        pwdMessage.setForeground(new java.awt.Color(204, 0, 0));
        jPanel2.add(pwdMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 180, 20));

        emailMessage.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        emailMessage.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(emailMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 180, 20));
        jPanel2.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 180, -1));

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Email                         :");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 110, 20));

        unameMessage.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        unameMessage.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(unameMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 180, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 470, 370));

        jLabel7.setBackground(new java.awt.Color(204, 255, 204));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background/siapatauperlu8.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 510));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void questionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_questionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_questionActionPerformed

    private void btn_SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SubmitActionPerformed
        if(username.getText().trim().isEmpty() && email.getText().trim().isEmpty() && password.getText().trim().isEmpty()
            && retypePwd.getText().trim().isEmpty() && answer.getText().trim().isEmpty()){
            showMessageDialog(null, "Semua field harus diisi!!");
        } else if(answer.getText().trim().isEmpty()){
            answerMessage.setText("Jawaban harus diisi!");
        } else if(retypePwd.getText().trim().isEmpty()){
            retypeMessage.setText("Retype Password!");
        } else if(password.getText().trim().isEmpty()){
            pwdMessage.setText("Password harus diisi!");
        } else if(email.getText().trim().isEmpty()){
            emailMessage.setText("Email harus diisi!");
        } else if(username.getText().trim().isEmpty()){
            unameMessage.setText("Username harus diisi!");
        } else{
            String nama = username.getText();
            String mail = email.getText();
            String pass = password.getText();
            int quest = question.getSelectedIndex();
            String answr = answer.getText();
                       
            insert(nama, mail, pass, quest, answr);
            
            showMessageDialog(null, "Semua data telah di masukan!");
        }

        new FormUser().setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btn_SubmitActionPerformed

    public void insert(String nama, String mail, String pass, int quest, String answr){
        String sql = "INSERT INTO User(userName, email, password, s_question, s_answer)" +
                "VALUES('" + nama + "','" + mail + "','" + pass + "','" + quest + "','" + answr + "')";
        try (Connection con = konek.connect();
            PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.executeUpdate();
              //selectAll();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void selectAll(){
        String sql = "SELECT userName, email, password, s_question, s_answer FROM User"; 
        
        try (Connection con = konek.connect();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql)){
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void encrypt(String enkrip){
        String pwd = null;
        
        try{
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(pwd.getBytes(),0,pwd.length());
            new BigInteger(1, md.digest()).toString(16);
            
        } catch(NoSuchAlgorithmException e){
            e.getMessage();
        }
    }
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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField answer;
    private javax.swing.JLabel answerMessage;
    private javax.swing.JButton btn_Submit;
    private javax.swing.JTextField email;
    private javax.swing.JLabel emailMessage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel pwdMessage;
    private javax.swing.JComboBox<String> question;
    private javax.swing.JLabel retypeMessage;
    private javax.swing.JPasswordField retypePwd;
    private javax.swing.JLabel unameMessage;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
