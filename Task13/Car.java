public class Car extends Vehicle {
    public int numberofdoors = 4;

    public Car (String make, String model, int year, int numberofdoors){
        super(make, model, year);
        this.make = make;
        this.model = model;
        this.year = year;
        this.numberofdoors = numberofdoors;
    }


    public void displayDetals(){
        System.out.println("Car Details:" +
                "\nMake: "+ this.make +
                "" +
                "\nModel: "+ this.model +
                "\nYear: "+ this.year +
                "\nNumber of Doors: "+ this.numberofdoors);
    }
}
