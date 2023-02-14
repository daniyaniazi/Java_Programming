package Problem;

import java.util.List;

import java.util.ArrayList;

public class BrowserHisrtory {

    // last 10 urls - Breaking changes now
    //private  String[] urls = new String[10];

    public List<String> getUrls() {
        return urls;
    }

    private List<String> urls = new ArrayList<>();
    public void push(String url){
        urls.add(url);
    }

    public String pop(){
        int lastIndex = urls.size()-1;
        String lastUrl = urls.get(lastIndex);
        urls.remove(lastUrl);
        return  lastUrl;
    }
}
