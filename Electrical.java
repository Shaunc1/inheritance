import java.util.Scanner;
public class Electrical extends Car{
 


    protected boolean selfdrive;
    protected double charge;
    public Electrical(String c, int p , int y , String e, int d, double r , String b,  boolean self, double charg){
    super(c,p,y,e,d,r,b);
    selfdrive = self;
    charge = charg;
    }
    public boolean getSelfdrive (){
      return selfdrive;
    }
     public void  updateCharge(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" current tank: " + charge);
        System.out.println("would you like to update the tank? yes or no");
        String input = scanner.nextLine().toLowerCase();   // to compare easier
        if(input.equals("yes")){
            System.out.println("Please enter the new tank value make it(0-100)" );
            Double b = scanner.nextDouble();
            if(b >= 0){
                charge = b;
                System.out.println("Tank updated to: " + charge);
            } else {
                System.out.println("Invalid tank value, please enter a value between 0 and 100");
            }
        } else if(input.equals("no")){
            System.out.println("Tank not updated");
        } else {
            System.out.println("Invalid input, please enter yes or no");
        }
    }
    
    public double getCharge(){
        return charge;
    }
    @Override
    public String drive(){
        while (selfdrive == true){
            System.out.println("The car is self driving");
            System.out.println("will you be keeping your hands on the wheel? yes/no");
            Scanner scanner = new Scanner(System.in);
            String answer = scanner.nextLine();
            if (answer.equals("yes")){
                System.out.println("The car is self driving with no problems");
                return "The car is self driving";
            }
            else if (answer.equals("no")){
                 int g = (int)Math.random();
                if(g < crashProbability){
                    System.out.println("due to the fact that you are not keeping your hands on the wheel, the car crashed"+ "there was a " + crashProbability + " chance of this happening" );
                    System.err.println("select a new car please, we have replaced the car that you crashed!");
                    break;
                }
                else{
                    System.out.println("luckely, the car did not crash");
                    break;
                }
                 
               
            }
            else{
                System.out.println("Please answer yes or no");
            }
             
        }
        return "The car is not self driving";
    }
 
 
 }

 
 
 
   
 
 
 
 
   
   
 
 
   
 
 