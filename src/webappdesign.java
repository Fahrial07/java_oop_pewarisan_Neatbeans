/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fahrial
 */
public class webappdesign  extends person{
    String webappmodel;
    
    public webappdesign(String model, String nama)
    {
        super(nama);
        this.webappmodel=model;
    }
    
    
    @Override
    public void myhobby()
    {
        System.out.println("Hobi : Membuat desain UI/UX Website");
    }
    
    @Override
    public void pekerjaanku()
    {
        System.out.println("Pekerjaan : Membuat desain UI/UX Website dan meeting bersama client");
    }
    
    public void tampilwebappdesign()
    {
        System.out.println("Nama : "+nama+" | "+"Model Website : "+webappmodel);
    }
}
