package core_java;
import java.util.*;
public class First_Program {

	public First_Program() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ENTER THE NUMBER");
		Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        if(n == 1) {
            System.out.println("NO");
            return;
        }
        
        for(int i=2;i<n;i++) {
            if(n % i == 0) {
                System.out.println("NO");
                return;
            }
        }
        
        System.out.println("YES");
	}

}
