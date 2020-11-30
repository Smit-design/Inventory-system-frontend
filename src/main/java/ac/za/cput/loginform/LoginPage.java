/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.loginform;

import ac.za.cput.controlclerkform.CreateClerkForm;
import ac.za.cput.entity.generic.University;
import ac.za.cput.entity.user.ControlClerk;
import ac.za.cput.entity.user.Login;
import ac.za.cput.util.HTTPHepler;
import com.google.gson.Gson;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.http.HttpResponse;

/**
 *
 * @author A. Mjeks
 */
public class LoginPage extends JFrame {

    // Variables declaration - do not modify
    private JLabel appNameTxt, emailTxt, jLabel1, jLabel2, passwordTxt,
                    slogan1, slogan2, universityOrCampusTxt, universityOrCampusTxt3;
    private JPanel jPanel1, jPanel2;
    private JTextField emailTextF;
    private JButton loginBtn;
    private JPasswordField passwordTextF;
    private JComboBox<String> userComboBox;
    private String baseURL = "http://localhost:8080/inventory/controlclerk/";
    private ControlClerk[] controlClerks;
    private String clerkEmail;
    private String clerkPassword;
    // End of variables declaration

    public LoginPage() throws IOException, InterruptedException {
        initComponents();
        getAllClerks();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel1 = new JPanel();
        jPanel2 = new JPanel();
        jLabel1 = new JLabel();
        slogan1 = new JLabel();
        appNameTxt = new JLabel();
        slogan2 = new JLabel();
        jLabel2 = new JLabel();
        universityOrCampusTxt = new JLabel();
        userComboBox = new JComboBox<>();
        emailTxt = new JLabel();
        emailTextF = new JTextField();
        passwordTxt = new JLabel();
        passwordTextF = new JPasswordField();
        universityOrCampusTxt3 = new JLabel();
        loginBtn = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new Color(255, 255, 255));

        jPanel2.setBackground(new Color(0, 101, 204));

