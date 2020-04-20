/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap2;

import java.util.stream.Stream;

/**
 *
 * @author Admin
 */
public class main {
    public static void main(String[] args) {
        GioHang GioHang = new GioHang();
        HangHoa hang = new HangHoa("Exciter", "xe máy", 1000000);
        HangHoa hang1 = new HangHoa("Lamborghini", "siêu xe", 20000000);
        HangHoa hang2 = new HangHoa("MesBen", "ô tô", 2000000);
        GioHang.themHH(hang);
        GioHang.themHH(hang1);
        GioHang.themHH(hang2);
        GioHang.setTT(new ThanhToanOnline());
        
        GioHang GioHang1 = new GioHang();
        HangHoa hang3 = new HangHoa("Nhà ở", "Home", 1000000);
        HangHoa hang4 = new HangHoa("Khách sạn", "Hotel", 500000);
        HangHoa hang5 = new HangHoa("Biệt thự", "Super home", 2000000);
        GioHang1.themHH(hang3);
        GioHang1.themHH(hang4);
        GioHang1.themHH(hang5);
        GioHang1.setTT(new ThanhToanCOD());
        
        System.out.println("Giỏ hàng 1 thanh toán online");
        System.out.println(GioHang.inDS());
        
        System.out.println("Giỏ hàng 2 thanh toán COD");
        System.out.println(GioHang1.inDS());

        
    }
    
}
