
public class CafeUtil {
    public int getStreakGoal(){
        int numWeeks = new int[10];

        for (int i = 0; i <=numWeeks.length; i++)
        {
        numWeeks[i] = i + 1;
        }
        return numWeeks[i];
    }

   public double getOrderTotal(double[] prices){
       double prices[] = {5.99, 7.89, 10.50, 11.99, 14.99};
       int i;
       for (i = 0; i <=prices.length; i++){
           total += i;
       }
       return total;
   }

   public void displayMenu(ArrayList<String> menuItems){
       String menuItems[]={ "drip coffee",  "cappuccino", "latte" ,"mocha"
   }
        int i;
        for(i=0; i<menuItems.length;i++){
        String name = menuItems.get(i);
        return System.out.println(name);
    }
    
    public addCustomer(ArrayList<String> customers){
        
    }
}

  