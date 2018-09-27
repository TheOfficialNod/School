package com.company;

import javax.swing.JOptionPane;

public class Gallons
{
	public static void main(String[] args)
	{
		String milesPerGallon = JOptionPane.showInputDialog(null, "How many miles per gallon do you want to convert");
		int milesPerGallonint = Integer.parseInt(milesPerGallon);
		double literPerKilometer = milesPerGallonint * 0.4251;
		String literPerKilometerstr = String.valueOf(literPerKilometer);

		JOptionPane.showMessageDialog(null, "Your kilometer per litre is: " + literPerKilometerstr);

	}
}
