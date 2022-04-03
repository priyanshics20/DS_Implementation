package Tree;

public class BinaryTree_using_Array {
    int arr[];
    int lastUsedIndex;
    BinaryTree_using_Array(int size){
        arr = new int[size+1];
        lastUsedIndex=0;
    }
    public void insert(int value){
        if(lastUsedIndex>arr.length-1)
            return;
        arr[++lastUsedIndex]=value;
    }
    public void preorder(int index){
        if(index>lastUsedIndex)
            return;
        System.out.println(arr[index]);
        preorder(2*index);
        preorder(2*index+1);
    }
    public int search(int value){
        for(int i=1;i<=lastUsedIndex;i++){
            if(arr[i]==value)
                return i;
        }
        return -1;
    }

    public void delete(int value){
        int idx = search(value);
        arr[idx]=arr[lastUsedIndex--];
    }

    public static void main(String[] args) {
        BinaryTree_using_Array bt = new BinaryTree_using_Array(5);
        bt.insert(10);
        bt.insert(7);
        bt.insert(20);
        bt.insert(45);
        bt.insert(56);
        bt.preorder(1);
        System.out.println(bt.search(20));
        bt.delete(20);
        bt.preorder(1);
    }
}
