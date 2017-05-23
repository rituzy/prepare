package interviewsKdn251.Company.Uber;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 21.05.2017.
 */
public class UndirectedGraphNode {
    int val;
    List<UndirectedGraphNode> neigbors;

    public UndirectedGraphNode(int val) {
        this.val = val;
        neigbors = new ArrayList<>();
    }
}
