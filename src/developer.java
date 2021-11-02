/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fahrial
 */
public class developer extends person {
    
    String projecttime;
    String jenisapp;
    
    public developer(String pt, String ja, String nama)
    {
        super(nama);
        this.projecttime=pt;
        this.jenisapp=ja;
    }
    
    @Override
    public void myhobby()
    {
        System.out.println("Hobi : Membuat Aplikasi berbasis website");
    }
    
    @Override
    public void pekerjaanku()
    {
           System.out.println("Pekerjaan : Membuat aplikasi berbasis website dan meeting dengan client"+"\n");
    }
    
    public void tampildeveloper()
    {
        System.out.println("Nama : "+nama+" | "+"Project Time :"+projecttime+" | "+"Jensi Aplikasi :"+jenisapp+"");
    }
       
       
    
    
    
    
}
