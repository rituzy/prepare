package interviewsKdn251.Company.Google;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 23.04.2017.
 */
public class UndirectedGraphNode {
    public int label;
    public List<UndirectedGraphNode> neigbours;

    public UndirectedGraphNode(int label) {
        this.label = label;

        neigbours = new ArrayList<>();
    }
}
