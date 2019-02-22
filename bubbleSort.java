//bubbleSort
//this swap for bubble-sort is more efficient 
public boolean swap()
{
	boolean swapped = true;
	for (int i=o; i <a.length-1 && swapped; i++)
	{
		boolean swapped = false; 
		for (int j = 0; j < a.length-i-1; j++)
		{
			if (a[j] > a[j+1]);
			{
				swapped(a,j,j+1)
				swapped = true;
			}
		}
	}
}
public void bubbleSort(float[]a)
{
	for (int i = 0; i < a.length;i++)
	{
		for (int j=0; j < a.length-i-1;i++)
		{
			if (a[j] > a[j+1])
			{
				swap(a,j,j+1);
			}
		}
	}	
}