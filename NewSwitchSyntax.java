public class NewSwitchSyntax {
    public static void main(String[] args) {
        System.out.println("----Old Switch----");
        // If it's saturday or Sunday I need to wake up at 7
        // If the day is Monday I need to wake up at 6
        // On other days I will wake up at 5


        // old style switch
        String day = "Sunday" ;
        System.out.println("Normal switch!");
        switch(day) {
            case "Monday" : 
                System.out.println("wake up at 7");
                break;
            case "Saturday", "Sunday":
               System.out.println("wake up at 6");
               break;
            default:
               System.out.println("Wake up at 5");
        }

        // New Syntax
        System.out.println("Improved switch!");
        switch (day) {
            case "Monday" -> System.out.println("wake up at 7");
            case "Saturday", "Sunday" -> System.out.println("wake up at 6");
            default -> System.out.println("Wake up at 5");
        }

        // Switch that will return a value
        System.out.println("Switch that will return!");
        String result;

        result = switch (day) {
            case "Monday" -> "wake up at 7";
            case "Saturday", "Sunday" -> "wake up at 6";
            default -> "Wake up at 5";
        };
        System.out.println(result);

        // Switch that will return a value
        System.out.println("Switch that will return and '->' replced with ':' but that needs yield");
        String resultwithYield;

        resultwithYield = switch (day) {
            case "Monday": yield "wake up at 7";
            case "Saturday", "Sunday": yield "wake up at 6";
            default: yield "Wake up at 5";
        };
        System.out.println(resultwithYield);
    }
}
