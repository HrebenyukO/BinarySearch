public class Part2 {
    public static void main(String[] args) {
        System.out.println(Stroka());
    }

    static String Stroka() {
        StringBuilder stringBuilder = new StringBuilder("");
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                stringBuilder.append("Hello world ");
            else if (i % 3 == 0)
                stringBuilder.append("Hello ");
            else if (i % 5 == 0)
                stringBuilder.append("World ");
            else
                stringBuilder.append(i + " ");
        }
        String str = new String(stringBuilder);
        return str;
    }
}
