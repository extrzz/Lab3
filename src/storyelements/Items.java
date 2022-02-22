package storyelements;

public enum Items {
    GRATED_RAW_POTATO("cold compress of grated raw potatoes"),
    STEWED_CABBAGE("stewed cabbage compress"),
    HORSERADISH("boiled horseradish"),
    CLAY("clay to cover sore spot");


    private final String item;
    Items(String item){
        this.item = item;
    }
    public String getItem(){
        return item;
    }
}
