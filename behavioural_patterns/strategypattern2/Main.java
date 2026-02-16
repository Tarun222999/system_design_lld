package strategypattern2;

import strategypattern2.concrete.CsvExport;
import strategypattern2.concrete.PdfExport;
import strategypattern2.processor.ReportGenerator;
import strategypattern2.strategy.ExportStrategy;

public class Main {
    public static void main(String[] args) {
        ExportStrategy exportByPdf = new PdfExport();
        ExportStrategy exportByCsv = new CsvExport();

        ReportGenerator reportGenerator = new ReportGenerator(exportByPdf);
        reportGenerator.generateReport();
        reportGenerator.changeReportGenerator(exportByCsv);
        reportGenerator.generateReport();
    }
}
