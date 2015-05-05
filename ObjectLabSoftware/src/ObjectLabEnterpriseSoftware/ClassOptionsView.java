package ObjectLabEnterpriseSoftware;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class ClassOptionsView extends javax.swing.JFrame
{
	private static final String NAME_OF_PAGE = "Class Management";

	public static final String [] arrayOfTowsonDepartments = {"ACCT","AFST","AHLT","AMST","ANTH",
		"ARAB","ARED","ART","ARTH","ASST","ASTR","BCLA","BIOL","BUSX","CDCE","CHEM","CHNS",
		"CIS","CLST","COMM","COSC","CRMJ","DANC","DFST","DVMT","DVRD","DVWR","EBTM","ECED",
		"ECON","ECSE","EDUC","EESE","ELED","EMF","ENGL","ENTR","ENVS","ESOL","FIN","FLPN","FMST",
		"FREN","FRSC","GENL","GEOG","GEOL","GERM","GERO","GRK","HCMN","HEBR","HIST",
		"HLTH","HONR","IDFA","IDHP","IDIS","IDNM","INLA","INST","ISTC","ITAL","ITEC",
		"JPNS","KNES","LAST","LATN","LEGL","LGBT","LWAC","MATH","MBBB","MCOM","MKTG",
		"MNGT","MTRO","MUED","MUSA","MUSC","NURS","OCTH","PHEA","PHIL","PHSC","PHYS",
		"PORT","POSC","PSYC","REED","RLST","RUSS","SCED","SCIE","SOCI","SOSC","SPAN",
		"SPED","SPPA","THEA","WMST","WRIT"};
	/* This should be stored in a file, sorry folks */
	
	private DefaultListModel allClassListModel;
	private DefaultListModel currentClassListModel;
    AdminSettingsView settings;

	private static FileManager inst = null;

	private void updateView()
	{
            if(allClassListModel != null)
                allClassListModel.clear();
            
            if(currentClassListModel != null)
                currentClassListModel.clear();
            
            allClassListModel = UtilController.returnNonCurrentClasses(); /* false */
            currentClassListModel = UtilController.returnCurrentClasses(); /* true */
            allClassList.setModel(allClassListModel);
            currentClassList.setModel(currentClassListModel);
	}

	public void OptionsStart()
	{
		/* Updates tables */
		updateView();
		hideOptions();
		setVisible(true);
	}

	public void hideOptions()
	{
		classNameL.setVisible(false);
		classNumberL.setVisible(false);
		sectionNumberL.setVisible(false);
		className.setVisible(false);
		classNumber.setVisible(false);
		classNumber.setText("");
        classProfessor.setVisible(false);
		classProfessor.setText("");
        classProfessorL.setVisible(false);
		sectionNumber.setVisible(false);
		sectionNumber.setText("");
		cancelBtn.setVisible(false);
		addNewButton.setVisible(false);
	}

	public ClassOptionsView()
	{
        allClassListModel = null;
        currentClassListModel = null;
		inst = new FileManager();
		/* Creates are PendingJobs UI window componet and grabs its data model for our uses */
		initComponents();
        settings = new AdminSettingsView();
		addWindowListener(
                    new WindowAdapter()
                    {
                        @Override
                        public void windowClosing(WindowEvent we)
                        {
                                /* 
                                 If they close the program then close out the window properly 
                                 */
                            if(!"".equals(className.getSelectedValue().toString())||!"".equals(classNumber.getText())||!"".equals(classProfessor.getText())||!"".equals(sectionNumber.getText())){
                                if(JOptionPane.showConfirmDialog(null, "Would you like to discard the class you are adding.", "Warning", JOptionPane.YES_OPTION)==JOptionPane.YES_OPTION){
                                    addNewClass.setVisible(true);
                                    settings.AdminSettingsViewStart();
                                    dispose();
                                }
                            }else{
                                addNewClass.setVisible(true);
                                settings.AdminSettingsViewStart();
                                dispose();
                            }
                        }
                    }
		);
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        addNewClass = new javax.swing.JButton();
        closeBtn = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        allClassList = new javax.swing.JList();
        jScrollPane4 = new javax.swing.JScrollPane();
        currentClassList = new javax.swing.JList();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        addArrow = new javax.swing.JButton();
        removeArrow = new javax.swing.JButton();
        classNumber = new javax.swing.JTextField();
        sectionNumber = new javax.swing.JTextField();
        classNameL = new javax.swing.JLabel();
        classNumberL = new javax.swing.JLabel();
        sectionNumberL = new javax.swing.JLabel();
        addNewButton = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        saveBtn = new javax.swing.JButton();
        classProfessor = new javax.swing.JTextField();
        classProfessorL = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        className = new javax.swing.JList();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        EditMenu = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Art 101-001\nArt 201-002\nArt 401-004\nArt 501-005\nArt 601-006\nArt 701-007\nArt 801-009");
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle(UtilController.getPageName(NAME_OF_PAGE));
        setMinimumSize(new java.awt.Dimension(530, 475));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Add/Remove Classes");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 45, 500, 10));

        addNewClass.setText("Add New Class");
        addNewClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewClassActionPerformed(evt);
            }
        });
        getContentPane().add(addNewClass, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, -1, -1));

        closeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ObjectLabEnterpriseSoftware/images/back_arrow_button.png"))); // NOI18N
        closeBtn.setToolTipText("Back");
        closeBtn.setBorderPainted(false);
        closeBtn.setContentAreaFilled(false);
        closeBtn.setFocusPainted(false);
        closeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBtnActionPerformed(evt);
            }
        });
        getContentPane().add(closeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 40));

        jScrollPane3.setViewportView(allClassList);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 182, 189));

        jScrollPane4.setViewportView(currentClassList);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 185, 190));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Current Classes");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, 129, 19));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Available Classes");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 110, 19));

        addArrow.setText("Add ->");
        addArrow.setPreferredSize(new java.awt.Dimension(60, 23));
        addArrow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addArrowActionPerformed(evt);
            }
        });
        getContentPane().add(addArrow, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 90, -1));

        removeArrow.setText("<- Remove");
        removeArrow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeArrowActionPerformed(evt);
            }
        });
        getContentPane().add(removeArrow, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, -1, -1));
        getContentPane().add(classNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 400, 124, -1));
        getContentPane().add(sectionNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, 124, -1));

        classNameL.setText("Department:");
        getContentPane().add(classNameL, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        classNumberL.setText("Class Number:");
        getContentPane().add(classNumberL, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, -1));

        sectionNumberL.setText("Section Number:");
        getContentPane().add(sectionNumberL, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, -1, -1));

        addNewButton.setText("Add");
        addNewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewButtonActionPerformed(evt);
            }
        });
        getContentPane().add(addNewButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 490, -1, -1));

        cancelBtn.setText("Cancel");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });
        getContentPane().add(cancelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 490, -1, -1));

        saveBtn.setText("Apply Changes");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });
        getContentPane().add(saveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 380, -1, -1));

        classProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classProfessorActionPerformed(evt);
            }
        });
        getContentPane().add(classProfessor, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 460, 120, -1));

        classProfessorL.setText("Professor:");
        getContentPane().add(classProfessorL, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 80, -1));

        className.setModel(new javax.swing.AbstractListModel()
        {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        className.addListSelectionListener(new javax.swing.event.ListSelectionListener()
        {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt)
            {
                classNameValueChanged(evt);
            }
        });
        jScrollPane5.setViewportView(className);
        className.setListData(arrayOfTowsonDepartments);

        getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 130, 90));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ObjectLabEnterpriseSoftware/images/white_bg.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, -26, 540, 550));

        EditMenu.setText("Help");

        jMenuItem1.setText("Contents");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        EditMenu.add(jMenuItem1);

        jMenuBar1.add(EditMenu);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addNewClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewClassActionPerformed
		addNewClass.setVisible(false);
		classNameL.setVisible(true);
		classNumberL.setVisible(true);
		sectionNumberL.setVisible(true);
		className.setVisible(true);
		classNumber.setVisible(true);
        classProfessor.setVisible(true);
        classProfessorL.setVisible(true);
		sectionNumber.setVisible(true);
		cancelBtn.setVisible(true);
		addNewButton.setVisible(true);
		//saves added class to the database in future
    }//GEN-LAST:event_addNewClassActionPerformed

    private void closeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtnActionPerformed
        if(!"".equals(className.getSelectedValue().toString())||!"".equals(classNumber.getText())||!"".equals(classProfessor.getText())||!"".equals(sectionNumber.getText())){
            if(JOptionPane.showConfirmDialog(this, "Would you like to discard the class you are adding.", "Warning", JOptionPane.YES_OPTION)==JOptionPane.YES_OPTION){
                addNewClass.setVisible(true);
                settings.AdminSettingsViewStart();
                dispose();
            }
        }else{
            addNewClass.setVisible(true);
            settings.AdminSettingsViewStart();
            dispose();
        }
    }//GEN-LAST:event_closeBtnActionPerformed

    private void addArrowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addArrowActionPerformed
		if (currentClassListModel.contains(allClassList.getSelectedValue()))
		{
			JOptionPane.showMessageDialog(null, "Class already in current class list",
					"Add Error", JOptionPane.ERROR_MESSAGE);
		} 
		else if(allClassList.getSelectedValue() == null)
		{
			JOptionPane.showMessageDialog(null, "No class selected!",
					"Add Error", JOptionPane.ERROR_MESSAGE);
		}
		else
		{
			currentClassListModel.addElement(allClassList.getSelectedValue());
			allClassListModel.removeElement(allClassList.getSelectedValue());
		}
    }//GEN-LAST:event_addArrowActionPerformed

    private void removeArrowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeArrowActionPerformed
		int i;
		for (i = 0; i < currentClassListModel.getSize(); i++)
		{
			if (currentClassListModel.elementAt(i).equals(currentClassList.getSelectedValue()))
			{
				allClassListModel.addElement(currentClassListModel.elementAt(i));
				currentClassListModel.removeElementAt(i);
			}
		}
    }//GEN-LAST:event_removeArrowActionPerformed

    private void addNewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewButtonActionPerformed
		if (InputValidation.isEmpty(className.getSelectedValue().toString()) | InputValidation.isEmpty(classNumber.getText())
				| InputValidation.isEmpty(sectionNumber.getText()) | InputValidation.isEmpty(classProfessor.getText()))
		{
			JOptionPane.showMessageDialog(null, "Please enter all Class Values",
					"Add Error", JOptionPane.ERROR_MESSAGE);
		} else if (className.getSelectedValue().toString().contains(" ") | classNumber.getText().contains(" ")
				| sectionNumber.getText().contains(" ") | classProfessor.getText().contains(" "))
		{
			JOptionPane.showMessageDialog(null, "Values can only be one word each",
					"Add Error", JOptionPane.ERROR_MESSAGE);
		} else if (!InputValidation.isNumber(classNumber.getText())
				| !InputValidation.isNumber(sectionNumber.getText()))
		{
			JOptionPane.showMessageDialog(null, "Class Number and Section Numbers must "
					+ "contain only numbers",
					"Add Error", JOptionPane.ERROR_MESSAGE);
		} else if (!InputValidation.isAlpha(className.getSelectedValue().toString()) | !InputValidation.isAlpha(classProfessor.getText()))
		{
			JOptionPane.showMessageDialog(null, "Names must only contain letters.",
					"Add Error", JOptionPane.ERROR_MESSAGE);
		} else
		{
			String input = className.getSelectedValue().toString().toUpperCase() + " "
					+ classNumber.getText() + " " + sectionNumber.getText();
			DefaultListModel temp = new DefaultListModel();
			temp.addElement(input);

			if (allClassListModel.contains(temp.elementAt(0)) || currentClassListModel.contains(temp.elementAt(0)))
			{
				JOptionPane.showMessageDialog(null, "Class already in all class list",
						"Add Error", JOptionPane.ERROR_MESSAGE);
			} else
			{
				allClassListModel.addElement(input.toUpperCase());
				UtilController.insertNewClass(className.getSelectedValue().toString().toUpperCase(), classNumber.getText(), sectionNumber.getText(), classProfessor.getText().trim());
			}

			temp.clear();
			hideOptions();
			addNewClass.setVisible(true);
                        updateView();
		}
    }//GEN-LAST:event_addNewButtonActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
		// TODO add your handling code here:
		
		String classSelection = className.getSelectedValue().toString();
			
		if(classSelection != null)
		{
			if(!"".equals(classSelection)||!"".equals(classNumber.getText())||!"".equals(classProfessor.getText())||!"".equals(sectionNumber.getText())){
				if(JOptionPane.showConfirmDialog(this, "Would you like to discard the class you are adding.", "Warning", JOptionPane.YES_OPTION)==JOptionPane.YES_OPTION){
					addNewClass.setVisible(true);
					classNumber.setText("");
					classProfessor.setText("");
					sectionNumber.setText("");
					hideOptions();
				}
			} else{
				addNewClass.setVisible(true);
				hideOptions();
			}
		}
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        ArrayList<String> classes = new ArrayList<>();
        
        for (int i = 0; i < currentClassListModel.getSize(); i++)
            classes.add(currentClassListModel.elementAt(i).toString());
        
        UtilController.updateAvailableClasses(classes);
		settings.AdminSettingsViewStart();
        dispose();
    }//GEN-LAST:event_saveBtnActionPerformed

    private void classProfessorActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_classProfessorActionPerformed
    {//GEN-HEADEREND:event_classProfessorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_classProfessorActionPerformed

    private void classNameValueChanged(javax.swing.event.ListSelectionEvent evt)//GEN-FIRST:event_classNameValueChanged
    {//GEN-HEADEREND:event_classNameValueChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_classNameValueChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu EditMenu;
    private javax.swing.JButton addArrow;
    private javax.swing.JButton addNewButton;
    private javax.swing.JButton addNewClass;
    private javax.swing.JList allClassList;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JList className;
    private javax.swing.JLabel classNameL;
    private javax.swing.JTextField classNumber;
    private javax.swing.JLabel classNumberL;
    private javax.swing.JTextField classProfessor;
    private javax.swing.JLabel classProfessorL;
    private javax.swing.JButton closeBtn;
    private javax.swing.JList currentClassList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList jList1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton removeArrow;
    private javax.swing.JButton saveBtn;
    private javax.swing.JTextField sectionNumber;
    private javax.swing.JLabel sectionNumberL;
    // End of variables declaration//GEN-END:variables
}
