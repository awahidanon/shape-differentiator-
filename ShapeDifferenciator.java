
package shapedifferenciator;

import java.util.Scanner;
public class ShapeDifferenciator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int u;
        do 
        {
        Differentiator object=new Differentiator();
                object.recieveCoordinates();
                object.calculateLength();
                object.displayResult();
                System.out.print("To try more press 1 to quit press any other entiger");
                u = input.nextInt();
    }while(u==1);
}
}