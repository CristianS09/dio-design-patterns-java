package singleton;

import java.util.Objects;

public class Singleton {
    private static Singleton singleton;

    // Construtor privado para evitar a criação direta.
    private Singleton(){}

    public static Singleton getSingleton(){
        if(Objects.isNull(singleton)){
            singleton = new Singleton();
        }
        return singleton;
    }
}
