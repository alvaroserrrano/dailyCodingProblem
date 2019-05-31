// ADJACENCY LIST IMPLEMENTATION
public class AdjacencyListGraph{
    private Map<Integer, ArrayList<Integer>> G;
    private boolean isDirected;
    
    public AdjacencyListGraph(boolean isDirected){
        this.G = new HashMap<>();
        this.isDirected = isDirected;
    }

    public void addEdge(int start, int dest){
        if(this.G.containsKey(start)){
            this.G.get(start).add(dest);
        }else{
            this.G.put(start, new ArrayList<>(Arrays.asList(dest));
        }
        if(!this.isDirected){
            if(this.G.containsKey(dest)){
                this.G.get(dest).add(start);
            }else{
                this.G.put(dest, new ArrayList<>(Arrays.asList(start));
            }
        }
    }
    public boolean isEdge(int start, int dest){
        if(this.containsKey(start)){
            return this.G.get(start).contains(dest);
        }
        return false;
    }
}