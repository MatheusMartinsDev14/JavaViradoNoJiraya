package javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "William"; //String constant pool
        String nome2 = "William"; //String constant pool
        nome = nome.concat(" Suane");
        System.out.println(nome);
        System.out.println(nome == nome2);
        String nome3 = new String("William"); // 1 variavel de referência, 2 objeto do tipo String, 3 uma String no poll de String
        System.out.println(nome2 == nome3.intern());
    }
}
