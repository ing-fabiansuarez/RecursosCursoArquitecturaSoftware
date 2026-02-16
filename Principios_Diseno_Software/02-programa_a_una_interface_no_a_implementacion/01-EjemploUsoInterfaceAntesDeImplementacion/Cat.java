
public class Cat
{
    int energy;
    
    public void eat(Food s){
        this.energy += s.getNutrition();
    }
}