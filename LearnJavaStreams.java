import java.util.Arrays;
import java.util.List;
// import java.util.stream.Stream;

public class LearnJavaStreams {

    public static void main(String[] args) {
        List<Integer> numbIntegers = Arrays.asList(1, 5, 2, 9, 8, 10);
        System.out.println(numbIntegers);

        // Stream<Integer> data = numbIntegers.stream();

        // Code to double all values in a List
        numbIntegers.stream()
                .map(doubledTheValue -> doubledTheValue*2)
                .forEach(element -> System.out.println(element));
        
        // Code to filter odd values in a List, then sort the value, then double the value
        System.out.println("Printing double of sorted odd values");
        numbIntegers.stream()
                .filter(num -> num % 2 == 1)
                .sorted()
                .map(doubledTheValue -> doubledTheValue*2)
                .forEach(element -> System.out.println(element));

        // Take the above list (odd values sorted) then find the sum
        System.out.println("Print Sum of double of sorted odd values ");
        int sum = numbIntegers.stream()
                .filter(odd -> odd % 2 == 1)
                .sorted()
                .map(doubleOdd -> doubleOdd * 2)
                .reduce(0, (a,b) -> a+b);
        System.out.println("Sum = " + sum);

        // for(int number: numbIntegers){
        //     System.out.println(number);
        // }

        // data.forEach(n -> System.out.println(n));

        // System.out.println(data.count());
        // Stream<Integer> sortedData =  data.sorted();
        // sortedData.forEach(sorted -> System.out.println(sorted));

        // Stream <Integer> mappedData = data.map(doubledTheValue -> doubledTheValue * 2);
        // mappedData.forEach(eachElem ->  System.out.println(eachElem));
    }
}