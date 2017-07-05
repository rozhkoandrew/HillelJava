class DeviderCycle {
    void devideNumbers(int devider, int devident) {
        int counter = 0;
        int cheking;
        cheking = devider;
        while (true) {
            if (devident < 0) {
                int remnantResult = devident + cheking;
                System.out.println(" remnant = " + (remnantResult));
                System.out.println(" result of devision = " + (counter - 1));
                break;
            }

            if (devident >= 2) {
                devident -= devider;
                counter++;
            }

            else {
                System.out.println(" remnant = " + devident);
                System.out.println(" result of devision = " + counter);
                break;

            }
        }
    }
}




