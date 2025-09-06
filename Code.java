import java.util.*;
public class Main {
    public static void main(String[] args) {
        
        System.out.println("Hii Plzz enter your name:");
        Scanner sc = new Scanner(System.in);
        String Name=sc.nextLine();
        System.out.println("Hey "+ Name+" Welcome");

        int choice;
        do {
            System.out.println("\nMenu");
            System.out.println("1. Tomato Curry - 60");
            System.out.println("2. Dal - 50");
            System.out.println("3. Chicken Curry - 120");
            System.out.println("4. Mutton Curry - 180");
            System.out.println("5. Prawns - 160");
            System.out.println("6. Exit");
            
            System.out.print("Please enter your choice (1-6): ");
            int n = sc.nextInt();
            choice = n;
            
            switch(n) 
            {
                case 1:
                    System.out.println("You have selected Tomato Curry");
                    System.out.println("Enter the quantity: ");
                    int a=sc.nextInt();
                    System.out.println("The total cost for your order is: "+(a*60)+" Rs");
                    
                    System.out.println("Please enter the amount:");
                    int i=sc.nextInt();
                    if(i==(a*60)){
                        System.out.println("--------------------\nYour order is placed!!! \nPlease Kindly wait 5min\n   ---Thank You---   ");
                    }
                    else{
                        System.out.println("We can't process your order.\nPlease enter the correct money...");
                    }
                    break;
                case 2:
                    System.out.println("You have selected Dal");
                    System.out.println("Enter the quantity: ");
                    int b=sc.nextInt();
                    System.out.println("The total cost for your order is: "+(b*50)+" Rs");
                    
                    System.out.println("Please enter the amount:"+(b*50));
                    int j=sc.nextInt();
                    if(j==(b*50)){
                        System.out.println("--------------------\nYour order is placed!!! \nPlease Kindly wait 5min\n   ---Thank You---   ");
                    }
                    else{
                        System.out.println("We can't process your order.\nPlease enter the correct money...");
                    }
                    break;
                    
                case 3:
                    System.out.println("You have selected Chicken Curry");
                    System.out.println("Enter the quantity: ");
                    int c=sc.nextInt();
                    System.out.println("The total cost for your order is: "+(c*120)+" Rs");
                    
                    System.out.println("Please enter the amount:"+(c*120));
                    int k=sc.nextInt();
                    if(k==(c*120)){
                        System.out.println("--------------------\nYour order is placed!!! \nPlease Kindly wait 5min\n   ---Thank You---   ");
                    }
                    else{
                        System.out.println("We can't process your order.\nPlease enter the correct money...");
                    }
                    break;
                    
                case 4:
                    System.out.println("You have selected Mutton Curry");
                    System.out.println("Enter the quantity: ");
                    int d=sc.nextInt();
                    System.out.println("The total cost for your order is: "+(d*180)+" Rs");
                    
                    System.out.println("Please enter the amount:"+(d*180));
                    int l=sc.nextInt();
                    if(l==(d*180)){
                        System.out.println("--------------------\nYour order is placed!!! \nPlease Kindly wait 5min\n   ---Thank You---  " );
                    }
                    else{
                        System.out.println("We can't process your order.\nPlease enter the correct money...");
                    }
                    break;
                    
                case 5:
                    System.out.println("You have selected Prawns");
                    System.out.println("Enter the quantity: ");
                    int e=sc.nextInt();
                    System.out.println("The total cost for your order is: "+(e*160)+" Rs");
                    
                    System.out.println("Please enter the amount:"+(e*160));
                    int m=sc.nextInt();
                    if(m==(e*160)){
                        System.out.println("--------------------\nYour order is placed!!! \nPlease Kindly wait 5min\n   ---Thank You---   ");
                    }
                    else{
                        System.out.println("We can't process your order\nPlease enter the correct money...");
                    }
                    break;
                case 6:
                    System.out.println("Exiting... Thank you for visiting!");
                    break;
                default:
                    System.out.println("Invalid choice");
                    System.out.println("   ---Thank You---   ");
            }
        } while(choice != 6);
    }
}
