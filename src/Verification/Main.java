package Verification;

public class Main {
    public static void main(String[] args) {
        boolean success = Data.validate("test","test","tаest");
        if(success){
            System.out.println("Данные верны!");
        }else{
            System.out.println("Данные не верны!");
        }
    }
}