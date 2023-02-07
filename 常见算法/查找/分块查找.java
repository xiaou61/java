package 常见算法.查找;

public class 分块查找 {
    public static void main(String[] args) {
        int[] arr={16,5,9,12,21,18,
                32,23,37,26,45,34,
                50,48,61,52,73,66};

        //要把数据进分块
        Block b1=new Block(21,0,5);
        Block b2 = new Block(45,6,11);
        Block b3 = new Block(73,12,17);

        //定义数组
        Block[] blockArr={b1,b2,b3};

        int number=23;

        //调用一个方法，传递索引表和查找索引。
        int index=getIndex(blockArr,arr,number);
        System.out.println(index);
    }

    private static int getIndex(Block[] blockArr, int[] arr, int number) {
        //确定number在那一块里面
        //定义一个方法。
        int indexBlock = findIndexBlock(blockArr, number);
        if (indexBlock == -1) {
            //表示不再数组当中
            return - 1;
        }



        //获取这一块的起始索引和结束索引
        int startIndex=blockArr[indexBlock].getStartIndex();
        int endIndex = blockArr[indexBlock].getEndIndex();


        for (int i = startIndex; i <= endIndex; i++) {
            if (arr[i]==number){
                return i;
            }
        }


        return - 1;

    }
    public static int findIndexBlock(Block[] blockArr,int number){
        //从0索引开始遍历blockarr，如果number小于max，那么就表示number是在一块当中的
        for (int i = 0; i < blockArr.length; i++) {
            if (number<=blockArr[i].getMax()){
                return i;
            }
        }
        return - 1;
    }
}
class Block{
    private int max;
    private int startIndex;
    private int endIndex;

    public Block() {
    }

    public Block(int max, int startIndex, int endIndex) {
        this.max = max;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    /**
     * 获取
     * @return max
     */
    public int getMax() {
        return max;
    }

    /**
     * 设置
     * @param max
     */
    public void setMax(int max) {
        this.max = max;
    }

    /**
     * 获取
     * @return startIndex
     */
    public int getStartIndex() {
        return startIndex;
    }

    /**
     * 设置
     * @param startIndex
     */
    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    /**
     * 获取
     * @return endIndex
     */
    public int getEndIndex() {
        return endIndex;
    }

    /**
     * 设置
     * @param endIndex
     */
    public void setEndIndex(int endIndex) {
        this.endIndex = endIndex;
    }

    public String toString() {
        return "Block{max = " + max + ", startIndex = " + startIndex + ", endIndex = " + endIndex + "}";
    }
}