package Ex64_grafos;

public class grafos_rotina {
    
    public static void main(String[] args) {
        Grafo<String> grafo = new Grafo<String>();
        grafo.adicionarVertice("Acordar");
        grafo.adicionarVertice("Tomar banho");
        grafo.adicionarVertice("Trocar de roupa");
        grafo.adicionarVertice("Cafe da manhã");
        grafo.adicionarVertice("Escovar os dentes");
        grafo.adicionarVertice("Embrulhar lanches");
        grafo.adicionarVertice("Praticar exercicios");
        
        grafo.adicionarAresta(2.0, "Acordar", "Tomar banho");
        grafo.adicionarAresta(3.0, "Tomar banho", "Cafe da manhã");
        grafo.adicionarAresta(1.0, "Cafe da manhã", "Trocar de roupa");
        grafo.adicionarAresta(1.0, "Acordar", "Trocar de roupa");
        grafo.adicionarAresta(3.0, "Escovar os dentes", "Acordar");
        grafo.adicionarAresta(2.0, "Escovar os dentes", "Tomar banho");


        
        
        grafo.buscaEmLargura();
    }
    
}
