package PR4;

public class Book {
    private String name;
    private String author;
    private String data;
    private String update;

    public Book(String n, String a, String d, String u){
        name = n;
        author = a;
        data = d;
        update = u;
    }
    public Book(){
        name = "-";
        author = "no_name";
        data = "00.00.00";
        update = "00.00.00";
    }
    public void setName(String n) {
        this.name = n;
    }
    public void setAuthor(String a) {
        this.author = a;
    }
    public void setData(String d) {
        this.data = d;
    }
    public void setUpdate(String u)
    {
        this.update = u;
    }
    public String getName(){
        return this.name;
    }
    public String getAuthor() {
        return this.author;
    }
    public String getData() {
        return this.data;
    }
    public String getUpdate()
    {
        return this.update;
    }

}
