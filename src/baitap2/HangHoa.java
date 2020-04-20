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
public class HangHoa {
    
    String TenHH, mota;
    int gia;
    
    public HangHoa(){
        this.TenHH = "";
        this.mota = "";
        this.gia = 0;
    }
    public HangHoa(String TenHH, String mota, int gia)
    {
        this.TenHH = TenHH;
        this.gia = gia;
        this.mota = mota;
    }
    public String getTenHH(){
        return TenHH;
    }
    public String getmota(){
        return mota;
    }
    public int getgia() {
        return gia;
    }
    
    public void setTenHH(String TenHH) {
        this.TenHH = TenHH;
    }
    public void setmota(string mota) {
        this.mota = mota;
    }
    public void setgia(int gia) {
        this.gia = gia;
    }
    
}




