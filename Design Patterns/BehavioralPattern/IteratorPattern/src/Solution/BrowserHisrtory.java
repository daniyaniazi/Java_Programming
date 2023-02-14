package Solution;

import java.util.ArrayList;
import java.util.List;

public class BrowserHisrtory {

    // last 10 urls - Breaking changes now
    //private  String[] urls = new String[10];

    private  List<String> urls = new ArrayList<>();

    public void push(String url){
        urls.add(url);
    }

    public String pop(){
        int lastIndex = urls.size()-1;
        String lastUrl = urls.get(lastIndex);
        urls.remove(lastUrl);
        return  lastUrl;
    }

    public  Iterator<String> createIterator(){
        return new ListIterator(this);
    }

    public class ListIterator implements Iterator<String>{

        private final BrowserHisrtory history;
        private  int index;

        public ListIterator(BrowserHisrtory history){
            this.history = history;
        }
        @Override
        public boolean hasNext() {
            return (index<history.urls.size());
        }

        @Override
        public String current() {
            return history.urls.get(index);
        }

        @Override
        public void next() {
            index++;
        }
    }
}
