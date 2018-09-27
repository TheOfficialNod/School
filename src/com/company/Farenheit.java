package com.company;

import javax.swing.JOptionPane;

public class Farenheit
{
	public static void main(String[] args)
	{
		String degreesFahrenheit = JOptionPane.showInputDialog(null, "Enter degrees in farenheit");
		int degreesFahrenheitint = Integer.parseInt(degreesFahrenheit);
		double degreesCelsius = (degreesFahrenheitint - 32) / 1.8;

		JOptionPane.showMessageDialog(null, degreesFahrenheit + " degrees Fahrenheit is equal to " + degreesCelsius + " degrees Celsius");
	}

}