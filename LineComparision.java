public class LineComparision{
public static void main(String args[]){
int x1=5;
int y1=4;
int x2=7;
int y2=8;
int u1=4;
int v1=5;
int u2=8;
int v2=8;
double length1, length2;
System.out.println("Welcome to line comparision");
length1 = Math.sqrt( (x2 - x1) ^ 2 + (y2- y1) ^ 2);
System.out.println("lenght of first line: " + length1);
length2 = Math.sqrt( (u2 - u1) ^ 2 + (v2- v1) ^ 2);
System.out.println("lenght of second line: " + length2);
String s1 = Double.toString(length1);
String s2 = Double.toString(length2);
double check = s1.compareTo(s2);
if (check == 0){
System.out.println("The two lines are equal");
}
else if(check < 0.0){
System.out.println("Line1 is smaller than Line2");
}
else{
System.out.println("Line1 is greater than Line2");
}
}
}
