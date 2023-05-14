package _02_array_list_guestbook;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Potao implements ActionListener {

	ArrayList<String> names = new ArrayList<String>();
	

	
	JButton button1 = new JButton("Add Name");
	JButton button2 = new JButton("View Names");
	public void Potao()
	{
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		
		frame.setVisible(true);
		frame.add(panel);
		panel.add(button2);
		panel.add(button1);
		button1.resize(100, 100);
		button2.resize(100, 100);
		frame.pack();
		
		names.add("Bob Banders");
		names.add("Sandy Summers");
		names.add("Greg Ganders");
		names.add("Donny Doners");
		
		button1.addActionListener(this);
		button2.addActionListener(this);
		
		
	}


	
	@Override
	public void actionPerformed(ActionEvent i) {
		if(i.getSource() == button1) {
			names.add(JOptionPane.showInputDialog("Type in Name:"));
			
		}
		else if(i.getSource() ==button2) {
			System.out.println("Names in Array:" + names);
		}
		
	}


	

}
