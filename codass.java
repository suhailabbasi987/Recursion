public class codass{
public static void main( String []  args)
{
  pintIncreasingNumber(5);
  printDecreasingNumber(5);
  printIncreasingDecreasing(5);
  
    
}
  public class void printIncreasingNumber(int n)
  
    if(n==0)
    {
      return;
    }
    
    printIncreasingNumber(n-1);
    System.out.println(n);
    
  }

  public static void printDecreasingNumber(int n)
  {
    if(n==0)
    {
      return 0;
    }
    
    System.out.println(n);
    printDecreasingNumber(n-1);
    
    
  }

public static void printIncrasingDecreasing(int n)
{
  
  if(n==0)
  {
    return;
  }
  System.out.println(n);
  printIncreasingDecreasing(n-1);
  System.out.println(n);
}


  
  
}
