package collection.deque.test.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistory {

    /*private Deque<String> history = new ArrayDeque<>();

    public void visitPage(String url) {
        System.out.println("방문: " + url);
        history.push(url);
    }

    public String goBack() {
        history.pop();
        String peek = history.peek();
        System.out.println("뒤로가기: " + peek);
        return peek;
    }*/

    private Deque<String> history = new ArrayDeque<>();
    private String currentPage = null;

    public void visitPage(String url) {
        if (currentPage != null) {
            history.push(currentPage);
        }
        currentPage = url;
        System.out.println("방문: " + url);
    }

    public String goBack() {
        if (!history.isEmpty()) {
            currentPage = history.pop();
            System.out.println("뒤로가기: " + currentPage);
            return currentPage;
        }
        return null;
    }
}
