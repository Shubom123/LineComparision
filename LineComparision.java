public class LineComparision
{
public static int x1=5;
public static int y1=4;
public static int x2=7;
public static int y2=8;
public static int u1=4;
public static int v1=5;
public static int u2=8;
public static int v2=8;
public static double length1, length2;
public static String s1, s2;

public static void length1()
{
  length1 = Math.sqrt( (x2 - x1) ^ 2 + (y2- y1) ^ 2);
  System.out.println("lenght of first line: " + length1);
  s1 = Double.toString(length1);
}

public static void length2()
{
  length2 = Math.sqrt( (u2 - u1) ^ 2 + (v2- v1) ^ 2);
  System.out.println("lenght of second line: " + length2);
  s2 = Double.toString(length2);
}

public double checkCompareTo()
{
  double check = s1.compareTo(s2);
  if (check == 0)
	{
	System.out.println("The two lines are equal");
	}
  else if(check < 0.0)
	{
	System.out.println("Line1 is smaller than Line2");
	}
  else
	{
	System.out.println("Line1 is greater than Line2");
	}
	return(check);
}
public void checkEquals()
{
  if (s1.equals(s2))
	{
	System.out.println("The two lines are equal");
	}
  else
	{
	System.out.println("The two lines are not equal");
	}
}

public static void main(String args[])
{
  LineComparision l1 = new LineComparision(); 
  System.out.println("Welcome to line comparision");
  length1();
  length2();
  l1.checkCompareTo();
  l1.checkEquals();
}
}
