
public class SeqList<E> {  //泛型参数，常见的有E,T key,不能直接被实例化
    private E[] data = (E[]) new Object[100];
    private  int size;
    public void add(E elem){
        data[size] = elem;
        size++;
    }
    public E get(int index){
        return data[index];
    }
    public static void main(String[] args) {
         SeqList<String> seqList = new SeqList<>();
         seqList.add("加油");
         seqList.add("中国");
         seqList.add("HELLO");
         String str = seqList.get(0);
        System.out.println(str);
    }
}
