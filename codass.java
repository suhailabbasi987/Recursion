public class codass{
public static void main( String []  args)
{
  PrintIncreasingNumber(5);
    
}
  public class void printIncreasingNumber(int n)
  {
    if(n==0)
    {
      return;
    }
    
    printIncreasingNumber(n-1);
    System.out.println(n);
    
  }
  
}
