package lesson.lesson19;

import java.util.List;

public class PeopleQueue extends Thread
{
    private List<String> people;
    private long sleepTime;

    public PeopleQueue(List<String> people, long sleepTime) {
        this.people = people;
        this.sleepTime = sleepTime;
    }

    @Override
    public void run() {
        for (String person : people) {
            System.out.println(Thread.currentThread().getName() + " :: " + person);
            try
            {
                Thread.sleep(sleepTime);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }

    }

}
