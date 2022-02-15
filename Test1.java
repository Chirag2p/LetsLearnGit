import java.util.HashSet;
class Test1
{
	/*
	public static int bsearch(int[]arr,int ele)
	{
		int n=arr.length;
		int l=0,h=n-1,mid;
		while (h>=1)
		{
			mid =(l+h)/2;
			if (arr[mid]==ele)
				return mid;
			else if (arr[mid]>ele)
				h=mid-1;
			else
				l=mid+1;
		}
		return -1;
	}
	
	public static void main(String[] args)
	{
		int arr[]={10,20,30,40,50,60};
		for(int i=1;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+ " " );
		}
		for(int i=0;i<=0;i++)
		{
			System.out.print(arr[i]+ " " );
		}
	}
	
	
	static int printUnion(int arr1[], int arr2[], int m, int n)
    {
        int i = 0, j = 0;
        while (i < m && j < n) 
		{
			if (arr1[i] < arr2[j])
               System.out.print(arr1[i++]+" ");
			
            else if (arr2[j] < arr1[i])
                System.out.print(arr2[j++]+" ");
			
            else 
			{
                System.out.print(arr2[j++] + " ");
                i++;
			}
		}
		while (i<m)
			System.out.print(arr1[i++]+" ");
		while (j<n)
			System.out.print(arr2[j++]+" ");
        return 0;
	}
 
    public static void main(String args[])
    {
        int arr1[] = {1,2,3,5,6,7};
        int arr2[] = {3,6,8,7,20};
        int m = arr1.length;
        int n = arr2.length;
        printUnion(arr1, arr2, m, n);
    }
}
	
	/*
	
	public static int[] elesum(int[] arr, int n)
	{
		int[] final1=new int[n];
		for ( int i=0;i<n;i++)
		{
			int result=0;
			int x=arr[i];
			int sum=0;
			while(x>0 || sum >9)
			{
				if(x==0)
				{
					x=sum;
					sum=0;
				}
				result = result +(x%10);
				x=x/10;
			}
			final1[i]= result;
		}
		return final1;
	}
	public static void main(String[] args)
	{
		int arr[]={};
		int result[]=elesum(arr,arr.length);
		for(int i=0;i<result.length;i++)
			System.out.print(result[i] +" ");
	}
	
	
	
	public static int Add(int[] arr,int first, int last)
	{
		int sum=0;
		for(int i= first;i<=last;i++)
			sum= sum + arr[i];
		return sum;
	}
	public static int findEle(int [] arr, int n)
	{
		int ls=0, rs=0;
		for(int i=1;i<n;i++)
		{
			ls=Add(arr,0,i-1);
			rs=Add(arr,i+1,n);
			if (ls==rs)
				return arr[i];
		}
		return -1;
	}
	
	




	public static void main(String[] args)
	{
		int[] arr={5,7,3,6,4,9,2};
		int n =arr.length-1;
		for(int i=0;i<n;i++)
		{
			arr[n]=
	}
	
}
	
	public static void main(String[] args)
	{
		int n= 334526,sum=0;
		while (n>0|| sum>9)
		{
			if(n==0)
			{
				n=sum;
				sum=0;
			}
			sum=sum+(n%10);
			n=n/10;
		}
		System.out.print(sum);
	}
	
	
	public static void main(String[] args)
	{
		int arr[] = {5,6,8,9};
		int k = 3;
		int n = arr.length-1;
		int a= arr[k-1];
		
		for(int i=0;i<=n;i++)
		{
			if(i<k-1)
			{
				arr[k-1]=arr[i];
				i++;
				arr[0]=a;
				
			}
			else if (i>=k)
			{
				
				int temp=arr[n];
				arr[n]=arr[i];
				arr[n-1]=temp;
				n--;
				
			}
			
		}
		for(int x:arr)
			System.out.print(x+" ");
	}
	
	
	//Hashset with Order of n
	public static boolean findSubArray(int[]arr)
	{
		HashSet<Integer> hs=new HashSet<Integer>();
		int sum=0;
		for(int ele:arr)
		{
			sum=sum+ele;
			if(ele==0||sum==0||hs.contains(sum)==true)
				return true;
			hs.add(sum);
		}
		return false;
	}
	public static void main(String[] args)
	{
	  int[]arr={4,2,-3,1,6};
	  boolean result=findSubArray(arr);
	  System.out.print(result);
	}
	
	public static int []  find(int arr[],int n)
	{
		int []arr1=new int [n+1];
		int a=arr[1];
		int b=arr[n-1];
		
		for(int i=3;i<=n;i++)
		{
			if(arr[i]%2==0)
			arr1[i-2]=arr[i];
		}
		
		arr1[n]=a;
		for(int j=0;j<=n-2;j++)
		{
			if(arr[j]%2!=0)
			arr1[j+2]=arr[j];
		}
		arr1[0]=b;
		return arr1;
		
		
		
	}
			
	public static void main(String[] args)
	{
		int[]arr={1,2,3,4,5,6,7,8};
		int n=arr.length-1;
		int result[]=find(arr,n);
		for (int x:result)
			System.out.print(x);
		
	}
	
	public static void main(String[] ars)
    {
       int x=5;
       for(int i=1;i<=1;i++)
       {
           for( int k=1;k<(x-i);k++)
           {
               System.out.print(" ");
           }
           for(int j=1;j<=i;j++)
           {
               System.out.print("* ");
           }
           System.out.println();
       }
    }
	
	public static void main(String[] ars)
	{
		int n=6;
		for(int i=1;i<=n;i++)
		{
			
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
				
			}
			System.out.println();
		}
		
		for(int i=n-1;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
			
					
		
	}
			
	public static void main(String[] ars)
	{
		int n=6;
		int num=1;
		for(int i=1;i<=n;i++)
		{
			num =1;
			for(int j=1;j<=i;j++)
			{
				System.out.print(num+" ");
				num++;
				if(num==10)
					 num=1;
			
			}
			System.out.println();
		}
	}
	
	public static void main(String[] ars)
	{
	int n=4;
	
	for(int i=1;i<=n;i++)
	{
		 
		   for(int j=1;j<=i;j++)
		  {
			System.out.print(" ");
		  }
		  
		  for(num=i;num<=n;num++)
		  {
			  System.out.print(num+" ");
		  }
		  System.out.println();
	}
	for(int i=5;i>=1;i--)
	{
		
		   
		   for(int j=1;j<=i;j++)
		  {
			System.out.print(" ");
		  }
		  
		  for(num=i;num<=n;num++)
		  {
			  System.out.print(num+" ");
		  }
		  System.out.println();
	}
	}

	public static void main(String[] ars)
	{
		int n=6;
		int a=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				
				System.out.print(a + " ");
				a++;
				if(a<=n-i)
					a=1;
				
				
			}
			System.out.println();
		}
	}
	
	public static void main(String[] ars)
	{
		int n=4;
		for(int i=4;i>=1;i--)
		{
			int a=97;
			for(int j=1;j<=i;j++)
			{
				
				System.out.print((char)a + " ");
				a++;
				
			}
			System.out.println();
		}
		
		for(int i=1;i<=n;i++)
		{
			int a=97;
			for(int j=1;j<=i;j++)
			{
				
				System.out.print((char)a + " ");
				a++;
				
			}
			System.out.println();
		}
	}
    
	public static void main(String[] ars)
	{
		int x=5;
		
		for(int i=1;i<=x;i++)
		{
			
			for(int j=i;j>=1;j--)
			 {
				 System.out.print(j+" ");
				
				 
			 }
			 
		   System.out.println();
		}
		
	}
	
	//Diamond
	public static void main(String[] ars)
	{
		int x=5;
		
		for(int i=1;i<=x;i++)
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
	
	
	//10101
	
	public static void main(String[] ars)
	{
		int x=5;
		
		for(int i=1;i<=x;i++)
		{
			for(int j=1;j<=x;j++)
			{
				if((i+j)%2+1!=1)
					System.out.print("0");
				else
					System.out.print("1");
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] ars)
	{
		int x=7;
		
		for(int i=1;i<=x;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(j==1||j==i)
					System.out.print("#" + " ");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		for(int i=x-1;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				if(j==1||j==i)
					System.out.print("#" + " ");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	// A school method based JAVA program
// to check if a number is prime


	static boolean isPrime(int n)
	{
		
		if (n <= 1)
			return false;

		
		for (int i = 2; i < n; i++)
			if (n % i == 0)
				return false;

		return true;
	}

	
	public static void main(String args[])
	{
		if (isPrime(11))
			System.out.println(" true");
		else
			System.out.println(" false");
		if (isPrime(15))
			System.out.println(" true");
		else
			System.out.println(" false");
	}
    
	public static void main(String[] ars)
	{
		int x=5;
		String result= "";
		for(int i=1;i<=x;i++)
		{
			
			for(int j=1;j<=x-i;j++)
			{
				result =result + " " ;
			}
			for(int k=1;k<=i;k++)
			{
				
					result = result + i ;
				
			}
			result =result+ "\n";
			System.out.print(result);
		}
	}
	*/
	public static void main(String[] ars)
	{
		int n=5;
		for(int i=5;i>=1;i--)
		{
			System.out.print("*" + " ");
		}
		System.out.println();
		for(int i=1;i<=1;i++)
		{
			System.out.print("*"+ " ");
		}
		for(int j=1;j<=n+1;j++)
		{
			System.out.print(" ");
		}
		for(int i=1;i<=1;i++)
		{
			System.out.print("*"+ " ");
		}
		System.out.println();	
		for(int i=5;i>=1;i--)
		{
			System.out.print("*" + " ");
		}
		System.out.println();
	}
		
	}
			
	
	

				
	
				
