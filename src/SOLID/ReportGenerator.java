package SOLID;

public class ReportGenerator {

    private Reporte reporte;
    public  ReportGenerator(Reporte reporte) {
        this.reporte=reporte;
    }

    public void generateReport(EmployeeManager employeeManager) {
        reporte.generarReporte(employeeManager);
    }
}
