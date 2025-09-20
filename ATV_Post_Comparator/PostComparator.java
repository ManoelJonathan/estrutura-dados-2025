import java.util.Comparator; 
public class PostComparator implements Comparator<Post> {
    @Override
    public int compare(Post p1, Post p2){
        return Integer.compare(p1.id, p2.id);
    }
}
