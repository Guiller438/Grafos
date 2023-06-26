public class Edge {
    private Vertice inicioVertice;
    private Vertice finalVertice;
    private int peso;

    public Edge(Vertice inicioVertice, Vertice finalVertice, int peso) {
        this.inicioVertice = inicioVertice;
        this.finalVertice = finalVertice;
        this.peso = peso;
    }

    public Vertice getInicioVertice() {
        return inicioVertice;
    }
    public Vertice getFinalVertice() {
        return finalVertice;
    }
    public int getPeso() {
        return peso;
    }
}
