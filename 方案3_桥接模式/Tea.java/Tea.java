/**
 * 方案3：桥接模式。
   * 抽象茶类持有 Size 引用（单向关联），品种与杯型两个维度解耦。
   */
public abstract class Tea {
      protected Size size; // 持有杯型对象，单向关联

    /** 将杯型注入茶对象 */
    public void setSize(Size size) {
              this.size = size;
    }

    /** 计算价格：基础价 × 杯型系数 */
    public abstract double calculatePrice();
}
