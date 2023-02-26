package Main;

import java.util.Scanner;


public class Main {

    static Store s;
    
    private static void init()
    {
        //init. the store with name and add products to it
        s= new Store ("ahmad rehili");
        s.setProducts(new Laptop("core i7", 16, "Legion-5", "Lenovo", 1000));
        s.setProducts(new Laptop("core i5", 8, "vivobook", "ASUS", 500.50));
        s.setProducts(new Laptop("core i5", 8, "G15", "Dell", 1025));
        s.setProducts(new Laptop("core i5", 8, "Probook", "HP", 875));
    }

    public static void main(String[] args) {
        init();
        System.out.println("***************************************");
        System.out.println("******WELCOME TO ELECTRONIC STORE******");
        System.out.println("***************************************");
        Scanner scan = new Scanner(System.in);//scanner to get input from user
        while(true)
        {
            System.out.println("\n\n***************************************");
            System.out.println("1. View All Products.\n"
                    + "2. Buy A Product.\n"
                    + "3. Contact With Store\n"
                    + "4. Exit");
            System.out.println("***************************************");
            System.out.print("Enter your choice --> ");
            String ch = scan.nextLine();//get choice from user
            System.out.println("***************************************");
            //switch the choice
           switch(ch)
           {
               case "1":
               {
                   System.out.println(s);
               }break;
                   
               case "2":
               {
                   System.out.println(s);
                   System.out.println("Enter number of product: ");
                   int number = scan.nextInt();
                   scan.nextLine();
                   //check number is valid
                   if(number > s.getProducts().size() || number <= 0)
                   {
                       System.out.println("not valid..!");
                       break;
                   }
                   //print details of laptop
                   System.out.println("Laptop details is as follow:");
                   System.out.println("\t"+s.getProducts().get(number-1));
                   System.out.println("The laptop will be delivered in 3 days");
                   System.out.println("1. Accept");
                   System.out.println("2. Cancel");
                   System.out.println("-> ");
                   //check choice 
                   number = scan.nextInt();
                   scan.nextLine();
                   if(number == 1)
                   {
                       System.out.println("Order accepted..!");
                   }
                   else
                   {
                       System.out.println("Order cancelled...!\n");
                   }
               }break; 
                   
               case "3":
               {
                   //print contact details
                   System.out.println("To contact with the store +966*********");
                   System.out.println("or via email: ahmad@company.sa");
               }break;
                   
               case "4": {
                   return;
               }

               default:
                   System.out.println("Not valid choice..!");
           }
        }
    }
    
}
