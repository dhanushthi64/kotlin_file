import java.util.Arrays;

public class MinHeap {
    public static void main(String[] args) {
        
    }
}
class Min{
    int capacity;
    int size;
    int[] heap;
    public Min(int capacity){
        this.capacity = capacity;
        this.size = 0;
        this.heap = new int[capacity];
    }
    int parent(int index){
        return (index-1)/2;
    }
    int leftindex(int index){
        return 2*index+1;
    }
    int rightindex(int index){
        return 2*index+2;
    }
    void ensureCapacity(){
        if(size==capacity){
            heap = Arrays.copyOf(heap, capacity*2);
            capacity*=2;
        }
    }
    void swap(int index1,int index2){
        int temp = heap[index1];
        heap[index1] = heap[index2];
        heap[index2] = temp;
    }
    void insert(int element){
        ensureCapacity();
        heap[size] = element;
        size++;
        heapifyUp(size-1);
    }
    void heapifyUp(int index){
        while(index!=0 && heap[parent(index)]<heap[index]){
            swap(index, parent(index));
            index = parent(index);
        }
    }
    int extractMin(){
        int root = heap[0];
        heap[0] = heap[size-1];
        size--;
        heapifyDown(0);
        return root;
    }
    void heapifyDown(int index){
        int smallest = index;
        int left = leftindex(index);
        int right = rightindex(index);
        if(left<size && heap[left]<heap[smallest]){
            smallest = left;
        }
        if(right<size && heap[right]<heap[smallest]){
            smallest = right;
        }
        if(smallest!=index){
            swap(index,smallest);
            heapifyDown(smallest);
        }
    }
}