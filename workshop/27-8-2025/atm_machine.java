import java.util.Scanner;

public class atm_machine {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the length :");
        int n=sc.nextInt();
        int arr[]=new int[n];
         System.out.print("enter the " + n + " element :");
        for(int i=0;i<n;i++){
           
             arr[i]=sc.nextInt();
        }
        int account_balance=accountbalance(arr);
        System.out.println("your account balance is:" + account_balance);
    }
    public static int accountbalance(int arr[]){
        int balance=0;
        for(int i=0;i<arr.length;i++){
            balance +=arr[i];
        }
        if(balance<0){
            System.out.println("account is overdraft");
            
        }
        
            return balance;
        
       
    }
}
