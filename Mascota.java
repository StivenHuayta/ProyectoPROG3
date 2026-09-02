import java.time.LocalDate;

public class Mascota {
    private int id;
    private int clienteId;
    private String nombre;
    private Especie especie;
    private LocalDate fechaNacimiento;
    private Sexo sexo;

    public Mascota() {}

    public Mascota(int id, int clienteId, String nombre, Especie especie, 
                   LocalDate fechaNacimiento, Sexo sexo) {
        this.id = id;
        this.clienteId = clienteId;
        this.nombre = nombre;
        this.especie = especie;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
    }
}
