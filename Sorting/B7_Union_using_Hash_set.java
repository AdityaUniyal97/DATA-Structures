package Sorting;

import java.util.HashSet;

/**
 * B7_Union_using_Hash_set
 */
public class B7_Union_using_Hash_set {

    public static int finUnion(int a[] , int b[])
    {
        HashSet<Integer> unionset = new HashSet<>();
        for(int value : a)
        {
            unionset.add(value);
        }
        for(int value : b)
        {
            unionset.add(value);
        }

        return unionset.size();
    }
}