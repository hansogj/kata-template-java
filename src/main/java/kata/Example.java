package kata;

import java.util.ArrayList;
import java.util.List;

public final class Example {

    private Example() { }

    public static int sum(final int... numbersTosum) {
        int result = 0;
        for (int number : numbersTosum) {
            result += number;
        }
        return result;
    }


    public static String simpleValue(int number) {
        switch (number) {
            case 0 : return "";
            case 1 : return "ett";
            case 2 : return "to";
            case 3 : return "tre";
            case 4 : return "fire";
            case 5 : return "fem";
            case 6 : return "seks";
            case 7 : return "sju";
            case 8 : return "åtte";
            case 9 : return "ni";
            default : return "";
        }
    }

    public static String firstPosition(int number)  {
        return simpleValue(number);
    }

    public static String secondPosition(int number) {
        switch (number) {
            case 0 : return "";
            case 1 : return "";
            case 2 : return "tjue";
            case 3 : return "tretti";
            case 4 : return "førti";
            case 5 : return "femti";
            case 6 : return "seksti";
            case 7 : return "sytti";
            case 8 : return "åtti";
            case 9 : return "nitti";
            default : return simpleValue(number) + "ti";
        }
    }

    public static String elevenToNineteen(int number) {
        switch (number) {
            case 0 : return "ti";
            case 1 : return "elleve";
            case 2 : return "tolv";
            case 3 : return "tretten";
            case 4 : return "fjorten";
            case 5 : return "femten";
            case 6 : return "seksten";
            case 7 : return "sytten";
            case 8 : return "atten";
            case 9 : return "nitten";
            default : return simpleValue(number) + "ti";
        }
    }

    public static String getPosition(int pos) {
        switch (pos) {
            case 3 : return "hundre";
            case 4 : return "tusen";
            case 6 : return "hundretusen";
            case 7 : return "million";
            default : return "";
        }

    }

    public static List<Integer> splitDigits(int number) {
        List<Integer> digits = new ArrayList<Integer>();
        while(number > 0) {
            digits.add(number % 10);
            number /= 10;
        }
        return digits;
    }

    public static String combineDigitAndPostion(int number, int position) {
        String result = "";
        switch (position) {
           case 1: result =  firstPosition(number); break;
           case 2: result =  secondPosition(number); break;
           case 3: result =  firstPosition(number) + getPosition(position); break;
           case 4: result =  firstPosition(number) + getPosition(position); break;
           case 5: result =  secondPosition(number) + getPosition(position-1);break;
           case 6: result =  firstPosition(number) + getPosition(position); break;

           default: return "";
       }
        result = result.replaceAll("ttt", "tt");
        return result;
    }

    public static String getNumberAsString(int number) {
        if (number == 0) {
            return "null";
        }
        List<Integer> integerList = splitDigits(number);
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<integerList.size(); i++) {
            if (i == 1 && integerList.get(i) == 1 && integerList.size() >= 2) {
                sb = new StringBuilder();
                sb.insert(0, elevenToNineteen(integerList.get(i-1)));
            }
            else {
                sb.insert(0, combineDigitAndPostion(integerList.get(i), i+1));
            }
        }

        return sb.toString();
    }



}