        jLabel1.setFont(new Font("SansSerif", 0, 14)); // NOI18N
        jLabel1.setIcon(new ImageIcon("Inventory Pic.png")); // NOI18N

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(89, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(72, 72, 72))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                .addGap(195, 195, 195))
        );

        slogan1.setFont(new Font("SansSerif", 1, 24)); // NOI18N
        slogan1.setForeground(new Color(0, 102, 255));
        slogan1.setText("Manage your University Equipment ");

        appNameTxt.setFont(new Font("SansSerif", 1, 30)); // NOI18N
        appNameTxt.setForeground(new Color(0, 102, 255));
        appNameTxt.setText("Inventory System");

        slogan2.setFont(new Font("SansSerif", 1, 24)); // NOI18N
        slogan2.setForeground(new Color(0, 102, 255));
        slogan2.setText("with us.");

        jLabel2.setFont(new Font("SansSerif", 0, 14)); // NOI18N
        jLabel2.setForeground(new Color(153, 153, 153));
        jLabel2.setText("Welcome back! Please login to your account.");

        universityOrCampusTxt.setFont(new Font("SansSerif", 0, 14)); // NOI18N
        universityOrCampusTxt.setForeground(new Color(153, 153, 153));
        universityOrCampusTxt.setText("Login as:");

        userComboBox.setFont(new Font("SansSerif", 0, 14)); // NOI18N
        userComboBox.setForeground(new Color(0, 102, 255));
        userComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "Please select...", "Admin", "Control Clerk" }));
        userComboBox.setCursor(new Cursor(Cursor.HAND_CURSOR));

        emailTxt.setFont(new Font("SansSerif", 0, 14)); // NOI18N
        emailTxt.setForeground(new Color(153, 153, 153));
        emailTxt.setText("Email Address*");

        emailTextF.setFont(new Font("SansSerif", 0, 14)); // NOI18N

        passwordTxt.setFont(new Font("SansSerif", 0, 14)); // NOI18N
        passwordTxt.setForeground(new Color(153, 153, 153));
        passwordTxt.setText("Password*");

        passwordTextF.setFont(new Font("SansSerif", 0, 14)); // NOI18N

        universityOrCampusTxt3.setFont(new Font("SansSerif", 0, 14)); // NOI18N
        universityOrCampusTxt3.setForeground(new Color(153, 153, 153));
        universityOrCampusTxt3.setText("Forgot Password?");
        universityOrCampusTxt3.setCursor(new Cursor(Cursor.HAND_CURSOR));

        loginBtn.setBackground(new Color(0, 102, 255));
        loginBtn.setFont(new Font("SansSerif", 0, 14)); // NOI18N
        loginBtn.setForeground(new Color(255, 255, 255));
        loginBtn.setText("Login");
        loginBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        loginBtn.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
                loginBtnMouseEntered(evt);
            }
        });
        loginBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                try {
                    loginBtnActionPerformed(evt);
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(slogan1)
                            .addComponent(slogan2)
                            .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(emailTextF)
                                    .addComponent(passwordTextF)
                                    .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(universityOrCampusTxt3))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 394, GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(universityOrCampusTxt, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(userComboBox, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE))
                                            .addComponent(emailTxt)
                                            .addComponent(passwordTxt))
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(86, 86, 86))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(156, 156, 156)
                                .addComponent(appNameTxt))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(214, 214, 214)
                                .addComponent(loginBtn, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(appNameTxt)
                .addGap(18, 18, 18)
                .addComponent(slogan1)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(slogan2)
                .addGap(49, 49, 49)
                .addComponent(jLabel2)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(universityOrCampusTxt)
                    .addComponent(userComboBox, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addComponent(emailTxt)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailTextF, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(passwordTxt)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordTextF, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(universityOrCampusTxt3)
                .addGap(31, 31, 31)
                .addComponent(loginBtn, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }

    public int getAllClerks() throws IOException, InterruptedException {
        String url = baseURL + "all";
        HttpResponse<String> response = HTTPHepler.sendGet(url);
        String responseBody = response.body();
        controlClerks = new Gson().fromJson(responseBody, ControlClerk[].class);
        return response.statusCode();
    }

    private void loginBtnActionPerformed(ActionEvent evt) throws IOException, InterruptedException {
        CreateClerkForm clerkForm = new CreateClerkForm();

        if(userComboBox.getSelectedItem().equals("Please select...")){
            JOptionPane.showMessageDialog(null, "Please Select User Type");

        }else if(userComboBox.getSelectedItem().equals("Admin")){

            if(emailTextF.getText().equals("admin@cput.ac.za") && String.valueOf(passwordTextF.getPassword()).equals("admin")){
                JOptionPane.showMessageDialog(null, "Login Successfull");
                clerkForm.setVisible(true);
                clerkForm.pack();
                clerkForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                this.dispose();

            }else {
                JOptionPane.showMessageDialog(null, "Login failed");
            }

        }else if(userComboBox.getSelectedItem().equals("Control Clerk")){
            for(int x = 0; x < controlClerks.length; x++){
                clerkEmail = controlClerks[x].getEmailAddress();
                clerkPassword = controlClerks[x].getPassword();

                if(emailTextF.getText().equals(clerkEmail) && String.valueOf(passwordTextF.getPassword()).equals(clerkPassword)){
                    JOptionPane.showMessageDialog(null, "Control Clerk");
                    /*clerkForm.setVisible(true);
                    clerkForm.pack();
                    clerkForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    this.dispose();*/
                    break;

                }else {
                    JOptionPane.showMessageDialog(null, "Login failed");
                    break;
                }
            }
        }
    }

    private void loginBtnMouseEntered(MouseEvent evt) {
        this.loginBtn.setBackground(new Color(0, 101, 183));
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
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new LoginPage().setVisible(true);
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
