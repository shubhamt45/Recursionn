

class Rec_fib
{
public static int fib(int n)
{
if(n<2)
{
    return n;
}

    int small_problem = fib(n-1);
    int small_problem2 =fib(n-2);

    return small_problem + small_problem2;


}


    public static void main(String args[])
    {
        int ans = fib(4);
        System.out.println(ans);
    }
}