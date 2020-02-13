import java.util.ArrayList;
import java.util.Arrays;

public class Race extends Stage{
    private ArrayList<Stage> stages;

    public ArrayList<Stage> getStages() {
        return stages;
    }

    public Race(Stage... stages) {
        this.stages = new ArrayList<>(Arrays.asList(stages));
    }

    public void go(Car c) {

    }
}
