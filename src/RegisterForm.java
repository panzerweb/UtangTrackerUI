
import java.awt.HeadlessException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author User
 */
public class RegisterForm extends javax.swing.JFrame {

    /**
     * Creates new form RegisterForm
     */
    public RegisterForm() {
        initComponents();
        
        //default visibility of icons
        showPass.setVisible(false);
        hidePass.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();
        RegisterPanel = new javax.swing.JPanel();
        container = new javax.swing.JPanel();
        fullNameField = new javax.swing.JTextField();
        emailAddressField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        showPass = new javax.swing.JButton();
        hidePass = new javax.swing.JButton();
        signUpBtn = new javax.swing.JButton();
        loginBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        passWordField = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane1.setDividerLocation(300);
        jSplitPane1.setDividerSize(0);
        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jPanel1.setBackground(new java.awt.Color(45, 225, 194));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Documents\\NetBeansProjects\\UtangTrackerUI\\Assets\\images\\Utang Tracker Images\\2.png")); // NOI18N
        jLabel8.setText("jLabel1");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 310, 40));

        logo.setFont(new java.awt.Font("Corbel Light", 1, 48)); // NOI18N
        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Documents\\NetBeansProjects\\UtangTrackerUI\\Assets\\images\\Utang Tracker Images\\1.png")); // NOI18N
        logo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoMouseClicked(evt);
            }
        });
        jPanel1.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 310, 250));

        bg.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Documents\\NetBeansProjects\\UtangTrackerUI\\Assets\\Assets.png")); // NOI18N
        jPanel1.add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 300));

        jSplitPane1.setTopComponent(jPanel1);

        RegisterPanel.setBackground(new java.awt.Color(106, 213, 203));
        RegisterPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        container.setBackground(new java.awt.Color(45, 225, 194));
        container.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(127, 190, 171), 2, true));
        container.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fullNameField.setBackground(new java.awt.Color(45, 225, 194));
        fullNameField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        container.add(fullNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 160, 30));

        emailAddressField.setBackground(new java.awt.Color(45, 225, 194));
        emailAddressField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        container.add(emailAddressField, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 160, 30));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Full Name");
        container.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Email Address");
        container.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Password");
        container.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, -1, -1));

        showPass.setBackground(new java.awt.Color(106, 213, 203));
        showPass.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Documents\\NetBeansProjects\\UtangTrackerUI\\Assets\\icons\\eye.png")); // NOI18N
        showPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                showPassMousePressed(evt);
            }
        });
        showPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPassActionPerformed(evt);
            }
        });
        container.add(showPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 50, 30));

        hidePass.setBackground(new java.awt.Color(106, 213, 203));
        hidePass.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Documents\\NetBeansProjects\\UtangTrackerUI\\Assets\\icons\\hidden.png")); // NOI18N
        hidePass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                hidePassMousePressed(evt);
            }
        });
        container.add(hidePass, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 50, 30));

        signUpBtn.setBackground(new java.awt.Color(0, 204, 204));
        signUpBtn.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        signUpBtn.setForeground(new java.awt.Color(51, 51, 51));
        signUpBtn.setText("Sign Up");
        signUpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpBtnActionPerformed(evt);
            }
        });
        container.add(signUpBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 160, 30));

        loginBtn.setBackground(new java.awt.Color(51, 255, 153));
        loginBtn.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        loginBtn.setForeground(new java.awt.Color(51, 51, 51));
        loginBtn.setText("Login");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });
        container.add(loginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 160, 20));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Already have an account?");
        container.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 160, -1));

        passWordField.setBackground(new java.awt.Color(45, 225, 194));
        passWordField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        passWordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                passWordFieldKeyTyped(evt);
            }
        });
        container.add(passWordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 160, 30));

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Register");
        container.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 40));

        RegisterPanel.add(container, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 380, 350));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Documents\\NetBeansProjects\\UtangTrackerUI\\Assets\\bg.png")); // NOI18N
        RegisterPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 600));

        jSplitPane1.setRightComponent(RegisterPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 891, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 719, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private boolean passWordVisible = false;
    private boolean iconVisible = false;
    
    //Shows password when key is press on password field
    private void passWordFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passWordFieldKeyTyped
        if (!iconVisible && passWordField.getPassword().length > 0) {
            showPass.setVisible(true);
            hidePass.setVisible(false);
            iconVisible = true;
        }
        else if(iconVisible && passWordField.getPassword().length == 0){
            showPass.setVisible(false);
            hidePass.setVisible(false);
            iconVisible = false;
        }
    }//GEN-LAST:event_passWordFieldKeyTyped

    private void showPassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showPassMousePressed
        hidePass.setVisible(passWordVisible);
        showPass.setVisible(!passWordVisible);
        
        if (passWordVisible) {
            passWordField.setEchoChar('*');
        } else {
            passWordField.setEchoChar((char)0);
        }
        
        passWordVisible = !passWordVisible;
    }//GEN-LAST:event_showPassMousePressed

    private void hidePassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hidePassMousePressed
        hidePass.setVisible(!passWordVisible);
        showPass.setVisible(passWordVisible);
        
        if (passWordVisible) {
            passWordField.setEchoChar('*');
        } else {
            passWordField.setEchoChar((char)0);
        }
        
        passWordVisible = !passWordVisible;
    }//GEN-LAST:event_hidePassMousePressed

    private void signUpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpBtnActionPerformed
        String fullName, emailAddress, passwordVar, query;
        String url = "jdbc:mysql://localhost:3306/utangtracker";
        String user = "root";
        String password = "";
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, password);
            Statement st = con.createStatement();
            if ("".equals(fullNameField.getText())) {
                JOptionPane.showMessageDialog(this, "Full Name is Required");
            }else if("".equals(emailAddressField.getText())){
                JOptionPane.showMessageDialog(this, "Email Address is Required");
            }else if("".equals(passWordField.getText())){
                JOptionPane.showMessageDialog(this, "Password is Required");
                
            }else{
                fullName = fullNameField.getText();
                emailAddress = emailAddressField.getText();
                passwordVar = passWordField.getText();
                System.out.println(passwordVar);
                
                query = "INSERT INTO userdb (full_name, email_ad, pass_word) VALUES ('" + fullName + "', '" + emailAddress + "', '" + passwordVar + "')";

                
                st.executeUpdate(query);
                
                fullNameField.setText("");
                emailAddressField.setText("");
                passWordField.setText("");
                JOptionPane.showMessageDialog(this, "Account has been successfully created!");
                
                LoginForm log = new LoginForm();
                log.setVisible(true);
                setVisible(false);
            }
        } catch (SQLException e) {
            System.out.println("Error" + e.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RegisterForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_signUpBtnActionPerformed

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
            LoginForm log = new LoginForm();
            log.setVisible(true);
            setVisible(false);
    }//GEN-LAST:event_loginBtnActionPerformed

    private void showPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_showPassActionPerformed

    private void logoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoMouseClicked
       Homepage home = new Homepage();
       home.setVisible(true);
       setVisible(false);
    }//GEN-LAST:event_logoMouseClicked

    

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
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel RegisterPanel;
    private javax.swing.JLabel bg;
    private javax.swing.JPanel container;
    private javax.swing.JTextField emailAddressField;
    private javax.swing.JTextField fullNameField;
    private javax.swing.JButton hidePass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton loginBtn;
    private javax.swing.JLabel logo;
    private javax.swing.JPasswordField passWordField;
    private javax.swing.JButton showPass;
    private javax.swing.JButton signUpBtn;
    // End of variables declaration//GEN-END:variables
}
