package ObserverPattern.Observer;

public class Chart implements IObeserver{
    private DataSource dataSource;

    public Chart(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void update() {
        System.out.println("Chart got notified!"+this.dataSource.getValue());
    }
}
