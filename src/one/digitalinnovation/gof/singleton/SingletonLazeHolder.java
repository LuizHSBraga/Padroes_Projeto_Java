package one.digitalinnovation.gof.singleton;

/**
 * Singleton "Lazy Holder"
 *
 * @see <a href="https://stackoverflow.com/a/24018148">Referencia</a>
 *
 */

public class SingletonLazeHolder {

    private static class InstanceHolder{
        public static SingletonLazeHolder instancia = new SingletonLazeHolder();
    }

    private SingletonLazeHolder(){
        super();
    }

    public static SingletonLazeHolder getInstancia(){
        return InstanceHolder.instancia;
    }

}
