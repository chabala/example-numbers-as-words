import java.util.HashMap;
import java.util.Map;

public class NumbersToWords {

    final Map<Integer, String> nineteenAndBelowMap = new HashMap<>();
    final Map<Integer, String> tensMap = new HashMap<>();

    public NumbersToWords() {
        nineteenAndBelowMap.put(0,"zero");
        nineteenAndBelowMap.put(1,"one");
        nineteenAndBelowMap.put(2,"two");
        nineteenAndBelowMap.put(3,"three");
        nineteenAndBelowMap.put(4,"four");
        nineteenAndBelowMap.put(5,"five");
        nineteenAndBelowMap.put(6,"six");
        nineteenAndBelowMap.put(7,"seven");
        nineteenAndBelowMap.put(8,"eight");
        nineteenAndBelowMap.put(9,"nine");
        nineteenAndBelowMap.put(10,"ten");
        nineteenAndBelowMap.put(11,"eleven");
        nineteenAndBelowMap.put(12,"twelve");
        nineteenAndBelowMap.put(13,"thirteen");
        nineteenAndBelowMap.put(14,"fourteen");
        nineteenAndBelowMap.put(15,"fifteen");
        nineteenAndBelowMap.put(16,"sixteen");
        nineteenAndBelowMap.put(17,"seventeen");
        nineteenAndBelowMap.put(18,"eighteen");
        nineteenAndBelowMap.put(19,"nineteen");
        tensMap.put(1,"ten");
        tensMap.put(2,"twenty");
        tensMap.put(3,"thirty");
        tensMap.put(4,"forty");
        tensMap.put(5,"fifty");
        tensMap.put(6,"sixty");
        tensMap.put(7,"seventy");
        tensMap.put(8,"eighty");
        tensMap.put(9,"ninety");
    }

    public String getNumberAsWords(String inputNumber) {
        return getNumberAsWords(Integer.parseInt(inputNumber));
    }

    public String getNumberAsWords(final int inputNumber) {
        StringBuilder resultBuilder = new StringBuilder();
        int thousandCount = inputNumber / 1000;
        int subThousandRemainder = inputNumber % 1000;
        if (thousandCount > 0) {
            resultBuilder.append(nineteenAndBelowMap.get(thousandCount)).append(" thousand");
        }

        int hundredCount = subThousandRemainder / 100;
        int subHundredRemainder = subThousandRemainder % 100;
        if (hundredCount > 0) {
            if (resultBuilder.length() > 0) {
                resultBuilder.append(" ");
            }
            resultBuilder.append(nineteenAndBelowMap.get(hundredCount)).append(" hundred");
        }

        if (nineteenAndBelowMap.containsKey(subHundredRemainder) && 0 != subHundredRemainder) {
            if (resultBuilder.length() > 0) {
                resultBuilder.append(" ");
            }
            resultBuilder.append(nineteenAndBelowMap.get(subHundredRemainder));
        } else {
            int tensCount = subHundredRemainder / 10;
            int lowerDigit = subHundredRemainder % 10;
            if (tensCount > 0) {
                if (resultBuilder.length() > 0) {
                    resultBuilder.append(" ");
                }
                resultBuilder.append(tensMap.get(tensCount));
            }
            if (lowerDigit != 0 || resultBuilder.length() < 1) {
                if (resultBuilder.length() > 0) {
                    resultBuilder.append(" ");
                }
                resultBuilder.append(nineteenAndBelowMap.get(lowerDigit));
            }
        }

        return resultBuilder.toString();
    }
}
