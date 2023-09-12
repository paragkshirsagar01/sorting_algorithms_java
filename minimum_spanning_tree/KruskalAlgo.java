import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Edges implements Comparable<Edges>{
    int source,dest,weight;
    public Edges(int source,int dest,int weight){
        this.source=source;
        this.dest=dest;
        this.weight=weight;
    }
    @Override
    public int compareTo(Edges oth){
        return Integer.compare(this.weight, oth.weight);
    }
}
class graph{
    int V;
    List<Edges> edg;
    graph(int V){
        this.V=V;
        this.edg = new ArrayList<Edges>();
    }
    public void addEdges(int src,int dest,int weight){
        Edges e=new Edges(src, dest, weight);
        edg.add(e);
    }

    public List<Edges> kruskal(){
        List<Edges> ans=new ArrayList<>();
        Collections.sort(this.edg);
        DisJoint d=new DisJoint(V);
        for(Edges e:edg){
            int xFind=d.find(e.source);
            int yfind=d.find(e.dest);
            if(xFind!=yfind){
                ans.add(e);
                d.union(xFind, yfind);
            }
        }
        return ans;
    }
}
class DisJoint{
    int[] parent;
    DisJoint(int V){
        parent =new int[V];
        for(int i=0;i<V;i++){
            parent[i]=i;
        }
    }
    public int find(int vertex){
        if(parent[vertex]==vertex){
            return parent[vertex];
        }
        return find(parent[vertex]);
    }

    public void union(int x,int y){
        int pXind=find(x);
        int pYind=find(y);
        parent[pXind]=pYind;
    }
}
public class KruskalAlgo {
    public static void main(String[] args){
        int V = 4; // Number of vertices
        graph graph = new graph(V);

        // Add edges to the graph
        graph.addEdges(0, 1, 1);
        graph.addEdges(0, 2, 3);
        graph.addEdges(1, 2, 4);
        graph.addEdges(1, 3, 2);
        graph.addEdges(2, 3, 5);

        List<Edges> mst = graph.kruskal();

        // Print the minimum spanning tree
        for (Edges edge : mst) {
            System.out.println(edge.source + " - " + edge.dest + " : " + edge.weight);
        }
    }
}
