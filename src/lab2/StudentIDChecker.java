package lab2;

import java.util.Scanner;

public class StudentIDChecker {
    static boolean isProperLength(String id){
        if(id.length() != 10) {
            System.out.println("The input length should be 10.");
            return false;
        }
        return true;
    }
    static boolean hasProperDivision(String id){
        if(id.charAt(4) != '-') {
            System.out.println("Fifth character should be `-`");
            return false;
        }
        return true;
    }
    static boolean hasProperDigits(String id){
        for(int i = 0; i < id.length(); i++){
            if(i == 4)
                continue;
            if(id.charAt(i) < '0' || id.charAt(i) > '9') {
                System.out.println("Contains an invalid digit.");
                return false;
            }
        }
        return true;
    }

    static void validateStudentID(String id) {
        if(isProperLength(id) && hasProperDivision(id) && hasProperDigits(id)) {
            System.out.println(id + " is a valid student ID.");
        }
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String id = scanner.next();
        while(!id.equals("exit")){
            validateStudentID(id);
            System.out.println();
            id = scanner.next();
        }
    }
}