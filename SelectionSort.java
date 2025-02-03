import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int a[] = {5,4,3,2,1};
		System.out.println(Arrays.toString(a));
		
		for(int i =0;i<a.length-1;i++)
		{
			int min = i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[min])
				{
					min = j;
				}
				
			}
			int temp = a[i];		
			a[i] = a[min];
			a[min] = temp;
		}
		
	
		System.out.println(Arrays.toString(a));

	}
	  

}
