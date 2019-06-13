package Nationwide.Scanner;

import java.util.Scanner;

class Scanner1{


public static void main(String args[]){

               Scanner ref= new Scanner(System.in);
               System.out.println("Boommmmmmmmmmmmmmmmmmmmmmmmmmm");
               System.out.print("Enter the Product ");
               String product=ref.nextLine();
               System.out.print("Enter the Price of "+product+":");
               float price=ref.nextFloat();
               System.out.print("How many "+ product +"s have you bought?");
                 
               float quantity=ref.nextInt();
               System.out.print("Your bill is £"+(price*quantity));            
	}
}