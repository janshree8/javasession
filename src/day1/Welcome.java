package day1;

public class Welcome {
    public static void main(String[] args){
        String greeting = "day1. Welcome to core java";
        System.out.println(greeting);
        for(int i = 0; i < greeting.length(); i++){
            System.out.println("*");
        }
        System.out.println();
    }
}
