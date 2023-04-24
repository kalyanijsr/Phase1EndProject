package test;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
  int[]arr1 = {10,20,30,40,50,60};
  
  System.out.println("length of the array is " + arr1.length);
  System.out.println("First value inside the array is" +arr1[0]);
  System.out.println("last value inside the array is " +arr1[arr1.length-1]);
  
    String[] arr2 = {"mon","tue","wed","thu","fri"};
    
    System.out.println("value of third position is " +arr2[2]);
    
    String str = "clean world green world happy world";
    
    String[] arr3 = str.split(" ");
    
    System.out.println("Total num of words inside the string is " + arr3.length);
    
    
    }

}
