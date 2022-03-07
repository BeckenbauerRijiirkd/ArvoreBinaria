public class App {
    public static void main(String[] args) throws Exception {
    
        Arvore<Integer> arvore = new Arvore<Integer>();
        arvore.adicionar(10);
        arvore.adicionar(8);
        arvore.adicionar(5);
        arvore.adicionar(9);
        arvore.adicionar(7);
        arvore.adicionar(18);
        arvore.adicionar(13);
        arvore.adicionar(20);
        arvore.adicionar(21);
        System.out.println("=======Nos=======");
        arvore.emOrdem(arvore.getRaiz());
        System.out.println("=======Folhas=======");
        arvore.folhas(arvore.getRaiz());
        System.out.println("=======SubArvores=======");
        arvore.subArvores(arvore.getRaiz());
        System.out.println("=======Profundidade=======");
        arvore.profundidade(arvore.getRaiz());
        System.out.println("=======Altura=======");
        arvore.altura(arvore.getRaiz());
        System.out.println("=======Grau=======");
        arvore.grau(arvore.getRaiz());
    }
}
