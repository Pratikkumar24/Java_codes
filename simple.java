import java.util.Scanner;

public class simple{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        int r = s.nextInt();
        System.out.printf("The volume of the sphere is: %0.2f", (float)SphereVol(r));
    }
     
    public static double SphereVol(double r)
    {
        return  ((double) (4 / 3) * (Math.PI * Math.pow(r, 3)));
    }
}