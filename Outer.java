public class Outer {
    
    private class Inner {
        public String getMessage() {
            return "Hello from Inner class!";
        }
    }

    public String callInnerMethod() {
        Inner inner = new Inner();
        return inner.getMessage();
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        String result = outer.callInnerMethod();
        System.out.println(result);
    }
}
