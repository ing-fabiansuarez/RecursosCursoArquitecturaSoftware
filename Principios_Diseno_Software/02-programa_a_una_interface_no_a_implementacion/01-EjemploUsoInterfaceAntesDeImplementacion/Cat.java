
public class Cat
{
    int energy;
    
    public void eat(Sausage s){
        this.energy += s.getNutrition();
    }
}