/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap3;

/**
 *
 * @author Admin
 */
public class SoSanhTheoTen implements ISoSanh<SinhVien>
{
        public int soSanh(SinhVien o1, SinhVien o2) {
        int result = o1.getHoTen().compareTo(o2.getHoTen());
        if (result > 0) {
            return -1;
        }
        if (result < 0) {
            return 1;
        }
        return 0;
    }
}
