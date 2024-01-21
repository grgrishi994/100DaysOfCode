import java.util.*;

class SumOfNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        System.out.println("Enter the number");
        int a = sc.nextInt();
        for(int i=1;i<=a;i++){
            sum=sum+i;
        }
        System.out.println(sum);

    }
}