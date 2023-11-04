package OO;

public class Main {
    public static void main() {
        Input input = new Input();
        input.input("data/input.txt");
        Shift shift = new Shift(input.getLineTxt());
        shift.shift();
        Alphabetizer alphabetizer = new Alphabetizer(shift.getKwicList());
        alphabetizer.sort();
        Output output = new Output(alphabetizer.getKwicList());
        output.output("data/OO_output.txt");

    }
}
