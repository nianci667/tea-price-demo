/**
 * 方案2 测试入口。
   */
public class TeaPriceCalculator {
      public static void main(String[] args) {
                Tea smallRed = new SmallRedTea();
                Tea mediumRed = new MediumRedTea();
                Tea largeRed = new LargeRedTea();

          Tea smallGreen = new SmallGreenTea();
                Tea mediumGreen = new MediumGreenTea();
                Tea largeGreen = new LargeGreenTea();

          System.out.println("小杯红茶：" + smallRed.getPrice());
                System.out.println("中杯红茶：" + mediumRed.getPrice());
                System.out.println("大杯红茶：" + largeRed.getPrice());
                System.out.println("小杯绿茶：" + smallGreen.getPrice());
                System.out.println("中杯绿茶：" + mediumGreen.getPrice());
                System.out.println("大杯绿茶：" + largeGreen.getPrice());
      }
}
