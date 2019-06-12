package ru.zolotarev.task17;
import java.util.*;

public class SuperComparator implements Comparator <Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getName().compareTo(o2.getName());
    }
}