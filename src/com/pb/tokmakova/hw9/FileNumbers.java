package com.pb.tokmakova.hw9;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class FileNumbers {

    public static void createNumbersFile() {
        Path path = Paths.get("numbers.txt");
        System.out.println("Writing File...");
        try (FileWriter writer = new FileWriter("numbers.txt")) {
            Random random = new Random();
            int[][] array = new int[10][10];
            for (int i = 0; i < array.length; i++, System.out.println(" "))
                for (int j = 0; j < array.length; j++) {
                    array[i][j] = random.nextInt(100);
                    String s = Integer.toString(array[i][j]);
                    System.out.print(" ");
                    writer.write(" ");
                    writer.write(s);
                    System.out.print(s);
                }
            writer.write("\n");
                  } catch (Exception ex) {
            System.out.println("Error with file write: " + ex);
        }
        System.out.println("");
        System.out.println("Write to file \"" + path.toAbsolutePath() + "\" done!");



    }

    public static void createOddNumbersFile() throws IOException {
        System.out.println("Reading File...");
        try (Scanner in = new Scanner(new File("numbers.txt"));
             PrintWriter out = new PrintWriter(new FileWriter("odd-numbers.txt"));) {
            System.out.println("Выводим и заменяем четные числа на '0':");
            while (in.hasNextLine()) {
                Scanner line = new Scanner(in.nextLine());
                while (line.hasNextInt()) {
                    int X = line.nextInt();
                    if (X % 2 == 0) {
                        System.out.format("%d -> 0, ", X);
                        X = 0;
                    } else
                        System.out.print(X + ", ");
                    out.print(X + ", ");
                }
                line.close();
                out.println();
                System.out.println();
            }
        } catch (IOException x) {
            System.out.println("IO error: " + x);
        }
        System.out.println("Read to file done!");
    }
        public static void main (String[]args) throws IOException {
            createNumbersFile();
            createOddNumbersFile();
        }
    }




