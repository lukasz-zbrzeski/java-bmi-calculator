package com.example.bmicalculator;

public class BmiCalculator {
    private static String calculateBmi(int height, double weight) {
        final double countBmi = (weight / Math.pow(height, 2)) * 10000;
        String outputText = "\nYour BMI is: " + countBmi;

        if (countBmi < 18.5) {
            return "Underweight" + outputText;
        } else if (countBmi > 18.5 && countBmi < 24.9) {
            return "Healthy" + outputText;
        } else if (countBmi > 25 && countBmi < 30) {
            return "Overweight" + outputText;
        } else if (countBmi > 30) {
            return "Obese" + outputText;
        }
        return "";
    }
}
