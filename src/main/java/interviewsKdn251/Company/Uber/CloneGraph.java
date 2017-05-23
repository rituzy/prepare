package interviewsKdn251.Company.Uber;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by user on 21.05.2017.
 */
// Clone an undirected graph. Each node in the graph contains a label and a list of its neighbors.

// OJ's undirected graph serialization:
// Nodes are labeled uniquely.

// We use # as a separator for each node, and , as a separator for node label and each neighbor of the node.
// As an example, consider the serialized graph {0,1,2#1,2#2,2}.

// The graph has a total of three nodes, and therefore contains three parts as separated by #.

// First node is labeled as 0. Connect node 0 to both nodes 1 and 2.
// Second node is labeled as 1. Connect node 1 to node 2.
// Third node is labeled as 2. Connect node 2 to node 2 (itself), thus forming a self-cycle.
// Visually, the graph looks like the following:

//        1
//       / \
//      /   \
//     0 --- 2
//          / \
//          \_/
public class CloneGraph {
    private static Map<Integer, UndirectedGraphNode> graphList = new HashMap<>();

    public static UndirectedGraphNode clone(UndirectedGraphNode node){

        if (node == null) return null;

        if (graphList.containsKey(node.val)) return graphList.get(node.val);

        UndirectedGraphNode newNode = new UndirectedGraphNode(node.val);

        for (UndirectedGraphNode n : node.neigbors){
            newNode.neigbors.add(clone(n));
        }

        graphList.put(newNode.val, newNode);

        return newNode;
    }
}
