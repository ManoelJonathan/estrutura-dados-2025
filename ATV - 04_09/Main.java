public class Main {
    public static void main(String[]args){
        Post post1 = new Post("Meu primeiro post", "imagem1.jpg", 150);
        ArvoreBinaria<Post> arvore = new ArvoreBinaria<>();
        arvore.inserir(post1);
        Post post2 = new Post("Outro post", "imagem2.jpg", 200);
        Post post3 = new Post("Mais um post", "imagem3.jpg", 150);

        arvore.inserir(post2);
        arvore.inserir(post3);
        arvore.imprimeEmOrdem();
        System.out.println();
        arvore.imprimePreFixado();
        
    }
    
}
