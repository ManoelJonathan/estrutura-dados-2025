public class Main {
    public static void main(String[]   args ) {
        Post post1 = new Post(1, "Meu primeiro post", "imagem1.jpg", 150, "2023-10-01");
        ArvoreBinaria<Post> arvore = new ArvoreBinaria<>();
        arvore.inserir(post1);
        Post post2 = new Post(4, "Outro post", "imagem2.jpg", 200, "2023-10-02");
        Post post3 = new Post(2, "Mais um post", "imagem3.jpg", 150, "2023-10-03");

        Post post4 = new Post(3, "Post com mais likes", "imagem4.jpg", 300, "2023-09-04");
        Post post5 = new Post(5, "Post com menos likes", "imagem5.jpg", 100, "2023-11-05");

        arvore.inserir(post4);
        arvore.inserir(post5);
        arvore.inserir(post2);
        arvore.inserir(post3);

        arvore.imprimeEmOrdem();
        System.out.println();
        arvore.imprimePreFixado();

        System.out.println();
        System.out.println("Árvore com Comparator");

        ArvoreBinariaComparator<Post> arvoreComparator = new ArvoreBinariaComparator<>(new PostComparator());

        arvoreComparator.inserir(post1);
        arvoreComparator.inserir(post3);
        arvoreComparator.inserir(post2);
        arvoreComparator.inserir(post4);
        arvoreComparator.inserir(post5);

        arvoreComparator.imprimeEmOrdem();
        System.out.println();
        arvoreComparator.imprimePreFixado();
    }
}
