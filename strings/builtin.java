package strings;

public class builtin {
    public static void main(String[] args) {
        String str = "Supritam Biswas";
        System.out.println(str);
        System.out.println(str.charAt(5));
        int x = str.length();
        System.out.println(x);

        String s = "Supritaam";
        System.out.println(s.indexOf('a'));
        System.out.println(s.lastIndexOf('a'));

        String s1 = "abc";
        String s2 = "abbcc";
        String s3 = "abcdd";
        String s4 = "a";

        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));
        System.out.println(s1.compareTo(s4));

        String a = "Physics Wallah";
        System.out.println(a.startsWith("Phy"));
        System.out.println(a.contains("sics"));
        System.out.println(a.endsWith("llah"));

        System.out.println(a.toLowerCase());
        System.out.println(a.toUpperCase());
        System.out.println();
        System.out.println(s1.concat(s3));
        }
}
