package treess;
public class Binarysearchtree {
Binarytreenode<Integer>root;
public void insertdata(int data)
{
	if(root==null)
	{
		root.data=data;
	}
	
}
public boolean hasdata(int data)
{
	return hasdata1(data,root);
}
public boolean hasdata1(int data,Binarytreenode<Integer>root)
{
	if(root==null)
	{
		return false;
	}
	if(root.data==data)
		return true;
	else if(data>root.data)
	{
		return hasdata1(data,root.left);
	}
	else
	{
		return hasdata1(data,root.right);
	}
}
}
