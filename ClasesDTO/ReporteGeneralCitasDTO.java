import java.util.List;
import java.util.ArrayList;

public class ReporteGeneralCitasDTO {
    private String rangoFechasEvaluado;
    private int totalCitasProgramadas;
    private int totalCitasCompletadas;
    private int totalCitasCanceladas;
    private List<CitaDetalleDTO> detalleCitas;

  
    public ReporteGeneralCitasDTO() {}

    public ReporteGeneralCitasDTO(String rangoFechasEvaluado, int totalCitasProgramadas, int totalCitasCompletadas, int totalCitasCanceladas, List<CitaDetalleDTO> detalleCitas) {
        this.rangoFechasEvaluado = rangoFechasEvaluado;
        this.totalCitasProgramadas = totalCitasProgramadas;
        this.totalCitasCompletadas = totalCitasCompletadas;
        this.totalCitasCanceladas = totalCitasCanceladas;
        this.detalleCitas = detalleCitas;
    }

    public String getRangoFechasEvaluado() {
        return rangoFechasEvaluado;
    }

    public void setRangoFechasEvaluado(String rangoFechasEvaluado) {
        this.rangoFechasEvaluado = rangoFechasEvaluado;
    }

    public int getTotalCitasProgramadas() {
        return totalCitasProgramadas;
    }

    public void setTotalCitasProgramadas(int totalCitasProgramadas) {
        this.totalCitasProgramadas = totalCitasProgramadas;
    }

    public int getTotalCitasCompletadas() {
        return totalCitasCompletadas;
    }

    public void setTotalCitasCompletadas(int totalCitasCompletadas) {
        this.totalCitasCompletadas = totalCitasCompletadas;
    }

    public int getTotalCitasCanceladas() {
        return totalCitasCanceladas;
    }

    public void setTotalCitasCanceladas(int totalCitasCanceladas) {
        this.totalCitasCanceladas = totalCitasCanceladas;
    }

    public List<CitaDetalleDTO> getDetalleCitas() {
        return detalleCitas;
    }

    public void setDetalleCitas(List<CitaDetalleDTO> detalleCitas) {
        this.detalleCitas = detalleCitas;
    }

}
