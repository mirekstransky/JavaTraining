package CompositionChallenge;

public class Refrigerator {
    private boolean hasWorkToDo;

    public void orderFood(){
        if (hasWorkToDo){
            System.out.println("Refrigerator starting ordering food... !");
            hasWorkToDo = false;
        }
    }

    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
}
