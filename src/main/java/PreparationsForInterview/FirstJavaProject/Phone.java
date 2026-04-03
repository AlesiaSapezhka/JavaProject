package PreparationsForInterview.FirstJavaProject;

public class Phone {
   String model;
   int batteryLevel;
   int number;

   public static void call (String model, int number) {
       System.out.println("Звоню на номер: " + number + " с телефона " + model);
   }
}
