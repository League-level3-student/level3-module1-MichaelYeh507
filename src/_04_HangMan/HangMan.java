package _04_HangMan;
import java.awt.event.*;
import java.util.Stack;
import javax.swing.*;

public class HangMan implements KeyListener{
	
	static Stack<String> words = new Stack<String>();
	static JLabel[] life = new JLabel[5];
	static Utilities wordReader = new Utilities();
	static JFrame frame = new JFrame();
	static JPanel panel = new JPanel();
	static JLabel lives = new JLabel();
	public static void main(String[] args) {
		lives.setText("Lives:");
		panel.add(lives);
		for(int i = 0; i<life.length;i++) {
			life[i] = new JLabel();
			life[i].setText("<3");
			panel.add(life[i]);
		}
		frame.add(panel);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		HangMan startup = new HangMan();
		String userNum = JOptionPane.showInputDialog("Enter a number");
		getWords(Integer.parseInt(userNum));
	}
	public HangMan() {
		frame.addKeyListener(this);
	}
	static void getWords(int numberWords) {
		for(int i = 0; i<numberWords;i++) {
			words.push(wordReader.readRandomLineFromFile("dictionary.txt"));
		}
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
