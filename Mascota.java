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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Especie getEspecie() {
        return especie;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

}
