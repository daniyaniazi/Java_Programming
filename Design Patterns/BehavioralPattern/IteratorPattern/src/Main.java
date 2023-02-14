import Problem.BrowserHisrtory;

public class Main {
    public static void main(String[] args) {

        BrowserHisrtory history = new BrowserHisrtory();
        history.push("a");
        history.push("b");
        history.push("c");

//        What is history class change its implementation to store history urls from list to stack
        for(int i=0;i<history.getUrls().size();i++){
          System.out.println(history.getUrls().get(i));
        }


    }
}