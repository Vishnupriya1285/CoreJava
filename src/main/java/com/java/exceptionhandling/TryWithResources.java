package com.java.exceptionhandling;

import java.io.*;

public class TryWithResources {
    public static void main(String[] args) {

        try(BufferedReader br=new BufferedReader(
                new FileReader("C:\\Users\\jeeva\\Desktop\\Java\\Practice\\Practie.txt"));
            BufferedWriter bw=new BufferedWriter(
                    new FileWriter("C:\\Users\\jeeva\\Desktop\\Java\\Practice\\Practice.txt"))
        ){
            String line="";
            while((line=br.readLine())!=null)
            {
                System.out.println(line);
                bw.write(line);
                bw.newLine();
                if(line.equalsIgnoreCase("interfaces"))
                {
                    //bw.newLine();
                    bw.write("Multiple Inheritance through interfaces");
                    bw.newLine();
                }
                //System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
