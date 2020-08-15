import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.SwingConstants;

import java.awt.Font;



public class Calc_1 extends JFrame {
	static int count = 0;
	static int current;
	static int result;
	static int temp=0;
	static boolean minus = false;
	static int check_temp = 0;
	static String screen = new String();
	static boolean initial = true;
	int arr[] = {1,1,1,1,1,1,1,1,1,1};
	
	
	private JPanel contentPane;
	private JTextField textField1;
	private JTextField textField2;
	private JButton buttonOperator1;
	private JButton buttonOperator2;
	private JButton buttonOperator3;
	private JButton buttonOperator4;
	private JButton button0;
	private JButton buttonSpecial2;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JButton button6;
	private JButton button7;
	private JButton button8;
	private JButton button9;
	void visibleAll(){
		buttonOperator1.setVisible(true);
		buttonOperator2.setVisible(true);
		buttonOperator3.setVisible(true);
		buttonOperator4.setVisible(true);
		button0.setVisible(true);
		buttonSpecial2.setVisible(true);
	}
	void disableAll(){
		buttonOperator1.setVisible(false);
		buttonOperator2.setVisible(false);
		buttonOperator3.setVisible(false);
		buttonOperator4.setVisible(false);
		buttonSpecial2.setVisible(false);
	}
	void checkMinus(boolean test){
		if (test){
			arr[count]*=-1;
		}
	}
	void disableNumber(){
		button0.setVisible(false);
		button1.setVisible(false);
		button2.setVisible(false);
		button3.setVisible(false);
		button4.setVisible(false);
		button5.setVisible(false);
		button6.setVisible(false);
		button7.setVisible(false);
		button8.setVisible(false);
		button9.setVisible(false);
	}
	void enableNumber(){
		button0.setVisible(true);
		button1.setVisible(true);
		button2.setVisible(true);
		button3.setVisible(true);
		button4.setVisible(true);
		button5.setVisible(true);
		button6.setVisible(true);
		button7.setVisible(true);
		button8.setVisible(true);
		button9.setVisible(true);
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calc_1 frame = new Calc_1();
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
	public Calc_1() {
		setTitle("Calculator 1.0");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField1 = new JTextField();
		textField1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField1.setEditable(false);
		textField1.setHorizontalAlignment(SwingConstants.RIGHT);
		textField1.setBounds(20, 30, 209, 41);
		contentPane.add(textField1);
		textField1.setColumns(10);
		
		textField2 = new JTextField();
		textField2.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField2.setHorizontalAlignment(SwingConstants.RIGHT);
		textField2.setEditable(false);
		textField2.setColumns(10);
		textField2.setBounds(20, 70, 209, 68);
		contentPane.add(textField2);
		
		JPanel panel = new JPanel();
		panel.setBounds(253, 30, 171, 207);
		contentPane.add(panel);
		panel.setLayout(null);
		
		button1 = new JButton("1");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				initial = false;
				temp = temp*10 + 1;
				visibleAll();
				if (screen == null)
					screen = "1";
				else
					screen += "1";
				textField1.setText(screen);
			}
		});
		button1.setBounds(0, 0, 55, 45);
		panel.add(button1);
		
		button4 = new JButton("4");
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				initial = false;
				temp = temp*10 + 4;
				visibleAll();
				if (screen == null)
					screen = "4";
				else
					screen += "4";
				textField1.setText(screen);
			}
		});
		button4.setBounds(0, 56, 55, 45);
		panel.add(button4);
		
		button7 = new JButton("7");
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				initial = false;
				temp = temp*10 + 7;
				visibleAll();
				if (screen == null)
					screen = "7";
				else
					screen += "7";
				textField1.setText(screen);
			}
		});
		button7.setBounds(0, 106, 55, 45);
		panel.add(button7);
		
		JButton buttonSpecial1 = new JButton(".");
		buttonSpecial1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Coming soon in next version!  This calculator only supports integer number!");
			}
		});
		buttonSpecial1.setBounds(0, 162, 55, 45);
		panel.add(buttonSpecial1);
		
		button2 = new JButton("2");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				initial = false;
				temp = temp*10 + 2;
				visibleAll();
				if (screen == null)
					screen = "2";
				else
					screen += "2";
				textField1.setText(screen);
			}
		});
		button2.setBounds(53, 0, 55, 45);
		panel.add(button2);
		
		button3 = new JButton("3");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				initial = false;
				temp = temp*10 + 3;
				visibleAll();
				if (screen == null)
					screen = "3";
				else
					screen += "3";
				textField1.setText(screen);
			}
		});
		button3.setBounds(107, 0, 55, 45);
		panel.add(button3);
		
		button5 = new JButton("5");
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				initial = false;
				temp = temp*10 + 5;
				visibleAll();
				if (screen == null)
					screen = "5";
				else
					screen += "5";
				textField1.setText(screen);
			}
		});
		button5.setBounds(53, 56, 55, 45);
		panel.add(button5);
		
		button6 = new JButton("6");
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				initial = false;
				temp = temp*10 + 6;
				visibleAll();
				if (screen == null)
					screen = "6";
				else
					screen += "6";
				textField1.setText(screen);
			}
		});
		button6.setBounds(107, 56, 55, 45);
		panel.add(button6);
		
		button8 = new JButton("8");
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				initial = false;
				temp = temp*10 + 8;
				visibleAll();
				if (screen == null)
					screen = "8";
				else
					screen += "8";
				textField1.setText(screen);
			}
		});
		button8.setBounds(53, 106, 55, 45);
		panel.add(button8);
		
		button9 = new JButton("9");
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				initial = false;
				temp = temp*10 + 9;
				visibleAll();
				if (screen == null)
					screen = "9";
				else
					screen += "9";
				textField1.setText(screen);
			}
		});
		button9.setBounds(107, 106, 55, 45);
		panel.add(button9);
		
		button0 = new JButton("0");
		button0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				initial = false;
				temp = temp*10 + 0;
				visibleAll();
				if (screen == null)
					screen = "0";
				else
					screen += "0";
				textField1.setText(screen);
			}
		});
		button0.setBounds(53, 162, 55, 45);
		panel.add(button0);
		
		buttonSpecial2 = new JButton("=");
		buttonSpecial2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				arr[count] *= temp;
				temp = 0;
				checkMinus(minus);
				minus = false;
				for(int i=0; i<=count; i++){
					result+=arr[i];
				}
				String equal = String.valueOf(result);
				textField2.setText(equal);
				buttonSpecial2.setVisible(false);
				disableNumber();
				disableAll();
			}
		});
		buttonSpecial2.setBounds(107, 162, 55, 45);
		panel.add(buttonSpecial2);
		
		buttonOperator1 = new JButton("+");
		buttonOperator1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (initial)
					JOptionPane.showMessageDialog(null, "Press the number first!!!");
				else{
					arr[count] *= temp;
					temp=0;
					checkMinus(minus);
					minus = false;
					count++;
					disableAll();
					screen += " + ";
					textField1.setText(screen);
				}
			}
		});
		buttonOperator1.setBounds(20, 155, 66, 33);
		contentPane.add(buttonOperator1);
		
		buttonOperator2 = new JButton("-");
		buttonOperator2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (initial)
					JOptionPane.showMessageDialog(null, "Press the number first!!!");
				else{
					arr[count] *= temp;
					temp=0;
					checkMinus(minus);
					count++;
					disableAll();
					minus = true;
					screen += " - ";
					textField1.setText(screen);
				}
				
			}
		});
		buttonOperator2.setBounds(96, 155, 66, 33);
		contentPane.add(buttonOperator2);
		
		buttonOperator3 = new JButton("*");
		buttonOperator3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (initial)
					JOptionPane.showMessageDialog(null, "Press the number first!!!");
				else{
					arr[count] *= temp;
					temp = 0;
					disableAll();
					screen += "*";
					textField1.setText(screen);
				}
			}
		});
		buttonOperator3.setBounds(20, 207, 66, 30);
		contentPane.add(buttonOperator3);
		
		buttonOperator4 = new JButton("/");
		buttonOperator4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//disableAll();
				//button0.setVisible(false);
				JOptionPane.showMessageDialog(null, "Coming soon in next version! This calculator only supports integer number!");
			}
		});
		buttonOperator4.setBounds(96, 207, 66, 30);
		contentPane.add(buttonOperator4);
		
		JButton buttonOperator5 = new JButton("Del");
		buttonOperator5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField2.setText(null);
				textField1.setText(null);
				visibleAll();
				for(int i=0; i<10; i++){
					arr[i] = 1;
				}
				count = 0;
				current = 0;
				result = 0;
				temp = 0;
				minus = false;
				screen = null;
				textField1.setText(null);
				enableNumber();
				initial = true;
			}
		});
		buttonOperator5.setBounds(172, 155, 57, 82);
		contentPane.add(buttonOperator5);
	}
}
