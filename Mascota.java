import java.time.LocalDate;

public class Mascota {
    private int id;
    private Cliente cliente;
    private String nombre;
    private Especie especie;
    private LocalDate fechaNacimiento;
    private Sexo sexo;
    private double peso;
    private LocalDate fechaRegistro;

    public Mascota() {}

    public Mascota(int id, Cliente cliente, String nombre, Especie especie, 
                   LocalDate fechaNacimiento, Sexo sexo,double peso,LocalDate fechaRegistro) {
        this.id = id;
        this.cliente = cliente;
        this.nombre = nombre;
        this.especie = especie;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
        this.peso = peso;
        this.fechaRegistro = fechaRegistro;
    }
}
