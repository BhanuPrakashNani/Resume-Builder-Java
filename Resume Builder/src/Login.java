import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Login extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblResumeBuilder = new JLabel("Resume Builder");
		lblResumeBuilder.setFont(new Font("Dialog", Font.BOLD, 16));
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginPage lp = new LoginPage();
				lp.setVisible(true);
			}
		});
		
		JButton btnSignUp = new JButton("Sign Up");
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SignUp sp = new SignUp();
				sp.setVisible(true);
			}
		});
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("/home/bhanuprakash/Downloads/index.jpeg"));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(86)
					.addComponent(btnLogin)
					.addPreferredGap(ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
					.addComponent(btnSignUp)
					.addGap(66))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(142)
					.addComponent(lblResumeBuilder)
					.addContainerGap(160, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(130)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 159, Short.MAX_VALUE)
					.addGap(151))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblResumeBuilder)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 118, Short.MAX_VALUE)
					.addGap(28)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnSignUp)
						.addComponent(btnLogin))
					.addGap(39))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
