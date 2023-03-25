package JavaDSA;
import java.util.Arrays;
public class BinarySearch {
	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50,60,70,80,90,100};
//		int low=0;
//		int high=arr.length-1;
//		Scanner sc= new Scanner(System.in);
//		System.out.println("Enter The Element You Have To Search:");
//		int key = sc.nextInt();
//		boolean flag= false;
//		while(low<=high)
//		{   int mid=(low+high)/2;
//			if(key==arr[mid])
//			{   System.out.println("Element Found At Index "+mid); 
//				flag=true;
//				break;
//			}
//		    if(arr[mid]<key)
//			{ low=mid+1;
//			}
//			if(arr[mid]>key)
//			{high=mid-1;
//			}	
//		}
//		if(flag==false)
//		{System.out.println("Element Not Found In The Array...");
//		}
		
		
		  // Approach Second Using Java Built-in Functions ( Arrays.binarysearch())
        System.out.println(Arrays.binarySearch(arr,70));

	}
 }
                                         
                     