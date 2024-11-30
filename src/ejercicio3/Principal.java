
package ejercicio3;

public class Principal {
    public static void main(String[] args) {
        GeneradorReporte pdf = new ReportePDF();
        GeneradorReporte excel = new ReporteExcel();
        
        GestorReportes gestorPDF = new GestorReportes(pdf);
        GestorReportes gestorExcel = new GestorReportes(excel);
        
        System.out.println("*** Generador de Reporte en PDF ***");
        gestorPDF.generarReporte();
        System.out.println("\n*** Generador de Reporte en Excel ***");
        gestorExcel.generarReporte();
    }
}
