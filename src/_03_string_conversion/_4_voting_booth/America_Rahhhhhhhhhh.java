package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class America_Rahhhhhhhhhh {
public static void main(String[] args) {
	
	String age = JOptionPane.showInputDialog("How old are you?");
	int newAge = Integer.parseInt(age);
	if(newAge>=18) {
		JOptionPane.showInputDialog("Who do you think the next presidant should be?");
		JOptionPane.showConfirmDialog(null, "Nice Choice");
	}else {
		JOptionPane.showMessageDialog(null, "Go away your too young!");
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
}
