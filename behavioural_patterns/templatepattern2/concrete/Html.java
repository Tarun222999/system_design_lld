package templatepattern2.concrete;

import templatepattern2.template.Report;

public class Html extends Report {

    public void formatReport() {
        System.out.println("formating data for html");
    }

    public void exportReport() {
        System.out.println("Exporting data in html");
    }
}
