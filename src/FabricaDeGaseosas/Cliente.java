package FabricaDeGaseosas;

import FabricaDeGaseosas.Factory.GaseosaFactory;

import java.util.ArrayList;

public class Cliente {
    private Integer codigo;
    private ArrayList<Gaseosa> gaseosas = new ArrayList<Gaseosa>();

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    public Cliente() {
        Gaseosa gaseosa1 = (Gaseosa)GaseosaFactory.getInstance().crearGaseosa(1);
        gaseosas.add(gaseosa1);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "codigo=" + codigo +
                ", gaseosas=" + gaseosas +
                '}';
    }
}


