package Solution.Framework;

public class Button {
    private String label;
    private ICommand command;

    public Button(ICommand command) {
        this.command = command;
    }

    public  void click(){
        command.execute();
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
