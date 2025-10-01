package javacore.Oexception.error.test;

public class StackOverSlowTest01 {
    public static void main(String[] args) {
        recursividade();

    }
    public static void recursividade(){
        recursividade();
    }
}
