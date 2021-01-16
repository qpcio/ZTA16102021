public class InfiniteLoop {
    public static void main(String[] args) {
        int i = 34;
        while(true){
            System.out.println(i);
            i++;
            //warunek przerwania petli
            if (i>49)break;
        }
    }
}
