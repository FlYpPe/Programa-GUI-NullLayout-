import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;

class NullLayout extends JFrame {
	public NullLayout() {
		getContentPane().setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Actividad");
		setSize(700, 500);
		setLocationRelativeTo(null);
		setVisible(true);

		JLabel lb1 = new JLabel();
		lb1.setText("The classic forum inclides all visible fields for \n this list");
		lb1.setBounds(10, 5, 350, 15);
		add(lb1);

		JLabel lb2 = new JLabel();
		lb2.setText("Forum options");
		lb2.setBounds(10, 22, 150, 15);
		add(lb2);

		JLabel lb3 = new JLabel();
		lb3.setText("inclde the following");
		lb3.setBounds(10, 38, 350, 15);
		add(lb3);

		JCheckBox cb1 = new JCheckBox();
		cb1.setText("a tde for you forum");
		cb1.setBounds(10, 55, 150, 15);
		add(cb1);

		JTextField susc = new JTextField(10);
		susc.setText("Suscribe to our malling list");
		susc.setBounds(10, 72, 155, 20);
		add(susc);

		ButtonGroup bg1 = new ButtonGroup();
		JRadioButton orf = new JRadioButton("Only required Fields");
		orf.setSelected(true);
		bg1.add(orf);
		orf.setBounds(10,95,140,15);
		add(orf);
		JRadioButton af = new JRadioButton("All fields");
		bg1.add(af);
		af.setBounds(155, 95, 80, 15);
		add(af);
		
		JLabel lb4 =  new JLabel();
		lb4.setText("(edit required fields in the from builder)");
		lb4.setBounds(10, 112,180,15);
		add(lb4);
		
		JCheckBox cb2 = new JCheckBox();
		cb2.setText("Interest group fields");
		cb2.setBounds(10, 129, 200, 15);
		add(cb2);
		
		JCheckBox cb3 = new JCheckBox();
		cb3.setText("Required field indicators");
		cb3.setBounds(10, 146, 200, 15);
		add(cb3);
		
		JLabel lb5 =  new JLabel();
		lb5.setText("Set from width");
		lb5.setBounds(10, 163, 400, 15);
		add(lb5);
		
		JTextField jt2 = new JTextField(10);
		jt2.setBounds(10, 180, 155, 20);
		add(jt2);
		
		JLabel lb6 =  new JLabel();
		lb6.setText("Enchance your form");
		lb6.setBounds(10, 204, 400, 15);
		add(lb6);
		
		JCheckBox cb4 = new JCheckBox();
		cb4.setText("Enable evil poup mode");
		cb4.setBounds(10, 221, 155, 15);
		add(cb4);
		JCheckBox cb5 = new JCheckBox();
		cb5.setText("Disable all java Script");
		cb5.setBounds(10, 238, 155, 15);
		add(cb5);
		JCheckBox cb6 = new JCheckBox();
		cb6.setText("Include archive link");
		cb6.setBounds(10, 255, 155, 15);
		add(cb6);
		JCheckBox cb7 = new JCheckBox();
		cb7.setText("Include MonkeyRewards link");
		cb7.setBounds(10, 272, 200, 15);
		add(cb7);
		

		
		
	

		
		JPanel jp1 = new JPanel();
		jp1.setLayout(null);
		jp1.setBorder(BorderFactory.createTitledBorder(""));
		jp1.setBounds(350, 10, 250, 210);
		
		add(jp1);
		
		JLabel lb7 =  new JLabel();
		lb7.setText("Preview");
		
		lb7.setBounds(10,10,100,15);
		jp1.add(lb7);
		
		
		JLabel lb8 =  new JLabel();
		lb8.setText("Email Adress");
		lb8.setBounds(10,28,100,15);
		jp1.add(lb8);		
		JTextField jt3 = new JTextField(10);
		jp1.add(jt3);
		jt3.setBounds(10,46,100,20);
		
		
		
		
		JLabel lb9 =  new JLabel();
		lb9.setText("First Name");
		jp1.add(lb9);
		lb9.setBounds(10,69,100,20);		
		JTextField jt4 = new JTextField(10);
		jt4.setBounds(10,92,100,20);
		jp1.add(jt4);
		
		
		JLabel lb10 =  new JLabel();
		lb10.setBounds(10,116,100,15);
		lb10.setText("Last Name");
		jp1.add(lb10);
		JTextField jt5 = new JTextField(10);
		jt5.setBounds(10,133,100,20);
		jp1.add(jt5);
		
		JButton jb1 = new JButton(new ImageIcon("C:\\Users\\Felipe\\Desktop\\Tópicos\\Programa GUI [NullLayout]\\src\\01.png"));
		
		jp1.add(jb1);
		jb1.setBounds(10,168,90,30);
		
		JLabel lb11 =  new JLabel();
		lb11.setText("Copy paste onto your site ");
		lb11.setBounds(350, 235, 155, 15);
		add(lb11);
		
		JTextField jt6 = new JTextField(10);
		jt2.setBounds(350, 260, 250, 150);
		add(jt6);
		
		
		
		
		
	}
}

public class PruebaNull {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new NullLayout();
			}
		});

	}

}
