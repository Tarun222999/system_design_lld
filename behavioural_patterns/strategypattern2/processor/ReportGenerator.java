package strategypattern2.processor;

import strategypattern2.strategy.ExportStrategy;

public class ReportGenerator {
    private ExportStrategy exportstrategy;

    public ReportGenerator(ExportStrategy exportstrategy) {
        this.exportstrategy = exportstrategy;
    }

    public void generateReport() {
        exportstrategy.exportdata();
    }

    public void changeReportGenerator(ExportStrategy exportstrategy) {
        this.exportstrategy = exportstrategy;
    }

}
