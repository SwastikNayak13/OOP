public class fourdig {
    public static void main(String[] args) throws Exception {
        int[]num={1,2,3,4};
        for (int i : num) {
            for (int j : num) {
                if(i!=j){
                for (int k : num) {
                    if(j!=k){
                    for (int l : num) {
                        if(k!=l){
                            if(i!=k){
                                if(i!=l){
                                    if(j!=l){
                        int number=1000*i+100*j+10*k+l;
                        System.out.println(number);}
                        
                    }
                }
            }
        }
    }
}}}}}}
