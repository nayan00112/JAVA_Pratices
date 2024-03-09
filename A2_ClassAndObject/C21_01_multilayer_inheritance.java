
class C{
    public C(){
        System.out.println("in C super super");
    }
}

class B extends C{
    public B(){
        System.out.println("in B super");
    }
}
class A extends B{
    public A(){
        System.out.println("in a");
    }
}
class C21_01_multilayer_inheritance {
    public static void main(String[] args) {
        //System.out.println("Try programiz.pro");
        A aa = new A();
    }
}

// Output:
// in C super super
// in B super
// in a