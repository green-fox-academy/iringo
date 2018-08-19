// Reuse your Sharpie class
//Create SharpieSet class
//it contains a list of Sharpie
    //countUsable() -> sharpie is usable if it has ink in it
    //removeTrash() -> removes all unusable sharpies

import java.util.List;

public class SharpieSet{

    List<Sharpie> list;

    public int countUsable() {

        int counter = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).inkAmount > 0) {
                counter ++;
            }
        }
        return counter;
    }

    public void removeTrash() {

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).inkAmount <= 0) {
                list.remove(i);
            }
        }

    }

}