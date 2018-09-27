package com.company;

import javax.swing.JOptionPane;
import java.math.*;
import java.util.*;

public class Countsphere
{
	public static void main(String[] args)
	{
		String userInput = JOptionPane.showInputDialog(null, "Enter diameter of your sphere");
		int userInteger = Integer.parseInt(userInput);
		int sphereRadius = userInteger / 2;
		double sphereDouble = Math.pow(sphereRadius, 3);
		double sphereTothepoweroftwo = Math.pow(sphereRadius, 2);

		double sphereVolume = 4 * 3.14 * sphereDouble / 3;
		double sphereArea = 4 * 3.14 * sphereTothepoweroftwo;

		String sphereAreastr = String.valueOf(sphereArea);
		String sphereVolumestr = String.valueOf(sphereVolume);

		JOptionPane.showMessageDialog(null, "The Area of your sphere is\n" + sphereAreastr + "\nThe Volume of your sphere is\n" + sphereVolumestr);

	}
}
