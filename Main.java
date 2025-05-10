import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    boolean run = true;
    Scanner scanner = new Scanner(System.in);
  Car car1 = new Car("Coupe", 18000, 2017, "V6", 2, 0.08, "Honda");
Car car2 = new Car("Sedan", 25000, 2021, "I4", 4, 0.05, "Toyota");
Car car3 = new Car("Convertible", 32000, 1987, "V6", 2, 0.1, "Mazda");

Gas gas1 = new Gas("SUV", 22000, 2015, "V8", 4, 0.15, "Chevrolet", "Gasoline", 18, 350);
Gas gas2 = new Gas("Pickup", 27000, 2020, "V8", 2, 0.2, "Ford", "Diesel", 24, 400);
Gas gas3 = new Gas("Minivan", 21000, 2016, "V6", 5, 0.12, "Chrysler", "Gasoline", 20, 300);
Gas gas4 = new Gas("Compact", 15000, 2001, "I4", 4, 0.07, "Hyundai", "Gasoline", 12, 280);

Electrical elec1 = new Electrical("Hatchback", 30000, 2023, "Electric Motor", 4, 0.03, "Tesla", true, 95);
Electrical elec2 = new Electrical("Sedan", 27000, 2022, "Electric Motor", 4, 0.02, "Nissan", false, 85);
Electrical elec3 = new Electrical("SUV", 40000, 2024, "Dual Motor", 4, 0.01, "Rivian", true, 100);
Electrical elec4 = new Electrical("Truck", 35000, 2021, "Single Motor", 4, 0.04, "Ford", false, 80);
    Car[] cars = { car1, car2, car3, gas1, gas2, gas3, gas4, elec1, elec2, elec3, elec4 };
    System.out.println("Welcome to the car dealership!, To EVER EXIT THE PROGRAM, please include 'thank' at any time");
        System.out.println("our first step is to ask you some questions to find the best match for you");
    
    
    
    
        while(run){
        System.out.println("please enter the oldest car you are willing to buy");
        //make a question asking generally "what is a key feature you are looking for in your car and then it will sort throguh the boolean atrributes "
        String input = scanner.nextLine().toLowerCase();
        if(input.contains("thank")){
            System.out.println("thank you for using the program, have a nice day");
            run = false;
        }
        //use an array here and remove the cars that do not match the criteria
            int min = Integer.valueOf(input);   //value makes string to int
            ArrayList<Car> carsList = new ArrayList<>();
            for (Car cary : cars) {
                if (cary.getYear() >= min) {                           //need to display car object type
                    carsList.add(cary);
                }
            }
            if(carsList.size() ==0){
                System.out.println("sorry, no new cars, pick a different year or exit my saying thank ");
                continue;   
            }
           
            System.out.println("Select a car by entering the number in order, and I will display what you can do with it ");
            System.out.println("If you want to change the year instead type back");
            while (true) { 
                System.out.println("Please enter the number of the car you want to select");
                for (Car cary : carsList) {
                    System.out.println(cary);                      
                    if(cary instanceof Gas) {      //checks if gas and then makes a new ob of gas 
                        Gas gasCar = (Gas) cary;
                        System.out.println("This is a gas car with a tank of " + gasCar.getTank() + " and a range of " + gasCar.getRange());
                    } else if (cary instanceof Electrical) {                //type casting since things in the array list are all cars but need to have different methods called 
                        Electrical electricCar = (Electrical) cary;
                        System.out.println(" electrical car with a self-driving feature: " + electricCar.getSelfdrive() + " and a charge of " + electricCar.getCharge());
                    } else {
                        System.out.println("This is a regular car");
                    }
                }

                System.out.println("For example, type one if you want the first car that was displayed");
                 
                String second = scanner.nextLine().toLowerCase();
                if(second.contains("thank")){
                    System.out.println("thank you for using the program, have a nice day");
                    run = false;
                    break;
                }
                if(second.contains("back")){
                    break;
                    

                }
                int input2 = Integer.valueOf(second)-1; // need to get rid of index, shift everyting down cause array starts at 0 
                if(input2 >= 0 && input2 < carsList.size()){
                    Car selectedCar = carsList.get(input2);
                    System.out.println("You selected: " + selectedCar);

                 
                    System.out.println("Please select an action:");
                    System.out.println("What would you like to do with this car?");
                    System.out.println("1. View details");
                    System.out.println("2. Barter for a better price");
                    System.out.println("3. Drive the car");
                    System.out.println("4. Update the car's charge or tank");
                  
                    int action = scanner.nextInt();
                    scanner.nextLine(); // consume the newline character
                    if(action == 1){
                        System.out.println(selectedCar);
                    } else if(action == 2){
                        selectedCar.barter();
                    } else if(action == 3){
                        System.out.println( selectedCar.drive());
                      
                    } 
                     else if(action == 4){
                        if(selectedCar instanceof Electrical){
                            ((Electrical) selectedCar).updateCharge();

                        }
                        else if(selectedCar instanceof Gas){
                            ((Gas) selectedCar).updateTank();
                        }
                        else{
                            System.out.println("this is not a gas or electrical car");
                        }
                     }
                 
                    else {
                        System.out.println("Invalid option, please try again.");
                    }
                } else {
                    System.out.println("Invalid selection, please try again.");

                }
            }
        
        
        

        }
        
        }
    }




    
