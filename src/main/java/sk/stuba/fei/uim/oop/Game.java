package sk.stuba.fei.uim.oop;

public class Game {
    public Game(){
        for(int i=1;i<=100;i++){
            //mustPrint = 0;
            if(i % 3 == 0 && i % 5 == 0)
                System.out.println("FizzBuzz");
            else if(i % 3 == 0 && i % 5 != 0) {
                System.out.println("Fizz");
            }
            else if(i % 3 != 0 && i % 5 == 0)
                System.out.println("Buzz");
            else
                System.out.println(i);
        }
    }
}
