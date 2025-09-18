//import java.util.Arrays;
public class BinarySearch_main {
public static void main(String[] args) {
	int arr[]= {1,2,3,4,5,6,7};
	int to_find=5;
	int ans = BinarySearch(arr,to_find);
	System.out.println(ans);
}
public static int BinarySearch(int[] arr,int value) {
	int low=0;
	int high=arr.length-1;
	
	while(low<=high) {
		int mid=(low+high)/2;
		if(arr[mid]==value) {
			return mid;
		}
		if(arr[mid]<value) {
			low=mid+1;
		}
		else {
			high=mid-1;
		}
	}
	return -1;
}
}
