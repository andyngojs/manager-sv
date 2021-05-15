package controller;

import app.Students;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author AndyNgoo
 */
public class IOFile {
    
    public void ghi(ArrayList list , String file) {
        try (FileOutputStream out = new FileOutputStream(new File(file))) {
            ObjectOutputStream oos = new ObjectOutputStream(out);
            oos.writeObject(list);
        } catch (Exception e) {
            System.out.println("Done !");
        } 
    }
    
    File file = new File("SV.txt");
    public void ghiSV(ArrayList<Students> list) {
        try (PrintWriter pw = new PrintWriter(file)) {
            for (Students sv: list) {
               pw.println(sv.getName());
               pw.println(sv.getDate());
               pw.println(sv.getLop());
               pw.println(sv.getNganh());
               pw.println(sv.getPhone());
            }
        } catch (Exception e) {
            System.out.println("Got an Exception!");
        }
    }
    
    public ArrayList doc( String file) {
        ArrayList list  = new ArrayList() ;
        try (FileInputStream out = new FileInputStream(file)) {
            ObjectInputStream oos = new ObjectInputStream(out);
            list = (ArrayList) oos.readObject();
        } catch (Exception e) {
            System.out.println("Got an Exception!");
        }
        return list;  
    }
    
    public ArrayList docSV () {
        ArrayList <Students> list = new ArrayList<>();
        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNext()) {
              Students sv = new Students();
              sv.setName(sc.nextLine());
              sv.setDate(sc.nextLine());
              sv.setLop(sc.nextLine());
              sv.setNganh(sc.nextLine());
              sv.setPhone(sc.nextLine());
              list.add(sv);
            }
        } catch (Exception e) {
            System.out.println("Got an Exception!");
        }
        return list;
    }
}
