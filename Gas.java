import java.util.Scanner;

public class Gas extends Car{
    protected String gas;
    protected double tank;
  
    protected double range;
   
    
    public Gas(String c, int p , int y , String e, int d, double r , String b, String g, double t,   int ra  ){
        super(c,p,y,e,d,r,b);
        gas = g;
        tank = t;
               
        range = ra;
        
    
      
    }
    
    public void setGas(String g){
        gas = g;
    }
    
    public String getGas(){
        return gas;
    }
    
    public void updateTank(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" current tank: " + tank);
        System.out.println("would you like to update the tank? yes or no");
        String input = scanner.nextLine().toLowerCase();   // to compare easier
        if(input.equals("yes")){
            System.out.println("please enter the new tank value make it(0-100)" );
            double newTank = scanner.nextDouble();
            if(newTank >= 0){
                tank = newTank;
                System.out.println("Tank updated to: " + tank);
            } else {
                System.out.println("invalid tank value, please enter a value between 0 and 100");
            }
        } else if(input.equals("no")){
            System.out.println("tank not updated");
        } else {
            System.out.println("invalid input, please enter yes or no");
        }
    }
    
    public double getTank(){
        return tank;
    }
    @Override
    public String drive(){
         while(tank>0){
        System.out.println("You are driving the " + car + " of brand: " + brand + ". Tank left: " + tank);
        tank -= 1;
         }
        if(tank ==0){
            System.out.println("You are out of gas, please refuel");
            System.out.println("Please select an action:");
            System.out.println("1. Refuel");
            System.out.println("2. Call for help");
            Scanner scanner = new Scanner(System.in);
            int action = scanner.nextInt();
            System.out.println("type 1 to refuel or 2 to call for help");
            if(action == 1){
                System.out.println("Refueling");
                tank = 10;
                System.out.println("tank refueled to ; " + tank);
                return "Refueled";
            } else if(action == 2){
                System.out.println("calling for help");
                return "Call for help";
            } else {
                System.out.println("invalid option ");
            }
        }
        else{
            return "you are driving the car";
        }
       
        return "has driven";
}
        
        
        
        
     
    
    
    public void setRange(int r){
        range = r;
    }
    public double getRange(){
        return range;
    }
    
}