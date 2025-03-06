package JavaProjects;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String str;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter (info/help/exit) : ");
        str = scanner.nextLine();
        if(str.equals("help")){
            Ajutor.afisare();
        }else if(str.equals("info")){
            Ajutor.info();
        }else if(str.equals("exit")){*