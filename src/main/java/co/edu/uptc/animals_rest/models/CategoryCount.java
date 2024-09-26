package co.edu.uptc.animals_rest.models;

public class CategoryCount {
    private String category;
    private long number;

    public CategoryCount(String category, long number) {
        this.category = category;
        this.number = number;
    }

    public String getCategory() {
        return category;
    }

    public long getNumber() {
        return number;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setNumber(long count) {
        this.number = count;
    }

    @Override
    public String toString() {
        return "{\ncategory:" + category + ", number:" + number + "\n}";
    }

    
}
