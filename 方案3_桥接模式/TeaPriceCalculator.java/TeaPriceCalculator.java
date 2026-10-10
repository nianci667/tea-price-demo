/**
 * 方案3 测试入口。
   */
public class TeaPriceCalculator {
      public static void main(String[] args) {
                Tea redTea = new RedTea();
                Tea greenTea = new GreenTea();

          redTea.setSize(new SmallSize());
                System.out.println("小杯红茶：" + redTea.calculatePrice());

          redTea.setSize(new MediumSize());
                System.out.println("中杯红茶：" + redTea.calculatePrice());

          redTea.setSize(new LargeSize());
                System.out.println("大杯红茶：" + redTea.calculatePrice());

          greenTea.setSize(new SmallSize());
                System.out.println("小杯绿茶：" + greenTea.calculatePrice());

          greenTea.setSize(new MediumSize());
                System.out.println("中杯绿茶：" + greenTea.calculatePrice());

          greenTea.setSize(new LargeSize());
                System.out.println("大杯绿茶：" + greenTea.calculatePrice());
      }
}
