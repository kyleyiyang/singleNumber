import java.io.*; 
import java.util.*;
import java.util.Random;
public class Main
{
	public static void main(String[] args) {
	    boolean found=false;
	    Random rand = new Random();
		System.out.println("Hello World");
		Vector<Integer> v = new Vector<Integer>();
		v.add(4);v.add(1);v.add(2);v.add(1);v.add(2);
		while (v.size()>=1) {
		    int rand_int = rand.nextInt(v.size());
		    if (v.size()==1) {
		        System.out.println(v.get(0));
		        break;
		    } 
		    for (int n:v) {
		        if (n == v.get(rand_int) && v.indexOf(n)!=rand_int) {
		            v.remove(v.indexOf(n));
		            v.remove(v.indexOf(n));
		            break;
		        } else if (v.indexOf(n) == v.size()-1) {
		            System.out.println(v.get(rand_int));
		            break;
		        }
		    }
		    //System.out.println(v);
		}
	}
}
