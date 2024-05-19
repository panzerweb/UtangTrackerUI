
import java.awt.Color;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author User
 */
public class Homepage extends javax.swing.JFrame {

    /**
     * Creates new form Homepage
     */
    public Homepage() {
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

        jSplitPane1 = new javax.swing.JSplitPane();
        mainframe = new javax.swing.JPanel();
        registerPressBtn = new javax.swing.JButton();
        loginPressBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        navigation = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        navbg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jSplitPane1.setDividerLocation(300);
        jSplitPane1.setDividerSize(0);
        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        mainframe.setBackground(new java.awt.Color(153, 153, 153));
        mainframe.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        registerPressBtn.setBackground(new java.awt.Color(0, 153, 102));
        registerPressBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Documents\\NetBeansProjects\\UtangTrackerUI\\Assets\\icons\\web.png")); // NOI18N
        registerPressBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(127, 190, 171), 2, true));
        registerPressBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                registerPressBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                registerPressBtnMouseExited(evt);
            }
        });
        registerPressBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerPressBtnActionPerformed(evt);
            }
        });
        mainframe.add(registerPressBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 210, 150));

        loginPressBtn.setBackground(new java.awt.Color(0, 204, 204));
        loginPressBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Documents\\NetBeansProjects\\UtangTrackerUI\\Assets\\icons\\login (1).png")); // NOI18N
        loginPressBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(127, 190, 171), 2, true));
        loginPressBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginPressBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginPressBtnMouseExited(evt);
            }
        });
        loginPressBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginPressBtnActionPerformed(evt);
            }
        });
        mainframe.add(loginPressBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 210, 150));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Documents\\NetBeansProjects\\UtangTrackerUI\\Assets\\bg.png")); // NOI18N
        mainframe.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 300));

        jSplitPane1.setRightComponent(mainframe);

        navigation.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Documents\\NetBeansProjects\\UtangTrackerUI\\Assets\\images\\Utang Tracker Images\\2.png")); // NOI18N
        jLabel1.setText("jLabel1");
        navigation.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 310, 40));

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Documents\\NetBeansProjects\\UtangTrackerUI\\Assets\\images\\Utang Tracker Images\\1.png")); // NOI18N
        logo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoMouseClicked(evt);
            }
        });
        navigation.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 380, 260));

        navbg.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Documents\\NetBeansProjects\\UtangTrackerUI\\Assets\\Assets.png")); // NOI18N
        navigation.add(navbg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 300));

        jSplitPane1.setTopComponent(navigation);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginPressBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginPressBtnActionPerformed
        LoginForm login = new LoginForm();
        login.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_loginPressBtnActionPerformed

    private void loginPressBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginPressBtnMouseExited
        loginPressBtn.setBackground(new Color(0x00CCCC));
    }//GEN-LAST:event_loginPressBtnMouseExited

    private void loginPressBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginPressBtnMouseEntered
        loginPressBtn.setBackground(new Color(0x0D98BA));
    }//GEN-LAST:event_loginPressBtnMouseEntered

    private void registerPressBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerPressBtnActionPerformed
        RegisterForm register = new RegisterForm();
        register.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_registerPressBtnActionPerformed

    private void registerPressBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerPressBtnMouseExited
        registerPressBtn.setBackground(new Color(0,153,102));
    }//GEN-LAST:event_registerPressBtnMouseExited

    private void registerPressBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerPressBtnMouseEntered
        registerPressBtn.setBackground(new Color(0x03C03C));
    }//GEN-LAST:event_registerPressBtnMouseEntered

    private void logoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoMouseClicked

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
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Homepage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton loginPressBtn;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel mainframe;
    private javax.swing.JLabel navbg;
    private javax.swing.JPanel navigation;
    private javax.swing.JButton registerPressBtn;
    // End of variables declaration//GEN-END:variables
}
