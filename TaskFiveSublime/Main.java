//TaskFive

//4.e Create a client class, Main with a main method. (You will use this class to test the GameMenu class) after the next step.

import java.util.ArrayList;

class Main {
	
	public static void main(String[]args) {


		//4.f In the main method create an ArrayList of type String called actions. Don't forget to import the ArrayList class. Add the following String values to the actions ArrayList:

 ArrayList<String> actions = new ArrayList<>();

        actions.add("Start Game");
        actions.add("Resume Game");
        actions.add("Pause Game");
        actions.add("End Game");



//4.g Still in the main method, instantiate the GameMenu class with the actions reference as an argument to the constructor.

        GameMenu gameMenu = new GameMenu(actions);


//4.i From the main method in Main, test the displayMenu method by calling it on the GameMenu instance created in step 4.g.

        gameMenu.displayMenu();

	}




}