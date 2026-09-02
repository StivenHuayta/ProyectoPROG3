import java.time.DayOfWeek;
import java.time.LocalTime;

public class Horario {
    private int id;
    private int idEmpleado; 
    private DayOfWeek diaSemana;
    private LocalTime horaInicio;
    private LocalTime horaFin;
    private boolean activo;

    public Horario() {
        this.activo = true;
    }

    public Horario(int id, DayOfWeek diaSemana, LocalTime horaInicio, LocalTime horaFin) {
        this.id = id;
        this.diaSemana = diaSemana;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.activo = true;
    }
}
