package variableType_Casting;

public class NonPrimitiveString {
public static void main(String[] args) {
	String s1=" Java Developer";
	String s2="Velocity";
	String s3="velocity";
	String s4="VELOCITY";
	String s5="Mava";
	String s6=new String("Velocity");
	
	System.out.println(s1.isEmpty());
	System.out.println(s1.length());
	System.out.println(s4.toLowerCase());
	System.out.println(s3.toUpperCase());
	System.out.println(s1.startsWith(s6));
	System.out.println(s1.endsWith("per"));
	System.out.println(s1.concat("is know as mava developer"));
	System.out.println(s1.charAt(10));
	System.out.println(s1.indexOf("a"));
	System.out.println(s1.lastIndexOf("r"));
	System.out.println(s1.substring(5));
	System.out.println(s2.equals(s6));
	System.out.println(s2.equalsIgnoreCase(s4));
	
	System.out.println(s2==s6);
	System.out.println(s1.replaceAll("Java", "Mava"));
	System.out.println(s1.trim());
}}
