package ObserverPattern.Observer;

public class Spreadsheet implements  IObeserver{
   private DataSource dataSource;

    public Spreadsheet(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void update() {
        System.out.println("Spreadsheet got notified!"+dataSource.getValue());

    }
}
