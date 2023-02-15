import java.util.PriorityQueue;

public class Saloon {

    private String title;
    private PriorityQueue<Cowboy> cowboys;

    public Saloon(String title) {
        this.title = title;
        cowboys = new PriorityQueue<>();

    }

    public  void serveDrink(){
        if (cowboys.isEmpty()){
            System.out.println("No one there");
        } else {
            System.out.println(cowboys.poll().getName() + " take your whiskey");
        }
    }

    public void  letCowboyIn(Cowboy cowboy){
        cowboys.offer(cowboy);

    }

    @Override
    public String toString() {
        return "Saloon{" +
                "title='" + title + '\'' +
                ", cowboys=" + cowboys +
                '\n';
    }
}
