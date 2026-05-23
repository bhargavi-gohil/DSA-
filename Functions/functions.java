package Functions;
// Block of code! that do specific task...
// used for reusable code, modularity
// easy to debug, read, maintain
// parameters and arguments , function body
// function calling 
// access modifiers --> keywords that determine the visibility  --> 
// return type 

// stack memory -> static variables --> LIFO functions
// Heap memory -> dynamically store variables

// global variable --> can be accessed from anywhere in the class
// local variable --> can be accessed only within the method/block where it is defined
// BLOCK LEVEL SCOPE --> variable defined within a block of code (e.g., if, for, while) is only accessible within that block
// INSTANCE VARIABLE --> non-static variable, belongs to an instance of the class, accessed through object reference


// lexical SCOPE --> where you declare a variable in the code determines where it can be accessed.
// import java.util.*;
public class functions {
    static int num = 10; // global variable
    // public static void add(int num){
    //     System.out.println(functions.num);  // 10
    //     System.out.println(num); // here a-> local variable  -> 6
    // }

    
    public static void main(String[] args) {
        // add(6); 
    }
}
