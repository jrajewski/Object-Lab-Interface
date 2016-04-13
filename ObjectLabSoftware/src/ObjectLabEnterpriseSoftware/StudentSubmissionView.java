package ObjectLabEnterpriseSoftware;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;

import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class StudentSubmissionView extends javax.swing.JFrame
{
	public StudentSubmissionView() {
	}
    private static final String NAME_OF_PAGE = "Student Submission";
    private static final MainView home = new MainView();
    private String userID;

    public void studentSubmissionStart(String id)
    {
        initComponents();
        hideErrorFields();
        
        /* set valid id passed in from MainView.java as our userID for submitting files... */
		userID = id;
        idOfUser.setText(userID);
        
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Windows".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException |
                javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(StudentSubmissionView.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        addWindowListener(new WindowAdapter()
        {
            @Override
            public void windowClosing(WindowEvent e)
            {
                dispose();
                home.setVisible(true);
            }
        });
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1_FileLocation = new javax.swing.JLabel();
        fileLocation = new javax.swing.JTextField();
        Browse = new javax.swing.JButton();
        projName = new javax.swing.JTextField();
        jLabel5_ProjName = new javax.swing.JLabel();
        jLabel6_Class = new javax.swing.JLabel();
        jLabel7_Printer = new javax.swing.JLabel();
        Student_Submit = new javax.swing.JButton();
        classBox = new javax.swing.JComboBox();
        printerBox = new javax.swing.JComboBox();
        error_NoFileLocationSelected = new javax.swing.JLabel();
        error_NoClassSelected = new javax.swing.JLabel();
        error_NoPrinterSelected = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8_StudentSubmission = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        idOfUser = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        editMenu = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        
        checkBox = new javax.swing.JCheckBox();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle(UtilController.getPageName(NAME_OF_PAGE));
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(java.awt.Color.white);
        setMinimumSize(new java.awt.Dimension(430, 310));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        
        
        
        
        
        

        jLabel1_FileLocation.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel1_FileLocation.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1_FileLocation.setText("File Location:");
        getContentPane().add(jLabel1_FileLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 95, 20));

        fileLocation.setEditable(false);
        fileLocation.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        fileLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileLocationActionPerformed(evt);
            }
        });
        getContentPane().add(fileLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 200, 20));

        Browse.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        Browse.setText("Browse");
        Browse.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Browse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BrowseMouseClicked(evt);
            }
        });
        Browse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrowseActionPerformed(evt);
            }
        });
        getContentPane().add(Browse, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 73, 23));

        projName.setEditable(false);
        projName.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        projName.setName("projName"); // NOI18N
        projName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                projNameActionPerformed(evt);
            }
        });
        getContentPane().add(projName, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 200, -1));

        jLabel5_ProjName.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel5_ProjName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5_ProjName.setText("Project Name:");
        getContentPane().add(jLabel5_ProjName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 95, 20));

        jLabel6_Class.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6_Class.setText("Class:");
        getContentPane().add(jLabel6_Class, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 95, 20));

        jLabel7_Printer.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel7_Printer.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7_Printer.setText("Printer:");
        jLabel7_Printer.setToolTipText("");
        getContentPane().add(jLabel7_Printer, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 95, 20));

        Student_Submit.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        Student_Submit.setText("Submit");
        Student_Submit.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Student_Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Student_SubmitActionPerformed(evt);
            }
        });
        getContentPane().add(Student_Submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, 100, 23));

        classBox.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        classBox.setModel(new javax.swing.DefaultComboBoxModel((String []) UtilController.returnAvailableClasses()));
        classBox.setSelectedItem(null);
        classBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classBoxActionPerformed(evt);
            }
        });
        getContentPane().add(classBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 140, -1));

        printerBox.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        printerBox.setModel(new javax.swing.DefaultComboBoxModel((String []) UtilController.returnAvailableDevicesStudentSubmissionRequired()));
        printerBox.setSelectedItem(null);
        printerBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printerBoxActionPerformed(evt);
            }
        });
        getContentPane().add(printerBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 140, -1));

        error_NoFileLocationSelected.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        error_NoFileLocationSelected.setForeground(new java.awt.Color(255, 0, 0));
        error_NoFileLocationSelected.setText("Error Text");
        getContentPane().add(error_NoFileLocationSelected, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 70, 20));

        error_NoClassSelected.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        error_NoClassSelected.setForeground(new java.awt.Color(255, 0, 0));
        error_NoClassSelected.setText("Error Text");
        getContentPane().add(error_NoClassSelected, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, -1, 20));

        error_NoPrinterSelected.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        error_NoPrinterSelected.setForeground(new java.awt.Color(255, 0, 0));
        error_NoPrinterSelected.setText("Error Text");
        getContentPane().add(error_NoPrinterSelected, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, 70, 20));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 400, 10));

        jLabel8_StudentSubmission.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8_StudentSubmission.setText("Student Submission");
        getContentPane().add(jLabel8_StudentSubmission, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ObjectLabEnterpriseSoftware/images/back_arrow_button.png"))); // NOI18N
        backButton.setFocusPainted(false);
        backButton.setContentAreaFilled(false);
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        getContentPane().add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel1.setText("Your user ID:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 70, 30));

        idOfUser.setEditable(false);
        idOfUser.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        idOfUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idOfUserActionPerformed(evt);
            }
        });
        getContentPane().add(idOfUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 130, 30));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ObjectLabEnterpriseSoftware/images/white_bg.jpg"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 260));

        editMenu.setText("Help");

        jMenuItem1.setText("Contents");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        editMenu.add(jMenuItem1);

        jMenuBar1.add(editMenu);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void hideErrorFields()
    {
        //visibility wasn't an option to set from the beginning.
        error_NoFileLocationSelected.setVisible(false);
        error_NoClassSelected.setVisible(false);
        error_NoPrinterSelected.setVisible(false);
    }

    private boolean errCheck()
    {
        boolean isErr = false;
        hideErrorFields();
        if (fileLocation.getText().isEmpty())
        {
            error_NoFileLocationSelected.setVisible(true);
            error_NoFileLocationSelected.setText("Select a File!");
            isErr = true;
        }

        //End Email Validation
        if (classBox.getSelectedIndex() == -1)
        {
            error_NoClassSelected.setVisible(true);
            error_NoClassSelected.setText("Select Option!");
            isErr = true;
        }

        if (printerBox.getSelectedIndex() == -1)
        {
            error_NoPrinterSelected.setVisible(true);
            error_NoPrinterSelected.setText("Select Option!");
            isErr = true;
        }
        return isErr;
    }

    private void Student_SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Student_SubmitActionPerformed
        /*
         Verifies user and file information is inputted in its entirety
         */
        if (errCheck() == false)
        {
            /* Recieve our input from the UI and hand it off to back end to submit / store file information */
            String fullFilePath, fileName, classText, printer;
            int classFK;
            
            fullFilePath = fileLocation.getText();
            fileName = projName.getText();
            printer = (String) printerBox.getSelectedItem();
            /* parse classBox string and pull out the primary key and store it in an integer */
            classText = (String) classBox.getSelectedItem();
            classFK = (Integer.parseInt(classText.split(" ")[0]));

            UtilController.submitStudentFile(userID, fullFilePath, fileName, printer, classFK);

            JOptionPane.showMessageDialog(new java.awt.Frame(), "Successfully submitted file!");
            dispose();
            new MainView().setVisible(true);
        } else
        {
            dispose();
            Reset_StudentSubmissionFields();
        }
    }

    private void Reset_StudentSubmissionFields()
    {
        setVisible(false);
        fileLocation.setText(null);
        projName.setText(null);
        classBox.setSelectedItem(null);
        printerBox.setSelectedItem(null);
        setVisible(true);
    }//GEN-LAST:event_Student_SubmitActionPerformed

    private void BrowseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BrowseMouseClicked
        //Creates "JFileChooser" file browser
        JFileChooser fileopen = new JFileChooser();
        File desktop = new File(System.getProperty("user.home") + "\\Desktop");
        fileopen.setCurrentDirectory(desktop);
        //in brackets, add Syncthing directory or new Drive's address for default location
        fileopen.setAcceptAllFileFilterUsed(false);
        fileopen.setMultiSelectionEnabled(false);
        //FileNameExtensionFilter filter = new FileNameExtensionFilter("Object Files", "obj", "zpr", "stl");
        //fileopen.setFileFilter(filter);
        int ret = fileopen.showDialog(null, "Open file");

        if (ret == JFileChooser.APPROVE_OPTION)
        {
            File file = fileopen.getSelectedFile();
            //Inputs the file location into the textbox "fileName"
            fileLocation.setText(file.toString().replaceAll("'", ""));
            String projectFileName = file.getName().replaceAll("'", "");
            String finalProjectFileName = projectFileName.replaceAll("(\\.\\S+?$)", UtilController.getCurrentTimeFromDB() + "$1");
            projName.setText(finalProjectFileName);
        }
    }//GEN-LAST:event_BrowseMouseClicked


    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void BrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrowseActionPerformed

    }//GEN-LAST:event_BrowseActionPerformed

    private void printerBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printerBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_printerBoxActionPerformed

    private void classBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_classBoxActionPerformed

    private void fileLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileLocationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fileLocationActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_backButtonActionPerformed
    {//GEN-HEADEREND:event_backButtonActionPerformed
		dispose();
                home.setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void projNameActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_projNameActionPerformed
    {//GEN-HEADEREND:event_projNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_projNameActionPerformed

    private void idOfUserActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_idOfUserActionPerformed
    {//GEN-HEADEREND:event_idOfUserActionPerformed
        
    }//GEN-LAST:event_idOfUserActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Browse;
    private javax.swing.JButton Student_Submit;
    private javax.swing.JButton backButton;
    private javax.swing.JComboBox classBox;
    private javax.swing.JMenu editMenu;
    private javax.swing.JLabel error_NoClassSelected;
    private javax.swing.JLabel error_NoFileLocationSelected;
    private javax.swing.JLabel error_NoPrinterSelected;
    private javax.swing.JTextField fileLocation;
    private javax.swing.JTextField idOfUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel1_FileLocation;
    private javax.swing.JLabel jLabel5_ProjName;
    private javax.swing.JLabel jLabel6_Class;
    private javax.swing.JLabel jLabel7_Printer;
    private javax.swing.JLabel jLabel8_StudentSubmission;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JComboBox printerBox;
    private javax.swing.JTextField projName;
    private javax.swing.JCheckBox checkBox;
    // End of variables declaration//GEN-END:variables
}
