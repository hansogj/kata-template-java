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

    public static String firstPosition(int number)  {
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


}
