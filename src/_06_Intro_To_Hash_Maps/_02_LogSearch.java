package _06_Intro_To_Hash_Maps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_LogSearch implements ActionListener {
  /* 
	 * Crate a HashMap of Integers for the keys and Strings for the values.
	 * Create a GUI with three buttons. 
	 * Button 1: Add Entry
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				After an ID is entered, use another input dialog to ask the user to enter a name.
	 * 				Add this information as a new entry to your HashMap.
	 * 
	 * Button 2: Search by ID
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				If that ID exists, display that name to the user.
	 * 				Otherwise, tell the user that that entry does not exist.
	 * 
	 * Button 3: View List
	 * 				When this button is clicked, display the entire list in a message dialog in the following format:
	 * 				ID: 123  Name: Harry Howard
	 * 				ID: 245  Name: Polly Powers
	 * 				ID: 433  Name: Oliver Ortega
	 * 				etc...
	 * 
	 * When this is complete, add a fourth button to your window.
	 * Button 4: Remove Entry
	 * 				When this button is clicked, prompt the user to enter an ID using an input dialog.
	 * 				If this ID exists in the HashMap, remove it. Otherwise, notify the user that the ID
	 * 				is not in the list. 
	 *
	 * */
	
	HashMap<Integer, String> list = new HashMap<Integer, String>();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	JButton addEntry = new JButton();
	JButton search = new JButton();
	JButton view = new JButton();
	JButton remove = new JButton();
	
	public void run() {
		addEntry.setText("Add Entry");
		addEntry.addActionListener(this);
		search.setText("Search by ID"); 
		search.addActionListener(this);
		view.setText("View list");
		view.addActionListener(this);
		remove.setText("Remove");
		remove.addActionListener(this);
		frame.setDefaultCloseOperation(0);
		frame.add(panel);
		panel.add(addEntry);
		panel.add(search);
		panel.add(view);
		panel.add(remove);
		panel.add(label);
		frame.pack();
		frame.setTitle("Log Search");
		frame.setVisible(true);	
	}
	
	
	public static void main(String[] args) {
		_02_LogSearch log = new _02_LogSearch();
		log.run();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if (e.getSource().equals(addEntry)) {
			String idNum = JOptionPane.showInputDialog("Enter an ID number");
			int IdNumber = Integer.parseInt(idNum);
			String name = JOptionPane .showInputDialog("Enter your name");
			list.put(IdNumber, name);
		} else if (e.getSource().equals(search)) {
			String idQ = JOptionPane.showInputDialog("Search for an ID:");
			int idQInt = Integer.parseInt(idQ);
			if (list.containsKey(idQInt)) {
			JOptionPane.showMessageDialog(null, list.get(idQInt));
			} else {
				JOptionPane.showMessageDialog(null, "Entry does not exist");
			}
		} else if(e.getSource()== remove) {
			String Detect = JOptionPane.showInputDialog("Enter an ID number");
			int detect = Integer.parseInt(Detect);
			if (list.containsKey(detect)) {
				list.remove(detect);
				JOptionPane.showMessageDialog(null, "Entry removed");
			} else {
				JOptionPane.showMessageDialog(null, "Entry does not exist");
			}		
		} else if (e.getSource() == view) {
			String output = "";
			for (int key : list.keySet()) {
				output += "ID: " + key + " Name: " + list.get(key) + "\n";
			JOptionPane.showMessageDialog(null, output);
			}
		}
	}
}
