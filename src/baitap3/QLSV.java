/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap3;

import java.util.ArrayList;
/**
 *
 * @author Admin
 */
public class QLSV {
        private ISoSanh soSanh;
    private ArrayList<SinhVien> list = new ArrayList<>();

    public QLSV() {
    }

    public QLSV(ISoSanh soSanh) {
        this.soSanh = soSanh;
    }

    public void setSoSanh(ISoSanh soSanh) {
        this.soSanh = soSanh;
    }  
    
    public void themSinhVien(SinhVien sv) {
        list.add(sv);
    }
    
    public void sapXep() {
        SinhVien temp;
        for(int i = 0; i < list.size(); i++) {
            for(int j = i + 1; j <= list.size()-1; j++)
                if(soSanh.soSanh(list.get(i), list.get(j)) == -1) { // i < j
                    temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
        }
    }
    
    public void inDS() {
        for (SinhVien sv : list) {
            sv.in();
        }
        System.out.println("\n");
    }
    
}
