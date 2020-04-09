1.**Write TWO (2) different ways to create an object from the String class.**
       
   #### String obj1 = “ first way ”;
   #### String obj2 = new String(“ second way ”);

2.**What is the output for the following Java statements?**

        String phr = new String("Big,blue sky");
        System.out.println(phr.substring(phr.indexOf(","),7));
       
   ### Output : ,blu
	
3.**Give your description on the output that will be produced by the execution of the following statements.**

        Random rd = new Random();
        System.out.println(rd.nextInt(41) + 10);

   ### Answer: The output is the sum of random number generated in the range of 0 to 40 and 10. 

4. **Write Java code segment that use class Random to generate two random numbers that is greater than or equal to 0, and less than 100  and store the values into local variable num1 and num2.  Then use class Math to determine and display the largest between both values.**

   https://github.com/KerryWongSzeKay/A192-Programming2-Exercise-/blob/master/Exercise%203/Task4.java
    
  ![image](https://user-images.githubusercontent.com/61194252/78867292-70c4e100-7a73-11ea-99b2-90224ed19da2.png)

5.**Determine the output of the following code segments:**

        String test = "abc";
        test = test + test;
        System.out.println(test); 

   ### Output: abcabc

        Random random = new Random();
        double d = Math.round ( 2.5 + random.nextInt(1) );
        System.out.println("The value is ” + d);

   ### Output : The value is 3.0

6.**Class Scanner in Java is used to read input from the console.  Answer all of the following questions:**

   a) Write a Java statement to instantiate an object input of class Scanner.

   ### Scanner console = new Scanner(System.in);
  
   b) By using the object input, read two integer values and assigned to variable x and y.

   ### System.out.println("Enter two integer values: ");
   ### int x = console.nextInt();
   ### int y = console.nextInt();
   
   c) By using an appropriate method from class Math, display the value of Xy.
	
   ### System.out.println(Math.pow(x,y));

7.**Given below are the statements that declare and create two String objects**

          String text1 = "School of Computing";
          String text2 = "College of Arts and Sciences";
          String text3 = “UUM Sintok”;

   a.	Write a Java statement to display the total length of the text1, text2 and text3.

   ### System.out.println("Total length: " + (text1.length()+text2.length()+text3.length()));

   b.	By using the variables of text1 and text2. Write a Java statement to display as output “College of Arts and Computing”.

   ### System.out.println(text2.substring(0,20) + text1.substring(10));
