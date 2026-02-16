package strategypattern2.concrete;

import strategypattern2.strategy.ExportStrategy;

public class JsonExport implements ExportStrategy {
    public void exportdata() {
        System.out.println("export data in Json");
    }
}
