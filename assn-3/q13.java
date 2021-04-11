public class q13 {
    static class clock{
        int hour,minute,second;

        clock(int h,int m,int s){
            hour=h;
            minute=m;
            second=s;
        }

        void  display()
        {
            System.out.println(hour+":"+minute+":"+second);
        }

        clock add(clock c)
        {
            int hh=0,mm=0,ss=0;
            ss=c.second+this.second;
            mm+=(ss/60);
            ss%=60;

            mm+=c.minute+this.minute;
            hh+=(mm/60);
            mm%=60;

            hh+=c.hour+this.hour;
            hh%=24;

            return new clock(hh,mm,ss);
        }
    }

    public static void main(String args[]){
        clock c1=new clock(5,23,12);
        clock c2=new clock(6,38,50);
        clock c3=c1.add(c2);
        System.out.print("Time 1 : ");
        c1.display();
        System.out.print("Time 2 : ");
        c2.display();
        System.out.print("Final : ");
        c3.display();
    }
}
