package org.example.interviewprep;

import java.util.Arrays;

public class StringAnagram {
    public static void main(String[] args) {
        String[] str={"eat","tea","tan","ate","nat","bat"};
        String[] destStr1 = new String[6],destStr2=new String[6];
        destStr1[0]=str[0];
        destStr2[0]="";

        char[] charArr= str[0].toCharArray();
        int count=0;
        for(int i=1;i<str.length;i++) {
            int c=1, d = 0;
            String tempArr = str[i];
            char[] temp=tempArr.toCharArray();

            for (int j = 0; j < charArr.length; j++) {
                for (int k = 0; k < temp.length; k++) {
                    if (charArr[j] == temp[k])
                        count++;
                }
            }
            if (count == charArr.length) {
                destStr1[c] = str[i];
                c++;
            }
            else
            {
                destStr2[d]=tempArr;
                d++;
            }
            count=0;
        }
        System.out.println(Arrays.toString(destStr1));
        System.out.println(Arrays.toString(destStr2));
    }
}
