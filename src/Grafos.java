import java.util.ArrayList;

public class Grafos {
    private ArrayList<Vertice> vertices;
    private boolean isDirected;
    private boolean isWeighted;

    public Grafos(boolean isDirected, boolean isWeighted) {
        this.vertices = new ArrayList<>();
        this.isDirected = isDirected;
        this.isWeighted = isWeighted;
    }

    public void addVertice(String data){
        Vertice vertice = new Vertice(data);
        vertices.add(vertice);
    }
    public void addEdge(Vertice inicialVertice, Vertice finalVertice, int peso){
        if(!isWeighted){
            peso = 1;
        }
        vertices.get(vertices.indexOf(inicialVertice)).addEdge(vertices.get(vertices.indexOf(finalVertice)), peso);
        inicialVertice.addEdge(finalVertice, peso);

        if(!isDirected){
            finalVertice.addEdge(inicialVertice, peso);
        }
    }

    public void addEdge(String inicialVertice, String finalVertice, int peso){
        if(!isWeighted){
            peso = 1;
        }
        getVertexByValue(inicialVertice).addEdge(getVertexByValue(finalVertice), peso);
        if(!isDirected){
            getVertexByValue(finalVertice).addEdge(getVertexByValue(inicialVertice), peso);
        }
    }

    public boolean isDirected() {
        return isDirected;
    }
    public boolean isWeighted() {
        return isWeighted;
    }
    public Vertice getVertexByValue(String value){
        for(Vertice v : vertices){
            if(v.getData().equals(value)){
                return v;
            }
        }
        return null;
    }

    public String print(){
        String grafoString = "";
        for(Vertice v : vertices){
            grafoString += v.print(isWeighted) + "\n";
        }
        return grafoString;
    }



}
