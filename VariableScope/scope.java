package VariableScope;
class class1{
    static int b = 20; // static variable(class variable)  -> global
    // global variable --> can be accessed from anywhere in the class
    // local variable --> can be accessed only within the method/block where it is defined
// BLOCK LEVEL SCOPE --> variable defined within a block of code (e.g., if, for, while) is only accessible within that block
// INSTANCE VARIABLE --> non-static variable, belongs to an instance of the class, accessed through object reference
// 
}
public class scope {
    public static void main(String[] args) {
        int a = 10; // local variable
        System.out.println(a);
        // System.out.println(b); // Error!! b is not defined in this scope

        // Accessing static variable b from class1    
        System.out.println(class1.b); 
    }
    
}
