package programming.dailypractices.july2026;

public class D02072026 {
    /*
   ================================================================================
        EXERCISE 1: TEMPERATURE LOGGER & METRICS (Arrays & Basic Statistics)
    ================================================================================
    Goal: Practice array manipulation, iterating over collections, and managing basic 
    mathematical loops.

    Your Task: Create a class named 'WeatherTracker':
    1. Attributes: 
        - double[] temperatures (to hold a week's data, e.g., 7 elements)
    2. Constructor: 
        - Takes a double array as an input and assigns it to the class attribute.
    3. Methods:
        - findHighestTemp(): Loops through the array and returns the maximum 
                          temperature found as a double.
        - calculateAverage(): Computes and returns the average temperature.
        - countFreezingDays(): Counts and returns how many days had temperatures 
                            below 0.0 degrees.

    Testing: In your main method, create an array with 7 values (include some 
         negative values like -2.5, 5.0, 12.3, -0.5, etc.), instantiate 
         your WeatherTracker, and print out the highest, average, and freezing 
         day count to the console.
    ================================================================================
    */



/*
================================================================================
EXERCISE 2: VEHICLE FLEET MANAGEMENT (Abstract Classes & Interfaces)
================================================================================
Goal: Practice abstraction. You cannot directly instantiate an abstract class, 
      forcing you to rely on proper inheritance and design structure.

Your Task: Build a robust polymorphic class structure:
  1. Abstract Class (Vehicle):
     - Attributes: String brand, double fuelLevel (0 to 100)
     - Constructor: Initializes brand and fuelLevel.
     - Abstract Method: void accelerate() -> implementation left to subclasses.
     - Regular Method: void refuel() -> sets fuelLevel to 100.0.
  2. Subclass (ElectricCar):
     - Inherits from Vehicle.
     - Override accelerate(): Print "Quietly zooming forward..." and deduct 
                              10 from fuelLevel (acting as battery life).
  3. Subclass (GasTruck):
     - Inherits from Vehicle.
     - Override accelerate(): Print "Engine roaring forward!" and deduct 
                              20 from fuelLevel.

Testing: In your main method, create an array of type Vehicle[] containing both 
         an ElectricCar and a GasTruck. Loop through the array, make each 
         vehicle accelerate, print their remaining fuel/battery, and refuel them.
================================================================================
*/



/*
================================================================================
EXERCISE 3: ROBUST STRING INT-PARSER (Advanced Exception Handling)
================================================================================
Goal: Deepen exception handling skills by safely managing input parsing and 
      tracking sequential processing errors.

Your Task: Create a class named 'DataValidator':
  1. Methods:
     - parseAndSum(String[] textNumbers): 
       * Takes an array of Strings (e.g., {"10", "abc", "25", "5"}).
       * Loops through the array and tries to parse each String into an integer 
         using Integer.parseInt().
       * Use a try-catch block INSIDE the loop. If a String cannot be parsed 
         (throws a NumberFormatException), print a message like: 
         "Skipping invalid element: [element]" and continue to the next one.
       * Sum up all successfully parsed numbers and return the final total.

Testing: In your main method, declare an array of Strings containing a mix of 
         valid numeric strings and invalid letters. Pass it to parseAndSum() 
         and print out the returned sum to verify that your program processed 
         the numbers without crashing on the letters.
================================================================================
*/
}
