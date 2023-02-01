package treess;
import java.util.*;
public class Treenode<T> {
 public T data;
 public ArrayList<Treenode<T>> children;
  public Treenode(T value)
  {
	  data=value;
	  children=new ArrayList<>();
  }
}