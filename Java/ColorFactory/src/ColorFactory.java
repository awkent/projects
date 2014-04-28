package week9;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ColorFactory extends JFrame
{
	public final int WIDTH = 500;
	public final int HEIGHT = 300;
	
	private JPanel topPanel;
	private JPanel bottomPanel;
	private JButton redButton;
	private JButton whiteButton;
	private JButton greenButton;
	private JRadioButton blackButton;
	private JRadioButton yellowButton;
	private JRadioButton blueButton;
	private JLabel message;
	private ButtonGroup radioButtonGroup;
	
	public ColorFactory()
	{
		super("Color Factory"); //Fills title bar.
		setSize(WIDTH, HEIGHT); //Sets the width and height of window JFrame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Allows JFrame to close and terminate.
		setLayout(new BorderLayout()); //BorderLayout Manager
		
		buildTopPanel();
		add(topPanel, BorderLayout.NORTH);
		
		buildBottomPanel();
		add(bottomPanel, BorderLayout.SOUTH);
		
		message = new JLabel("Top buttons change the panel color and the " +
				"bottom radio buttons change text color.");
		
		add(message, BorderLayout.CENTER);
		
	}
	
	//create objects and place in top panel
	private void buildTopPanel()
	{
		topPanel = new JPanel();
		topPanel.setBackground(Color.ORANGE);
		topPanel.setLayout(new FlowLayout());
		
		redButton = new JButton("RED");
		redButton.setBackground(Color.RED);
		redButton.addActionListener(new ButtonListener());
		redButton.setActionCommand("R");
		
		whiteButton = new JButton("WHITE");
		whiteButton.setBackground(Color.WHITE);
		whiteButton.addActionListener(new ButtonListener());
		whiteButton.setActionCommand("W");
		
		greenButton = new JButton("GREEN");
		greenButton.setBackground(Color.GREEN);
		greenButton.addActionListener(new ButtonListener());
		greenButton.setActionCommand("G");
		
		topPanel.add(redButton);
		topPanel.add(whiteButton);
		topPanel.add(greenButton);
	}
	
	private void buildBottomPanel()
	{
		bottomPanel = new JPanel();
		bottomPanel.setBackground(Color.BLACK);
		bottomPanel.setLayout(new FlowLayout());
		
		blackButton = new JRadioButton("BLACK");
		blackButton.setForeground(Color.BLACK);
		blackButton.setBackground(Color.MAGENTA);
		blackButton.addActionListener(new RadioButtonListener());
				
		yellowButton = new JRadioButton("YELLOW");
		yellowButton.setForeground(Color.YELLOW);
		yellowButton.setBackground(Color.MAGENTA);
		yellowButton.addActionListener(new RadioButtonListener());
				
		blueButton = new JRadioButton("BLUE");
		blueButton.setForeground(Color.BLUE);
		blueButton.setBackground(Color.MAGENTA);
		blueButton.addActionListener(new RadioButtonListener());
				
		radioButtonGroup = new ButtonGroup();
		radioButtonGroup.add(blackButton);
		radioButtonGroup.add(yellowButton);
		radioButtonGroup.add(blueButton);
		
		bottomPanel.add(blackButton);
		bottomPanel.add(yellowButton);
		bottomPanel.add(blueButton);
		
	}
	
	private class ButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			//change background color of ColorFactory object's content pane
			//will need to determine which button was clicked and set color accordingly
			String whichButton = event.getActionCommand();
						
			if(whichButton.equals("R"))
			{
				getContentPane().setBackground(Color.RED);
			}
			else if(whichButton.equals("W"))
			{
				getContentPane().setBackground(Color.WHITE);
			}
			else if(whichButton.equals("G"))
			{
				getContentPane().setBackground(Color.GREEN);
			}
		}
	}
	
	private class RadioButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			//Change text to color of the message to match the
			//radio clicked (determined from the event object
			
			if(event.getSource() == blackButton)
			{
				message.setForeground(Color.BLACK);
			}
			else if(event.getSource() == yellowButton)
			{
				message.setForeground(Color.YELLOW);
			}
			else if(event.getSource() == blueButton)
			{
				message.setForeground(Color.BLUE);
			}
		}
	}
	
	public static void main(String[] args)
	{
		ColorFactory app = new ColorFactory();
		app.setVisible(true);
		
	}

}
