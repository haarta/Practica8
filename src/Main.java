
import java.util.*;
import java.util.Collection;


public class Main {


    public static void zad1(ArrayList colors2) {
        System.out.println("1 задание: ");
        System.out.println(colors2);
    }

    public static void zad2(ArrayList colors2,Scanner sc) {
        System.out.println("2 задание: "); System.out.println("Изначальный массив: "); System.out.println(colors2);
        System.out.println("Введите номер обновляемого элемента и новое название: ");
        colors2.set(sc.nextInt(), sc.next());
        System.out.println(colors2);
    }

    public static void zad3(ArrayList colors2,Scanner sc) {
        System.out.println("3 задание: ");
        System.out.println(colors2);
        System.out.println("введите границы извлекаемой части: ");
        List col = colors2.subList(sc.nextInt(), sc.nextInt()); //узнать почему просто List а ArrayList не подойдет
        System.out.println(col);
    }


    public static void zad4() { //костыль сделал с пустым значением, хз как чинить
        System.out.println("4 задание!");
        ArrayList<String> danet = new ArrayList<>();

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("red");
        list1.add("green");
        list1.add("black");
        list1.add("white");
        list1.add("pink");
        System.out.println(list1);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("red");
        list2.add("green");
        list2.add("black");
        list2.add("");
        list2.add("pink");
        System.out.println(list2);


        for (int i = 0; i < list1.size(); i++) {

            String value = list1.get(i);
            String value2 = list2.get(i);

            if (value.equals(value2)) {
                danet.add("Да");
            } else {
                danet.add("Нет");
            }
        }
        System.out.println(danet);
    }

    public static void zad5(ArrayList colors2) {
        System.out.println("5 задание: ");
        System.out.println("Исходный список: ");
        System.out.println(colors2);
        System.out.println("Перетасованный список: ");
        Collections.shuffle(colors2);
        System.out.println(colors2);

    }

    public static void zad6(LinkedList clr, Scanner sc){
        System.out.println("6 задание: ");
        System.out.println("Исходный связный список: ");
        System.out.println(clr);
        System.out.println("Введите позицию и новое значение: ");
        clr.add(sc.nextInt(),sc.next());
        System.out.println("Новый связный список: ");
        System.out.println(clr);
    }


    public static void zad7(LinkedList clr,Scanner sc){
        System.out.println("7 задание: ");
        System.out.println("Исходный связный список: ");
        System.out.println(clr);
        System.out.println("Введите новое значение первого элемента ");
        clr.addFirst(sc.next());
        System.out.println("Введите новое значение последнего элемента ");
        clr.addLast(sc.next());
        System.out.println("Новый связный список: ");
        System.out.println(clr);
    }

    public static void zad8(LinkedList clr,Scanner sc){
        System.out.println("8 задание: ");
        System.out.println("Исходный связный список: ");
        System.out.println(clr);
        LinkedList<String> clr1 = new LinkedList<>();
        System.out.println("Введите новые элементы списка");
        clr1.add(sc.next()); clr1.add(sc.next());
        System.out.println("Введите позицию для добавления");
        clr.addAll(sc.nextInt(),clr1);
        System.out.println(clr);
    }

    public static void zad9(LinkedList clr){
        System.out.println("9 задание: ");
        System.out.println("Исходный связный список: ");
        System.out.println(clr);

        for(int i=0;i<clr.size();i++){
            String value = clr.get(i).toString();
            System.out.println("Элемент с индексом " + i +" : " + value);
        }
    }


    public static void zad10(){
        System.out.println("10 задание: ");
        ArrayList<Integer> l1 = new ArrayList<>();
        for (int i = 1; i <= 10 ; i++) {
            l1.add(i);
        }

        ArrayList<String> l2 = new ArrayList<>();
        l2.add("aaa");
        l2.add("www");
        l2.add("eee");
        l2.add("rrr");
        l2.add("ttt");
        l2.add("yyy");
        l2.add("uuu");
        l2.add("iii");
        l2.add("xxx");
        l2.add("ccc");


        ArrayList<String> l3 = new ArrayList<>();
        for (int i = 0; i < l1.size(); i++) {
            String rez = l1.get(i) + " - " + l2.get(i);
            l3.add(rez);
        }

        for (String s: l3) {
            System.out.println(s);
        }

    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> colors = new ArrayList<>();
        colors.add("Красный");
        colors.add("Зеленый");
        colors.add("Оранжевый");
        colors.add("Белый");
        colors.add("Черный");
        //String str = Arrays.toString(colors.toArray());
        ArrayList<String> colors2 = colors;

        LinkedList<String> clr = new LinkedList<>();
        clr.add("red");
        clr.add("green");
        clr.add("black");
        clr.add("white");
        clr.add("pink");


        zad1(colors2);
        zad2(colors2,sc);
        zad3(colors2,sc);
        zad4();
        zad5(colors2);
        zad6(clr,sc);
        zad7(clr,sc);
        zad8(clr,sc);
        zad9(clr);
        zad10();
    }
}