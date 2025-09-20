public class Post implements Comparable<Post> {
    int id;
    String descricao;
    String imagem;
    int likes;
    String createDate;

    public Post(int id, String descricao, String imagem, int likes, String createDate) {
        this.id = id;
        this.descricao = descricao;
        this.imagem = imagem;
        this.likes = likes;
        this.createDate = createDate;
    }

    @Override
    public int compareTo(Post outro) {
        int comparacaoData = this.createDate.compareTo(outro.createDate);
        if (comparacaoData != 0) {
            return comparacaoData;
        }
        return this.createDate.compareTo(outro.createDate);
    }

    @Override
    public String toString() {
        return "Post: " + this.id + " - " + this.descricao + " with image " + this.imagem + " has " + this.likes + " likes\n"
        + "Created at: " + this.createDate + "\n";
    }

}