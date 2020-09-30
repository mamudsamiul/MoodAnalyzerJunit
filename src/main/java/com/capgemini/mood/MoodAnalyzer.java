package com.capgemini.mood;

public class MoodAnalyzer {
	private String message;

	public MoodAnalyzer() {
	}

	public MoodAnalyzer(String message) {
		this.message = message;
	}

	public String analyseMood(String message) throws MoodAnalyzerException {

		this.message = message;
		return analyseMood();
	}

	public String analyseMood() throws MoodAnalyzerException {
		try {
			if (message.length() == 0)
				throw new MoodAnalyzerException(MoodAnalyzerException.ExceptionType.ENTERED_EMPTY,
						"Please Enter Some Message");

			if (message.contains("Happy"))
				return "HAPPY";
<<<<<<< HEAD
			else
				return "SAD";
		} catch (NullPointerException e) {
			throw new MoodAnalyzerException(MoodAnalyzerException.ExceptionType.ENTERED_NULL, "Enter a Proper Message");
=======
		} catch (Exception e) {
			System.out.println("Exception thrown");
			return "HAPPY";
>>>>>>> 88442baff76617563915d12f31a9da3382caeda1
		}
	}
}
