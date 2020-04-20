/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap2;

import java.util.ArrayList;

/**
 *
 * @author TinhNV
 */
public class GioHang {
    IThanhToan TT;
    ArrayList<HangHoa> listHH = new ArrayList<>();
    // them hang hoa vao gio
    public int themHH(HangHoa hang) {
        listHH.add(hang);
        return 1;
    }
    // tinh tong so tien trong danh sach
    public int tienHang(){
        int tienHang = 0;
        for( int i = 0; i < listHH.size(); i++){
            tienHang += listHH.get(i).getgia();
        }
        return tienHang;
    }
    //chon hinh thuc thanh toan
    public void setTT(IThanhToan TT){
        this.TT = TT;
    }
    //tien hanh thanh toan
    public double thanhtoan(){
        return TT.thanhtoan(tienHang());
    }
    //in danh sach va tien tra
    public String inDS(){
        int tong = 0;
        String sanpham = "";
        for( int i= 0; i <listHH.size();i++){
            tong++;
            HangHoa HangHoa = listHH.get(i);
            sanpham += "Tên mặt hàng: "+HangHoa.getTenHH()+"\t\t\t"+
                       "Mô tả :"+HangHoa.getmota()+"\t\t\t"+
                       "Giá :"+HangHoa.getgia()+"\n";
        }
        return sanpham + 
                "Số lượng sản phẩm :"+tong +"\n"+
                "Số tiền cần trả :"+thanhtoan();
    }
    
}
