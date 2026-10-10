/**
 * 方案2：父类统一持有基础价格与杯型系数。
   * 子类只在构造方法中为这两个成员变量赋值，价格计算逻辑复用在父类 getPrice()。
   */
public class Tea {
      protected double basePrice;        // 基础价格
    protected double sizeCoefficient;  // 杯型系数

    /** 统一计算价格，所有子类复用这一段逻辑 */
    public double getPrice() {
              return basePrice * sizeCoefficient;
    }
}
