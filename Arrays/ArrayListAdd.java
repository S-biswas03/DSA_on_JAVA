import java.util.ArrayList;
public class ArrayListAdd {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list + " " + list.size());
        list.add(12);
        System.out.println(list + " " + list.size());
        list.add(30);
        System.out.println(list + " " + list.size());
        list.add(43);
        System.out.println(list + " " + list.size());
        list.add(55);
        System.out.println(list + " " + list.size());

        list.remove(2);
        System.out.println(list + " " + list.size());
    }
}
