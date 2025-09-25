import java.util.*;
public class Count
{
public static void main(String[] args)
{
String str = "Sushma";
str= str.toLowerCase();
int count=0;
for(int i=0; i<str.length(); i++)
{
if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
{
count++;
}
System.out.println("Total number of Vowels in a string are: " +count);
}
}
}