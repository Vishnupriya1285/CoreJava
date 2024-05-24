package stringexamples;

import java.util.Arrays;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder stringBuilder=new StringBuilder();
        StringBuilder sb=new StringBuilder();
        sb.append("HetakshVishnupriya Jeevan Hetaksh Reyansh HetakshJeevan Jeevan");
        char[] charArr={'G','H','R'};
        stringBuilder.append('S');
        System.out.println(sb.indexOf("Hetaksh"));
        System.out.println(sb.lastIndexOf("Jeevan"));

        StringBuilder sb1=new StringBuilder();
        sb1.append("My Family::").append(sb).append(" !!!Lovely family of four!!!");
        System.out.println(sb1);

        stringBuilder.append(" Vishnu ");
        stringBuilder.append(38.9);
        stringBuilder.append(" "+15);
        stringBuilder.append(" "+Arrays.toString(charArr));
        stringBuilder.insert(8,"priya");
        stringBuilder.delete(0,1);
        stringBuilder.replace(7,12," S");
        System.out.println(stringBuilder);
        System.out.println(sb.reverse());
    }
}
