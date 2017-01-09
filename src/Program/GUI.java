package Program;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;


/**
* 
* @author  Jae Allen Reyes Nuguid
* @version 1.0
* @since   01-09-2017 
*/



public class GUI extends JFrame {

	private JPanel contentPane;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public GUI() {
		getContentPane().setBackground(new Color(95, 158, 160));
		getContentPane().setLayout(null);
		
		JLabel lblX = new JLabel("X");
		lblX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.exit(1);
			}
		});
		lblX.setForeground(Color.WHITE);
		lblX.setHorizontalAlignment(SwingConstants.CENTER);
		lblX.setToolTipText("CLOSE PROGRAM");
		lblX.setFont(new Font("Calibri", Font.BOLD, 25));
		lblX.setBounds(620, 11, 40, 42);
		getContentPane().add(lblX);
		
		JLabel lblJEncryptionSoftware = new JLabel("J256 Text Encryption Software");
		lblJEncryptionSoftware.setToolTipText("CLOSE PROGRAM");
		lblJEncryptionSoftware.setHorizontalAlignment(SwingConstants.LEFT);
		lblJEncryptionSoftware.setForeground(Color.WHITE);
		lblJEncryptionSoftware.setFont(new Font("Calibri", Font.BOLD, 25));
		lblJEncryptionSoftware.setBounds(10, 11, 327, 42);
		getContentPane().add(lblJEncryptionSoftware);
		
		JLabel lblEncryptAndDecrypt = new JLabel("Encrypt and decrypt text with J256 algorithm");
		lblEncryptAndDecrypt.setToolTipText("CLOSE PROGRAM");
		lblEncryptAndDecrypt.setHorizontalAlignment(SwingConstants.LEFT);
		lblEncryptAndDecrypt.setForeground(Color.WHITE);
		lblEncryptAndDecrypt.setFont(new Font("Calibri", Font.BOLD, 15));
		lblEncryptAndDecrypt.setBounds(10, 80, 327, 42);
		getContentPane().add(lblEncryptAndDecrypt);
		
		JTextArea input = new JTextArea();
		input.setFont(new Font("Monospaced", Font.PLAIN, 22));
		input.setBounds(10, 111, 650, 159);
	
		
		JScrollPane scroll = new JScrollPane (input, 
				   JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		getContentPane().add(scroll);
		scroll.setBounds(10, 111, 650, 159);
		
		JButton btnNewButton = new JButton("Encrypt");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String data=input.getText().trim();
				  if(data.equals("")){
					  JOptionPane.showMessageDialog(null,"Please input a plain text/string!","J256 Text Encryption Software",JOptionPane.INFORMATION_MESSAGE);
						
				  }else if(input.getText().contains("|J|")){
					 JOptionPane.showMessageDialog(null,"Invalid Input!\n\nJ256 cannot be re-encrypted!\n\nIt's encrypted enough!","J256 Text Encryption Software",JOptionPane.ERROR_MESSAGE);
							
				}else{
					Main_Encryption me = new Main_Encryption();
					input.setText(me.Encryption(input.getText()));
				}
				
			}
		});
		btnNewButton.setBackground(new Color(30, 144, 255));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 23));
		btnNewButton.setBounds(294, 281, 178, 38);
		getContentPane().add(btnNewButton);
		
		JButton btnDecrypt = new JButton("Decrypt");
		btnDecrypt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String data=input.getText().trim(); 
				if(data.equals("")){
					  JOptionPane.showMessageDialog(null,"Please input an encrypted text(J256)!","J256 Text Encryption Software",JOptionPane.INFORMATION_MESSAGE);
						
				  }else if(!input.getText().contains("|J|")){
					 JOptionPane.showMessageDialog(null,"Invalid Input!\n\nPlease input an encrypted text(J256)!","J256 Text Encryption Software",JOptionPane.ERROR_MESSAGE);
							
				}else{
					Main_Decryption me = new Main_Decryption();
					input.setText(me.Decryption(input.getText()));
				}
				
			}
		});
		btnDecrypt.setBackground(new Color(128, 0, 0));
		btnDecrypt.setForeground(Color.WHITE);
		btnDecrypt.setFont(new Font("Tahoma", Font.PLAIN, 23));
		btnDecrypt.setBounds(482, 281, 178, 38);
		getContentPane().add(btnDecrypt);
		setUndecorated(true);
		setBackground(SystemColor.textHighlight);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 670, 330);
		setSize(670,330);
		setLocationRelativeTo(null);

	}
}
