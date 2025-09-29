package javacore.Minterfaces.dominio;

public interface DataLoader {
    public static final int MAX_DATA_SIZE = 20;
    public abstract void load();
    default void checkPermission(){
        System.out.println("Fazendo Checagem de permissões");
    }

    public static void retriveMaxDataSize(){
        System.out.println("Dentro do retriveMaxDataSize na interface");
    }
}
