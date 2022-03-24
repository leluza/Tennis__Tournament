import java.util.ArrayList;
import java.util.List;

public class Player {

    private String name;

    private List< List < List<Score>>> points;

    private int last_set;
    private int last_game;
    private int last_match;

    private int set_quantity;

    private double success_rate;

    public Player(String name, int set_quantity, double success_rate){
        this.name=name;
        this.set_quantity=set_quantity;
        this.success_rate=success_rate;
        //this.points =  new ArrayList< List< List<Score> > >();
        this.points =  new ArrayList<>();
        this.last_match=0;
        this.last_game=0;
        this.last_set=0;
    }


    public void addPoints(Score sc){}

    public Score getPoint(){
        return new Score();
    }

    public List<Score> getGame(){
        return new ArrayList<>();
    }

    public List<List<Score>> getSet(){
        return new ArrayList<>();
    }

    public List<List<List<Score>>> getAllPoints(){
        return new ArrayList<>();
    }


    public void setName(String name){ this.name=name;}
    public String getName(){ return this.name;}


}