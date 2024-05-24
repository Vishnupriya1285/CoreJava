package stringexamples;
import java.util.Arrays;
import java.util.Scanner;


    public class StringOperations {

        public static void main(String[] args) {

            String helloWorld = "Hello World";
            int length = helloWorld.length();
            System.out.println(length);

            //trim
            //substring
            //concat
            //replace
            //split
            //searching- indexOf,contains,lastIndexOf


            String comments = "Social Media Comment on the Platform         ";
            comments = comments.trim();
            System.out.println(comments);

            //SubString
            String subString = comments.substring(7);
            System.out.println(subString);

            subString = comments.substring(7, 20);
            System.out.println(subString);


            //concat
            subString = subString.concat(" "+comments);
            System.out.println(subString);

            //replace
            subString = subString.replace("Comment", "Post");
            System.out.println("Replaced String:: " + subString);

            //split
            String commaSperatedValues = "apple, banana, cat, dog, eat, france, goa";
            String[] stringArray = commaSperatedValues.split(", ");
            for (String value : stringArray) {
                System.out.println(value);
            }

            Scanner scanner = new Scanner(System.in);

            System.out.println("Pls enter the marks of the Student separated with coma::");
            String marksByCommaSeparatedValues = scanner.nextLine();

            String[] marks = marksByCommaSeparatedValues.split(",");
            System.out.println(Arrays.toString(marks));
        }
}
