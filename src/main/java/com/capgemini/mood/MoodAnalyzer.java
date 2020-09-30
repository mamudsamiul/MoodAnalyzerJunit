package com.capgemini.mood;

public class MoodAnalyzer {
	public String analyseMood(String message) {
		try {
			if (message.contains("sad"))
				return "SAD";
			else
				return "HAPPY";
		} catch (Exception e) {
			System.out.println("Exception thrown");
			return null;
		}
	}
}
