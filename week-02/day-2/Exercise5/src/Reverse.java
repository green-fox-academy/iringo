public class Reverse {

    public static void main(String[] args) {

        String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

        StringBuilder newstring = new StringBuilder();
        newstring.append(reversed);
        newstring = newstring.reverse();
        System.out.println(newstring);

    }

}
