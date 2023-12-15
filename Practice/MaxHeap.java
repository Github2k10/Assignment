package Practice;

import java.util.*;

public class MaxHeap {
    List<Integer> list;
    int heapSize;

    MaxHeap(){
        list = new ArrayList<>();
        heapSize = 0;
    }

    MaxHeap(List<Integer> list){
        this.list = list;
        this.heapSize = list.size();
    }

    public void heapfiy(int i){
        if(i <= 0) return ;
        int l = leftChild(i);
        int r = rightChild(i);
        int m = i;

        if(l < heapSize && list.get(l) > list.get(i)) m = l;
        if(r < heapSize && list.get(r) > list.get(i)) m = r;
        if(m != i){
            int k = list.get(i);
            list.set(i, list.get(m));
            list.set(m, k);
            heapfiy(m);
        } 
    }

    public void add(int a){
        list.add(a);
        heapSize++;
        
        int i = heapSize;

        while(i != 1 && list.get(parent(i)) < list.get(i)){
            int k = list.get(i);
            list.set(i, list.get(parent(i)));
            list.set(parent(i), k);
            i = parent(i);
        }
    }

    public int removeMax(){
        if(heapSize <= 0) {
            System.out.println("Out of range");
            return Integer.MAX_VALUE;
        }

        if(heapSize == 1){
            heapSize--;
            return list.get(1);
        }

        int root = list.get(1);
        list.set(1, list.get(heapSize));
        heapfiy(1);
        list.remove(heapSize);
        heapSize--;
        return root;
    }

    public void delete(int i){
        increaseKey(i);
        
    }

    public int getMax(){
        return list.get(1) == null ? Integer.MAX_VALUE : list.get(1);
    }

    public int parent(int i){
        return (i)/2;
    }

    public int leftChild(int i){
        return (i * 2);
    }

    public int rightChild(int i){
        return (i * 2 + 1);
    }

    private void increaseKey(int i){
        list.set(i, Integer.MAX_VALUE);
        while(i != 1 && list.get(parent(i)) < list.get(i)){
            int k = list.get(i);
            list.set(i, list.get(parent(i)));
            list.set(parent(i), k);
            i = parent(i);
        }
    }

    
    public String toString(){
        return list.toString();
    }
}
