/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fahrial
 */
public class pewarisan {
    
    public static void main(String[] args)
    {
           developer dvlpr=new developer("One Time","Aplikasi Berbasis Website","Ali fahrial Anwar");
           webdesign wbdsgn=new webdesign("UI/UX Desainer","Ali Fahrial ");
           webappdesign wbapdsgn=new webappdesign("Aplikasi Berbasis Website","Ali ");
           
            dvlpr.tampildeveloper();
             dvlpr.myhobby();
              dvlpr.pekerjaanku();
              wbdsgn.tampilwebdesign();
              wbdsgn.myhobby();
              wbdsgn.pekerjaanku();
              wbapdsgn.tampilwebappdesign();
              wbapdsgn.myhobby();
              wbapdsgn.pekerjaanku();
    }
}
