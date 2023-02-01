package treess;
import java.util.*;
public class Treeuse {
public static void postordertraversal(Treenode<Integer>root)
{
	if(root==null)
		return;
	for(int i=0;i<root.children.size();i++)
	{
		postordertraversal(root.children.get(i));
	}
	System.out.print(root.data);
}
public static void preordertraversal(Treenode<Integer>root)
{
	if(root==null)
		return;
	System.out.print(root.data);
	for(int i=0;i<root.children.size();i++)
	{
		preordertraversal(root.children.get(i));
	}
}
public static Treenode<Integer>takeinput(Scanner s)
	{
		System.out.print("enter the next node data: ");
		int n=s.nextInt();
		Treenode<Integer>root= new Treenode<>(n);
		 System.out.print("enter the no of childrens: ");
		 int childcount=s.nextInt();
		 for(int i=0;i<childcount;i++)
		 {
			 Treenode<Integer>child=takeinput(s);
			 root.children.add(child);
		 }
		return root;
	}
public static void print(Treenode<Integer>root)
{
	String s=root.data+":";
	for(int i=0;i<root.children.size();i++)
	{
		s=s+root.children.get(i).data+",";
	}
	System.out.println(s);
	for(int i=0;i<root.children.size();i++)
	{
		print(root.children.get(i)); 
	}
}
public static int numnodes(Treenode<Integer>root)

{
	int count=root.data;
	for(int i=0;i<root.children.size();i++)
	{
		count+=numnodes(root.children.get(i));
	}
	return count;
}
public static int returnlargest(Treenode<Integer>root)
{
	if(root==null)
		return Integer.MIN_VALUE;
	int ans=root.data;
	for(int i=0;i<root.children.size();i++)
	{
		int childlargest=returnlargest(root.children.get(i));
		if(childlargest>ans)
		{
			ans=childlargest;
		}
	}
	return ans;
}
public static int noofnodesgreaterthan(Treenode<Integer>root,int x)
{
	int count=0;
	if(root.data==null)
		return Integer.MIN_VALUE;
	if(root.data>x)
		count++;
	for(int i=0;i<root.children.size();i++)
	{
		int childnodes=noofnodesgreaterthan(root.children.get(i),x);
		count=count+childnodes;
	}
	return count;
}
public static int heightoftree(Treenode<Integer>root)
{
	int height=0;
	for(int i=0;i<root.children.size();i++)
	{
		int childheight=heightoftree(root.children.get(i));
		if(childheight>height)
		{
			height=childheight;
		}
	}
	return height+1;
}
public static void printlevelatK(Treenode<Integer>root,int k)
{
	if(k<0)
		return;
	if(k==0) {
		System.out.print(root.data);
		return;
	}
	for(int i=0;i<root.children.size();i++)
	{
		printlevelatK(root.children.get(i),k-1);
	}
}
public static int  countLeafNodes(Treenode<Integer>root)
{
	int count=0;
	if(root.children.size()==0)
	{
		count=count+1;
	}
	for(int i=0;i<root.children.size();i++)
	{
		countLeafNodes(root.children.get(i));
	}
	return count;
}
public static void main(String args[])
{
	Treenode<Integer>root=new Treenode(1);
	Treenode<Integer>node1=new Treenode(2);
	Treenode<Integer>node2=new Treenode(3);
	Treenode<Integer>node3=new Treenode(4);
	Treenode<Integer>node11=new Treenode(5);
	Treenode<Integer>node12=new Treenode(5);
	Treenode<Integer>node21=new Treenode(7);
	root.children.add(node1);
	root.children.add(node2);
	root.children.add(node3);
	node1.children.add(node11);
	node2.children.add(node21);
	node1.children.add(node12);
	System.out.print(root);
	Scanner s=new Scanner(System.in);
	Treenode<Integer>t=takeinput(s);
//	System.out.println(noofnodesgreaterthan(t,3));	
//	System.out.println(heightoftree(t));
//    printlevelatK(root,2);
	//preordertraversal(t);
	postordertraversal(t);
}
}
