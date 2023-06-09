import java.util.*;

public class PracticeCollections {
    public static void main(String[] args) {

        List<Integer> test = new ArrayList<>();
        test.add(4);
        test.add(1);
        test.add(3);
        test.add(2, 6);

        test.remove(1);
        test.remove(Integer.valueOf(1));

        Collections.sort(test);
        System.out.println(test);

        test.remove(2);
        System.out.println(test);

        int getIndex = test.get(1);
        System.out.println(getIndex);

        int max = Collections.max(test);
        System.out.println(max);

        int min = Collections.min(test);
        System.out.println(min);

        for (int sorting : test);
        if ((test.size() % 2) == 0) System.out.println(test);

        ArrayList <Integer> test2 = new ArrayList<>();
         test2.add(2);
         test2.add(3);
         test2.add(4);
         test.addAll(test2);

        System.out.println(test2);
        System.out.println(test);

        //////////////////////////////////////////////////////////////////////////////////////////////////////

        Queue<String> queue = new LinkedList<>();

        queue.add("Елемент 1");
        queue.offer("Елемент 2");
        //add(): Цей метод використовується для додавання елемента в кінець черги. Якщо черга має обмеження на максимальний розмір (capacity),
        // і вона вже досягла свого максимуму, то add() генерує виключення типу IllegalStateException з повідомленням "Queue full".
        // Іншими словами, якщо неможливо додати елемент через обмеження розміру черги, то генерується виключення.
        //offer(): Цей метод також додає елемент в кінець черги. Однак, якщо черга має обмеження на максимальний розмір і вона вже досягла свого максимуму,
        // то offer() поверне false, не генеруючи жодного виключення. Іншими словами, якщо неможливо додати елемент через обмеження розміру черги,
        // то метод просто поверне false.
        boolean isEmptyQueue = queue.isEmpty();
        String firstElement = queue.peek();
        // Видалення та отримання першого елемента черги
        String removedElement = queue.poll();
        int sizeQueue = queue.size();

        //////////////////////////////////////////////////////////////////////////////////////////////

        Stack<String> stack = new Stack<>();
        stack.push("Елемент 1");
        stack.add("Елемент 2");
        stack.push("Елемент 3");
        //різниця між push() та add() полягає в тому, що push() завжди успішно додає елемент і повертає його, тоді як add() повертає
        // булеве значення, що показує, чи вдалося додати елемент до колекції. Зазвичай для роботи зі стеком рекомендується використовувати
        // push() метод, оскільки це визначений метод у класі Stack і біль близький до ідеї стеку.
        boolean isEmpty = stack.isEmpty();
        String topElement = stack.peek();
        String poppedElement = stack.pop();
        int sizeStack = stack.size();
        stack.remove(1);

        String getFirstElement = null; //отримати число
        if (stack.size() >= 2) {
            getFirstElement = stack.get(stack.size() - 2);
        }
        System.out.println("First Element" + " " + getFirstElement);

        String valueToRemove = "Element 1"; //видалення певного числа
        int index = stack.search(valueToRemove);
        if (index != -1) {
            stack.remove(index);
            System.out.println("Value removed: " + valueToRemove);
        } else {
            System.out.println("Value not found in the stack: " + valueToRemove);
        }
        System.out.println("Remaining stack: " + stack);

        ///////////////////////////////////////////// homework from Leedcode

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        int startIndex = 2;
        ListIterator<Integer> iterator = linkedList.listIterator(startIndex);
        while (iterator.hasNext()) {
            System.out.print(iterator.next());
        }

        //////////////////////////////////////////////////////////////////////////////////////

        ArrayList <Integer> product = new ArrayList<>();
        product.add(1);
        product.add(2);
        product.get(1);
        product.remove(0);
        LinkedList <String> shops = new LinkedList<>();
        for (String i: shops)
            shops.add("Element 1");
        shops.add("Element 1");
        shops.get(1);
        shops.remove(0);

        //////////////////////////////////////////////////////////////////////////////////////

        List <Integer> list4;
        List <String> list1 = new ArrayList<>();
        ArrayList<String> dab = new ArrayList<>();

        ///////////////////////////////////////////////////////////////////////////////////////

        List <Integer> numbers = new ArrayList<>();
        List <Integer> numbers4 = new LinkedList<>();
        ArrayList <String > numbers3 = new ArrayList<>();
        LinkedList <String> numbers5 = new LinkedList<>();
        List <String> numbers2 = new ArrayList<>();
        List <Long> str = new LinkedList<>();

        ///////////////////////////////////////////////////////////////////////////////////////

        // hashset зберігає унікальні значення
        // hashmap зберігає різні ключі значення
        Set<Integer> set = new HashSet<>();
        set.add(2);
        set.add(1);
        set.add(2);
        //add(E element): Цей метод додає переданий елемент element до множини HashSet. Якщо елемент вже присутній в множині, то додавання
        // не відбувається, оскільки HashSet не допускає дублікати. Повертає true, якщо елемент успішно доданий, і false, якщо елемент вже
        // присутній у множині.
        System.out.println(set.contains(2));
        set.remove(2);
        System.out.println(set.contains(2));
        System.out.println(set.isEmpty());
        System.out.println(set.size());
        System.out.println(set.equals(2)); //should be true, but vice versa

        Iterator<Integer> iterator1 = set.iterator(); //ослідовний доступ до елементів колекції і дозволяє їх перебирати.
        while (iterator1.hasNext()) {  // Він має методи, такі як hasNext(), next(), і remove(), які дозволяють перевіряти наявність наступного елемента,
            int element = iterator1.next();  // отримувати наступний елемент і видаляти поточний елемент, відповідно.
            System.out.print(element);
        }
        System.out.println(set);
//Різниця в запису Set<Integer> set = new HashSet<>(); та HashSet<Integer> set = new HashSet<>(); полягає у типі змінної,
// до якої присвоюється об'єкт.
//У першому випадку (Set<Integer> set = new HashSet<>();), змінна set має тип інтерфейсу Set, але насправді містить об'єкт
// класу HashSet. Це означає, що ви можете використовувати лише методи та функціонал, визначений в інтерфейсі Set.
// В даному випадку, ви можете використовувати методи, що є спільними для всіх реалізацій інтерфейсу Set, такі як add(),
// remove(), contains(), і т.д. Використання інтерфейсу Set дозволяє зробити код більш гнучким, забезпечуючи можливість зміни
// конкретної реалізації множини, якщо потрібно.
//
//У другому випадку (HashSet<Integer> set = new HashSet<>();), змінна set має конкретний тип класу HashSet. Це означає, що ви
// можете використовувати всі методи та функціонал, які доступні в класі HashSet, разом з усіма специфічними методами цього
// класу. Використання конкретного класу HashSet дозволяє вам використовувати всі функції, які присутні саме у цьому класі.
//
//Узагалінено кажучи, використання інтерфейсу Set дозволяє програмістам працювати з абстракцією множини, не зважаючи на
// конкретну реалізацію. Це дозволяє легше змінювати реалізацію множини в майбутньому без впливу на інші частини коду,
// які використовують цю множину. Однак, при використанні конкретного класу, ви отримуєте доступ до всіх його специфічних
// методів та функціоналу.

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////

        Map<String, Integer> map = new HashMap<>();
        HashMap<String, Integer> maps = new HashMap<>();
        map.put("Olha", 16);
        map.put("Alex", 33);
        map.put("Martin", 37);
        map.put("Olha", 25); //не може бути двох однакових ключів. якщо ключ вже існує, то нове значення перезапише попереднє значення, пов'язане з цим ключем
        System.out.println(map.get("Olha"));

        System.out.println(map.containsKey(23)); //false
        System.out.println(map.containsKey(16)); //false
        System.out.println(map.containsKey("Olha")); //true (звертаємося по ключу)
        System.out.println(map.containsKey("Dima")); //false
        System.out.println(map.containsValue(25)); //true (звертаємося до значення)
        System.out.println("new");

        Map <String, Integer> mapsie = new HashMap<>();
        map.put("Alex", 33);
        map.put("Martin", 37);
        map.put("Olha", 25);

        map.forEach((key, value) -> { //виводить всі елементи
            System.out.println("Ключ: " + key + ", Значення: " + value);
        });
        System.out.println(map.equals(mapsie));

        /////////////////////////////////////////дз

        List<Integer> longie3 = Arrays.asList(1,3,4,4,5,6,7,8);

        List<Integer> filter = longie3.stream() //обираю стрім
                .filter(n -> n % 3 == 0) //фільтрую непарні числа
                .toList(); // тепер збираємо все в ліст
        System.out.println(filter);

        List<Integer> dublicatesDistincts = longie3.stream()
                .distinct()
                .toList();
        System.out.println(dublicatesDistincts);

        List<Integer> limit = longie3.stream()
                .limit(4)
                .toList();
        System.out.println(limit);

        longie3.forEach(n -> System.out.println(n - 1));
        // n -> ось це лямбда вираз, це як аргумент для методу, який каже що n зроби стільки то раз скільки вимагається
        longie3.forEach(System.out::println); //є ще такий більш коротший варіант запису, це як цикл, тільки для ліста


        }
    }

