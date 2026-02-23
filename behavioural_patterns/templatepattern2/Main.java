package templatepattern2;

import templatepattern2.concrete.Csv;
import templatepattern2.concrete.Html;
import templatepattern2.concrete.Pdf;
import templatepattern2.template.Report;

public class Main {
    public static void main(String[] args) {
        Report pdf = new Pdf();
        Report csv = new Csv();
        Report html = new Html();

        pdf.generate();
        csv.generate();
        html.generate();
    }
}
