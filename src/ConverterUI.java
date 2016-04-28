import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ConverterUI extends JFrame {

	private JPanel contentPane;
	private JTextField input;
	
	private JLabel equals;
	private JTextField result;

	private JButton action;
	private JButton clear;
	private JComboBox unit1;
	private JComboBox unit2;
	private JRadioButton left;
	private JRadioButton right;
	private JPanel contentPane2;
	
	UnitConverter u = new UnitConverter();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConverterUI frame = new ConverterUI();
					frame.setTitle("Distance Converter");
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
	public ConverterUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 100);


		initComponents();
	}
	private void initComponents(){
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 30, 5));
		setContentPane(contentPane);
		input = new JTextField(10);
		input.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == 10){
					actionConvert();
				}
			}
		});
		contentPane.setLayout(new FlowLayout());
		getContentPane().add(input);
		unit1 = new JComboBox(u.getUnit());
		unit1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == 10){
					actionConvert();
				}
			}
		});
		getContentPane().add(unit1);
		equals = new JLabel("=");
		getContentPane().add(equals);
		result = new JTextField(10);
		result.setEnabled(false);
		getContentPane().add(result);
		unit2 = new JComboBox(u.getUnit());
		unit2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == 10){
					actionConvert();
				}
			}
		});
		getContentPane().add(unit2);
		action = new JButton("Convert!");
		action.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionConvert();
			}
		});
		getContentPane().add(action);
		clear = new JButton("Clear");
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Reset();
			}
		});
		getContentPane().add(clear);
		this.pack();

		
		left = new JRadioButton("Left->Right");
		right = new JRadioButton("Right->Left");
		
		left.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				right.setSelected(false);
				unit2.setEnabled(false);
				unit1.setEnabled(true);
			}
		});
		

		right.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				left.setSelected(false);
				unit1.setEnabled(false);
				unit2.setEnabled(true);
			}
		});
		
		getContentPane().add(left);
		getContentPane().add(right);
		

	}
	public void actionConvert(){
		try{
			result.setText(String.valueOf(String.format("%.3f",u.convert(Double.parseDouble(input.getText()), (Length)unit1.getSelectedItem(), (Length)unit2.getSelectedItem()))));	
			
		}catch(NumberFormatException a){
			
		}
	}
	
	public void Reset(){
		input.setText("");
		result.setText("");
		right.setEnabled(true);
		unit2.setEnabled(true);
		left.setEnabled(true);
		unit1.setEnabled(true);
		left.setSelected(false);
		right.setSelected(false);
	}

}
