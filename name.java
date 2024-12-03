public class name {
    public static void main(String[] args) {
        String name = "Adarsh";
        String last = "mishra";
        String fullname = name + "$" + last;
        for (int i = 0; i < fullname.length(); i++) {
            System.out.println(fullname.charAt(i));
        }
    }
}
