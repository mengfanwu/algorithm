package print;

/**
 * Created by mengfw on 2018/1/24.
 */
public class PrintExcelHeader {
    char[] arr = initCharArr();
    public static void main(String[] args) {
            new PrintExcelHeader().print(1);
    }
    void print(int c){
        c = c-1;
        int a = c%26;
        System.out.println(arr[a]);
        c = c/26;
        if(c <= 0){
            return;
        }
        print(c);
    }
    char[] initCharArr(){
        char[] arr = new char[26];
        int a=64;
        for (int i=0;i<26;i++){
            arr[i] =  (char)(++a);
        }
        return arr;
    }
}
