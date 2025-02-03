import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
	int a[] = {12,4,35,34,78,998,333,667,867};
	System.out.println(Arrays.toString(a));
	
	for(int i = 0;i<a.length-1;i++)
	{
		for(int j = 0;j<a.length-1-i;j++)
		{
			if(a[j]>a[j+1])
			{
				int temp = a[j];
				a[j] = a[j+1];
				a[j+1] = temp;
			}
		}
	}
	for(int i = 0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}// System.out.println(Arrays.toString[a]);
	}
	

}


