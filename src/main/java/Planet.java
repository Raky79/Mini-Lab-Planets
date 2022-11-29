public class Planet {
    private String name;
    private long size;

    public Planet(String name, long size){
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return this.name;
    }

    public long getSize() {
        return this.size;
    }

    public String explode() {
        return "Boom! " +this.name+ " has exploded.";
    }

}
