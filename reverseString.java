public class reverseString {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");
        for (int i = 0; i < sb.length() / 2; i++) {
            // font index replaced name as:i
            // last index replace it's name as:sb.length()-i-1;
            int font = i;//here i stands for index
            int back = sb.length() - 1 - i;// 5-1-0=4index has character h;
            char fontchar = sb.charAt(font);
            char backchar = sb.charAt(back);
            sb.setCharAt(font, backchar);//here front character replaced by ➡️back character;
            sb.setCharAt(back, fontchar);//here back character replaced by ➡️front character;
            
        }
        System.out.println(sb);
    }

}
