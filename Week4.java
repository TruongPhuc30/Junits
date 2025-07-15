
public class Week4 {
    public static int max2Int(int a, int b) {
        return (a>b) ? a : b;
    }
   public static int minArray(int[] array){

       int min = array[0];
       for (int i = 1; i < array.length; i++) {
           if (array[i] < min) {
               min = array[i];
           }
       }
       return min;
   }
   public static String calculateBMI(double weight, double height) {
       double bmi = weight / (height * height);
       double BMI = Math.round(bmi * 10.0) / 10.0;
       if (BMI < 18.5) {
           return "Thiếu cân";
       }
       if (18.5 <= BMI && BMI <= 22.9) {
           return "Bình thường";
       }
       if (23 <= BMI && BMI <= 24.9) {
           return "Thừa cân";
       }
       if (BMI >= 25) {
           return "Béo phì";
       }
       return "";
   }
}
