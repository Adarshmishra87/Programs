public class stringBuilders {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        // print char at index of 2
        // System.out.println(sb.charAt(5));
        // to change any character index we use setcharAt(index,character you wanted to
        // change)
        // sb.setCharAt(1, 'E');
        // to add extra character into string//
        sb.insert(2, 'n');
        // delete any extra character in string we use delete function as sb.delete(at
        // index, end index);
        sb.delete(2, 4);
        System.out.println(sb);

    }
}
