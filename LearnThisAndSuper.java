/*
 * All classes in java extends Object class, example in the below case
 * This is what actually happens  class BaseClass extends Object
 */
class BaseClass {
    public BaseClass() { // This is an example of default constructor
        System.out.println("in Baseclass");
    }

    public BaseClass(int n) {
        System.out.println("in BaseClass int");
    }
}

class SubClass extends BaseClass {
    public SubClass() {
        System.out.println("in SubClass");
    }

    public SubClass(int n) {
        this();
        System.out.println("In SubClass int");
    }
}

public class LearnThisAndSuper {
    public static void main(String[] args) {
        // SubClass obj = new SubClass();
        new SubClass(5); // I don't need to do anything with this object for now , This is called
                         // Anonymous object
    }

}
