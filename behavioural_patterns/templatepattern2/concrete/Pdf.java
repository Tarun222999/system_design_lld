package templatepattern2.concrete;

import templatepattern2.template.Report;

public class Pdf extends Report {

    public void formatReport() {
        System.out.println("formating data for pdf");
    }

    public void exportReport() {
        System.out.println("Exporting data in pdf");
    }
}
