import java.util.*;

public class Collections {
    public static void main(String[] args) {

        //Заметка о таких коллекциях как List,Set,Map

        //List

        //ArrayList
        List<String> fruitsArrayList = new ArrayList<String>();
        fruitsArrayList.add("apple");
        fruitsArrayList.add("cherry");
        fruitsArrayList.add("banana");
        fruitsArrayList.add("apple");
        System.out.println(fruitsArrayList + "ArrayList");
        // У массива очень дешевое обращение по индексу
        // но дорогое при добавлении новых элементов
        // при условии его большой величины

        //LinkedList
        List<String> fruitsLinkedList = new LinkedList<String>();
        fruitsLinkedList.add("apple");
        fruitsLinkedList.add("cherry");
        fruitsLinkedList.add("banana");
        fruitsLinkedList.add("apple");
        System.out.println(fruitsLinkedList + "LinkedList");
        //LinkedList в отличии от ArrayList построен на базе связанных друг с другом элементов
        //каждый такой элемент имеет ссылку на следующий элемент и на предыдущий
        //обращение по индексу дорогое, так как нужно проходиться по всей цепочке до искомого
        //но зато дешовая вставка в середину
        //часто почти не используется

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        //Set

        Set<String> fruitsHashSet = new HashSet<String>();
        fruitsHashSet.add("apple");
        fruitsHashSet.add("cherry");
        fruitsHashSet.add("banana");
        fruitsHashSet.add("apple");
        System.out.println(fruitsHashSet + "HashSet");
        //HashSet работает быстрее остальных Setов
        //порядок зависит от ключа по которому вычисляется hash

        Set<String> fruitsLinkedHashSet = new LinkedHashSet<>();
        fruitsLinkedHashSet.add("apple");
        fruitsLinkedHashSet.add("cherry");
        fruitsLinkedHashSet.add("banana");
        fruitsLinkedHashSet.add("apple");
        System.out.println(fruitsLinkedHashSet + "LinkedHashSet");
        //LinkedHashSet сохраняет порядок

        Set<String> fruitsTreeSet = new TreeSet<>();
        fruitsTreeSet.add("apple");
        fruitsTreeSet.add("cherry");
        fruitsTreeSet.add("banana");
        fruitsTreeSet.add("apple");
        System.out.println(fruitsTreeSet + "TreeSet");
        //отсортировывает в алфавитном порядке

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        Map<String, Integer> fruitsMap = new HashMap<>();
        fruitsMap.put("apple", 3);
        fruitsMap.put("cherry", 2);
        fruitsMap.put("banana", 1);
        fruitsMap.put("apple", 3);
        System.out.println(fruitsMap + "Map");

        //отсортировывает по hash

        Map<String, Integer> fruitsMapPutIfAbsent = new HashMap<>();
        fruitsMapPutIfAbsent.putIfAbsent("apple", 3);
        fruitsMapPutIfAbsent.putIfAbsent("cherry", 2);
        fruitsMapPutIfAbsent.putIfAbsent("banana", 1);
        fruitsMapPutIfAbsent.putIfAbsent("apple", 3);
        System.out.println(fruitsMapPutIfAbsent + "MapHashMap and element PutIfAbsent");

        //элемент PutIfAbsent исключает перетирание значений и добавляет элемент только если его ещё нет в коллекции

        Map<String, Integer> fruitsMapLinkedHashMap = new LinkedHashMap<>();
        fruitsMapLinkedHashMap.putIfAbsent("apple", 3);
        fruitsMapLinkedHashMap.putIfAbsent("cherry", 2);
        fruitsMapLinkedHashMap.putIfAbsent("banana", 1);
        fruitsMapLinkedHashMap.putIfAbsent("apple", 3);
        System.out.println(fruitsMapLinkedHashMap + "MapLinkedHashMap and element PutIfAbsent");

        //сохраняет порядок добавления

        Map<String, Integer> fruitsMapTreeMap = new TreeMap<>();
        fruitsMapTreeMap.putIfAbsent("apple", 3);
        fruitsMapTreeMap.putIfAbsent("cherry", 2);
        fruitsMapTreeMap.putIfAbsent("banana", 1);
        fruitsMapTreeMap.putIfAbsent("apple", 3);
        System.out.println(fruitsMapTreeMap + "MapTreeMap and element PutIfAbsent");

        //сортирует по ключам
    }
}
