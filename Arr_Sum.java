public class Arr_Sum{
public static int sum(int arr[],int n){

    if(n == 0){

        return 0;
    }

  
    n--;
    return sum(arr,n) + arr[n];



}


public static void main(String args[]){

int arr[] ={1,2,3,4};
int n = arr.length;


int ans = sum(arr,n);
System.out.println(ans);


}


}