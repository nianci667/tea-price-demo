/** 绿茶，与任意杯型动态组合 */
public class GreenTea extends Tea {
      private double basePrice = 6.0; // 绿茶基础价

    @Override
      public double calculatePrice() {
                return basePrice * size.getCoefficient();
      }
}
