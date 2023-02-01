package treess;
import java.util.*;
class Binarytreenode<T>
{
	T data;
	Binarytreenode<T>left;
	Binarytreenode<T>right;
	public Binarytreenode(T value)
	{
		data=value;
	}
}
public class BinaryTree {
public static Binarytreenode<Integer>takeinput(Scanner s)
{
	int rootdata;
	System.out.print("Enter the node data");
	rootdata=s.nextInt();
	if(rootdata==-1)
	{
		return null;
	}
	Binarytreenode<Integer> root=new Binarytreenode<>(rootdata);
	root.left=takeinput(s);
	root.right=takeinput(s);
	return root;
}
public static void print(Binarytreenode<Integer>root)
{
	if(root==null)
		return;
	String str=root.data+"";
	if(root.left!=null)
	{
		str=str+"L:"+root.left.data+",";
	}
	if(root.right!=null)
	{
		str+="R:"+root.right.data+",";
	}
	System.out.println(str);
	print(root.left);
	print(root.right);	
}
public static int countNodes(Binarytreenode<Integer>root)
{
	int ans=1;
	if(root==null)
	{
		return 0;
	}
	ans+=countNodes(root.left);
	ans+=countNodes(root.right);
	return ans;
}
public static int diameter(Binarytreenode<Integer>root)
{
  if(root==null)
  {
	  return 0;
  }
  int op1=height(root.left)+height(root.right);
  int op2=diameter(root.left);
  int op3=diameter(root.right); 
  return Math.max(op1, Math.max(op2, op3));
}
  private static int height(Binarytreenode<Integer>root) {
	if(root==null)
		return 0;
	int ans=1;
   int l=height(root.left);
   int r=height(root.right);
   if(l>r)
   {
	   return ans+l;
   }
   else
   {
	   return ans+r;
   }
}
public static Pair1<Integer,Integer>hd(Binarytreenode<Integer>root)
{
	if(root==null)
	{
		Pair1<Integer,Integer>output=new Pair1<>();
		output.first=0;
		output.second=0;
		return output;
	}
	Pair1<Integer,Integer>lo=hd(root.left);
	Pair1<Integer,Integer>ro=hd(root.right);
	int height=1+Math.max(lo.first,ro.first);
	int option1=lo.first+ro.first;
	int option2=lo.second;
	int option3=ro.second;
	int diameter=Math.max(option1, Math.max(option2, option3));
	Pair1<Integer,Integer>output=new Pair1<>();
	output.first=height;
	output.second=diameter;
	return output;
}
public static void inorder(Binarytreenode<Integer>root)
{
	if(root==null)
	{
		return;
	}
	inorder(root.left);
	System.out.print(root.data+" ");
	inorder(root.right);
}
public static void preorder(Binarytreenode<Integer>root)
{
	if(root==null)
		return;
	System.out.print(root.data+" ");
	preorder(root.left);
	preorder(root.right);
}
public static void postorder(Binarytreenode<Integer>root)
{
	if(root==null)
	{
		return;
	}
	postorder(root.left);
	postorder(root.right);
	System.out.print(root.data+" ");
}
public static ArrayList<Integer>get_root_node_path(Binarytreenode<Integer>root,int data)
{
	if(root==null)
	{
		return null;
	}
	if(root.data==data)
	{
		ArrayList<Integer>output=new ArrayList<>();
		output.add(root.data);
		return output;
	}
 ArrayList<Integer>leftoutput=get_root_node_path(root.left,data);
{
		if(leftoutput!=null)
		{
			leftoutput.add(root.data);	
			return leftoutput;
		}
}
ArrayList<Integer>rightoutput=get_root_node_path(root.right,data);
{
		if(rightoutput!=null)
		{
			rightoutput.add(root.data);	
			return rightoutput;
		}
		else
		{
			return null;
		}
}

	
}
public static void main(String args[])
  {
	  Scanner s = new Scanner(System.in);
	  Binarytreenode<Integer>root=takeinput(s);
	  print(root);
	  s.close();
	  System.out.println("diameter"+":"+diameter(root));
	  System.out.println("height"+hd(root));
	  postorder(root);
	  System.out.println();
	  inorder(root);
	  System.out.println();
	  preorder(root);

  }
}
