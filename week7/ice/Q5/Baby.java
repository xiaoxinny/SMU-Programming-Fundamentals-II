public class Baby {
    private boolean isHungry;

    public void setIsHungry(boolean status) {
        this.isHungry = status;
    } 

    public void eat(String description) throws NotHungryException {
        if (isHungry) {
            System.out.println("eating " + description);
        } else {
            throw new NotHungryException("rejects " + description);
        }
    }
}