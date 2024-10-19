//class names should be PascalCase
public class Main{

//    entry point of all java applications
//    main is a method
    public static void main(String[] args) {

//        printing onto the terminal
        System.out.println("Testing my Java Application");


/*
    Multiline comment
    line 1 comment
    line 2 comment
*/

//      declaring a string variable
//        final keyword for constant variables
        final String myFirstVariable = "My First Variable";

//        myFirstVariable = "New Value";

        String mySecondVariable;

        mySecondVariable = "updated value";

        System.out.println(myFirstVariable);

        System.out.println(mySecondVariable);

        char firstInitial = 'A';

//        numbers

//        most used whole number data type
        int myNumber = 2_147_483_647;

//        long is a bigger int
        long myBiggerNumber = 2000000000000000L;

//        these are different
        String myBiggerNumberString = "2_147_483_648_677_676L";



//        fractional numbers

        float myDecimalNumber = 66.5F;

        double myBigDecimal = 66.5;


        System.out.println(myNumber);

        System.out.println(myFirstVariable.charAt(1));

        System.out.println(myFirstVariable.toUpperCase());


        boolean myBool = true;

//        not operator
//        System.out.println(!myBool);

        System.out.println(5==5 && 5<2);

        int favNumber = 12;

//        favNumber = favNumber + 2;
        favNumber+=2;

        System.out.println(favNumber);


        int age = 17;
        if(age <18){
            System.out.println("You are not allowed in the bar");
        }
        else if(age >18 && age<21){
            System.out.println("You are allowed in but cannot consume any drinks");
        }
        else{
            System.out.println("You can go in please be responsible");
        }

        String firstName = "Kathrin";

        String lastName = "Zirbes";

//        string concatenation
        System.out.println(firstName + " " + lastName);


//        modulus operator
//        System.out.println(5%2);

        for(int i =10; i>0;i--){
            System.out.println(i);
        }

//        2. call the method


        omar();

        sayHello("Kai","Berlin");

        System.out.println("Hello");

        String greeting = "Hello";




}

public static void sayHello(String name, String city){
    System.out.println("Hello " + name + " From " + city);
}

// 1. method decleration
public static void omar(){
    System.out.println("Omar first Method for Java Class");
}


}