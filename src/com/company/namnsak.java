package com.company;

import javax.swing.JOptionPane;

public class namnsak
{
	public static void main(String[] args){
		String name = JOptionPane.showInputDialog(null, "Enter your name");
		String nameUpper = name.toUpperCase();
		JOptionPane.showMessageDialog(null, "Hello " + nameUpper + '.');
	}
}
// This Program is done