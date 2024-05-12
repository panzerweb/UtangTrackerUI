
import com.mysql.cj.jdbc.result.ResultSetFactory;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author User
 */
public class LoginForm extends javax.swing.JFrame {

    /**
     * Creates new form LoginForm
     */
    public LoginForm() {
        initComponents();
        
        //Default Icon Visibility
        showPassword.setVisible(false);
        hidePassword.setVisible(false);
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
        logo = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();
        loginPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        showPassword = new javax.swing.JButton();
        loginBtn = new javax.swing.JButton();
        signUpBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        hidePassword = new javax.swing.JButton();
        passField = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane1.setDividerLocation(120);
        jSplitPane1.setDividerSize(0);
        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jPanel1.setBackground(new java.awt.Color(45, 225, 194));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setFont(new java.awt.Font("Corbel Light", 1, 48)); // NOI18N
        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Documents\\NetBeansProjects\\UtangTrackerUI\\Assets\\logo\\logo.png")); // NOI18N
        jPanel1.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 0, 900, 120));

        bg.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Documents\\NetBeansProjects\\UtangTrackerUI\\Assets\\Assets.png")); // NOI18N
        jPanel1.add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, -2, 910, 120));

        jSplitPane1.setTopComponent(jPanel1);

        loginPanel.setBackground(new java.awt.Color(232, 232, 232));
        loginPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(45, 225, 194));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(127, 190, 171), 2, true));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Email Address");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, -1, -1));

        emailField.setBackground(new java.awt.Color(45, 225, 194));
        jPanel2.add(emailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 480, 40));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Password");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, -1, -1));

        showPassword.setBackground(new java.awt.Color(106, 213, 203));
        showPassword.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Documents\\NetBeansProjects\\UtangTrackerUI\\Assets\\icons\\eye.png")); // NOI18N
        showPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                showPasswordMousePressed(evt);
            }
        });
        showPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPasswordActionPerformed(evt);
            }
        });
        jPanel2.add(showPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 240, 60, 50));

        loginBtn.setBackground(new java.awt.Color(0, 204, 204));
        loginBtn.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        loginBtn.setText("Login");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });
        jPanel2.add(loginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 310, 120, 40));

        signUpBtn.setBackground(new java.awt.Color(51, 255, 153));
        signUpBtn.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        signUpBtn.setText("Signup");
        signUpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpBtnActionPerformed(evt);
            }
        });
        jPanel2.add(signUpBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, 120, 40));

        jLabel3.setText("Don't have an account?");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, -1, -1));

        hidePassword.setBackground(new java.awt.Color(106, 213, 203));
        hidePassword.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Documents\\NetBeansProjects\\UtangTrackerUI\\Assets\\icons\\hidden.png")); // NOI18N
        hidePassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                hidePasswordMousePressed(evt);
            }
        });
        hidePassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                hidePasswordKeyPressed(evt);
            }
        });
        jPanel2.add(hidePassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 240, 60, 50));

        passField.setBackground(new java.awt.Color(45, 225, 194));
        passField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                passFieldKeyTyped(evt);
            }
        });
        jPanel2.add(passField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 420, 50));

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Login");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 10, 650, 40));

        loginPanel.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 67, 667, 437));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Documents\\NetBeansProjects\\UtangTrackerUI\\Assets\\bg.png")); // NOI18N
        loginPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 600));

        jSplitPane1.setRightComponent(loginPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private boolean iconVisible = false;
    private boolean passWordVisible = false;
    
    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
       String FullName = null, EmailAddress, PasswordVar, query, passDb = null;
        String url = "jdbc:mysql://localhost:3306/utangtracker";
        String user = "root";
        String password = "";
        int notFound = 0;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, password);
            Statement st = con.createStatement();
            if("".equals(emailField.getText())){
                JOptionPane.showMessageDialog(this, "Email Address is Required");
            }else if("".equals(passField.getText())){
                JOptionPane.showMessageDialog(this, "Password is Required");
                
            }else{
                EmailAddress = emailField.getText();
                PasswordVar = passField.getText();
                System.out.println(PasswordVar);
                
                query = "SELECT * FROM userdb WHERE email_ad = '"+ EmailAddress+"'";
                ResultSet rs = st.executeQuery(query);
                    
                    while(rs.next()){
                        passDb = rs.getString("pass_word");
                        FullName = rs.getString("full_name");
                        notFound = 1;
                    }
                    
                    if (notFound == 1 && (PasswordVar == null ? passDb == null : PasswordVar.equals(passDb))) {
                        
                        JOptionPane.showMessageDialog(this, "Logged In");
                        System.out.println("Success!");
                        Main main = new Main();
                        //setProfile is the method we created in the Main.java to set the Jlabel
                        main.setProfile(FullName);
                        main.setVisible(true);
                        setVisible(false);
                    } else {
                        JOptionPane.showMessageDialog(this, "Incorrect Email or Password");
                    }

               
                passField.setText("");

                
            }
        } catch (SQLException e) {
            System.out.println("Error" + e.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RegisterForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_loginBtnActionPerformed

    private void signUpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpBtnActionPerformed
        RegisterForm register = new RegisterForm();
        register.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_signUpBtnActionPerformed

    private void showPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_showPasswordActionPerformed

    private void showPasswordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showPasswordMousePressed
        hidePassword.setVisible(passWordVisible);
        showPassword.setVisible(!passWordVisible);
        
        if (passWordVisible) {
            passField.setEchoChar('*');
        } else {
            passField.setEchoChar((char)0);
        }
        
        passWordVisible = !passWordVisible;
    }//GEN-LAST:event_showPasswordMousePressed

    private void hidePasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_hidePasswordKeyPressed

    }//GEN-LAST:event_hidePasswordKeyPressed

    private void hidePasswordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hidePasswordMousePressed
        hidePassword.setVisible(!passWordVisible);
        showPassword.setVisible(passWordVisible);
        
        if (passWordVisible) {
            passField.setEchoChar('*');
        } else {
            passField.setEchoChar((char)0);
        }
        passWordVisible = !passWordVisible;
        
    }//GEN-LAST:event_hidePasswordMousePressed

    private void passFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passFieldKeyTyped
        if (!iconVisible && passField.getText().length() > 0) {
            showPassword.setVisible(true);
            hidePassword.setVisible(true);
            iconVisible = true;
        } else if(iconVisible && passField.getText().length() == 1){
            showPassword.setVisible(false);
            hidePassword.setVisible(false);
            iconVisible = false;
        }
    }//GEN-LAST:event_passFieldKeyTyped

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
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JTextField emailField;
    private javax.swing.JButton hidePassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton loginBtn;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JLabel logo;
    private javax.swing.JPasswordField passField;
    private javax.swing.JButton showPassword;
    private javax.swing.JButton signUpBtn;
    // End of variables declaration//GEN-END:variables
}
