package calculator;
import java.util.Scanner;

public class calculator {

    public static int add(int x, int y) {
        return x + y;
    }

    public static int sub(int x, int y) {
        return x - y;
    }

    public static int mul(int x, int y) {
        return x * y;
    }

    public static double div(int x, int y) {
        return x / (double) y;     }

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Choose your option");
            System.out.println("Choose 1 for Addition");
            System.out.println("Choose 2 for Subtraction");
            System.out.println("Choose 3 for Multiplication");
            System.out.println("Choose 4 for Division");

            int choose = scan.nextInt();
            System.out.println("Enter two numbers");
            int x = scan.nextInt();
            int y = scan.nextInt();

            if (choose == 1) {
                System.out.println("the answer is: " + add(x, y));
            } else if (choose == 2) {
                System.out.println("the answer is: " + sub(x, y));
            } else if (choose == 3) {
                System.out.println("the answer is: " + mul(x, y));
            } else if (choose == 4) {
                System.out.println("the answer is: " + div(x, y));
            }
        }
    }
}





//package calculator;
//import java.util.Scanner;
//public class calculator 
//{
//	      public static int add(int x,int y){
//	        
//	        return x+y;
//
//	      }
//	      public static  int sub(int x,int y){
//	        
//	        return x-y;
//	 
//	      }
//	      public static int  mul(int x,int y){  
//            return x*y;
//	      }
//	      
//	      public static double div(int x,int y){
//	        return x/ (double)y;
//	      }
//
//
//    public static void main (String[] args){
//        try (Scanner scan = new Scanner(System.in)) {
//			System.out.println("Choose your option");
//
//			System.out.println("Choose 1 for Addition");
//			System.out.println("Choose 2 for Subtraction");
//			System.out.println("Choose 3 for Multiplication");
//			System.out.println("Choose 4 for Division");
//			
//			 
//			int choose = scan.nextInt();
//			System.out.println("Enter two numbers");
//			int x = scan.nextInt();
//			int y = scan.nextInt();
//
//			if (choose ==1){
//			   System.out.println("the answer is: " + add(x,y)); 
//
//			}
//			else if(choose ==2){
//			     System.out.println("the answer is: " + sub(x,y)); 
//
//			}
//			 else if(choose ==3){
//			     System.out.println("the answer is: " + mul(x,y)); 
//
//			}
////          else if(choose ==4){
////             System.out.println("the answer is: " + div(x,y)); 
////
////        }
//
//			}
//		}
//    }
//}
