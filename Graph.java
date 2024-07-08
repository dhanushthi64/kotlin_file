public class Graph {
    public static void main(String[] args) {
        Graphs g = new Graphs(4);
        g.addedge(0, 1);
        g.addedge(0, 2);
        g.addedge(1, 3);
        g.printgraph();
    }
}
class Graphs{
    int V;
    int[][] adjmatrix;
    Graphs(int v){
        V = v;
        adjmatrix = new int[V][V];
    }
    void addedge(int v,int w){
        adjmatrix[v][w] = 1;
        adjmatrix[w][v] = 1;
    }
    void printgraph(){
        for(int i=0;i<V;i++){
            for(int j=0;j<V;j++){
                System.out.println(adjmatrix[i][j]);
            }
            System.out.println();
        }
    }
}