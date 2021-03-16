package loopMap;
import java.util.*;
public class loopMap {

	public static void main(String[] args) {
		ArrayList<Integer> cars = new ArrayList<Integer>(); // Create an ArrayList object
		Scanner a = new Scanner(System.in);
		System.out.println("provide your first number");
		
		int one = a.nextInt();
		cars.add(one);
		System.out.println("provide your second number");
		int two = a.nextInt();
		cars.add(two);
		System.out.println("provide your third number");
		int three = a.nextInt();
		cars.add(three);
		System.out.println("provide your fourth number");
		int four = a.nextInt();
		cars.add(four);
		System.out.println("provide your fifth number");
		int five = a.nextInt();
		cars.add(five);
		
		int sum = 0;
		int product = 1;
		int largest = 0;
		int smallest = 0;
		
		
		for(int i=0; i<cars.size(); i++)
		{
		sum = sum + cars.get(i);
		product = product * cars.get(i);
		
		}
		System.out.println("sum " + sum);
		System.out.println("product " + product);
System.out.println("smallest " + Collections.min(cars));
System.out.println("largest " + Collections.max(cars));
	}
}