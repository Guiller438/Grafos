import java.util.ArrayList;

public class Vertice {

    private String data;
    private ArrayList<Edge> edges;

    public Vertice(String Entradadata){
        this.data = data;
        this.edges = new ArrayList<>();
    }

    public void addEdge(Vertice finalVertice, int peso){
        Edge edge = new Edge(this, finalVertice, peso);
        edges.add(edge);
    }

    public void removeEdge(Vertice finalVertice){
        this.edges.removeIf(edge -> edge.getFinalVertice().equals(finalVertice));
    }

    public String getData() {
        return data;
    }
    public ArrayList<Edge> getEdges() {
        return edges;
    }
    public String print(boolean showPeso){
        String mensaje = "";

        if(edges.size() == 0) {
            mensaje = "El vertice " + data + " no tiene aristas";
            return mensaje;
        }

        for(int i = 0; i < edges.size(); i++){
            if(i==0){
                mensaje += edges.get(i).getInicioVertice().data + "->  ";
            }
            mensaje += edges.get(i).getFinalVertice().data;

            if(showPeso){
                mensaje += "(" + edges.get(i).getPeso() + ")";
            }
            if(i != edges.size() - 1){
                mensaje += ", ";
            }
        }
        return mensaje;
    }







}
