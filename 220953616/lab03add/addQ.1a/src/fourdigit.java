
public class fourdigit {
    public static void main(String[] args) throws Exception {
        
        int[]num={1,2,3,4};
        for (int i : num) {
            for (int j : num) {
                for (int k : num) {
                    for (int l : num) {
                        int number=1000*i+100*j+10*k+l;
                        System.out.println(number);
                        
                    }
                }
            }
        }
    }
}
