import java.util.*;

public class Sorter{
  
  public static int findMin(Comparable[] input, int start){
    Comparable min = input[start];
    int position = start;
    for(int i=start+1; i<input.length; i++){
      if(input[i].compareTo(min)<0){
        min = input[i];
        position = i;
      }
    }
    return position;
  }
  
  public static void swap(int[] input, int loc1, int loc2){
    int temp = input[loc1];
    input[loc1] = input[loc2];
    input[loc2] = temp;
  }
  
  public static void selectionSort(int[] input){
    for(int i=0; i<input.length-1; i++){
      int minLoc = findMin(input, i);
      swap(input,i,minLoc);
    }
  }
  
  public static int linearSearch (int[] input, int x){
    for(int i=0; i<input.length; i++){
      if(input[i]==x)
        return i;
    }
    return -1;     
  }

  public static String displayArray(int[] input){
    String result="[";
    for(int i=0; i<input.length; i++){
      result += input[i]+",";
    }
    result += "]";
    return result;
  }

  
  public static int recursiveBinarySearch (int[] input, int x, int start, int end){
    if(start>end)
      return -1;
    int mid = (start + end)/2;
    if(input[mid] == x)
      return mid;
    if(x<input[mid])
      return recursiveBinarySearch(input,x,start,mid-1);   
    return recursiveBinarySearch(input,x,mid+1,end);
  }

  public static int binarySearch (int[] input, int x){
    int start = 0;
    int end = input.length-1;
    while(start<=end){
      int mid = (start + end)/2;
      if(input[mid] == x)
        return mid;
      else if(x<input[mid])
        end = mid-1;
      else
        start = mid+1;
    }
    return -1;     
  }

  public static void main(String[] args){
   
    int[] test = {3,6,1,7,9,2,8,2};
    //System.out.println("First position of 2: "+linearSearch(test,2));
    //Arrays.sort(test);
    //System.out.println("First position of 2: "+displayArray(test));
    //System.out.println("First position of 2 - linear search: "+linearSearch(test,2));
    //System.out.println("First position of 2 - binary search: "+binarySearch(test,2));
    int[] test2 = {7,9,1};
    System.out.println(displayArray(test2));
    selectionSort(test2);
    System.out.println(displayArray(test2));
    //System.out.println("First position of 6 - binary search: "+recursiveBinarySearch(test2,6,0,test2.length-1));
    //System.out.println("First position of 3 - binary search: "+recursiveBinarySearch(test2,3,0,test2.length-1));
    //System.out.println("First position of 1 - binary search: "+recursiveBinarySearch(test2,1,0,test2.length-1));

  }

}
