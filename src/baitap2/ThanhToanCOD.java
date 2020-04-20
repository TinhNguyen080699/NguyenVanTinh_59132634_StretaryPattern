/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap2;

/**
 *
 * @author Admin
 */
public class ThanhToanCOD implements IThanhToan{
    
    public double thanhtoan(int tienHang) {
        if(tienHang > 2000000) tienHang -= 2* tienHang/100;
        return tienHang;
    }
    
}
