import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.awt.event.ActionEvent;

public class ResumeUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_10;
	private JTextField textField_14;
	private JLabel lblWorkExperience;
	private JTextField textField_15;
	private JLabel lblCompanyName;
	private JLabel label;
	private JLabel lblDesignation;
	private JLabel lblDesignation_1;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JLabel lblQualifications;
	private JLabel lblCollegeuniversity;
	private JTextField textField_19;
	private JTextField textField_20;
	private JLabel lblSchool;
	private JLabel lblOtherQualifications;
	private JTextField textField_21;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ResumeUI frame = new ResumeUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ResumeUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1500, 1000);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblResume = new JLabel("Resume");
		lblResume.setFont(new Font("Dialog", Font.BOLD, 30));
		
		JLabel lblPersonalInformation = new JLabel("Personal Information");
		lblPersonalInformation.setFont(new Font("Dialog", Font.BOLD, 24));
		
		JLabel lblFirstName = new JLabel("First Name:");
		lblFirstName.setFont(new Font("Dialog", Font.BOLD, 16));
		
		textField = new JTextField();
		textField.setFont(new Font("Dialog", Font.PLAIN, 16));
		textField.setColumns(10);
		
		JLabel lblSurname = new JLabel("Surname:");
		lblSurname.setFont(new Font("Dialog", Font.BOLD, 16));
		
		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setFont(new Font("Dialog", Font.BOLD, 16));
		
		JLabel lblAddress_1 = new JLabel("Address:");
		lblAddress_1.setFont(new Font("Dialog", Font.BOLD, 16));
		
		JLabel lblPincode = new JLabel("Pincode:");
		lblPincode.setFont(new Font("Dialog", Font.BOLD, 16));
		
		JLabel lblNationality = new JLabel("Nationality");
		lblNationality.setFont(new Font("Dialog", Font.BOLD, 16));
		
		JLabel lblDateOfBirth = new JLabel("DOB:");
		lblDateOfBirth.setFont(new Font("Dialog", Font.BOLD, 16));
		
		JLabel lblPhoneNo = new JLabel("Phone No.:");
		lblPhoneNo.setFont(new Font("Dialog", Font.BOLD, 16));
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Dialog", Font.BOLD, 16));
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Dialog", Font.PLAIN, 16));
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Dialog", Font.PLAIN, 16));
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Dialog", Font.PLAIN, 16));
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Dialog", Font.PLAIN, 16));
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Dialog", Font.PLAIN, 16));
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Dialog", Font.PLAIN, 16));
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Dialog", Font.PLAIN, 16));
		textField_8.setColumns(10);
		
		JLabel lblSkills = new JLabel("Skills");
		lblSkills.setFont(new Font("Dialog", Font.BOLD, 24));
		
		textField_9 = new JTextField();
		textField_9.setFont(new Font("Dialog", Font.PLAIN, 22));
		textField_9.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		
		textField_13 = new JTextField();
		textField_13.setFont(new Font("Dialog", Font.PLAIN, 22));
		textField_13.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		
		textField_14 = new JTextField();
		textField_14.setFont(new Font("Dialog", Font.PLAIN, 22));
		textField_14.setColumns(10);
		
		lblWorkExperience = new JLabel("Work Experience");
		lblWorkExperience.setFont(new Font("Dialog", Font.BOLD, 24));
		
		textField_15 = new JTextField();
		textField_15.setFont(new Font("Dialog", Font.PLAIN, 16));
		textField_15.setColumns(10);
		
		lblCompanyName = new JLabel("Company Name:");
		lblCompanyName.setFont(new Font("Dialog", Font.BOLD, 16));
		
		label = new JLabel("Company Name:");
		label.setFont(new Font("Dialog", Font.BOLD, 16));
		
		lblDesignation = new JLabel("Designation:");
		lblDesignation.setFont(new Font("Dialog", Font.BOLD, 16));
		
		lblDesignation_1 = new JLabel("Designation:");
		lblDesignation_1.setFont(new Font("Dialog", Font.BOLD, 16));
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		
		textField_18 = new JTextField();
		textField_18.setFont(new Font("Dialog", Font.PLAIN, 16));
		textField_18.setColumns(10);
		
		lblQualifications = new JLabel("Qualifications");
		lblQualifications.setFont(new Font("Dialog", Font.BOLD, 24));
		
		lblCollegeuniversity = new JLabel("College/University:");
		lblCollegeuniversity.setFont(new Font("Dialog", Font.BOLD, 16));
		
		textField_19 = new JTextField();
		textField_19.setFont(new Font("Dialog", Font.PLAIN, 16));
		textField_19.setColumns(10);
		
		textField_20 = new JTextField();
		textField_20.setFont(new Font("Dialog", Font.PLAIN, 16));
		textField_20.setColumns(10);
		
		lblSchool = new JLabel("School:");
		lblSchool.setFont(new Font("Dialog", Font.BOLD, 16));
		
		lblOtherQualifications = new JLabel("Other Qualifications:");
		lblOtherQualifications.setFont(new Font("Dialog", Font.BOLD, 16));
		
		textField_21 = new JTextField();
		textField_21.setFont(new Font("Dialog", Font.PLAIN, 16));
		textField_21.setColumns(10);
		
		JButton btnSave = new JButton("Save ");
		
		JButton btnCreate = new JButton("Create");
		btnCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FileWriterInput fwi = new FileWriterInput();
				String s = getTextField().getText().toString();
				String s1 = getTextField_1().getText().toString();
				String s2 = getTextField_2().getText().toString();
				String s3 = getTextField_3().getText().toString();
				String s4 = getTextField_4().getText().toString();
				String s5 = getTextField_5().getText().toString();
				String s6 = getTextField_6().getText().toString();
				String s7 = getTextField_7().getText().toString();
				String s8 = getTextField_8().getText().toString();
				String s9 = getTextField_9().getText().toString();
				String s10 = getTextField_10().getText().toString();
				String s11 = getTextField_11().getText().toString();
				String s12 = getTextField_12().getText().toString();
				String s13 = getTextField_13().getText().toString();
				String s14 = getTextField_14().getText().toString();
				String s15 = getTextField_15().getText().toString();
				String s16 = getTextField_16().getText().toString();
				String s17 = getTextField_17().getText().toString();
				String s18 = getTextField_18().getText().toString();
				String s19 = getTextField_19().getText().toString();
				String s20 = getTextField_20().getText().toString();
				String s21 = getTextField_21().getText().toString();
				System.out.println(s1);
				fwi.add(s,s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13,s14,s15,s16,s17,s18,s19,s20,s21);
				
			}
		});
		
		JButton btnDelete = new JButton("Delete");
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("/home/bhanuprakash/Downloads/placeholder-200x200.png"));
		
		JButton btnBrowse = new JButton("Browse");
		btnBrowse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				FileBrowser fb = new FileBrowser();
				fb.setVisible(true);
				fb.dispose();
				if(fb.getS()!=null) {
					lblNewLabel.setIcon(new ImageIcon(fb.getS()));
				}
				else {
					lblNewLabel.setIcon(new ImageIcon("/home/bhanuprakash/Downloads/placeholder-200x200.png"));
				}
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(55)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblEmail, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, 296, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblPhoneNo, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, 296, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblDateOfBirth, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, 296, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblNationality, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, 296, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblPincode, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 296, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblAddress_1, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 296, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblAddress, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 296, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblPersonalInformation)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(lblFirstName)
										.addComponent(lblSurname))
									.addPreferredGap(ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
										.addComponent(textField, GroupLayout.PREFERRED_SIZE, 296, GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 296, GroupLayout.PREFERRED_SIZE))))
							.addPreferredGap(ComponentPlacement.RELATED, 199, Short.MAX_VALUE)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblSkills)
									.addGap(306))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblResume)
									.addGap(679))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblWorkExperience)
									.addGap(346))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
											.addComponent(textField_10, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)
											.addComponent(textField_12, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)
											.addComponent(textField_11, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE))
										.addComponent(lblCompanyName, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)
										.addComponent(label, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblDesignation, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblDesignation_1, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE))
									.addGap(43)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(textField_18, GroupLayout.PREFERRED_SIZE, 436, GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_17, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_16, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_15, GroupLayout.PREFERRED_SIZE, 436, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
											.addComponent(textField_13, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 595, GroupLayout.PREFERRED_SIZE)
											.addComponent(textField_9, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 595, GroupLayout.PREFERRED_SIZE)
											.addComponent(textField_14, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 595, GroupLayout.PREFERRED_SIZE))))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblSchool, GroupLayout.PREFERRED_SIZE, 217, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(textField_19, GroupLayout.PREFERRED_SIZE, 436, GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_20, GroupLayout.PREFERRED_SIZE, 436, GroupLayout.PREFERRED_SIZE)))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblCollegeuniversity, GroupLayout.PREFERRED_SIZE, 217, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
											.addComponent(lblOtherQualifications, GroupLayout.PREFERRED_SIZE, 217, GroupLayout.PREFERRED_SIZE)
											.addComponent(lblQualifications, GroupLayout.PREFERRED_SIZE, 225, GroupLayout.PREFERRED_SIZE)))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textField_21, GroupLayout.PREFERRED_SIZE, 436, GroupLayout.PREFERRED_SIZE)))
							.addGap(128)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 201, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 225, Short.MAX_VALUE)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
									.addComponent(btnCreate, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(btnDelete, GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
									.addComponent(btnSave, GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE))
								.addComponent(btnBrowse, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE))
							.addGap(64))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblResume)
					.addGap(35)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPersonalInformation)
						.addComponent(lblSkills))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(43)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblFirstName)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(34)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblSurname)
								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
							.addGap(29)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblAddress, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(66)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(textField_9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_10, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
							.addGap(39)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(textField_13, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_11, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))))
					.addGap(35)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblAddress_1, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_12, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_14, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(35)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblPincode, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
							.addGap(30)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNationality, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
							.addGap(33)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblDateOfBirth, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
							.addGap(33)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblPhoneNo, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(52)
							.addComponent(lblWorkExperience)
							.addGap(30)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField_15, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblCompanyName, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
							.addGap(39)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblDesignation, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_16, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(28)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblEmail, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
								.addComponent(label, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
							.addGap(44)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblDesignation_1, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblQualifications, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(18)
							.addComponent(textField_18, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(textField_17, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(51)
									.addComponent(btnSave, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(61)
									.addComponent(lblCollegeuniversity, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(45)
									.addComponent(textField_19, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)))
							.addGap(25)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblSchool, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_20, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
									.addGap(32)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblOtherQualifications, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_21, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
									.addGap(45))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(btnBrowse, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(btnDelete, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
									.addGap(23))))
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 222, GroupLayout.PREFERRED_SIZE)
							.addComponent(btnCreate, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}
	public JTextField getTextField() {
		return textField;
	}

	public JTextField getTextField_1() {
		return textField_1;
	}

	public JTextField getTextField_2() {
		return textField_2;
	}

	public JTextField getTextField_3() {
		return textField_3;
	}

	public JTextField getTextField_4() {
		return textField_4;
	}

	public JTextField getTextField_5() {
		return textField_5;
	}

	public JTextField getTextField_6() {
		return textField_6;
	}

	public JTextField getTextField_7() {
		return textField_7;
	}

	public JTextField getTextField_8() {
		return textField_8;
	}

	public JTextField getTextField_9() {
		return textField_9;
	}

	public JTextField getTextField_11() {
		return textField_11;
	}

	public JTextField getTextField_12() {
		return textField_12;
	}

	public JTextField getTextField_13() {
		return textField_13;
	}

	public JTextField getTextField_10() {
		return textField_10;
	}

	public JTextField getTextField_14() {
		return textField_14;
	}

	public JTextField getTextField_15() {
		return textField_15;
	}

	public JTextField getTextField_16() {
		return textField_16;
	}

	public JTextField getTextField_17() {
		return textField_17;
	}

	public JTextField getTextField_18() {
		return textField_18;
	}

	public JTextField getTextField_19() {
		return textField_19;
	}

	public JTextField getTextField_20() {
		return textField_20;
	}

	public JTextField getTextField_21() {
		return textField_21;
	}
	

}
