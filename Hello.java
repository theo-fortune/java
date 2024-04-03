class Hello {
  public static void main(String args[]) {
    String days = "Monday";
    String result = "";
    result = switch (days) {
      case "Saturday", "Sunday" -> "6am";
      case "Monday" -> "8am";
      default -> "9am";
    };
    System.out.println(result);
  }
}