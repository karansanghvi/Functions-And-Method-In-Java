//WAP to perform function overloading using data types
public class functionoverloading2 {
    //function to calculate integer sum
    public static int sum(int a, int b) {
        return a+b;
    }
    //function to calculate float sum
    public static float sum(float a, float b) {
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println(sum(3, 5));
        System.out.println(sum(3.2f, 4.8f));
    }
}
