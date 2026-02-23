package templatepattern2.concrete;

import templatepattern2.template.Report;

public class Csv extends Report {

    public void formatReport() {
        System.out.println("formating data for csv");
    }

    public void exportReport() {
        System.out.println("Exporting data in csv");
    }
}
