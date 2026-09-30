package pe.pucp.progra3.mimados.console;

import pe.pucp.progra3.mimados.model.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args){



        Usuario us1=new Usuario("11111111","usuarioPrueba","apellidoPrueba",
                                "email@rroba","p4ssw0rd","999999999");





        Cliente cli1= new Cliente(us1,"calle el olimpo 123","955556333",true);




        Sede sede1= new Sede("Huellitas - san miguel","direccion en sm","999999999",true);





        Usuario us2=new Usuario("22222222","usEmpleado","apellidoP",
                "email@rroba2","p4ssw0rd2","999999989");

        Empleado emp1=new Empleado(sede1.getId(),us2.getId(),"cmvp-11",false,true,null,null, null,null);


        Mascota mas1= new Mascota(9,cli1, "chimenea",Especie.CANINO,"raza",Sexo.MACHO, LocalDate.of(2000, 5, 15),10.5,true);
    }
}
