package javafinal;

import java.awt.*;
import javax.swing.*;

/*
 * The SoupPanel class allows the user to select their soup.
 */

public class SoupPanel extends JPanel
{
	//Indicates the cost of each Soup
	public final double CHOWDER = 3.00;
	public final double SOD = 2.25;
	public final double BEEF_STEW = 2.75;
	
	//Check Boxes
	private JCheckBox chowder; 
	private JCheckBox sod;
	private JCheckBox beefStew;
	
	//Group buttons
	private ButtonGroup bg;
	
	/*
	 * Constructor
	 */
	
	public SoupPanel()
	{
		//Grid Layout
		setLayout(new GridLayout(3,1));
		
		//Create Check Boxes
		chowder = new JCheckBox("Chowder");
		sod = new JCheckBox("Soup of the Day");
		beefStew = new JCheckBox("Beef Stew");
		
		//Border
		setBorder(BorderFactory.createTitledBorder("Soup"));
		
		//Add the Check Boxes
		add(chowder);
		add(sod);
		add(beefStew);
	}
	
	/*
	 * getSoupCost method
	 */
	
	public double getSoupCost()
	{
		//Variable holds the cost of the soup.
		double soupCost = 0.0;
		
		//Determine which soup is selected.
		if(chowder.isSelected())
			soupCost = CHOWDER;
		else if(sod.isSelected())
			soupCost = SOD;
		else if(beefStew.isSelected())
			soupCost = BEEF_STEW;
		
		//Return the cost of soup.
		return soupCost;
	}

}
