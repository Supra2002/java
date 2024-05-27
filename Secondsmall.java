import java.util.*;
class Secondsmall{
    public static void main(String[] args){
        int arr[] = {10, 30, 20, 40, 50};
        int min = arr[0];
        int n = arr.length;
        int sec_smallest = Integer.MAX_VALUE;

        for(int i=0; i<n; i++){
            if(min>arr[i]){
                min = arr[i];
            }
        }

        for(int i=0; i<n; i++){
            if(arr[i]!=min && sec_smallest>arr[i]){
                sec_smallest = arr[i];
            }
        }

        System.out.println("The second smallest number is: " + sec_smallest);

    }
}