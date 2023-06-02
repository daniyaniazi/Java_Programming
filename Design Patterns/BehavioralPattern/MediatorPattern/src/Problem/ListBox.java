package Problem;

public class ListBox extends  UIControl{
    private String selection;

    public String getSelection() {
        return selection;
    }

    public void setSelection(String selection) {

        this.selection = selection;
        owner.changed(this);
    }

    public ListBox(DialogBox owner) {
        super(owner);
    }
}
