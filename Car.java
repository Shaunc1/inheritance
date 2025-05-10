import java.util.Scanner;
 

public class Car{
    protected String car;
    protected int price;
    protected int year;
    protected String engine;
    protected int dimensions;
    protected double crashProbability;
    protected String brand;
   
 

    public Car(String c, int p, int y, String e, int d ,double r, String b){
 
    car = c;
    price = p;
    year = y;
    engine = e;
    dimensions = d;
    crashProbability=r;
    brand = b; 
    }
   
    public String drive(){
        
         return "you are driving the "+ car + "of brand:" + brand;
        
    }
    public String toString(){
        return "Car: " + car + ", Price: " + price + ", Year: " + year + ", Engine: " + engine + ", Dimensions: " + dimensions + ", Crash Probability: " + crashProbability + ", Brand: " + brand;
    }
 
 
   
    public void setPrice(int p){
        price = p;
    }
   
    public int getPrice(){
        return price;
    }
    public void setYear(int y){
        year = y;
    }
   
    public int getYear(){
        return year;
    }
   
    public void setEngine(String e){
        engine = e;
    }
   
    public String getEngine(){
        return engine;
    }
    public double getCrashProbability(){
        return crashProbability;
    }
    public void setCrashProbability(double x){ 
         crashProbability = x;
    }
    public void barter(){

    
        Scanner scanner = new Scanner(System.in);       
        boolean loop = true;
        int drawline = (int)(Math.random() * 10000);
         int factor = price - drawline;
        System.out.println("car price is "+ price); 
        while(loop){
           
            System.out.println("hmm , car price is "+ price + " do you accept(yes/no)"); 
            String answer = scanner.nextLine();
            if (answer.equals("yes")){
                System.out.println("wise desicion");
                loop = false;
            }
         
            else{
                System.out.println("ok, how much do you want to pay?");
                int offer = scanner.nextInt();
                if (offer < factor){
                     while(offer < factor){
                        System.out.println("no, you have to pay more than "+ factor);
                        System.out.println("ok, how much do you want to pay?");
                        offer = scanner.nextInt();
                     }

                 }
                if (offer > factor){
                    System.out.println("ok, you can have it for "+ offer);
                    loop = false;
                     price = offer; 
                } 

            }
        }
       
    
       
        }
 }
 
 
 