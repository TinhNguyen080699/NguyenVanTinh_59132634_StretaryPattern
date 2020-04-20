/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap2;

/**
 *
 * @author TinhNV
 */
public class ThanhToanOnline implements IThanhToan{
    
    public double thanhtoan(int tienHang) {
        if(tienHang < 1000000) tienHang -= 5 * tienHang / 100;
        else tienHang -= 7 * tienHang / 100;
        return tienHang;
    }
    
}
