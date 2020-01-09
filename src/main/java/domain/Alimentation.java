package domain;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

public class Food {
    private long id;

    private String label;

    public Food(long id, String label){
        this.id = id;
        this.label = label;
    }
    @Id
    @GeneratedValue
    public Long getId(){
        return id;
    }

    public void setId(long id){
        this.id = id;
    }

    public String getLabel(){
        return label;
    }
    public void setLabel(String label){
        this.label = label;
    }
}
