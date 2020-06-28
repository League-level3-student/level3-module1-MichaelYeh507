package _01_IntroToArrayLists;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	ArrayList<String> names = new ArrayList<String>();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton addName = new JButton();
	JButton viewName = new JButton();
	public void run() {
		frame.add(panel);
		frame.setVisible(true);
		panel.add(addName);
		panel.add(viewName);
		frame.pack();
		addName.setText("Add a Guest.");
		viewName.setText("View current guests.");
		addName.addActionListener(this);
		viewName.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==addName) {
			String newUser = JOptionPane.showInputDialog("Enter the guest name.");
			names.add(newUser);
		} else {
			for (int i = 0; i < names.size(); i++) {
				String s = names.get(i);
				System.out.println(s);
			}
		}
	}
}
	
