package one.digitalinnovation.gof;

import one.digitalinnovation.gof.facade.Facade;
import one.digitalinnovation.gof.singleton.SingletonEager;
import one.digitalinnovation.gof.singleton.SingletonLazeHolder;
import one.digitalinnovation.gof.singleton.SingletonLazy;
import one.digitalinnovation.gof.strategy.*;

public class Teste {

    public static void main(String[] args){

        //Singleton:

        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazeHolder holder = SingletonLazeHolder.getInstancia();
        System.out.println(holder);
        holder = SingletonLazeHolder.getInstancia();
        System.out.println(holder);

        //Strategy
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();
        Comportamento normal = new ComportamentoNormal();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();;
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();;
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();;
        robo.mover();

        //Facade
        Facade facade = new Facade();
        facade.migrarCliente("Luiz","38740256");
        
    }

}
