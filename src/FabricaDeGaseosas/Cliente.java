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

  /*  public Cliente() {
        Gaseosa factory = (Gaseosa)GaseosaFactory.
    }
}
    //Gaseosa factory = (Gaseosa)GaseosaFactory;
    //EmpleadoDependencia empleadoDependencia= (EmpleadoDependencia) EmpleadoFactory.getInstance().crearEmpleado("EMP-D");


   */