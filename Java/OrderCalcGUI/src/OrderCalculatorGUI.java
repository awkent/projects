package javafinal;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.text.DecimalFormat;

/*
 * The OrderCalculatorGUI class creates the GUI for 
 * The Holy Grail Irish Pub Half Sandwich and Soup Menu.
 */

public class OrderCalculatorGUI extends JFrame
{
	//Sales Tax Constant
	private final double TAX_RATE = 0.09;
	
	//Variables referencing custom panel objects
	private BreadPanel breads;
	private ToppingPanel toppings;
	private SoupPanel soups;
	private GreetingPanel banner;
	
	//Following variables will reference objects
	//needed to add the Calculate and Exit buttons.
	private JPanel buttonPanel;
	private JButton calcButton;
	private JButton exitButton;
	
	/*
	 * Constructor
	 */
	public OrderCalculatorGUI()
	{
		//Display a title
		super("Order Calculator");
		
		//Specify an action for the close Button.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Create a BorderLayout Manager
		setLayout(new BorderLayout());
		
		//Create the custom Panels.
		banner = new GreetingPanel();
		breads = new BreadPanel();
		toppings = new ToppingPanel();
		soups = new SoupPanel();
		
		//Call the buildButtonPanel Method
		buildButtonPanel();
		
		//Add the components to the current pane.
		add(banner, BorderLayout.NORTH);
		add(breads, BorderLayout.WEST);
		add(toppings, BorderLayout.CENTER);
		add(soups, BorderLayout.EAST);
		add(buttonPanel, BorderLayout.SOUTH);
		
		//Pack the contents of the window and display it.
		pack();
		setVisible(true);

	}
	
	/*
	 * the buildButtonPanel method builds the button panel.
	 */
	
	private void buildButtonPanel()
	{
		//Create a panel for the buttons.
		buttonPanel = new JPanel();
		
		//Create the buttons.
		calcButton = new JButton("Calculate");
		exitButton = new JButton("Exit");
		
		//Register the action listeners.
		calcButton.addActionListener(new CalcButtonListener());
		exitButton.addActionListener(new ExitButtonListener());
		
		//Add the buttons to the button panel.
		buttonPanel.add(calcButton);
		buttonPanel.add(exitButton);
		
	}
	
	/*
	 * Private inner class that handles the event when 
	 * the user clicks the calculate button.
	 */
	
	private class CalcButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			double subtotal;
			double tax;
			double total;
			
			//Calculate the subtotal.
			subtotal = breads.getBreadCost() +
						toppings.getToppingCost() +
						soups.getSoupCost();
			
			//Calculate the sales tax
			tax = subtotal * TAX_RATE;
			
			//Calculate the total.
			total = subtotal + tax;
			
			//Create a DecimalFormat object to format the total as a dollar amount.
			DecimalFormat dollar = new DecimalFormat("0.00");
			
			//Display the charges.
			JOptionPane.showMessageDialog(null, "Subtotal: $" + dollar.format(subtotal) + "\n" +
										  "Tax: $" + dollar.format(tax) + "\n" +
										  "Total: $" + dollar.format(total));
					
		}
					
	}
	
	/*
	 * Private inner class that handles the event when the user clicks the Exit button.
	 */
	private class ExitButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			//Exit the application
			System.exit(0);
		}
	}
	

}
