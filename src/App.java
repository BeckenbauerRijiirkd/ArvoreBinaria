public class App {
    public static void main(String[] args) throws Exception {
    
        Arvore<Integer> arvore = new Arvore<Integer>();
        arvore.adicionar(arvore.getRaiz(),10);
        arvore.adicionar(arvore.getRaiz(),8);
        arvore.adicionar(arvore.getRaiz(),5);
        arvore.adicionar(arvore.getRaiz(),9);
        arvore.adicionar(arvore.getRaiz(),7);
        arvore.adicionar(arvore.getRaiz(),18);
        arvore.adicionar(arvore.getRaiz(),13);
        arvore.adicionar(arvore.getRaiz(),20);
        arvore.adicionar(arvore.getRaiz(),21);
        System.out.println("=======Nos=======");
        arvore.imprimir(arvore.getRaiz());
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
