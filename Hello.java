class Hello {
  public static void main(String args[]) {
    int x = 4;
    int result = 0;
    if (x % 2 == 0) {
      result = 10;
      System.out.println(result);
    } else {
      result = 20;
      System.out.println(result);
    }
    int points = 0;
    points = x % 2 == 0 ? 10 : 20;
  }
}