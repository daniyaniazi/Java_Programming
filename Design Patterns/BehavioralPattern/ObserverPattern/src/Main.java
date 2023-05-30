import ObserverPattern.Observer.Chart;
import ObserverPattern.Observer.DataSource;
import ObserverPattern.Observer.Spreadsheet;

public class Main {
    public static void main(String[] args) {

        DataSource dataSource = new DataSource();
        Spreadsheet sheet1 = new Spreadsheet();
        Spreadsheet sheet2 = new Spreadsheet();
        Chart chart = new Chart();

        dataSource.addObserver(sheet1);
        dataSource.addObserver(sheet2);
        dataSource.addObserver(chart);

        dataSource.setValue(1);
    }
}