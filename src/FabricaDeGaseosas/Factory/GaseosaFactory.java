package FabricaDeGaseosas.Factory;

import FabricaDeGaseosas.Gaseosa;

public class GaseosaFactory {
    private static GaseosaFactory instance;

    private GaseosaFactory() {
    }
    public static GaseosaFactory getInstance(){
        if (instance==null){
            instance= new GaseosaFactory();
        } return instance;
    }
    public Gaseosa crearGaseosa(Integer codigo){
        Gaseosa gaseosa = null;
        switch (codigo){
            case 1: gaseosa = new Gaseosa("Coca Cola",1.0,200.0);
        break;
        case 2: gaseosa = new Gaseosa("Pepsi",1.0, 210.0);
        break;
            default:
                System.out.println("Ingrese un codigo valido");}
            return gaseosa;}

}
