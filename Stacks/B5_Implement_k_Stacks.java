package Stacks;
class Kstacks{

    int arr[];
    int top[];
    int next[];
    int cap , k;
    int freeTop;

    Kstacks(int k1 , int n)
    {
        k = k1;
        cap = n;
        arr = new int[cap];
        top = new int[k];
        next = new int[cap];

        for(int i =0 ; i < k ; i ++)
    }
}
public class B5_Implement_k_Stacks {
    
}
