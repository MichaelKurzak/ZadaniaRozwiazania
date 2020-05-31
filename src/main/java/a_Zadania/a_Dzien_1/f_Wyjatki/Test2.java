package a_Zadania.a_Dzien_1.f_Wyjatki;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {

        try {
            String firsLine = readFirstLine("text.txt");
            System.out.println(firsLine);
        } catch (FileNotFoundException e) {
            System.out.println("Nie odnaleziono pliku");
        }
    }


    public static String readFirstLine(String path) throws FileNotFoundException {
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        return scanner.nextLine();
    }


}
