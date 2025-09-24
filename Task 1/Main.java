// Task 1a: Main class with main method
class Main {
    public static void main(String[] args) {

        // Task 1g: Create instances of Team
        // Task 1i: Set rank with setRank
        // Task 1l: Add players to each team
        Team t1 = new Team("Team A");
        t1.setRank(2);
        t1.addPlayer("Ole");
        t1.addPlayer("Bent");
        t1.addPlayer("Dorthe");

        Team t2 = new Team("Team B");
        t2.setRank(1);
        t2.addPlayer("Erik");
        t2.addPlayer("Hans");
        t2.addPlayer("Dorit");

        Team t3 = new Team("Team C");
        t3.setRank(3);
        t3.addPlayer("Magnus");
        t3.addPlayer("Ali");
        t3.addPlayer("Louise");

        Team t4 = new Team("Team D");
        t4.setRank(5);
        t4.addPlayer("Adam");
        t4.addPlayer("Emre");
        t4.addPlayer("Amaan");

        Team t5 = new Team("Team E");
        t5.setRank(6);
        t5.addPlayer("Khattab");
        t5.addPlayer("Omar");
        t5.addPlayer("Fiona");

        Team t6 = new Team("Team F");
        t6.setRank(4);
        t6.addPlayer("Kristina");
        t6.addPlayer("Karsten");
        t6.addPlayer("Marius");

        // Task 1j + 1k + 1m: Print all teams
        // toString automatically shows team name, rank, and players
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);
        System.out.println(t5);
        System.out.println(t6);
    }
}