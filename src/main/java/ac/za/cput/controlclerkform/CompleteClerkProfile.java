package ac.za.cput.controlclerkform;

import ac.za.cput.entity.generic.University;
import ac.za.cput.entity.user.ControlClerk;
import ac.za.cput.util.HTTPHepler;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.http.HttpResponse;
import javax.swing.*;

/**
 *
 * @author A. Mjeks
 */
public class CompleteClerkProfile extends JFrame {
    // Variables declaration - do not modify
    private JLabel alreadyHaveAccountTxt, alreadyHaveAccountTxt1, backLblBtn,
            jLabel10, jLabel11, jLabel2, jLabel3,jLabel4, jLabel5, jLabel6,
            jLabel8, jLabel9, newControlClerkTxt,
            universityOrCampusTxt, universityOrCampusTxt1, universityOrCampusTxt2,
            universityOrCampusTxt3, universityOrCampusTxt4, jLabel7;
    public JLabel universityLogo;
    private JPanel jPanel1, jPanel2;
    private JTextField addressTxtF, countryTxtF;
    private JPasswordField confPasswTxtF, passwordTxtF;
    private JButton completeProfBtn;
    private String baseURL = "http://localhost:8080/inventory/controlclerk/";
    public String email, name, surname, phoneNum;
    University university;
    // End of variables declaration

