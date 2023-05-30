package ObserverPattern.Observer;

public class Spreadsheet implements  IObeserver{
    @Override
    public void update(int value) {
        System.out.println("Spreadsheet got notified!"+value);

    }
}
