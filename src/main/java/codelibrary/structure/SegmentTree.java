package codelibrary.structure;

public class SegmentTree {
    private int data[];
    private int size;
    public SegmentTree(int size){
        this.data = new int[size<<1];
        this.size = size;
    }
    public SegmentTree(int[] data){
        this.data = new int[data.length<<1];
        this.size = data.length;
        System.arraycopy(data,0,this.data,data.length,data.length);
    }
    public void build(){
        for(int i = size - 1;i>0;i--){
            System.out.println(i+" "+(i<<1)+" "+(i<<1|1));
        }
    }
    public void modify(int index,int value){
        for(data[index+=size] = value;index>0;index>>=1){
            System.out.println((index>>1)+" "+(index)+" "+(index^1));
        }
    }

}
