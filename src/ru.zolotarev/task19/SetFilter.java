package ru.zolotarev.task19;

import java.util.Set;

public class SetFilter {
    public Set<String> removeEvenLength(Set<String> set) {
        for (String s : set) {
            if (s.length() % 2 == 0) {
                set.remove(s);
            }
        }
        System.out.println(set.toString());
        return set;
    }
}