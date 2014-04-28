package javafinal;

import java.awt.*;
import javax.swing.*;

/**
 * ToppingPanel is used to allow the user to select sandwich toppings
 * @author Aaron
 *
 */

public class ToppingPanel extends JPanel
{
	//Constants are used to indicate the cost of toppings.
	public final double ROAST_BEEF = 1.50;
	public final double TURKEY = 1.00;
	public final double CORNED_BEEF = 1.25;
	public final double MUSTARD = 0.00;
	public final double MAYO = 0.00;
	public final double LETTUCE = 0.25;
	public final double TOMATO = .25;
	public final double PICKLES = 0.25;
	public final double ONIONS = 0.25;
	public final double PROVALONE_CHEESE = 1.00;
	public final double SWISS_CHEESE = 1.00;
	public final double CHEDDAR_CHEESE = 1.00;
	
	//Check Boxes for toppings.
	private JCheckBox roastBeef;
	private JCheckBox turkey;
	private JCheckBox cornedBeef;
	private JCheckBox mustard;
	private JCheckBox mayo;
	private JCheckBox lettuce;
	private JCheckBox tomato;
	private JCheckBox pickles;
	private JCheckBox onions;
	private JCheckBox provaloneCheese;
	private JCheckBox swissCheese;
	private JCheckBox cheddarCheese;
	
	/*
	 * COnstructor
	 */
	public ToppingPanel()
	{
		//Gridlayout
		setLayout(new GridLayout(12,1));
		
		//Create Check Boxes
		roastBeef = new JCheckBox("Roast Beef");
		turkey = new JCheckBox("Turkey");
		cornedBeef = new JCheckBox("Corned Beef");
		mustard = new JCheckBox("Mustard");
		mayo = new JCheckBox("Mayo");
		lettuce = new JCheckBox("Lettuce");
		tomato = new JCheckBox("Tomato");
		pickles = new JCheckBox("Pickles");
		onions = new JCheckBox("Onions");
		provaloneCheese = new JCheckBox("Provalone");
		swissCheese = new JCheckBox("Swiss");
		cheddarCheese = new JCheckBox("Cheddar");
		
		//Border
		setBorder(BorderFactory.createTitledBorder("Toppings"));
		
		//Add Check Boxes
		add(roastBeef);
		add(turkey);
		add(cornedBeef);
		add(mustard);
		add(mayo);
		add(lettuce);
		add(tomato);
		add(pickles);
		add(onions);
		add(provaloneCheese);
		add(swissCheese);
		add(cheddarCheese);
		
	}
	
	/*
	 * getToppingCost method returns the cost of the selected toppings
	 */
	public double getToppingCost()
	{
		//Variable holds the cost of the selected topping.
		double toppingCost = 0.0;
		
		//Determine which toppings are selected.
		//More than one may be selected.
		if(roastBeef.isSelected())
			toppingCost += ROAST_BEEF;
		if(turkey.isSelected())
			toppingCost += TURKEY;
		if(cornedBeef.isSelected())
			toppingCost += CORNED_BEEF;
		if(mustard.isSelected())
			toppingCost += MUSTARD;
		if(mayo.isSelected())
			toppingCost += MAYO;
		if(lettuce.isSelected())
			toppingCost += LETTUCE;
		if(tomato.isSelected())
			toppingCost += TOMATO;
		if(pickles.isSelected())
			toppingCost += PICKLES;
		if(onions.isSelected())
			toppingCost += ONIONS;
		if(provaloneCheese.isSelected())
			toppingCost += PROVALONE_CHEESE;
		if(swissCheese.isSelected())
			toppingCost += SWISS_CHEESE;
		if(cheddarCheese.isSelected())
			toppingCost += CHEDDAR_CHEESE;
		
		//Return the toppings cost.
		return toppingCost;
		
	}



}
