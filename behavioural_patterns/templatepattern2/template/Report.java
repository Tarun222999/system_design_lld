package templatepattern2.template;

public abstract class Report {
    public final void generate() {
        fetchData();
        validateData();
        formatReport();
        exportReport();
    }

    public void fetchData() {
        System.out.println("fetching data");
    }

    public void validateData() {
        System.out.println("validating data");
    }

    public abstract void formatReport();

    public abstract void exportReport();
}
