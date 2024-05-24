package com.java.exceptionhandling;

import java.io.*;

public class FileNotFoundClass {
    public static void main(String[] args) {

        FileReader fileReader;
        FileWriter fileWriter;
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileReader = new FileReader("C:\\Users\\jeeva\\IdeaProjects\\JavaTrainingMagnus\\files\\Marks.txt");
            bufferedReader = new BufferedReader(fileReader);

            fileWriter = new FileWriter("C:\\Users\\jeeva\\IdeaProjects\\JavaTrainingMagnus\\files\\Marks_New.txt");
            bufferedWriter = new BufferedWriter(fileWriter);
            String line;
            while ((line=bufferedReader.readLine()) != null) {
                System.out.println(line);
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("The file specified is not found: " + e.getMessage());
        } catch (IOException ioException) {
            System.out.println(ioException.getMessage());
        }
        finally{
            try {
                bufferedReader.close();
                bufferedWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
