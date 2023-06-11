package ObserverMediator;

public class ArticleDialogBox  {

    private ListBox aticleListBox = new ListBox();
    private Button button = new Button();
    private TextBox textbox = new TextBox();

    public ArticleDialogBox() {
        //  new anonymous class that implemenet observer interface
        //        aticleListBox.attach(new IObserver() {
        //            @Override
        //            public void update() {
        //
        //                articleSelected();
        //            }
        //        });

        aticleListBox.attach(()-> articleSelected());
        textbox.attach(this::textChanged);
    }
    private void articleSelected(){
        textbox.setContent(aticleListBox.getSelection());
        button.setEnabled(true);
    }

    private void textChanged(){
        var isEmpty = textbox.getContent()== null || textbox.getContent().isEmpty();
        button.setEnabled(!isEmpty);
    }

    public  void simulateUserInteraction(){
        aticleListBox.setSelection("Article 1");
        System.out.println("Text Box : "+textbox.getContent());
        System.out.println("Button Enabled change : "+button.isEnabled());
    }
}