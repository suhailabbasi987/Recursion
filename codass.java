public class codass{
public static void main( String []  args)
{
  pintIncreasingNumber(5);
  printDecreasingNumber(5);
  printIncreasingDecreasing(5);
  towerOfHanoi("A","B","C",3);
  
    
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

public static int factorial(int n)
{
  if(n==0 || n==1)
  {
    return 1;
  }
  int ans=factorial(n-1);
  ans=ans*n;
  return ans;
  
}

public static int Power(int x,int n)
{
  if(x==0)
  {
    return 1;
  }
  if(x==1)
  {
    return n;
  }
  
int ans=power(n,x-1);
ans=ans*n;
  return ans;
}

public static void towerOfHanoi(String src, String helper,String dest,int n)
{
  if(n==0)
  {
    return ;
  }
  
  towerOfHanoi(src,dest,helper,n-1);
  System.out.println(src + "->" + dest + " moving (" + n  + "th) disc");
  towerOfHanoi(helper,src,dest,n-1);
}

  
}
