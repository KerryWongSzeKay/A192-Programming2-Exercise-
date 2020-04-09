public class  StringExercise 
 { 
   public static void main (String[]args) 
   { 
   String college=new String ("College of Arts and Sciences "); 
   String town="UUM Sintok";   //   part   (a) 
   int stringLength;//declare stringLength as int
   String change1,change2,change3; 
   stringLength=college.length();   //   part   (b) 
   System.out.println   (college   +   "contains "   +   stringLength   +   " characters.");//display college and stringLength
   change1=college.toUpperCase();   //   part   (c) 
   System.out.println   ("The string is all in upper case: " + change1);//display change1 
   change2=change1.replace('O','*') ;   //   part   (d) 
   System.out.println   ("All capital O's are replaced with the asterisk character: "   +   change2);//display change2 
   change3=college.concat (town) ;   //   part   (e) 
   System.out.println   ("The final string is "   +   change3);//display change3
   } 
 }   