package csc372;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/*
 * Benjamin Lutter
 * CSC372 Critical Thinking Assignment 2
 */
public class accountBalance extends JFrame {
	
private JButton balanceButton;
private JButton withdrawButton;
private JButton depositButton;
private JTextField userInput;
private JLabel output;
private double balance;

public accountBalance() {
	JPanel mainPanel = new JPanel();
	output = new JLabel("Enter Balance");
	userInput = new JTextField(20);
	balanceButton = new JButton("Set Balance");
	withdrawButton = new JButton("Withdraw");
	depositButton = new JButton("Deposit");
	//Set actionlisteners for buttons
	balanceButton.addActionListener(new balanceListener());
	withdrawButton.addActionListener(new withdrawListener());
	depositButton.addActionListener(new depositListener());
	
	//add gui elements
	mainPanel.add(userInput);
	mainPanel.add(output);
	mainPanel.add(balanceButton);
	mainPanel.add(withdrawButton);
	mainPanel.add(depositButton);
	//Add our panel to the accountBalance frame
	add(mainPanel);
	//Set window title
	setTitle("Account Balance Manager");	
	
}
//Defining actionListeners for the buttons
private class balanceListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		double balanceAmount = Double.parseDouble(userInput.getText());
		balance = balanceAmount;
		output.setText(Double.toString(balance));
		userInput.setText("");
	}
}
private class depositListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		double depositAmount = Double.parseDouble(userInput.getText());
		balance = balance + depositAmount;
		output.setText(Double.toString(balance));
		userInput.setText("");
		
	}
}
	private class withdrawListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			double withdrawAmount = Double.parseDouble(userInput.getText());
			balance = balance - withdrawAmount;
			output.setText(Double.toString(balance));
			userInput.setText("");
		}	
}



public static void main(String[] args) { 
	//Intantiate an accountBalance frame
	accountBalance mainBalance = new accountBalance();
	mainBalance.setVisible(true);
	mainBalance.pack();
}
}

