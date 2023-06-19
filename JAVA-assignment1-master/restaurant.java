import java.util.Scanner;
public class restaurant 
{
        public static void main(String[] args) {
        int count=0,  l=0, pi=0, p=0, r=0, w=0, sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("&&&&&&& Welcome to Mangiare, the premium Italian cuisine house &&&&&&&& ");
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Check on the menu number that you want to eat on.");
        System.out.println(" 1.Lasagne        ₹350\n 2.Farmhouse Pizza         ₹500\n 3.Pasta           ₹250\n 4.Ravioli          ₹250\n 5.Red Wine           ₹2000\n");
        System.out.println ("How many food items you want to order");
        int k = sc.nextInt();
        if(k>=1)
        {for(int i=1; i<=k; i++)
        {System.out.println("Enter the number");
        int a =sc.nextInt();

        switch(a){
            case 1:l++; sum+=350;
            System.out.println("You have ordered a lasagna");
            break;
            case 2:pi++; sum+=500;
            System.out.println("You have ordered a pizza");
            break;
            case 3:p++; sum+=250;
            System.out.println("You have ordered a pasta");
            break;
            case 4:r++; sum+=250;
            System.out.println("You have ordered a ravioli");
            break;
            case 5:w++; sum+=2000;
            System.out.println("You have ordered the red wine");
            break;
            default:System.out.println("Choose the right number");
            break;
        }
    
        }
       double bill= ((p+r+w+pi+l)(sum + (0.08*sum)));
       System.out.println("Your bill is: "+bill);
    }
}}
