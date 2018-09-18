public class Main {

    public static void main(String[] args) {

        BlogPost blogpost1 = new BlogPost("en", "valami", "ez meg valami", "ma");

        Blog blog1 = new Blog(blogpost1);

        blog1.delete(1);
        System.out.println(blogpost1.title);
    }
}
