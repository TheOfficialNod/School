package com.company;

import javax.swing.JOptionPane;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class Klocka
{
	public static void main(String[] args)
	{
		Calendar time = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		String formatedTime = sdf.format(time.getTime());
		JOptionPane.showMessageDialog(null, "The time is " + formatedTime);
	}
}
