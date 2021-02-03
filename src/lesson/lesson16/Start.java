package lesson.lesson16;

public class Start
{
    public static void main(String[] args)
    {
        Monitoring alert = new Monitoring()
        {
            @Override
            public String monitor(String n)
            {
                System.out.println("some error message");
                return "alert";
            }
        };

        alert.monitor("fwewefef");

        Monitoring ok = new Monitoring()
        {
            @Override
            public String monitor(String n)
            {
                System.out.println("some info message: " + n);
                return "ok";
            }
        };

        example("Hello World");

        Person.Body body = new Person.Body("right");
        Person person = new Person("ffw", "weffwe", 3);
        Person.Head head = person.new Head("left");

    }

    private static void example(String s) {
        class Test {
            private int i;

            Test(int i) {
                this.i = i;
            }

            public void print() {
                System.out.println(s + " - number " + i);
            }
        }

        Test test = new Test(3);
        test.print();
    }
}
