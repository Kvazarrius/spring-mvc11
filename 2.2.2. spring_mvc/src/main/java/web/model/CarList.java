package web.model;

import java.util.ArrayList;
import java.util.List;

public class CarList {
    Car one = new Car("Audi", "Red", 200);
    Car two = new Car("BMW", "Black", 250);
    Car three = new Car("Mercedes", "White", 230);
    Car four = new Car("LADA", "Brown", 180);
    Car five = new Car("Chevrolet", "Yellow", 320);

    public List autoList(int count) {
        List list = new ArrayList();
        if (count == 1) {
            list.add(one);
        } else if (count == 2) {
            list.add(one);
            list.add(two);
        } else if (count == 3) {
            list.add(one);
            list.add(two);
            list.add(three);
        } else if (count == 4) {
            list.add(one);
            list.add(two);
            list.add(three);
            list.add(four);
        } else if (count == 5) {
            list.add(one);
            list.add(two);
            list.add(three);
            list.add(four);
            list.add(five);
        }
        return list;
    }
}