    public CompleteClerkProfile() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jPanel1 = new JPanel();
        jPanel2 = new JPanel();
        universityLogo = new JLabel();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        jLabel6 = new JLabel();
        jLabel7 = new JLabel();
        jLabel8 = new JLabel();
        jLabel9 = new JLabel();
        jLabel10 = new JLabel();
        jLabel11 = new JLabel();
        jLabel3 = new JLabel();
        alreadyHaveAccountTxt = new JLabel();
        newControlClerkTxt = new JLabel();
        jLabel2 = new JLabel();
        universityOrCampusTxt = new JLabel();
        completeProfBtn = new JButton();
        universityOrCampusTxt1 = new JLabel();
        universityOrCampusTxt2 = new JLabel();
        universityOrCampusTxt3 = new JLabel();
        backLblBtn = new JLabel();
        alreadyHaveAccountTxt1 = new JLabel();
        universityOrCampusTxt4 = new JLabel();
        passwordTxtF = new JPasswordField();
        confPasswTxtF = new JPasswordField();
        addressTxtF = new JTextField();
        countryTxtF = new JTextField();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new Color(255, 255, 255));

        jPanel2.setBackground(new Color(0, 101, 204));

        universityLogo.setIcon(new ImageIcon("/images/CPUT final.png"));
        universityLogo.setHorizontalTextPosition(SwingConstants.CENTER);

        jLabel4.setFont(new Font("SansSerif", 0, 14));
        jLabel4.setForeground(new Color(255, 255, 255));
        jLabel4.setText("The goal is not to improve one measurement in ");

        jLabel5.setFont(new Font("SansSerif", 0, 14));
        jLabel5.setForeground(new Color(255, 255, 255));
        jLabel5.setText("isolation. The goal is to reduce operational");

        jLabel6.setFont(new Font("SansSerif", 0, 14));
        jLabel6.setForeground(new Color(255, 255, 255));
        jLabel6.setText("expenses & reduce inventories and increase ");

        jLabel7.setFont(new Font("SansSerif", 0, 14));
        jLabel7.setForeground(new Color(255, 255, 255));
        jLabel7.setText("throughput simultaneously.");

        jLabel8.setFont(new Font("SansSerif", 0, 14));
        jLabel8.setForeground(new Color(255, 255, 255));
        jLabel8.setText("Eliyahu M. Goldratt");

        jLabel9.setIcon(new ImageIcon("approval_96px.png"));

        jLabel10.setIcon(new ImageIcon("quote_left_96px.png"));

        jLabel11.setIcon(new ImageIcon("quote.png"));

        jLabel3.setFont(new Font("SansSerif", 1, 28));
        jLabel3.setForeground(new Color(0, 204, 204));
        jLabel3.setText("Inventory Management System");

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabel10)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel7, GroupLayout.PREFERRED_SIZE, 290, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel11)
                                        .addGap(15, 15, 15))))
                            .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 422, GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(universityLogo, GroupLayout.PREFERRED_SIZE, 324, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(universityLogo, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 17, GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel10))
                        .addGap(1, 1, 1)
                        .addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel7, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jLabel11)))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(164, 164, 164))
        );

        alreadyHaveAccountTxt.setFont(new Font("SansSerif", 0, 12));
        alreadyHaveAccountTxt.setForeground(new Color(204, 204, 204));
        alreadyHaveAccountTxt.setText("STEP 03/03");

        newControlClerkTxt.setFont(new Font("SansSerif", 1, 30));
        newControlClerkTxt.setText("Complete Profile!");

        jLabel2.setFont(new Font("SansSerif", 0, 14)); // NOI18N
        jLabel2.setForeground(new Color(153, 153, 153));
        jLabel2.setText("For the purpose of industry revolution, your details                       ");

        universityOrCampusTxt.setFont(new Font("SansSerif", 0, 14));
        universityOrCampusTxt.setForeground(new Color(153, 153, 153));
        universityOrCampusTxt.setText("Create password*");

        completeProfBtn.setBackground(new Color(14, 68, 240));
        completeProfBtn.setFont(new Font("SansSerif", 0, 14));
        completeProfBtn.setForeground(new Color(255, 255, 255));
        completeProfBtn.setText("Register Account");
        completeProfBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        completeProfBtn.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
                completeProfBtnMouseEntered(evt);
            }
        });
        completeProfBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                try {
                    completeProfBtnActionPerformed(evt);
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        universityOrCampusTxt1.setFont(new Font("SansSerif", 0, 14));
        universityOrCampusTxt1.setForeground(new Color(153, 153, 153));
        universityOrCampusTxt1.setText("are required.");

        universityOrCampusTxt2.setFont(new Font("SansSerif", 0, 14));
        universityOrCampusTxt2.setForeground(new Color(153, 153, 153));
        universityOrCampusTxt2.setText("Confirm password*");

        universityOrCampusTxt3.setFont(new Font("SansSerif", 0, 14));
        universityOrCampusTxt3.setForeground(new Color(153, 153, 153));
        universityOrCampusTxt3.setText("Your Address*");

        backLblBtn.setFont(new Font("SansSerif", 1, 12));
        backLblBtn.setForeground(new Color(153, 153, 153));
        backLblBtn.setText("<   Back");
        backLblBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        backLblBtn.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                backLblBtnMouseClicked(evt);
            }
            public void mouseEntered(MouseEvent evt) {
                backLblBtnMouseEntered(evt);
            }
            public void mouseExited(MouseEvent evt) {
                backLblBtnMouseExited(evt);
            }
        });

        alreadyHaveAccountTxt1.setFont(new Font("SansSerif", 0, 12));
        alreadyHaveAccountTxt1.setForeground(new Color(102, 102, 102));
        alreadyHaveAccountTxt1.setText("Residency Info.");

        universityOrCampusTxt4.setFont(new Font("SansSerif", 0, 14));
        universityOrCampusTxt4.setForeground(new Color(153, 153, 153));
        universityOrCampusTxt4.setText("Province of Residence*");

        passwordTxtF.setFont(new Font("SansSerif", 0, 14));

        confPasswTxtF.setFont(new Font("SansSerif", 0, 14));

        addressTxtF.setFont(new Font("SansSerif", 0, 14));

        countryTxtF.setFont(new Font("SansSerif", 0, 14));

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(backLblBtn)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addComponent(alreadyHaveAccountTxt1)
                            .addComponent(alreadyHaveAccountTxt))
                        .addGap(87, 87, 87))
                    .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(universityOrCampusTxt2)
                            .addComponent(universityOrCampusTxt1)
                            .addComponent(newControlClerkTxt)
                            .addComponent(jLabel2)
                            .addComponent(universityOrCampusTxt)
                            .addComponent(universityOrCampusTxt3)
                            .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                .addComponent(confPasswTxtF, GroupLayout.Alignment.LEADING)
                                .addComponent(passwordTxtF, GroupLayout.Alignment.LEADING)
                                .addComponent(universityOrCampusTxt4, GroupLayout.Alignment.LEADING)
                                .addComponent(addressTxtF, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
                                .addComponent(countryTxtF, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)))
                        .addGap(67, 67, 67))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(completeProfBtn, GroupLayout.PREFERRED_SIZE, 401, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(95, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(alreadyHaveAccountTxt)
                        .addGap(9, 9, 9)
                        .addComponent(alreadyHaveAccountTxt1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(backLblBtn)))
                .addGap(42, 42, 42)
                .addComponent(newControlClerkTxt)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(universityOrCampusTxt1)
                .addGap(18, 18, 18)
                .addComponent(universityOrCampusTxt)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordTxtF, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(universityOrCampusTxt2)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(confPasswTxtF, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(universityOrCampusTxt3)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addressTxtF, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(universityOrCampusTxt4)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(countryTxtF, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(completeProfBtn, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
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
    }// </editor-fold>//GEN-END:initComponents

    public int createClerk(ControlClerk controlClerk) throws IOException, InterruptedException {
        String createClerkURL = baseURL + "create";
        ObjectMapper mapper = new ObjectMapper();

        String jsonString = mapper.writeValueAsString(controlClerk);
        HttpResponse<String> response = HTTPHepler.sendPost(createClerkURL, jsonString);
        System.out.println("status code: " + response.statusCode());
        return response.statusCode();
    }

    private void completeProfBtnActionPerformed(ActionEvent evt) throws IOException, InterruptedException {
         String password = String.valueOf(passwordTxtF.getPassword()).trim();
         String confirmPassword = String.valueOf(confPasswTxtF.getPassword()).trim();
         String address = addressTxtF.getText().trim();
         String province = countryTxtF.getText().trim();

        if(password.equals("")){
            JOptionPane.showMessageDialog(null, "Please enter your Password");

        }else if(!(password.equals(confirmPassword))){
             JOptionPane.showMessageDialog(null, "Passwords don't match");

         }else if(address.equals("")){
            JOptionPane.showMessageDialog(null, "Please enter your current address");

        }else if(province.equals("")){
            JOptionPane.showMessageDialog(null, "Please enter your province of residence");

        }else{
             ControlClerk controlClerk = new ControlClerk(university, surname, name, phoneNum, email, address, province, password);

             int result = createClerk(controlClerk);
             if(result == 401){
                 JOptionPane.showMessageDialog(null, "Unauthorized User");

             }else if (result != 200) {
                 JOptionPane.showMessageDialog(null, "Error");

             }else {
                 JOptionPane.showMessageDialog(null, "Success");
                 CreateClerkForm clerkForm = new CreateClerkForm();
                 clerkForm.setVisible(true);
                 clerkForm.pack();
                 clerkForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                 this.dispose();
             }
         }
    }

    private void backLblBtnMouseClicked(MouseEvent evt) {
        RegisterClerk regClerk = new RegisterClerk();
        regClerk.setVisible(true);
        regClerk.jTextField1.setText(this.name);
        regClerk.surnameTxtF.setText(this.surname);
        regClerk.emailTxtF.setText(this.email);
        regClerk.phoneNumTxtF.setText(this.phoneNum);
        regClerk.university = this.university;
        regClerk.universityLogo.setIcon(this.universityLogo.getIcon());
        regClerk.pack();
        regClerk.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }

    private void completeProfBtnMouseEntered(MouseEvent evt) {
        completeProfBtn.setBackground(new Color(0, 101, 183));
    }

    private void backLblBtnMouseEntered(MouseEvent evt) {
        backLblBtn.setForeground(new Color(0, 101, 183));
    }

    private void backLblBtnMouseExited(MouseEvent evt) {
        backLblBtn.setForeground(new Color(153,153,153));
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
            java.util.logging.Logger.getLogger(CompleteClerkProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CompleteClerkProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CompleteClerkProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CompleteClerkProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CompleteClerkProfile().setVisible(true);
            }
        });
    }
}
