import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Example {

    public static void main(String[] args) {

        String s1 = "Strings are awesome";
        String s2 = "Methods are cool";
        // System.out.println(s1.length);

        // s1.substring(8) A 8k indextől tördelje fel - és a maradékot írja majd ki!
            //s1.substring(0, 8) - kezdő index és vég index és kiírja a kettő között levő szöveget
        // s1.replace(are, is) - végigmegy a szövegen és mondjuk az összes are-t cserélje ki is-re.
        // s1.charAt(0) - az index alatt milyen betű van
        // s1.equals(s2) igazzal tér vissz ha  a két String megegyezik - ez meg egy object-et vár
            //s.equalsIgnoreCase
        // s1.compareTo(s2) -  ABC rendben hasonlítja össze, ha negatív az első van előbb, ha pozitív akkor a második van előbb, és 0 ha megegyezik
        // .toLowercase/ .toUppercase
        // s1.contains("are") - egy adott string tartalmaz-e egy adott karaktert, vagy szövegrészletet - TRUE és FALSE értékeket ad vissza
        // s1.endsWith("e") - egy adott string mivel végződik - ez is TRUE és FALSE értéket ad vissza. Nem csak karakterre hanem szóra is működik.
        // s1.startsWith("str")
        // s1.indexOf("are") - megkeresi az első előfordulásást az adott betűnek, szónak
            // s1.lastIndexOf("are") - az utolsó előfordulásást adja majd vissza

        // String email = "csigacsabi@example.com"
        // String[] data;
        // data = email.split("@") - megkeresi a kukacot, azt kiszedi, és a csigacsabi berakja a tomböm 0-ik elemére, és az example.com-ot pedig a tömb második elemére.
            // email.split("") akkor karakterenként szedi szét
        //

        // Array Lists
        //ArrayList<String> arrayList = new ArrayList<>();
        // ArrayList<Integer>
        //arrayList.add("A");
        //arrayList.add("C");
        //arrayList.add(1, "B");
        //arrayList.add(1, "Peti");
        //arrayList.set(0, "Alex"); //Kicseréli az indexe alatt levő elemet arra amit én kértem
        //arrayList.remove(0);
        //arrayList.remove("C"); //Konkrét elemere is rá lehet keresni, nem csak index alapján.

        //arrayList.addAll(Arrays.asList("D", "E", "F")); // Listát (COLLECTION) csináltam és úgy adtam hozzá, ez ugyanaz, mint ha 3 ADD-al adtam volna hozzá.
        //arrayList.addAll(2, Arrays.asList("X", "x")); //konkrét indextől fűzünk hozzá
        //arrayList.size();
        // arrayList.isEmpty() - megnézi, hogy üres-e az adott lista
        // arrayList.clear() törli az összes lista elemet és egy üres listánk lesz
        // arrayList.contains("A") - igazat ad vissza, ha van benne A betű, különben hamisat - helyenként nézo
            //arrayList.containsAll(Arrays.asList("A", "D")) - IGAZ vagy HAMIS tér vissza - megnézi, hogy van-e A és D külön-külön
       // String[] copyOfList = new String[arrayList.size()];
        //copyOfList = arrayList.toArray(copyOfList); //Mivel a copy egy értékkel tér vissza ezért assignolni kell valamihez, csak maga a parancs nem térne vissza semmivel.
        //System.out.println(Arrays.toString(copyOfList));

        //ArrayList<Integer> intArray = new ArrayList<>();
        //fillArray(intArray);
        //System.out.println(intArray);

        //System.out.println(arrayList);


        //Hash Map
        Map<String, Integer> map = new HashMap<>(); //Map az alaptípus és utána konkretizálom, hogy milyen Map.
        map.put("Age", 22); //Kulcs és érték nem szerepelhet magában csak párban, együtt.
        map.put("Height", 178);
        map.put("Weight", 65);
        //int[] intArray1 = {1, 5, 3};

        //for (int i: intArray1) {
        //    System.out.print(i);
        //}

        //iterate through keys
        for (String s : map.keySet()) {
            System.out.print(s  + " ");
        }
        System.out.println();
        // iterate through values
        for (Integer i: map.values()) {
            System.out.print(i + " ");
        }
        System.out.println();
        //iterate through both
        for (Map.Entry<String, Integer> m: map.entrySet()){
            System.out.println(m);
        }



        // Map-et nem lehet bejárni, csak a for each-el.

        // System.out.println(map.get("Height"));

    }

    // Vár egy arraylist-et amit integeret tárol és a függvéneyen belül úgy hivatkozok rá, hogy list.

        public static void fillArray(ArrayList<Integer> list) {
            for (int i = 1; i <= 10; i++) {
            list.add(i);
            }
        }


}
