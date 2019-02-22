//insertsort 

public void insertionsort (float[] a)
{
	int temp;
	for (i=1;i<a.length;i++)
	{
		temp = arr[i];
		j = i-1;
	}
	
	while(j>=0 && a[j] > temp)
	{
		a[j+1] = a[j];
		j--; 
	}
	a[j+1] = temp; 
} 