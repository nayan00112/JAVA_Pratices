
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



/*
In Python, if a subclass has its own `__init__` method and does not 
explicitly call the `__init__` method of its parent class using `super().
__init__()`, the constructor of the parent class won't be automatically 
called. 


In your Python example:

```python
class B:
    def __init__(self):
        print("in B super")

class A(B):
    def __init__(self):
        print("in A")

aa = A()
```

The output will be:

```
in A
```

This is because the `__init__` method of class `A` does not call the 
`__init__` method of its parent class `B`.

On the other hand, in your Java example:

```java
class B {
    public B() {
        System.out.println("in B super");
    }
}

class A extends B {
    public A() {
        System.out.println("in a");
    }
}

public class HelloWorld {
    public static void main(String[] args) {
        A aa = new A();
    }
}
```

The output will be:

```
in B super
in a
```

In Java, when you create an instance of class `A`, the constructor of class 
`B` is automatically called (unless the parent class has a parameterized 
constructor and you need to explicitly call it using `super(...)`). Java 
handles the constructor chaining differently than Python. In Python, you 
need to explicitly call `super().__init__()` if you want to invoke the 
constructor of the parent class.

*/