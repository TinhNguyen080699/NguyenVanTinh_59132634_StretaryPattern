/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap3;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
/**
 *
 * @author Admin
 */
public class SinhVien {
        private String hoTen;
    private LocalDate ngaySinh;
    private float diemTB;

    public SinhVien() {
    }
       
    public SinhVien(String hoTen, LocalDate ngaySinh, float diemTB) {
        this.hoTen = hoTen;
        this.diemTB = diemTB;
        this.ngaySinh = ngaySinh;
    }

    public float getDiemTB() {
        return diemTB;
    }

    public String getHoTen() {
        return hoTen;
    }

    public LocalDate getNgaySinh() {
        return ngaySinh;
    }
    
    public void in() {
        System.out.println("Ho va ten: " + hoTen + "; Ngay sinh: " + ngaySinh + "; Diem: " + diemTB);
    }
    
}
