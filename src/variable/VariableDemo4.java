package variable;

public class VariableDemo4 {
    static void main() {
        double weight = 55;
        double height = 1.69;
        double bmi = weight / height / height;
        System.out.println("bmi="+bmi);
        double maxweight = 23.9*height*height;
        System.out.println("maxweight="+maxweight);
    }
}
