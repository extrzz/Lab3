package storyelements;

public enum Status {
    GOOD("Feeling pretty good"),
    ALRIGHT("A little bit bad, but alright overall"),
    INJURED("Got a little injury"),
    HARDLY_INJURED("Got a serious injury");

    private String status;
    Status(String status){
        this.status = status;
    }
    public String getStatus(){
        return status;
    }
}

