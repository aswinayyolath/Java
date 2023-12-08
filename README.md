# Java

## Static Keyword

### Static variable

Static Keyword will make  a varible common to all object (in other words *Static variables are shared by different objects*). Static variable should be called by their class Name, not using their objects.

### Static Method

We cannot directly use a non Static variable inside a Static method

### Super keyword in Java

By default for every constructor, the first statement is super. or every constructor will have a super method. The super() method actually says that call the default constructor of super/base class. Every class in Java extends the `Object class`. `this()` method will call the constructor of the same class.

**Note** : `this()` will execute the constructor of the same class
           `super()` will execute the constructor of the super class

### Encapsulation

Simply means instance/class variables are hidden from outside world by using private keyword! and to access this variable outside of the class in which it is defined, we have to use getters and setters.