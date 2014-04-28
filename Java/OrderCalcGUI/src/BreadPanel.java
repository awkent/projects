package javafinal;

import java.awt.*;
import javax.swing.*;

/**
 * The BreadPanel allows the user to select which 
 * type of bread they would like their sandwich on.
 * @author Aaron
 *
 */


public class BreadPanel extends JPanel
{
	//The following constants are used to indicate
	//the cost of each type of bread.
	public final double WHITE_BREAD = 1.00;
	public final double WHEAT_BREAD = 1.25;
	public final double RYE_BREAD = 1.50;
	
	//The following variables will reference check boxes for the breads
	private JCheckBox whiteBread;
	private JCheckBox wheatBread;
	private JCheckBox ryeBread;
	
	//Button Group
	private ButtonGroup bg;
	
	/*
	 * Constructor
	 */
	
	public BreadPanel()
	{
		//Grid layout manager
		setLayout(new GridLayout(3,1));
		
		//Create check boxes
		whiteBread = new JCheckBox("White");
		wheatBread = new JCheckBox("Wheat");
		ryeBread = new JCheckBox("Rye");
		
		//Group the check boxes
		bg = new ButtonGroup();
		bg.add(whiteBread);
		bg.add(wheatBread);
		bg.add(ryeBread);
		
		//Border to panel
		setBorder(BorderFactory.createTitledBorder("Bread"));
		
		//Add the check boxes to this panel
		add(whiteBread);
		add(wheatBread);
		add(ryeBread);
		
	}
		
	/*
	 * Bread Cost Method
	 */
	
	public double getBreadCost()
	{
		//Variable holds the cost of selected bread.
		double breadCost = 0.0;
		
		//Determine which bread was selected
		if(whiteBread.isSelected())
			breadCost = WHITE_BREAD;
		else if (wheatBread.isSelected())
			breadCost = WHEAT_BREAD;
		else
			breadCost = RYE_BREAD;
		
		//Return the cost of the bread
		return breadCost;
	}
}
