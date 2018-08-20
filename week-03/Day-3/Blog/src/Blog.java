import java.util.ArrayList;

public class Blog {

    ArrayList<BlogPost> list = new ArrayList<>();

    Blog (BlogPost post) {
        this.list.add(post);
    }

    public void delete (int index) {
        list.remove(index);
    }

    public void update (int index, BlogPost newPost) {
        list.add(index, newPost);
    }

}
