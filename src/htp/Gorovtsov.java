package htp;

public class Gorovtsov {
    private String newField;
    public static void main(String[] args) {
        System.out.println("First str changed by gorovtsov");
        System.out.println("First str changed by Denis");
        System.out.println("Can i go to master?");
        Gorovtsov gorovtsov = new Gorovtsov();
    }

    public void setNewField(String newField) {
        this.newField = newField;
    }

}
