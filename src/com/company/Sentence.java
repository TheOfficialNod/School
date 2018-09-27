package com.company;

import javax.swing.JOptionPane;

public class Sentence
{

	public static void main(String[] args)
	{
		String sentence = JOptionPane.showInputDialog("Enter a sentence");
		String[] splitInput = sentence.split(" ");
		String trimmedSentence = sentence.trim();
		int last = sentence.lastIndexOf(' ') + 1;
		int length = GetLength(trimmedSentence);
		String firstWord = splitInput[0];

		String lastWord = trimmedSentence.substring(last, length);

		if (!sentence.contains(" "))
		{
			JOptionPane.showMessageDialog(null, "You did not enter a sentence");
		}
		else if (trimmedSentence.length() > 200)
		{
			JOptionPane.showMessageDialog(null, "That sentence is to long for your own good");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "You wrote a text with " + length + " characters\n The first word was " + '"' + firstWord + '"' + "\n The last word was " + '"' + lastWord + '"');
		}
	}

	private static int GetLength(String s)
	{
		return s.length();
	}
}