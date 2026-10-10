/** 大杯红茶 */
public class LargeRedTea extends Tea {
      @Override
      public double calculatePrice() {
                return 5.0 * 2.0; // 基础价5元 × 大杯系数2.0
      }
}
