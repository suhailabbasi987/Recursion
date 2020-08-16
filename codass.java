public class codass{
public static void main( String []  args)
{
  int [] arr = {1,2,3,4,5};
  pintIncreasingNumber(5);
  printDecreasingNumber(5);
  printIncreasingDecreasing(5);
  towerOfHanoi("A","B","C",3);
  printArray(arr,0);
  printReverseArray(arr,0);
  printIncDecArray(arr,0);
 System.out.println("data is "+ dataFound(arr,3,0)); 
    
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


public static void printArray(int [] arr,int vidx)
{
  if(vidx==arr.length)
  {
    return;
  }
  
  System.out.println(arr[vidx]);  // this line print before call so its print value as it is as array order.
  printArray(arr,vidx+1);
  
}
  
public static void printReverseArray(int [] arr,int vidx)
{

  if(vidx == arr.length)
  {
    return;
  }
  printReverseArray(arr,vidx+1);  
  System.out.println(arr[vidx]);  // this line print after calls so after reaching basecase on the way of return n drop back this line will be executed

}

public static void printIncDecArray(int [] arr,int vidx)
{
  if(arr.length == vidx)
  {
    return ;
  }
   
  System.out.println(arr[vidx]);  // this line executed before calls 
  printIncDecArray(arr,vidx+1);   // this is call  
  System.out.println(arr[vidx]);  // this line executed after return in function
}

public static boolean dataFound(int []arr,int data,int vidx)
{

  if(arr.length == vidx)
  {
    return false;
  }
  
  if(data == arr[vidx])
  {
    return true;
  }
  
  boolean ans=dataFound(arr,data,vidx+1);
  return ans;
  
  
 }


public static int firstIndex (int [] arr,int data,int vidx)
{
  if(vidx == arr.length)
  {
    return -1;
  }
  
  if(data == arr[vidx])
  {
    return vidx;
  }
  
  int ans = fisrtIndex(arr,data,vidx+1);
  return ans;
}

public static int lastIndex(int []arr, int data,int vidx)
{
  if(data==)
  
  int ans=lastIndex(arr,data,vidx+1)
  return ans;
  
}

}
