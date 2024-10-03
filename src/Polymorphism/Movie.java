package Polymorphism;

public class Movie {
    private String title;

    public Movie(String title) {
        this.title = title;
    }
    public void watchMovie(){
        String result = this.getClass().getSimpleName();
        System.out.println("Watching " + title + " is " + result + " film" );
    }
}
