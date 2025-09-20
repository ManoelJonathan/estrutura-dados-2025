public class Main {
    public static void main(String[]args){
        Post post1 = new Post("Meu primeiro post", "imagem1.jpg", 150, "2023-10-01");
        ArvoreBinaria<Post> arvore = new ArvoreBinaria<>();
        arvore.inserir(post1);
        Post post2 = new Post("Outro post", "imagem2.jpg", 200, "2023-10-02");
        Post post3 = new Post("Mais um post", "imagem3.jpg", 150, "2023-10-03");

        Post post4 = new Post("Post com mais likes", "imagem4.jpg", 300, "2023-09-04");
        Post post5 = new Post("Post com menos likes", "imagem5.jpg", 100, "2023-11-05");

        arvore.inserir(post4);
        arvore.inserir(post5);

        arvore.inserir(post2);
        arvore.inserir(post3);
        arvore.imprimeEmOrdem();
        System.out.println();
        arvore.imprimePreFixado();
        
    }
    
}
