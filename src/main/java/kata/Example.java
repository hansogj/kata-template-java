package kata;

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
            case 0 : return "null";
            case 1 : return "en";
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
            case 1 : return "ti";
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

}
