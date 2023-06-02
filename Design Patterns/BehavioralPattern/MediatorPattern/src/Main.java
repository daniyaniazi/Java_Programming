import Problem.ArticleDialogBox;
import Problem.DialogBox;

public class Main {
    public static void main(String[] args) {

        System.out.println("Mediator Pattern");
        ArticleDialogBox box = new ArticleDialogBox();
        box.simulateUserInteraction();
    }
}