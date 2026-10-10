/**
 * 茶实体类：包含茶品种与杯型两个属性。
   */
public class Tea {
      private String type; // 茶品种：红茶、绿茶、花茶
    private String size; // 杯型：小杯、中杯、大杯

    public Tea(String type, String size) {
              this.type = type;
              this.size = size;
    }

    public String getType() {
              return type;
    }

    public String getSize() {
              return size;
    }
}
