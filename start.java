
import java.util.Scanner;

 class student {
    int roll;
    String name;

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

public class start {

    public static void main(String[] args) {
        try {
            
            student s = new student();
            // s[0].name= "pratik";
            // s[0].roll=90;
            s.setName("Pratik");
            System.out.println("the name using getter and setter: "+ s.getName());   

            // System.out.printf("the Name is %s: and the roll is %d ",s[0].name,s[0].roll);
            
      } catch (Exception e) {
          e.printStackTrace();
      }
      finally{
          System.out.println("\n\n\t\tEnded");
      }
   }

   
}