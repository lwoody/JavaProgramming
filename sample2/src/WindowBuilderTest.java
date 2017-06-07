import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WindowBuilderTest extends JFrame {

	private JPanel contentPane;
	JLabel lblNewLabel;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WindowBuilderTest frame = new WindowBuilderTest();
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
	public WindowBuilderTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("new button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				lblNewLabel.setText("fdsafdsafdsa");
				
			}
		});
		btnNewButton.setFont(new Font("±¼¸²", Font.BOLD, 13));
		btnNewButton.setForeground(Color.YELLOW);
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setBounds(146, 229, 135, 23);
		contentPane.add(btnNewButton);
		
		lblNewLabel = new JLabel("no text");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(116, 21, 192, 23);
		contentPane.add(lblNewLabel);
	}
}
