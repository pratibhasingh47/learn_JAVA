public class Car2 {
    
    private String make;
    private String model;
    private int year;

    Car2(String make, String model , int year){
        // this.make = make;
        // this.model = model;
        // this.year = year;
        this.setMake(make);
        this.setModel(model);
        this.setYear(year);
    }

    Car2(Car2 y){
        this.copy(y);
        this.copy(y);
        this.copy(y);
    }

    public String getMake()
    {
        return make;
    }
    public String getModel()
    {
        return model;
    }
    public int getYear()
    {
        return year;
    }

    public void setMake(String make){
        this.make = make;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setYear(int year){
        this.year = year;
    }

    public void copy(Car2 x){
        this.setMake(x.getMake());
        this.setModel(x.getModel());
        this.setYear(x.getYear());
    }
}
