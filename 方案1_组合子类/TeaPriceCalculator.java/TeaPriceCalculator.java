/**
 * 方案1 测试入口。
   */
public class TeaPriceCalculator {
      public static void main(String[] args) {
                Tea smallRed = new SmallRedTea();
                Tea mediumRed = new MediumRedTea();
                Tea largeRed = new LargeRedTea();

          Tea smallGreen = new SmallGreenTea();
                Tea mediumGreen = new MediumGreenTea();
                Tea largeGreen = new LargeGreenTea();

          System.out.println("小杯红茶：" + smallRed.calculatePrice());
                System.out.println("中杯红茶：" + mediumRed.calculatePrice());
                System.out.println("大杯红茶：" + largeRed.calculatePrice());
                System.out.println("小杯绿茶：" + smallGreen.calculatePrice());
                System.out.println("中杯绿茶：" + mediumGreen.calculatePrice());
                System.out.println("大杯绿茶：" + largeGreen.calculatePrice());
      }
}
