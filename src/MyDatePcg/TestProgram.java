package MyDatePcg;

public class TestProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//MyDate d1 = new MyDate(2012, 2, 28);
        //System.out.println(d1);
        //System.out.println(d1.nextDay());
        //System.out.println(d1.nextDay());
        //System.out.println(d1.nextMonth());
        //System.out.println(d1.nextYear());

        //MyDate d2 = new MyDate(2012, 1, 2);
        //System.out.println(d2);
        //System.out.println(d2.previousDay());
        //System.out.println(d2.previousDay());
        //System.out.println(d2.previousMonth());
        //System.out.println(d2.previousYear());

        //MyDate d3 = new MyDate(2012, 2, 29);
        //System.out.println(d3.previousYear());

        //MyDate d4 = new MyDate(2099, 11, 31);
        //MyDate d4 = new MyDate(2011, 2, 22);

        //Console.ReadLine();

        MyDate d6 = new MyDate(2011, 12, 28);
        //MyDate d7 = new MyDate(2012, 03, 02);



        int mesic;
        int den;

        do
        {

            System.out.println(d6.nextDay());


            mesic = d6.getMonth();
            den = d6.getDay();


            //takhle to funguje, ale moc nechapu proc nebo, radsi bych dal a zaroven while( mesic != 03 && den!=3);
        } while ( mesic != 03 || den!=3 );


        
		
	}

}
