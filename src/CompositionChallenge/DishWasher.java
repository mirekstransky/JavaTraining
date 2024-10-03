package CompositionChallenge;

public class DishWasher {
    private boolean hasWorkToDo;

    public void doDishes(){
        if (hasWorkToDo){
            System.out.println("Dishwasher starting washing dishes... !");
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
