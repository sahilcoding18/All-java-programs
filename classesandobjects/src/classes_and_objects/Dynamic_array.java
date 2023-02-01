package classes_and_objects;
public class Dynamic_array {
  private int data[];
  private int nextindex;
  public Dynamic_array()
  {
	  data=new int[5];
	  nextindex=0;
  }
  public int size() {
	  return nextindex;
  }
public void add(int element)
{
	if(nextindex==data.length)
	{
		restructure();
	}
	data[nextindex]=element;
	nextindex++;
}
private void restructure()
{
	int temp[]=data;
	data=new int[data.length*2];
	for(int i=0;i<temp.length;i++)
	{
		data[i]=temp[i];
	}
}
public void set(int index,int element)
{
	if(index>nextindex)
	{
		return;
	}
	else if(index<nextindex)
	{
		data[index]=element;
	}
	else
	{
		add(element);
	}
}
public int get(int index)
{
	if(index>=nextindex)
	{
		return -1;
	}
	return data[index];
}
public boolean isempty()
{
	if(size()==0)
	{
		return true;
	}
	else
	{
		return false;
	}
}
public int removelast()
{
	if(size()==0)
	{
		return -1;
	}
    int value=data[nextindex-1];
    data[nextindex-1]=0;
    nextindex--;
    return value;
}
}