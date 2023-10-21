package model;
import java.util.*;
import java.util.regex.*;

public class AnalysisString {
    public HashMap<String, List<Integer>> getNumber(String input) {
        HashMap<String, List<Integer>> result = new LinkedHashMap<>();
        List<Integer> allNumbers = new ArrayList<>();
        List<Integer> evenNumbers = new ArrayList<>();
        List<Integer> oddNumbers = new ArrayList<>();
        List<Integer> squareNumbers = new ArrayList<>();

        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            int number = Integer.parseInt(matcher.group());
            allNumbers.add(number);

            if (number % 2 == 0) {
                evenNumbers.add(number);
            } else {
                oddNumbers.add(number);
            }

            int sqrt = (int) Math.sqrt(number);
            if (sqrt * sqrt == number) {
                squareNumbers.add(number);
            }
        }

        result.put("Perfect Square Numbers", squareNumbers);
        result.put("Odd Numbers", oddNumbers);
        result.put("Even Numbers", evenNumbers);
        result.put("All Numbers", allNumbers);

        return result;
    }

    public HashMap<String, StringBuilder> getCharacter(String input) {
        HashMap<String, StringBuilder> result = new LinkedHashMap<>();
        StringBuilder allCharacters = new StringBuilder();
        StringBuilder uppercaseCharacters = new StringBuilder();
        StringBuilder lowercaseCharacters = new StringBuilder();
        StringBuilder specialCharacters = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                allCharacters.append(c);

                if (Character.isUpperCase(c)) {
                    uppercaseCharacters.append(c);
                } else {
                    lowercaseCharacters.append(c);
                }
            } else if (!Character.isWhitespace(c) && !Character.isDigit(c)) {
                specialCharacters.append(c);
            }
        }

        result.put("Uppercase Characters", uppercaseCharacters);
        result.put("Lowercase Characters", lowercaseCharacters);
        result.put("Special Characters", specialCharacters);
        result.put("All Characters", allCharacters);

        return result;
    }
}