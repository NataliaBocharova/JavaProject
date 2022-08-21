public class Loop {
    public static void main(String[] args) {

        for (int i = 100; i >= 1; i--){
            if(getNeedNumber(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean getNeedNumber(int number) {
        return number % 4 == 0;
    }
}
