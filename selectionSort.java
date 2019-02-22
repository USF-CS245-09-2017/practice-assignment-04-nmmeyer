//selection sort 

public void swap (float[] a,int i, int j)
{
	float temp = a[i];
	a[i] = a[j];
	a[j] = temp;
}

public int findSmallest (float[]a,int start)
{
	int small = start;
	for (int i =start+1; i<a.length;i++)
		{
			if (a[i] < a[small])
			{	
				small = i
			}
		}
	return small; 

public void selectionSort (float[] a);
{
	int small = 0;
	for (i=0; i < a.length-1; i++)
	{
		swap(a,i,findsmallest(a,i));
	}	
}