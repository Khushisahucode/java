import java.io.Serializable;
public class Address implements Serializable  {
    City city;
    State state;
    Address(City city ,State state){
        this.city=city;
        this.state=state;
    }
}
