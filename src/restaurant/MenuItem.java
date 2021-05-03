package restaurant;


import java.util.ArrayList;

public class MenuItem {
    private ArrayList appetizer = new ArrayList(4);
    private ArrayList mainCourse = new ArrayList(4);
    private ArrayList dessert = new ArrayList(4);

    public MenuItem(ArrayList appetizer, ArrayList mainCourse, ArrayList dessert){
        this.appetizer = appetizer;
        this.mainCourse = mainCourse;
        this.dessert = dessert;
    }

    public void setAppetizer(ArrayList appetizer) {this.appetizer = appetizer;}

    public void setMainCourse(ArrayList mainCourse) {this.mainCourse = mainCourse;}

    public void setDessert(ArrayList dessert) {this.appetizer = dessert;}

    public ArrayList getAppetizer() {
        return appetizer;
    }

    public ArrayList getDessert() {
        return dessert;
    }

    public ArrayList getMainCourse() {
        return mainCourse;
    }
}

