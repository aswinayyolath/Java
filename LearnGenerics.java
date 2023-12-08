public class LearnGenerics {
    public static void main(String[] args) {
        Printer<Integer> intObj = new Printer<>(30000);
        intObj.show();

        Printer<Double> doubleObj = new Printer<>(300.456);
        doubleObj.show();

        Printer<String> stringObj = new Printer<>("Hello Aswin");
        stringObj.show();
    }
}

class Printer<T> {
    T thingToPrint;

    public Printer(T thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public void show() {
        System.out.println(thingToPrint);
    }
}