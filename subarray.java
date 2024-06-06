import java.util.*;

public class subarray {
    public static void printSubarray(int num[]){

    int ts =0; // for finding total pairs
        for(int i=0; i<num.length;i++){  //This loop is just for first value
            int start=i;
            for(int  j=1; j<num.length; j++){  // This value is just for end value
                int end=j;
                for(int k=start; k<=end;k++){  // This is just for printing both
                    System.out.print(num[k]+" ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total pairs are :"+ ts);
    }
   public static void main(String args[]){
    int num[]={2,4,6,8,10};

printSubarray(num);
   } 
}   
