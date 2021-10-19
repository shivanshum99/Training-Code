import java.util.*;
 
class OddEven
{
    static void sortevenodd(int arr[])
    {
        int n=arr.length;
        int l=0, r=n-1;
	int k=0; 
        while (l<r)
        {
            
            while(arr[l]%2==0&&l<r)
                l++;
		k++;
 
            
            while(arr[r]%2==1&&l<r)
                r--;
 
            if(l<r)
            {
                int temp=arr[l];
                arr[l]=arr[r];
                arr[r]=temp;
                l++;
                r--;
            }
        }
	Arrays.sort(arr, 0, k, Collections.reverseOrder());
	Arrays.sort(arr, k, n);
    }
    public static void main (String[] args)
    {  
	Scanner sc=new Scanner(System.in);
	int[] arr = new int[10];  
	System.out.println("Enter the elements of the array: ");  
	for(int i=0; i<10; i++)  
	{  
  		arr[i]=sc.nextInt();  
	}  
        sortevenodd(arr);
 
        System.out.print("Array after sort ");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i]+" ");
    }
}