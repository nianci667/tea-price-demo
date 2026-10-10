/** 红茶，与任意杯型动态组合 */
public class RedTea extends Tea {
      private double basePrice = 5.0; // 红茶基础价

    @Override
      public double calculatePrice() {
                return basePrice * size.getCoefficient();
      }
}
