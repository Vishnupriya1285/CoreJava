package org.example.interviewprep;

public class StringPalindrome {
    public static void main(String[] args) {
        //using StringBuffer
        String palindrome=new String("madam");
        String revStr=new StringBuffer(palindrome).reverse().toString();
        if(palindrome.equals(revStr))
            System.out.println("The given string is a palindrome");
        else
            System.out.println("The given number is not a palindrome");

        //using StringBuilder
        int len=palindrome.length();
        StringBuilder revString=new StringBuilder(len);
        for(int i=len-1;i>=0;i--)
            revString.append(palindrome.charAt(i));

        if(palindrome.equals(revString.toString()))
           System.out.println("The given string is a palindrome");
        else
            System.out.println("The given number is not a palindrome");

        //using char array
         char[] arr=palindrome.toCharArray();
         char temp;
         int i=len-1,j=0;
         while(i>=0)
         {
             temp=arr[j];
             arr[j]=arr[i];
             arr[i]=temp;
             i--;
             j++;
         }
         if(palindrome.equals(new String(arr)))
             System.out.println("The given string is a palindrome");
         else
             System.out.println("The given string is not a palindrome");


    }

}
