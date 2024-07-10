package shapedifferenciator;

import java.util.Scanner;
public class Differentiator {
    private double[] x;
    private double[] y;
    private double[] length;
    public void setX(double[] x){
        this.x=x;
    }
    public double[] getX(){
        return x; 
    }
    public void setY(double[] y){
        this.y=y;
    }
    public double[] getY(){
        return y; 
    }
      public void setLength(double[] length){
        this.length=length;
    }
    public double[] getLength(){
        return length; 
    }
    public void calculateLength(){
        double[] length=new double[4];
        for (int i=0;i<4;i++){
            int j=i+1;
            if(i==3){
        length[i]=Math.sqrt((y[i]-y[0])*(y[i]-y[0])+(x[i]-x[0])*(x[i]-x[0]));}
            else
        length[i]=Math.sqrt((y[j]-y[i])*(y[j]-y[i])+(x[j]-x[i])*(x[j]-x[i]));
        }
        setLength(length);
    }
    public void recieveCoordinates(){
        double[] x = new double[4];
        double[] y = new double[4];
        Scanner input=new Scanner(System.in);
        System.out.println("This programme differentiates whether aset of coordiantes compose a SQUARE,A RECTANGLE,A RHOMBUS or A PARALLELOGRAM.\nTo continue press 1,to quit press any other integer number.");
        int choise=input.nextInt();
        switch(choise){
             case 1:
                 for (int i=0;i<4;i++){
                   up:System.out.print("please enter x"+i+": ");
                   x[i]=input.nextDouble();
                   System.out.print("please enter y"+i+": ");
                   y[i]=input.nextDouble();     }
              break;
            default:
              break;}
         setX(x);
        setY(y);}
    public void displayResult(){
        if(length[0]==length[1]&&length[1]==length[2]&&length[2]==length[3]){
            if(x[0]==x[1]&&x[2]==x[3]&&y[0]==y[3]&&y[1]==y[2]){
                System.out.print("Square. ");
            }
            else{
           System.out.print("rhombus. "); }
        }
        else if(length[0]==length[2]&&length[1]==length[3]){
            if (x[0]==x[1]&&x[2]==x[3]&&y[0]==y[3]&&y[1]==y[2]){
               System.out.print("Rectangle. "); 
            }
            else{
                System.out.print("Parallelogram. ");}
        }
       
       else
        { 
            System.out.print("The input coordinates compose niether of the four quadrilaterals. ");
        }
        
        }
        }
    

    
