
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
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.Font;

public class ConverterUI extends JFrame {

	private JPanel contentPane;
	private JTextField input;
	
	private JLabel equals;
	private JTextField result;

	private JButton action;
	private JButton clear;
	private JComboBox unit1;
	private JComboBox unit2;

		

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
		setBounds(100, 100, 667, 78); 
		initComponents();
	}
	private void initComponents(){
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 30, 5));
		setContentPane(contentPane);
		input = new JTextField(10);
		input.setBounds(0, 22, 125, 28);
		input.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == 10){
					actionConvert();
				}
			}
		});
		contentPane.setLayout(null);
		getContentPane().add(input);
		unit1 = new JComboBox();
		unit1.setBounds(120, 24, 125, 27);
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
		equals.setBounds(247, 28, 25, 16);
		getContentPane().add(equals);
		result = new JTextField(10);
		result.setBounds(261, 23, 130, 26);
		result.setEnabled(false);
		getContentPane().add(result);
		unit2 = new JComboBox();
		unit2.setBounds(384, 24, 125, 27);
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
		action.setBounds(501, 23, 97, 29);
		action.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionConvert();
			}
		});
		getContentPane().add(action);
		clear = new JButton("Clear");
		clear.setBounds(589, 23, 76, 29);
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Reset();
			}
		});
		getContentPane().add(clear);
		

		

		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 64, 22);
		JMenu unitType = new JMenu("Unit Type");
		JMenuItem length = new JMenuItem("Length");
		length.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Unit[] unit = UnitType.LENGTH.getUnit(); 
				unit1.removeAllItems();
				unit2.removeAllItems();
				for(Unit u : unit) unit1.addItem(u);
				for(Unit u : unit) unit2.addItem(u);
				
			}
		});
		JMenuItem area = new JMenuItem("Area");
		/**
		 * // remove you combobox
		 * // add your new type combobox
		 */
		area.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// remove you combobox
				// add your new type combobox
				Unit[] unit = UnitType.AREA.getUnit(); 
				unit1.removeAllItems();
				unit2.removeAllItems();
				for(Unit u : unit) unit1.addItem(u);
				for(Unit u : unit) unit2.addItem(u);
			}
		});
		JMenuItem weight = new JMenuItem("Weight");
		weight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Unit[] unit = UnitType.WEIGHT.getUnit(); 
				unit1.removeAllItems();
				unit2.removeAllItems();
				for(Unit u : unit) unit1.addItem(u);
				for(Unit u : unit) unit2.addItem(u);
			}
		});
		JMenuItem volume = new JMenuItem("Volume");
		volume.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Unit[] unit = UnitType.VOLUME.getUnit(); 
				unit1.removeAllItems();
				unit2.removeAllItems();
				for(Unit u : unit) unit1.addItem(u);
				for(Unit u : unit) unit2.addItem(u);
			}
		});
		JMenuItem exit = new JMenuItem("Exit");
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			System.exit(0);
			}
		});
		
		unitType.add(length);
		unitType.add(area);
		unitType.add(weight);
		unitType.add(volume);
		unitType.add(exit);
		unitType.setFont(new Font("Arial Narrow", Font.PLAIN, 13));
		menuBar.add(unitType);
		contentPane.add(menuBar);
		

	}
	

	public void actionConvert(){
		try{
			result.setText(String.valueOf(String.format("%.4f",u.convert(Double.parseDouble(input.getText()), (Unit)unit1.getSelectedItem(), (Unit)unit2.getSelectedItem()))));	
		}catch(NumberFormatException a){
			
		}
	}
	
	
	
	public void Reset(){
		System.out.println("2");
		input.setText("");
		result.setText("");
		
		unit2.setEnabled(true);
	
		unit1.setEnabled(true);
		
	}
}
