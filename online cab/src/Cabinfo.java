import java.awt.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class CabInfo {
    public class CabInfo()
    {
        Aarthi ar = null;
        Driver2 s1= new Driver2("mahesh","TSO36726","6756576889");
        Driver2 s2= new Driver2("rajesh","TSOEA6732","6756768809");
        Driver2 s3= new Driver2("likith","TSO45435","6789787990");
        Driver2 s4= new Driver2("mayank","TSO45598","6008976889");
        Driver2 s5= new Driver2("mateen","TSO362126","6713244235");
        Driver2 s6= new Driver2("mathak","TSO334306","6706576889");
        List<Driver2> list = new ArrayList<Driver2>();

        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        list.add(s6);

        int s = list.size();
        Random r = new Random();
        int p = r.nextInt();

        try{
        FileInputStream fileInputStream = new FileInputStream("");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        ar =(Aarthi) in.readObject();
        in.close();
        fileIn.close()
       }
        catch(IOException i)
        {
            i.printStackTrace();
            return;
        } catch(ClassNotFoundException c)
        {
            System.out.println("joe class not found");
            c.printStackTrace();
            return;
        }
        JFrame j4 = new JFrame("CabInfo");
        String x=ar.p;
        String y=ar.vt;
        JLabel pl = new JLabel("pickup Location");
        JLabel pl1 = new JLabel();
        p1.setBounds(10,50,200,30);
        pl1.setBounds(150,50,200,30);

        JLabel cd = new JLabel("Cab Driver Name");
        cd.setBounds(10,100,200,30);
        JLabel cd1 = new JLabel();
        cd1.setBounds(150,100,200,30);

      //
        JLabel cn1l = new JLabel();
        JLabel cn1 = new JLabel("cab no :")

    }
}
