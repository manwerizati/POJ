public class DemoRunners {
    public static void main(String[] args) {
        Machine myMachine = new Machine();
        Athlete myAthlete = new Athlete();
        PoliticalCandidate myCandidate = new PoliticalCandidate();

        Runner[] runners = { myMachine, myAthlete, myCandidate};

        for (Runner currentRunner : runners) {
            currentRunner.run();
        }
    }
}
