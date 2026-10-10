/**
 * 方案0：过程式实现。
 * 价格计算写在 calculatePrice 方法中，通过 if/switch 字符串判断茶品种和杯型。
 * 缺点：新增茶品种需要修改本方法，违反开闭原则。
 */
public class TeaPriceCalculator {

    public double calculatePrice(Tea tea) {
        String type = tea.getType();
        String size = tea.getSize();

        // 基础价格：红茶5元、绿茶6元、花茶7元（扩展示例）
        double basePrice;
        if ("红茶".equals(type)) {
            basePrice = 5.0;
        } else if ("绿茶".equals(type)) {
            basePrice = 6.0;
        } else if ("花茶".equals(type)) {
            basePrice = 7.0;
        } else {
            basePrice = 0.0; // 未知品种
        }

        // 杯型系数：小杯1.0、中杯1.5、大杯2.0
        double sizeCoefficient;
        switch (size) {
            case "小杯":
                sizeCoefficient = 1.0;
                break;
            case "中杯":
                sizeCoefficient = 1.5;
                break;
            case "大杯":
                sizeCoefficient = 2.0;
                break;
            default:
                sizeCoefficient = 0.0; // 未知杯型
        }

        return basePrice * sizeCoefficient;
    }

    public static void main(String[] args) {
        Tea smallRed = new Tea("红茶", "小杯");
        Tea mediumGreen = new Tea("绿茶", "中杯");
        Tea largeFlower = new Tea("花茶", "大杯"); // 扩展：花茶

        TeaPriceCalculator calculator = new TeaPriceCalculator();
        System.out.println("红茶小杯：" + calculator.calculatePrice(smallRed));
        System.out.println("绿茶中杯：" + calculator.calculatePrice(mediumGreen));
        System.out.println("花茶大杯：" + calculator.calculatePrice(largeFlower));
    }
}
