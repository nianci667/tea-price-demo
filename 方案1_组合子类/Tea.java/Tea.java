/**
 * 方案1：抽象茶类。
   * 每一种「茶品种 + 杯型」组合单独成为一个子类，子类重写 calculatePrice 方法。
   */
public abstract class Tea {
      public abstract double calculatePrice();
}
