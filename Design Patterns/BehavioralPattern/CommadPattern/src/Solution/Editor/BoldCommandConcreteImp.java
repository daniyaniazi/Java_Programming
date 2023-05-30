package Solution.Editor;

public class BoldCommandConcreteImp implements IUndoableCommand {

    private String prevContent;
    private HtmlDocument document;
    private History history;

    public BoldCommandConcreteImp(HtmlDocument document, History history) {
        this.document = document;
        this.history = history;
    }

    @Override
    public void execute() {
        prevContent = document.getContent();
        document.makeBold();
        history.push(this);
    }

    @Override
    public void unexecute() {


    }
}
