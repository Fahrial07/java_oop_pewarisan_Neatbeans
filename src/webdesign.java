/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fahrial
 */
public class webdesign extends person {
    String jenis;
    
    public webdesign(String jns, String nama)
    {
       super(nama);
       this.jenis=jns;
    }
    
    @Override
    public void myhobby()
    {
        System.out.println("Hobi : Membuat desain UI/UX Website");
    }
    
    @Override
    public void pekerjaanku()
    {
        System.out.println("Pekerjaan : Membuat Desain UI/UX website dan Web App & meeting dengan client"+"\n");
    }
    
    public void tampilwebdesign()
    {
        System.out.println("Nama :"+nama+" | "+"Jenis Desain"+jenis);
    }
}
