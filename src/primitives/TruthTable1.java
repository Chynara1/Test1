package primitives;

public class TruthTable1 {

    public static void main(String[] args) {

        // visa and ticket
        boolean visa = true;
        boolean ticket = true;

        boolean myVisa = false;
        boolean myTicket = true;
       boolean canTravel = visa == myVisa && ticket == myTicket; // myVisa false //ticket true


        System.out.println(canTravel);

        // ask question

        boolean online = true;
        boolean campus = true;


        boolean student = true; //if it's false meaning you re not student it can be false
        boolean askQuestion = student == online || student == campus;
        System.out.println("can i ask question?"+ askQuestion);


        //90% or more attendance and score of 80 or more to pass this class

        int reqAttendance = 90;
        int  reqScore = 80;

        int yourAttendance = 100;
        int youScore =90;

        boolean pass = yourAttendance >= reqAttendance  && youScore >= reqScore;
        System.out.println("Can I pass the course? >>"+pass);

        //


    }
}
