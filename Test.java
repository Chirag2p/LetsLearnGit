import java.lang.reflect.*;
class Test
 {
	 /*
    public void m1(int x)

    {
       System.out.println("int");
    }

    public void m1(double a)

    {
        System.out.println("double");
    }

    public static void main(String[] args)
   {
        Test t = new Test();
        t.m1(10);
        t.m1(10.5);
        t.m1(10456);
    }
	
	Output
	int
	double
	double
	
	public void m1(String x)
	{
		System.out.println("String");
	}
	public void m1(Object a)
	{
		System.out.println("Object");
	}
	public static void main(String[] args)
	{
		Test t = new Test();
		t.m1(new String());
		t.m1(new Object());
		t.m1(null);
	}
	
	Output
	String
	Object
	String
	
	Test()
	{
		System.out.println("Test no arg constructor");
	}
	Test(int x)
	{
		System.out.println("Test int arg constructor");
	}
	public static void main(String[] args)
	{
		Test t = new Test(10);
	}
	
	Test(double d)
	{
		System.out.println("Double-argument constructor");
	}
	Test(int i)
	{
		this(10.5);
		System.out.println("Int-argument constructor");	
	}
	Test()
	{
		this(10);
		System.out.println("no-argument constructor");
	}
	public static void main(String[] args)
	{
		Test t1 = new Test();
		Test t2 = new Test(10);
		Test t3 = new Test(10.5);
	}
	
	static void m1(int n)
	{
		System.out.println(n);
		if (n < 30)
		{
			m1(n - 5);
		}
		System.out.println(n+n);
	}
	public static void main(String[] args)
	{
		m1(10);
	}
	
	public  void strRecur (String s)
	{
		if (s.length() < 6)
		{
			System.out.println(s);
			strRecur(s+"*");
		}
	}
	public  void main(String[] args)
	{
		strRecur("wyo");
	}
	
	static void m1(int n)
	{
		System.out.println("csd");
		if (n < 6)
		{
			m2(n+2);
			m1(n+1);
		}
		System.out.println(n+n);
	}
	
	static void m2( int n)
	{
		System.out.println(n);
		if (n<6)
			m1(n*2);
	}
	public static void main(String[] args)
	{
		m1(1);
	}
	
	static void m1(int n)
	{
		if(n>0)
		{
			System.out.println(n);
			m1(n-1);
			m1(n-1);
		}
	}
	public static void main(String[] args)
	{
		m1(3);
	}
	
	static int sum(int n)
	{
		int result =0;
		for(int i=1;i<=n;i++)
			result = result+i;
		return result;
	}
	public static void main(String[] args)
	{
		int result=sum(6);
		System.out.println(result);
	}
	
	static int fib(int n)
	{
		if(n==0)
			return 0;
		else if (n==1)
			return 1;
		else 
			return fib(n-1)+fib(n-2);
	}
	public static void main(String[] args)
	{
		int result= fib (7);
		System.out.println(result)
	}
	static void m1(int n)
	{
		System.out.println(n);
		if (n>1)
		{
			m1(n-1);
		}
	}
	public static void main(String[] args)
	{
		m1(5);
	}
	public static void main(String[] args)
	{
		int arr[]={3,4,2,15,12,14,20,25};
		int n=arr.length;
		int arr1[]=new int[n];
		int x=arr[n-1];
		for(int i=n-1;i>0;i--)
			arr1[i]=arr[i-1];
		arr1[0]=x;
		for(int i=0;i<=n-1;i++)
			arr[i]=arr1[i];
		for(int i=0;i<=n-1;i++)
		System.out.print(arr[i]+ " " );
	}
	
	public static void main(String[] args)
	{
		int arrA[]={2,4,5,8,12,13,17,18,20,22,309,999};
		int arrB[]={109,99,68,54,22,19,17,13,11,5,3,1};
		int n=arrA.length;
		int m=arrB.length;
		int x=0;
		for(int i=0;i<=n-1;i++)
		{
			for(int j=m-1;j>0;j--)
				if(arrA[i]==arrB[j])
					x++;
		}
		System.out.print(x);
	}
	
	// Non Repeating Number 
	
	public static void main(String[] args)
	{
		int arr[]={9,4,9,7,6,4};
		int n=arr.length;
		Repeat(arr,n);
	}
	public static void Repeat(int arr[],int n)
	{
		for(int i=0;i<n;i++)
		{
			int count=0;
			for(int j=0;j<n;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
			}
			if(count==1)
			{
				System.out.print(arr[i]);
				return;
			}
		}
	}
	
	public static int common(int[] arrA,int[] arrB)
	{
		int count=0;
		int n= arrA.length;
		int m= arrB.length;
		for(int i=0;i<=n-1;i++)
		{
			for(int j=m-1;j>=0;j--)
			{
				if(arrA[i]==arrB[j])
				{
					count++;
					break;
				}
				else if (arrB[j]>arrA[i])
				break;
			}
		}
		return count;
	}
	public static  void main(String[] args)
	{
		int arrA[]={2,4,5,8,12,13,17,18,20,22,309,999};
		int arrB[]={109,99,68,54,22,19,17,13,11,5,3,1};
		int result =common(arrA,arrB);
		System.out.print(result);
	}
	
	public static int sum(int[] arr,int start,int end)
	{
		int sum =0;
		for(int i=start; i <= end; i++)
			sum = sum+ arr[i];
		return sum;
	}
	public static int findEle(int[] arr, int n)
	{

		for (int i=1; i<=n-2; i++)
		{
			int ls= sum(arr,0,i-1);
			int rs= sum(arr,i+1,n-1);
			int rev=0;
			while(rs>0)
			{
				rev=rs%10;
				rev=rev*10+rev;
				rs=rs/10;
			}
				
			if(ls==rs)
				return arr[i];
		}
		return -1;
	}
	public static void main(String[] args)
	{
		int[] arr= {5,7,3,6,3,4,9,2};
		int n = arr.length;
		int result= findEle(arr,n);
		System.out.print(result);
	}
	
	
	public static void main(String[] args)
	{
		int n=6;
		int sum=0;
		for(int i=1;i<=n;i++)
			sum=sum+i;
		System.out.println(sum);
		
	}
	
	
	
		static  int  sum(int n)
		{
			if (n==0)
			return 0;
			else
				return sum(n-1)+n;
		}
		public static void main(String[] args)
		{
			int result = sum(6);
			System.out.println(result );
		}
		
		
		
		public static void main(String[] args)
		{
			int arr[]={4,6,9,12,23,15,20,25,30};
			int k=29;
			int n=arr.length;
			
			for(int i=0;i<n-2;i++)
			{
				for(int j=i+1;j<n-1;j++)
				{
					
					if (arr[i]+arr[j]==k)
					{
						System.out.println(arr[i]+" "+arr[j]);
						
					}
					
				}
			}
		}
		
		public static int sum(int[]arr,int start , int end)
		{
			int sum=0;
			for(int i=start;i<=end;i++)
				sum=sum+arr[i];
			return sum;
		}
		
		public static int rev(int num)
		{
			int rev=0;
			while (num>0)
				{
					
					rev=(rev*10)+(num%10);
					num/=10;
				}
				return rev;
		}
		public static int findEle(int[]arr,int n)
		{
			for(int i=1;i<n-2;i++)
			{
				int ls=sum(arr,0,i-1);
				int rs=sum(arr,i+1,n-1);
				
				int rev1=rev(rs);
				if (ls==rev1)
					return arr[i];
			}
			return -1;
		}
		public static void main(String[] args)
		{
			int[] arr={5,7,3,6,4,9,2};
			int n=arr.length;
			int result = findEle(arr,n);
			System.out.print(result);
		}
		
		int x=10;
		int y=20;
		public static void main(String[] args)throws CloneNotSupportedException
		{
			Test t=new Test();
			Test t1=(Test)t.clone();
			System.out.println(t.x+ " " +t.y);
			System.out.println(t.x+ " " +t.y);
			t.x=100;
			t.y=200;
			System.out.println(t.x+ " " +t.y);
			System.out.println(t1.x+ " " +t1.y);
		}
		
		public static void main(String[] args)
		{
			String s=new String ("Chirag");
			s.concat("pande");
			String s1=s.concat("deepak");
			s1=s.concat("cp");
			
			
			
			System.out.println(s1);
			System.out.println(s);
			//System.out.println(s2==s3);
		}
		
		public static void main(String[] args)
		{
			StringBuffer sb=new StringBuffer("csd");
			System.out.println(sb.capacity());
			System.out.println(sb.length());
			System.out.println(sb.charAt(1));
			sb.append("cp");
			sb.append(10.7);
			sb.append(true);
			System.out.println(sb+ " ");
			sb.append("q");
			System.out.println(sb.capacity());
		}
		
		
		public static boolean  a(int[]arr,int n)
		{
			HashSet<Integer> hs = new HashSet<Integer>();
			int sum=0;
			for(int ele:arr)
			{
				if(ele ==0||sum==0||hs.contains(sum)==true);
				hs.add(sum);
				return true;
				
				
			}
			return false;
		}
		
				
			
		public static void main(String [] args)
		{
			int []arr={5,6,-1,-2,-3,7,4};
			int n=arr.length-1;
			
			 boolean result=a(arr,n);
			System.out.println(result);
		}
		
		public static int findMissing (int[]arr,int n)
		{
		int sum_n=n*(n-1)/2;
		int sum_arr=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			sum_arr+=arr[i];
			
		}
		return (sum_n - sum_arr);
		}
 
		
		public static void main(String [] args)
		{
			int []arr={5,6,1,2,3,7,4,9};
			int n=9;
			
			 int  result=findMissing (arr,n);
			System.out.println(result);
		}
		
		public static void main(String [] args)throws Exception
		{
			int count=0;
			Class c = Class.forName("java.land.Object");
			Method[] m = c.getDeclearedMethods();
			for(Method m1:m)
			{
				count++;
				System.out.println(m1.getName());
			}
			System.out.println("The number of methods:"+ count);
			
		}
		
		public static void main(String args[]) 
    {
        int arr[]={5,10,15,20,25,18,7,3};
        int n=arr.length-1;
        int x=arr[0];
        for(int i=1;i<=n;i++)
		{
        
            arr[i-1]=arr[i];
            
		}
          arr[n]=x;  
        
        
        for(int i=0;i<=n;i++)
        {
            System.out.print(arr[i]+" ");
        }
       
        
    }
	
		
		//Pattern 8
		public static void main(String args[])
		{
		int n=5;
		
		for(int i=1;i<=n;i++)
		{
			int x=i; int egg=0;
		
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");		
			}
			for(int k=1;k<=(2*i-1);k++)
			{
				System.out.print(x);
				if(egg==0)
					x--;
				else
					x++;
				if(x==1)
					egg=1;
			}
			
			System.out.println();
		}
		
		for(int i=n-1;i>=1;i--)
		{
			int x=i; int egg=0;
		
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");		
			}
			for(int k=1;k<=(2*i-1);k++)
			{
				System.out.print(x);
				if(egg==0)
					x--;
				else
					x++;
				if(x==1)
					egg=1;
			}
			
			System.out.println();
		}
		
 }

 //Pattern 10
 public static void main(String[] args)
 {
	 int x=5;
	 for(int i=1;i<=9;i++)
	 {
		 System.out.print("*");
	 }
	 System.out.println();
	 
		 
	 for(int i=x-1;i>=1;i--)
		{
			
			for(int j=1;j<=(x-i);j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=(2*i-1);k++)
			{
				if(k==1||k==2*i-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
			
 }
  
  
  //Prime number
   public static void main (String[] args)
   {
	   
	   for(int i=1;i<=10;i++)
	   {
		   int count=0;
		   for(int j=1;j<=i;j++)
		   {
			   if(i%j==0)
			   {
				   count++;
			   }
		   }
		   if(count==2)
		   {
			   System.out.print(i + " ");
		   }
	   }
   }
   
   public static void main (String[] args)
   {
	   int []arr={1,2,3,4,5,6,7,8,9};
	   int n=arr.length;
	   int sum1=0;
	   int sum2=0;
	   if(n%2==0)
	   {
		   
	      for(int i=0;i<=(n/2)-1;i++)
	     {
		   sum1=sum1+arr[i];
	     }
	      for(int i=(n/2);i<=n-1;i++)
	     {
		   sum2=sum2+arr[i];
	     }
	     System.out.print(sum1*sum2);
	   }
	   else
	   {
		   for(int i=0;i<=(n/2);i++)
	     {
		   sum1=sum1+arr[i];
	     }
	      for(int i=(n/2)+1;i<=n-1;i++)
	     {
		   sum2=sum2+arr[i];
	     }
	     System.out.print(sum1*sum2);
	   }
		   
   }
   
   public static void main (String[] args)
   {
	   int []arr={1,2,5,4,7,3,0};
	   int n=arr.length;
	   int sum1=0;
	   int sum2=0;
	   if(n%2==0)
	   {
		   
	      for(int i=0;i<=(n/2)-1;i++)
	     {
		   sum1=sum1+arr[i];
	     }
	      for(int i=(n/2);i<=n-1;i++)
	     {
		   sum2=sum2+arr[i];
	     }
	     System.out.print("To make the array balance you have to add" + " " + (sum1-sum2));
	   }
	   else
	   {
		   for(int i=0;i<=(n/2);i++)
	     {
		   sum1=sum1+arr[i];
	     }
	      for(int i=(n/2)+1;i<=n-1;i++)
	     {
		   sum2=sum2+arr[i];
	     }
	     System.out.print("To make the array balance you have to add" + " " + (sum1-sum2) );
	   }
		   
   }
   public static void main(String args[])
   {
      String s="nevermind";
      int n=s.length() -1;
      char a=s.charAt(0);
      String s1="";
      for(int i=1;i<=n;i++)
      {
         
          s1=s1+s.charAt(i);
        
      }
      s1=s1+ a + "ay";
      System.out.print(s1);

      
    }
   
   public static void main (String[] args)
   {
	   int n=5;
	   for(int i=n;i>=1;i--)
	   {
		    
		   for(int j=1;j<=i;j++)
		   {
			   if(j==2*j-1 || j==n)
			   {
				   
			   System.out.print(j+" ");
			   }
			   else
				   System.out.print(" "+" ");
				   
			   
		   }
		   System.out.println();
	   }
   }
   */
   public static void main(String [] arhs)
   {
	   int[] arr1={1,2,3,4,7,9};
	   int[] arr2={0,1,2,1,1,4};
	   int [] result=new int[arr1.length];
	   int count=0;
	      
	  
	   
	   for(int i=0;i<arr1.length;i++)
	   {
		   count=0;
		   for(int j=0;j<arr2.length;j++)
		   {
			   if(arr2[j]<=arr1[i])
				   count++;
			   
		   }
		   result[i]=count;
	   }
	   for(int ele:result)
		   System.out.print(ele+ " ");
   }
(chirag)
 }
				
	 