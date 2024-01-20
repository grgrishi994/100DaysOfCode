import java.util.*;

class PosOrNeg{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
                int a=sc.nextInt();
                if(a>0){
                    System.out.println("The number is positive");
                }
                else if(a<0){
                    System.out.println("the number is negative");
                }
                else{
                    System.out.println("number is zero");
                }
        
    }
}