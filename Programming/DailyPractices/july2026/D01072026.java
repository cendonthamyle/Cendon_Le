package programming.dailypractices.july2026;

public class D01072026 {
    /*
    ================================================================================
           EXERCISE 1: THE CAR RENTAL AGENCY SYSTEM (Classes & Basic Logic)
    ================================================================================
    Goal: Practice creating classes, working with custom methods, and modifying object
    fields based on logic rules.

    Your Task: Create a class named 'Car' with the following criteria:
    1. Attributes: 
      - String model
      - double pricePerDay
      - boolean isAvailable
    2. Constructor: 
      - Takes 'model' and 'pricePerDay' as inputs.
      - Sets 'isAvailable' to true by default.
    3. Methods:
      - rentCar(): Checks if the car is available. 
                  If true, change isAvailable to false and print "Enjoy your ride!".
                  If false, print "Sorry, this car is already rented."
      - returnCar(): Sets isAvailable back to true.
      - calculateTotalCost(int days): Multiplies pricePerDay by days and returns 
                                     the total cost as a double.

    Testing: In your main method, instantiate a Car (e.g., "Toyota Corolla", 50.0), 
         try renting it twice in a row to verify your logic, calculate the cost 
         for a 5-day rental, and return it.
    ================================================================================
    */

   public static class theCarRentalAgencySystem{
         public static void main(String[] args) {
            Car myCar = new Car("Toyota Corolla", 50.0);
            System.out.println("| Testing Car Rental System for: " + myCar.model + " |");

        
            System.out.println("\nAttempting 1st rental:");
            myCar.rentCar();

            System.out.println("\nAttempting 2nd rental:");
            myCar.rentCar();

            int rentalDays = 5;
            double cost = myCar.calculateTotalCost(rentalDays);
            System.out.println("\nTotal cost for a " + rentalDays + "-day rental: $" + cost);

            System.out.println("\nReturning the car:");
            myCar.returnCar();
            System.out.println("Is the car available again? " + myCar.getIsAvailable());
         }

         static class Car{
            String model;
            double pricePerDay;
            boolean isAvailable;

            Car(String model, double pricePerDay){
               this.model = model;
               this.pricePerDay = pricePerDay;
               this.isAvailable = true;
            }

            public boolean getIsAvailable() {
               return this.isAvailable; // Now Java knows what 'isAvailable' is!
            }

            public void rentCar() {
               if (isAvailable) {
                  this.isAvailable = false;
                  System.out.println("Enjoy or trip!");
               } else {
                  System.out.println("Sorry, this car is already rented.");
               }
            }

            public void returnCar() {
               this.isAvailable = true;
            }

            public double calculateTotalCost(int days) {
               double totalCost;

               totalCost = this.pricePerDay * days;

               return totalCost; 
            }
         }
    }
    

   /*
   ================================================================================
            EXERCISE 2: SECURE BANK ACCOUNT (Encapsulation & Validation)
   ================================================================================
   Goal: Practice data hiding using the 'private' modifier, tracking state changes, 
         and protecting fields with validation.

   Your Task: Create a class named 'BankAccount':
   1. Attributes: 
     - private String accountHolder
     - private double balance
   2. Constructor: 
     - Initializes 'accountHolder'.
     - Sets the starting 'balance' to 0.0.
   3. Methods:
     - Provide public getters for both fields, but NO direct setter for balance.
     - deposit(double amount): If amount > 0, add it to balance. 
                               Otherwise, print an error message.
     - withdraw(double amount): Check if amount > 0 AND if amount <= balance. 
                                If valid, deduct it from balance; otherwise, 
                                print "Invalid transaction or insufficient funds."

   Testing: In your main method, create an account, try depositing a negative number, 
            deposit a valid amount, and attempt to withdraw more money than the 
            available balance to make sure your validation checks work.
   ================================================================================
   */



   /*
   ================================================================================
          EXERCISE 3: ONLINE STORE DISCOUNTS (Inheritance & Polymorphism)
   ================================================================================
   Goal: Practice class inheritance, using the 'super' keyword, and method overriding.

   Your Task: Build a multi-class structure:
   1. Base Class (Customer):
     - Attributes: String name
     - Method: double applyDiscount(double orderTotal) -> returns the original 
               orderTotal unchanged (no discount for regular members).
   2. Subclass (VIPCustomer):
     - Inherits from Customer.
     - Override applyDiscount(double orderTotal) to deduct 15% off the total price.
   3. Subclass (FirstTimeCustomer):
     - Inherits from Customer.
     - Override applyDiscount(double orderTotal) to subtract a flat $10 from 
               the total price (ensure the final total doesn't fall below $0).

   Testing: In your main method, create an array or list of Customer objects containing 
         one standard customer, one VIP customer, and one first-time customer. 
         Loop through them, pass an initial order total of $100.0 to each object's 
         applyDiscount() method, and print the resulting price to watch polymorphism 
         handle the math.
   ================================================================================
   */
}