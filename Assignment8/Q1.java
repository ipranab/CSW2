package Assigment_8;

class BSTnode {
    int info;
    BSTnode left, right;

    public BSTnode(int info) {
        this.info = info;
        left = right = null;
    }
    public void insert(int info){
        if(info<this.info){
            if(left==null){
                left=new BSTnode(info);
            }else{
                left.insert(info);
            }
        }if(info>this.info){
            if(right==null){
                right= new BSTnode(info);
            }else{
                right.insert(info);
            }
        }
    }

}

public class Q1 {
    public static void main(String[] args) {
        BSTnode root = new BSTnode(30);
        root.insert(90);
        root.insert(35);
        root.insert(50);
        root.insert(10);

        System.out.println(root.info);
        System.out.println(root.left.info);
        System.out.println(root.right.info);

    }
}
