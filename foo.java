public class Foo {
int x;
public Foo() {
this(1);
System.out.println(x);
}
public Foo(int x) {
this.x = x;
}
}