

public class Arrsorted_r
{
public static void sorted(int []arr,int n)
{

if(n == arr.length - 1){
System.out.println("Sorted");
return;
}

if(arr[n +1]<arr[n]){
    System.out.println("not sorted");
}
n++;
sorted(arr,n);

}

public static void main(String args[]){

int arr[] = {2,1};
int n =0;
sorted(arr,n);



}



}