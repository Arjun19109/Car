interface MyInterface {
    public void method1();
    public void method2();
}

class MyClass implements MyInterface {
    public void method1() {
        System.out.println("implementation of method1");
    }
    public void method2() {
        System.out.println("implementation of method2");
    }
    public static void main(String[] args) {
        MyInterface obj = new MyClass();
        obj.method1();
        obj.method2();
    }
}