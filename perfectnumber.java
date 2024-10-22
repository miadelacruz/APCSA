import java.util.Random;
import java.util.Scanner;

public class perfectnumber {
    public static void main(String [] args)
    
    {
      
          int num=1;
          while (num<10000){
            int sum=0;
          for (int i =1; i<num; i++ ){
            if (num%i==0){
                sum+=i;
                
            }
        }
        if (sum==num){
            System.out.println("A perfect number is " + num);
        }
        
num++;
}
}
}