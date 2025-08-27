import java.util.*;
public class railway_system {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        int age=sc.nextInt();
        int tp=sc.nextInt();
        String tt=sc.next();
        while(tp>0){
            if(tp==0){
                System.out.println("waiting list");
            }
            else{
                switch(tt){
                    case "sleeper":
                        System.out.println("sleeper ticket booked of"+name);
                        System.out.println(300);
                        break;
                    case "general":
                        System.out.println("general ticket booked of"+name);
                        System.out.println(150);
                        break;
                    case "ac":
                        System.out.println("ac ticket booked of"+name);
                        System.out.println(700);
                        break;
                    case "sleeperac":
                        System.out.println("sleeperac ticket booked of"+name);
                        System.out.println(1000);
                        break;
                    case "economy":
                        System.out.println("economy ticket booked of"+name);
                        System.out.println(1300);
                        break;
                }
            }
            tp--;
        }
    }
}