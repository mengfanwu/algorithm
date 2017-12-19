package stairs;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by mengfw on 2017/12/19.
 * N阶楼梯，每次可以走一阶或两阶，从底下走到顶有多少种方案
 */
public class Main {
    Map<Integer,Long> map = new HashMap<>();
    public long getKinds(int step){
        if(map.containsKey(step)){
            return map.get(step);
        }
        if(step == 1){
            return 1;
        }
        if(step == 2){
            return 2;
        }
        long result = getKinds(--step) + getKinds(--step);
        map.put(step,result);
        return result;
    }

    public static void main(String[] args) {
        Main main = new Main();
        long kinds = main.getKinds(100);
        System.out.println(kinds);
    }
}
