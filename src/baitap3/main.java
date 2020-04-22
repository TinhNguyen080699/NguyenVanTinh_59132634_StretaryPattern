/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap3;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Admin
 */
public class main {
        public static LocalDate getDateFromString(String string, DateTimeFormatter format) 
    {  
        // Convert the String to Date in the specified format 
        LocalDate date = LocalDate.parse(string, format); 
  
        // return the converted date 
        return date; 
    } 
    
    public static void main (String[] args) throws ParseException {

        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
        
        // danh sach sinh vien
        SinhVien sv1 = new SinhVien("Nguyen Van Tinh", getDateFromString("08/06/1999", format), 9.0f);
        SinhVien sv2 = new SinhVien("Bui Xuan Phai", getDateFromString("05/11/1996", format), 7.8f);
        SinhVien sv3 = new SinhVien("Dinh Vo Hoai Phuong", getDateFromString("20/03/1998", format), 8.1f);
        SinhVien sv4 = new SinhVien("To Hien Thanh", getDateFromString("12/12/2000", format), 9.4f);
        
        SoSanhTheoTen theoTen = new SoSanhTheoTen();
        SoSanhTheoDiem theoDiem = new SoSanhTheoDiem();
        
        QLSV ql = new QLSV();
        ql.themSinhVien(sv1);
        ql.themSinhVien(sv2);
        ql.themSinhVien(sv3);
        ql.themSinhVien(sv4);
        
        System.out.println(" Danh sach ban dau ");
        ql.inDS();
        
        // sap xep danh sach theo ten
        System.out.println(" Sap xep sanh sach sinh vien theo TEN ");
        ql.setSoSanh(theoTen);
        ql.sapXep();
        ql.inDS();
        
        // sap xep danh sach theo diem
        System.out.println(" Sap xep sanh sach sinh vien theo DIEM TRUNG BINH ");
        ql.setSoSanh(theoDiem);
        ql.sapXep();
        ql.inDS();
    }
    
}
