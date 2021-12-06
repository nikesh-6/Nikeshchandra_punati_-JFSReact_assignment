package collections;
import java.util.*;

 class Collections1{
    long phoneNumber;
    String contactName,email;
    char gender;
    public Collections1(long phoneNumber,String contactName,String email,char gender)
    {
        this.phoneNumber=phoneNumber;
        this.contactName=contactName;
        this.email=email;
        this.gender=gender;
    }

}
public class Collections2
{
    public static void main(String[] args) {
        Map<Long,Collections1>map=new TreeMap<>(Collections.reverseOrder());
        Collections1 c1=new Collections1(82251155L,"Nikesh","lolddkm77@gmail.com",'M');
        Collections1 c2=new Collections1(998887776L,"mahesh","abcd@capg.com",'M');
        Collections1 c3=new Collections1(699888666L,"Virat","virat2gmail.com",'M');
        Collections1 c4=new Collections1(96767656L,"dhoni","dhoni@capgemini.com",'M');
        map.put(1L,c1);
        map.put(2L,c2);
        map.put(3L,c3);
        map.put(4L,c4);


        for(Map.Entry<Long, Collections1> entry:map.entrySet()){
            long key=entry.getKey();
            Collections1 c5=entry.getValue();
          System.out.println(key+" Details:");

            System.out.println("phone number: "+c5.phoneNumber+" contact name: "+c5.contactName+"email: "+c5.email+" gender: "+c5.gender);
        }
        System.out.print(" ");

    }
}


