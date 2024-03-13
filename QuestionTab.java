package co;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class QuestionTab extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuestionTab frame = new QuestionTab();
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
	public QuestionTab() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 675, 395);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter your questions");
		lblNewLabel.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 43));
		lblNewLabel.setBounds(205, 11, 270, 43);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField.setBounds(273, 119, 223, 34);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_1.setColumns(10);
		textField_1.setBounds(273, 219, 223, 34);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel_1 = new JLabel("Question 1");
		lblNewLabel_1.setFont(new Font("MingLiU-ExtB", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1.setBounds(150, 126, 113, 23);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Question 2");
		lblNewLabel_2.setFont(new Font("MingLiU-ExtB", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_2.setBounds(150, 230, 113, 23);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(260, 296, 131, 49);
		contentPane.add(btnNewButton);
	}
}
