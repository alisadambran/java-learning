package lv.acodemy;

public class PezDispenser {
    private String name;
    private String colour;
    private String series;
    private int candiesCapacity;
    private int candiesAmount;

    public PezDispenser(String name, String colour, String series, int candiesCapacity) {
        this.name = name;
        this.colour = colour;
        this.series = series;
        this.candiesCapacity = 12;
        this.candiesAmount = this.candiesCapacity; // fuull by creation
    }

    public String getName() {
        return this.name;
    }

    public String getColour() {
        return this.colour;
    }

    public String getSeries() {
        return this.series;
    }

    public int getCandiesCapacity() {
        return candiesCapacity;
    }

    public int getCandiesAmount() {
        return this.candiesAmount;
    }

    public void setCandiesAmount(int candiesAmount) {
        this.candiesAmount = candiesAmount;
    }

    // API

    public void getSomeCandies(int candiesNumber) {
        if (this.candiesAmount == 0) {
            System.out.println("No candies available");
        } else if (this.candiesAmount - candiesNumber >= 0) {
            this.candiesAmount -= candiesNumber;
            System.out.println("Take Your " + candiesNumber + " candies, New candies amount: " + this.candiesAmount);
        } else {
            System.out.println("Can't give You " + candiesNumber + " candies. Take Your " + this.candiesAmount + " candies loadable, New candies amount: " + 0);
            this.candiesAmount = 0;
        }
    }

    public void getOneCandy() {
        this.getSomeCandies(1);
    }

    public void loadSomeCandies(int candiesNumber) {
        if (this.candiesAmount + candiesNumber > this.candiesCapacity) {
            System.out.println("Error! Pez overload on loading " + candiesNumber + " candies (" + this.candiesAmount + " candies available). Pez capacity is " + this.candiesCapacity);
        } else {
            this.candiesAmount += candiesNumber;
            System.out.println("Loaded " + candiesNumber + " candies. Candies amount: " + this.candiesAmount);
        }
    }

    public void loadOneCandy() {
        this.loadSomeCandies(1);
    }

    public void loadFullCandies() {
        this.loadSomeCandies(this.candiesCapacity - this.candiesAmount);
    }

}
