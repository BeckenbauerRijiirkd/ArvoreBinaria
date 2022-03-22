public class App {
    public static void main(String[] args) throws Exception {
    
        Arvore<Integer> arvore = new Arvore<Integer>();
        arvore.adicionar(arvore.getRaiz(), 45);
        arvore.adicionar(arvore.getRaiz(), 30);
        arvore.adicionar(arvore.getRaiz(), 40);
        arvore.adicionar(arvore.getRaiz(), 20);
        arvore.adicionar(arvore.getRaiz(), 10);
        arvore.adicionar(arvore.getRaiz(), 25);
        arvore.adicionar(arvore.getRaiz(), 27);
        arvore.adicionar(arvore.getRaiz(), 35);
        arvore.adicionar(arvore.getRaiz(), 42);
        arvore.adicionar(arvore.getRaiz(), 60);
        arvore.adicionar(arvore.getRaiz(), 50);
        arvore.adicionar(arvore.getRaiz(), 49);
        arvore.adicionar(arvore.getRaiz(), 52);
        arvore.adicionar(arvore.getRaiz(), 75);
        arvore.adicionar(arvore.getRaiz(), 70);
        arvore.adicionar(arvore.getRaiz(), 80);

        System.out.println("=======LNR=======");
        arvore.imprimir(arvore.getRaiz());
        System.out.println("=======NLR=======");
        arvore.imprimirNLR(arvore.getRaiz());
        System.out.println("=======LRN=======");
        arvore.imprimirLRN(arvore.getRaiz());

        System.out.println("\n=======Folhas=======");
        arvore.folhas(arvore.getRaiz());
        System.out.println("\n=======SubArvores=======");
        arvore.subArvores(arvore.getRaiz());
        System.out.println("\n=======Profundidade=======");
        arvore.profundidade(arvore.getRaiz());
        System.out.println("\n=======Altura=======");
        arvore.altura(arvore.getRaiz());
        System.out.println("\n=======Grau=======");
        arvore.grau(arvore.getRaiz());
    }
}
