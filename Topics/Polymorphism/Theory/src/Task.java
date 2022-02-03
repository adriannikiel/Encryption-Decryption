// You can experiment here, it won’t be checked

public class Task {
  public static void main(String[] args) {
    // put your code here

    BaseNumberGenerator generator = new MagicNumberGenerator(10);
    int value = generator.generate();

  }

  static class BaseNumberGenerator {

    protected int base;

    public BaseNumberGenerator(int base) {
      this.base = base;
    }

    public int generate() {
      return base + 11;
    }
  }

  static class NumberGenerator extends BaseNumberGenerator {


    public NumberGenerator(int base) {
      super(base);
    }

    @Override
    public int generate() {

      return super.generate() + getNumber();
    }


    protected int getNumber() {
      return this.base - 7;
    }
  }

  static class MagicNumberGenerator extends NumberGenerator {


    public MagicNumberGenerator(int base) {
      super(base);
    }

    @Override
    protected int getNumber() {
      return this.base + 7;
    }
  }

}
