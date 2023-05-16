
        abstract class A {
            abstract void print(String str);
        }
        class B extends A {
            void print(String str) {
                System.out.println(str + " " +"in method B");
            }
        }
        class C extends A {
            void print(String str) {
                System.out.println(str + " " +"in method C");
            }
        }
        public class Main {
            public static void main(String[] args) {
                A a = new B();


                if (a instanceof A) {

                }
                if (a instanceof B) {
                    a.print("hello");
                }
                a = new C();
                if (a instanceof C) {
                    a.print("Data");
                }
            }

        }

