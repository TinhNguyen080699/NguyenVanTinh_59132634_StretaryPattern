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
public class SoSanhTheoDiem  implements ISoSanh<SinhVien>
{
    public int soSanh(SinhVien o1, SinhVien o2) {
        if (o1.getDiemTB() > o2.getDiemTB()) {
            return 1;
        }
        if (o1.getDiemTB() < o2.getDiemTB()) {
            return -1;
        }
        return 0;
    }
    
}
