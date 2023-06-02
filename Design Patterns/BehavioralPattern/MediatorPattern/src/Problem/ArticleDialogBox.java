package Problem;

public class ArticleDialogBox extends DialogBox{

    private  ListBox aticleListBox = new ListBox(this);
    private  Button button = new Button(this);
    private  TextBox textbox = new TextBox(this);

    @Override
    public void changed(UIControl UIControl) {

        if(UIControl == aticleListBox){
            articleSelected();
        } else if(UIControl == textbox ){
            textChanged();
        }
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
        System.out.println("Button Enabled ? : "+button.isEnabled());
    }
}
