package javafinal;

import javax.swing.*;

/**
 * This Greeting panel is designed to display 
 * a greeting for the application window.
 * @author Aaron
 *
 */

public class GreetingPanel extends JPanel 
{
	/*
	 * Constructor
	 */
	
	public GreetingPanel()
	{
		//Create the label
		JLabel greeting = new JLabel("The Holy Grail Irish Pub Half Sandwich and Soup Menu");
		
		//Add the label to this panel.
		add(greeting);
	}

}
