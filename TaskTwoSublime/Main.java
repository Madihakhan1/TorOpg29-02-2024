//TaskTwo


import java.util.Scanner;



class Main {
//2.a: create a Main class with a main method.

public static void main(String[]args){

//2.b: In the main method start by printing a message to the user: "Please type your name".

System.out.println("Please Type your name");

//2.c: Create a Scanner object for reading the command line (remember to import the Scanner class from the util library: 
Scanner scanner = new Scanner(System.in); 



//2.d: Declare a String variable, name and assign it the content of the scanner's call to nextLine().
String input =  scanner.nextLine();

//2.e: Print the name of the user in a greeting, followed by the message "Please type your age"

System.out.println("Hello " + input); 


//2.f: Declare another variable of type int, age and assign it the value returned by the nextInt method of the Scanner object. (you may reuse the Scanner object created in 2.c).

System.out.println("Hvor gammel er du?");

int age = scanner.nextInt();

System.out.println("Du er " + age + " år gammel");


//2.h: Declare a third variable of type int. To this variable, assign the calculated number of years until the user can retire. You may assume retirement starts at 67 years. Print the result.

int ret = 67 - age;
System.out.println("Du har " + ret + " Indtil du kan gå på pension");









}

}