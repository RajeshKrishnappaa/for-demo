//import java.util.Arrays;
public class LinearSearch_main {
public static void main(String[] args) {
	int arr[]= {1,2,3,4,5,6,7};
	int to_find=5;
	int ans = LinearSearch(arr,to_find);
	System.out.println(ans);
}
public static int LinearSearch(int[] arr,int value) {
	for(int i=0;i<arr.length-1;i++) {
		if(arr[i]==value) {
			return i;
		}
	}
	return -1;
}
}
