package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Button;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JLabel;

public class ViewAula02 extends JFrame {

	private JPanel contentPane;
	private JTextField txtusername;
	private JTextField txtuserlastname;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewAula02 frame = new ViewAula02();
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
	public ViewAula02() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 632, 531);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton saveuser = new JButton("Save");
		saveuser.setBounds(278, 403, 82, 23);
		saveuser.setBackground(new Color(240, 128, 128));
		saveuser.setFont(new Font("Tahoma", Font.BOLD, 12));
		saveuser.setForeground(Color.ORANGE);
		saveuser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.setLayout(null);
		contentPane.add(saveuser);
		
		Button button = new Button("TKS");
		button.setBounds(336, 69, 95, 31);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		contentPane.add(button);
		
		txtusername = new JTextField();
		txtusername.setBounds(27, 69, 272, 31);
		contentPane.add(txtusername);
		txtusername.setColumns(10);
		
		JLabel txtprimeironome = new JLabel("First Name");
		txtprimeironome.setFont(new Font("Arial", Font.BOLD, 14));
		txtprimeironome.setBounds(27, 35, 95, 23);
		contentPane.add(txtprimeironome);
		
		txtuserlastname = new JTextField();
		txtuserlastname.setColumns(10);
		txtuserlastname.setBounds(27, 145, 272, 31);
		contentPane.add(txtuserlastname);
		
		JLabel txtsegundonome = new JLabel("Last Name");
		txtsegundonome.setFont(new Font("Arial", Font.BOLD, 14));
		txtsegundonome.setBounds(27, 111, 95, 23);
		contentPane.add(txtsegundonome);
		
		JLabel txtresultado = new JLabel("Resultado");
		txtresultado.setHorizontalAlignment(SwingConstants.CENTER);
		txtresultado.setFont(new Font("Arial", Font.PLAIN, 14));
		txtresultado.setBounds(200, 214, 209, 31);
		contentPane.add(txtresultado);
	}
}
