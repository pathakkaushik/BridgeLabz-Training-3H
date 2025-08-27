
import java.util.Scanner;

public class cricker_score {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size :");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("enter the " + n + " score :");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int max_score=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max_score){
                max_score=arr[i];
            }
        }
        System.out.println("maximum scored is :" + max_score);
        int min_score=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min_score){
                min_score=arr[i];
            }
        }
        System.out.println( "minimun score is :" + min_score);
        int average=0;
        for(int i=0;i<arr.length;i++){
            average +=arr[i];
        }
        System.out.println("average score by all batsman :" + average/n);
        for(int i=0;i<arr.length;i++){
            if(arr[i]>100){
                System.out.println("century scored by : " + (i+1) + " batsman ");
            }
        }
        
        
        
    }
}
