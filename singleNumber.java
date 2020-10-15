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
		    if (v.size()==1) {
		        System.out.println(v.get(0));
		        break;
		    } 
		    int rand_int = rand.nextInt(v.size());
		    int element = v.get(rand_int);
		    v.remove(rand_int);
		    if (v.contains(element)) {
		        v.remove(v.indexOf(element));
		    } else {
		        System.out.println("final="+element);
		        break;
		    }
		    /*if (v.size()==1) {
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
		    }*/
		    //System.out.println(v);
		}
	}
}
//input int array instead of vector;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		int[] arr = {1,-5,1,9,9,-5,6};
		int n;
		n=non_repeating(arr);
		System.out.println(n);
	}
	public static int non_repeating (int[] arr) {
	    Integer myInf = Integer.MAX_VALUE;
	    for (int i=0;i<=arr.length-1;i++) {
	        if (arr[i] != myInf) {
    	        for (int j=i+1;j<arr.length;j++) {
    	            if (arr[i]==arr[j]) {
    	                arr[j]=myInf;
    	                break;
    	            } else if (j==arr.length-1) {
    	                return arr[i];
    	            }
    	        }
	        }
	    }
	    return arr[arr.length-1];
	}
}
