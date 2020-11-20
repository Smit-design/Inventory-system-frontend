package ac.za.cput.controlclerkform;

import ac.za.cput.entity.generic.University;
import ac.za.cput.loginform.LoginPage;
import ac.za.cput.util.HTTPHepler;
import com.google.gson.Gson;
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
 * @author Athenkosi Mjekula
 */
public class CreateClerkForm extends JFrame {
    // Variables declaration - do not modify
    private JComboBox<String> jComboBox1;
    private JLabel jLabel1, jLabel10, jLabel11, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7, jLabel8,
                    jLabel9, alreadyHaveAccountTxt, newControlClerkTxt, universityOrCampusTxt;
    private JPanel jPanel1, jPanel2;
    public JLabel universityLogo;
    private JButton saveBtn;
    private String baseURL = "http://localhost:8080/university/";
    private String universitySelected;
    University[] universities;
    // End of variables declaration

    public CreateClerkForm() throws IOException, InterruptedException {
        initComponents();
        getAllUniversity();
        loadUniversityComboBox();
    }

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
        jLabel1 = new JLabel();
        newControlClerkTxt = new JLabel();
        jLabel2 = new javax.swing.JLabel();
        universityOrCampusTxt = new JLabel();
        jComboBox1 = new JComboBox<>();
        saveBtn = new JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new Color(255, 255, 255));

        jPanel2.setBackground(new Color(0, 101, 204));

        universityLogo.setIcon(new ImageIcon("Inventory Default Logo.png")); // NOI18N
        universityLogo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel4.setFont(new Font("SansSerif", 0, 14)); // NOI18N
        jLabel4.setForeground(new Color(255, 255, 255));
        jLabel4.setText("The goal is not to improve one measurement in ");

        jLabel5.setFont(new Font("SansSerif", 0, 14)); // NOI18N
        jLabel5.setForeground(new Color(255, 255, 255));
        jLabel5.setText("isolation. The goal is to reduce operational");

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel11)
                                        .addGap(15, 15, 15))))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(universityLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(universityLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel10))
                        .addGap(1, 1, 1)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jLabel11)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(164, 164, 164))
        );

        alreadyHaveAccountTxt.setFont(new Font("SansSerif", 0, 14)); // NOI18N
        alreadyHaveAccountTxt.setForeground(new Color(153, 153, 153));
        alreadyHaveAccountTxt.setText("Already have an Account?");

        jLabel1.setFont(new Font("SansSerif", 0, 14)); // NOI18N
        jLabel1.setForeground(new Color(0, 2, 251));
        jLabel1.setText("Sign In");
        jLabel1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        newControlClerkTxt.setFont(new Font("SansSerif", 1, 30)); // NOI18N
        newControlClerkTxt.setText("Create New Clerk");

        jLabel2.setFont(new Font("SansSerif", 0, 14)); // NOI18N
        jLabel2.setForeground(new Color(153, 153, 153));
        jLabel2.setText("To begin this journey, please select your University");

        universityOrCampusTxt.setFont(new Font("SansSerif", 0, 14)); // NOI18N
        universityOrCampusTxt.setForeground(new Color(153, 153, 153));
        universityOrCampusTxt.setText("University or Campus");

        jComboBox1.setFont(new Font("SansSerif", 0, 14)); // NOI18N
        jComboBox1.setForeground(new Color(153, 153, 153));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Please Select..."}));
        jComboBox1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jComboBox1.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox1PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        saveBtn.setBackground(new Color(14, 68, 240));
        saveBtn.setFont(new Font("SansSerif", 0, 14)); // NOI18N
        saveBtn.setForeground(new Color(255, 255, 255));
        saveBtn.setText("Save & Continue");
        saveBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        saveBtn.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
                saveBtnMouseEntered(evt);
            }
        });
        saveBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 364, Short.MAX_VALUE)
                        .addComponent(alreadyHaveAccountTxt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(newControlClerkTxt)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(universityOrCampusTxt)
                            .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alreadyHaveAccountTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(93, 93, 93)
                .addComponent(newControlClerkTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(86, 86, 86)
                .addComponent(universityOrCampusTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(127, 127, 127)
                .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }

    public void loadUniversityComboBox(){
        for(int x = 0; x < universities.length; x++){
            jComboBox1.addItem(universities[x].getName());
        }
    }

    public int getAllUniversity() throws IOException, InterruptedException {
        String url = baseURL + "all";
        HttpResponse<String> response = HTTPHepler.sendGet(url);
        String responseBody = response.body();
        universities = new Gson().fromJson(responseBody, University[].class);
        return response.statusCode();
    }

    private void saveBtnActionPerformed(ActionEvent evt) {
        for(int x = 0; x < universities.length; x++){
            if (jComboBox1.getSelectedItem().equals("Please Select...")) {
                JOptionPane.showMessageDialog(null, "Please Select University");
                break;

            }else if(jComboBox1.getSelectedItem().equals(universities[x].getName())){
                RegisterClerk regClerk = new RegisterClerk();
                regClerk.setVisible(true);
                regClerk.university = universities[x];
                regClerk.pack();
                regClerk.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                regClerk.universityLogo.setIcon(this.universityLogo.getIcon());
                this.dispose();
            }
        }
    }

    private void jComboBox1PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
         universitySelected = jComboBox1.getSelectedItem().toString();

         if(universitySelected.equals("Please Select...")) {
             universityLogo.setIcon(new ImageIcon("Inventory Default Logo.png"));

         }else if (universitySelected.equalsIgnoreCase("Cape Peninsula University of Technology")
                    || universitySelected.equalsIgnoreCase("CPUT")) {
            universityLogo.setIcon(new ImageIcon("CPUT final.png"));

        } else if (universitySelected.equalsIgnoreCase("University of Western Cape")
                    || universitySelected.equalsIgnoreCase("University of the Western Cape")
                        ||universitySelected.equalsIgnoreCase("UWC")) {
            universityLogo.setIcon(new ImageIcon("UWC Logo.png"));

        } else if (universitySelected.equalsIgnoreCase("University of Cape Town")
                    || universitySelected.equalsIgnoreCase("UCT")) {
            universityLogo.setIcon(new ImageIcon("UCT Logo.png"));

        } else if (universitySelected.equalsIgnoreCase("University of South Africa")
                    || universitySelected.equalsIgnoreCase("UNISA")) {
            universityLogo.setIcon(new ImageIcon("Unisa Logo.png"));

        }
    }

    private void saveBtnMouseEntered(MouseEvent evt) {
        //set jButton background
        saveBtn.setBackground(new Color(0, 101, 183));
    }

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {
        LoginPage loginPage = new LoginPage();
        loginPage.setVisible(true);
        loginPage.pack();
        loginPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }

    /**
     * Main Method
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
            java.util.logging.Logger.getLogger(CreateClerkForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateClerkForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateClerkForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateClerkForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new CreateClerkForm().setVisible(true);
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
