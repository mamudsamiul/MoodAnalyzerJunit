package com.capgemini.mood;

public class MoodAnalyzer {
	private String message;

	public MoodAnalyzer() {
		message="sad";
	}

	public MoodAnalyzer(String message) {
		this.message = message;
	}

	public String analyseMood() {
		if (message.contains("sad"))
			return "SAD";
		else
			return "HAPPY";
	}
	public String analyseMood(String message) {
		try {
			if (message.contains("sad"))
				return "SAD";
			else
				return "HAPPY";
		} catch (Exception e) {
			System.out.println("Exception thrown");
			return "HAPPY";
		}
	}
}
