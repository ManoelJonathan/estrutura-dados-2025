public class Post implements Comparable<Post> {
    String descricao;
    String imagem;
    int likes;

    public Post(String descricao, String imagem, int likes) {
        this.descricao = descricao;
        this.imagem = imagem;
        this.likes = likes;
    }

    @Override
    public int compareTo(Post outro) {
        int comparacaoLikes = Integer.compare(outro.likes, this.likes);
        if (comparacaoLikes != 0) {
            return comparacaoLikes;
        }
        return this.descricao.compareTo(outro.descricao);
    }

    @Override
    public String toString() {
        return "Post: " + this.descricao + " with image " + this.imagem + " has " + this.likes + " likes\n";
    }

}