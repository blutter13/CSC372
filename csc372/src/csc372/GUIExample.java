package csc372;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUIExample {
	public static void main(String[] args)
	{
		//Making a frame
		JFrame exampleFrame = new JFrame();
		exampleFrame.setSize(200, 200);
		exampleFrame.setTitle("Example Frame");
		//Making label
		JLabel labelExample = new JLabel("Hello discussion board!");
		//Making panel
		JPanel examplePanel = new JPanel();
		examplePanel.add(labelExample);
		//Adding panel to the frame
		exampleFrame.add(examplePanel);
		exampleFrame.setVisible(true);

	}
}
