import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileSystemView;
import javax.swing.JFileChooser;

public class FileBrowser extends JFrame {

	private JPanel contentPane;
	private String s;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FileBrowser frame = new FileBrowser();
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
	public FileBrowser() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JFileChooser fileChooser = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
		fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
		int r = fileChooser.showOpenDialog(null);
		if(r == JFileChooser.APPROVE_OPTION) {
			s = fileChooser.getSelectedFile().getAbsolutePath();
			dispose();
		}
		else
		{
			fileChooser.setVisible(false);
			dispose();
		}
		fileChooser.setBounds(12, 0, 548, 326);
		contentPane.add(fileChooser);
		
	}
	public String getS() {
		return s;
	}

}
