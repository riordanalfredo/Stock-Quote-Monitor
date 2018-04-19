package StockQuoteGUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JSplitPane;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.JCheckBox;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JProgressBar;
import java.awt.Color;

public class MainInterface {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainInterface window = new MainInterface();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainInterface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 235, 205));
		frame.getContentPane().setForeground(new Color(255, 228, 196));
		frame.getContentPane().setFont(new Font("Segoe UI Light", Font.PLAIN, 21));
		frame.setBounds(100, 100, 600, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblSymbolInputex = new JLabel("Symbol Input (ex. ASX): ");
		lblSymbolInputex.setFont(new Font("Segoe UI Light", Font.PLAIN, 21));
		lblSymbolInputex.setBounds(92, 62, 216, 46);
		frame.getContentPane().add(lblSymbolInputex);
		
		textField = new JTextField();
		textField.setBounds(318, 70, 146, 32);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel label = new JLabel("Stock Quote Monitor");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Segoe UI Black", Font.PLAIN, 30));
		label.setBounds(110, 0, 354, 46);
		frame.getContentPane().add(label);
		
		JButton btnSubscribe = new JButton("Subscribe");
		btnSubscribe.setBounds(168, 129, 236, 96);
		frame.getContentPane().add(btnSubscribe);
	}
}
