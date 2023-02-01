package classes_and_objects;

public class Studentclass {
   public String name;
   int rollno;

  public Studentclass(String n, int rn)
  {
	name=n;
	rollno=rn;
  }
  public void setRollnumber(int rn)
  {
	  if(rn<=0)
	  {
		  return;
	  }
	  rollno=rn;
  }
public int getrollrno()
{
	return rollno;
}
  
}