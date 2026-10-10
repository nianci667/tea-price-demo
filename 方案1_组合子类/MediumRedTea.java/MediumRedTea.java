/** 中杯红茶 */
public class MediumRedTea extends Tea {
      @Override
      public double calculatePrice() {
                return 5.0 * 1.5; // 基础价5元 × 中杯系数1.5
      }
}
