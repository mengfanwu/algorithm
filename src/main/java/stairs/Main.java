package stairs;

/**
 * Created by mengfw on 2017/12/19.
 * N阶楼梯，每次可以走一阶或两阶，从底下走到顶有多少种方案
 */
public class Main {

    public int getKinds(int step){
        if(step == 1){
            return 1;
        }
        if(step == 2){
            return 2;
        }
        int pre = getKinds(--step);
        int prePre = getKinds(--step);
        return pre + prePre;
    }

    public static void main(String[] args) {
        Main main = new Main();
        int kinds = main.getKinds(4);
        System.out.println(kinds);
    }
}
