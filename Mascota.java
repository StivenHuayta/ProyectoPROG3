import java.time.LocalDate;
import java.time.Period;

public class Mascota {
    private int id;
    private Cliente cliente;
    private String nombre;
    private Especie especie;
    // hay raza en base de datos
    private LocalDate fechaNacimiento;
    private Sexo sexo;
    private double peso;
    private LocalDate fechaRegistro; // falta en base de datos
    //bolleano activo en base de datos, y no aca

    public Mascota() {}

    public Mascota(Cliente cliente, String nombre, Especie especie, Sexo sexo, LocalDate fechaNacimiento, double peso) {
        // Validaciones
        if ( nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre de la mascota es obligatorio");
        }
        if (fechaNacimiento != null && fechaNacimiento.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("La fecha de nacimiento no puede ser en el futuro.");
        }
        if (peso <= 0) {
            throw new IllegalArgumentException("El peso debe ser mayor a 0.");
        }

        this.cliente = cliente;
        this.nombre = nombre;
        this.especie = especie;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
        this.peso = peso;
        this.fechaRegistro = LocalDate.now(); 
    }

public Mascota(int id, Cliente cliente, String nombre, Especie especie, Sexo sexo, LocalDate fechaNacimiento, double peso, LocalDate fechaRegistro) {
        this(cliente, nombre, especie, sexo, fechaNacimiento, peso); 
        this.id = id;
        this.fechaRegistro = fechaRegistro; 
    }



public int calcularEdadEnAnios() {
        if (this.fechaNacimiento == null) {
            return 0;
        }
        return Period.between(this.fechaNacimiento, LocalDate.now()).getYears();
    }

    // Un método clínico especializado
    public void actualizarPeso(double nuevoPeso) {
        if (nuevoPeso <= 0) {
            throw new IllegalArgumentException("El peso registrado debe ser mayor a 0.");
        }
        this.peso = nuevoPeso;
    }


    
    //-----------------------------------
    public int getId() {
        return id;
    }

 

    public Cliente getCliente() {
        return cliente;
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


    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

}
