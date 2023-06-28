/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viewmodel;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author trant
 */
public class ThongKeTheoThoiGianViewModel {

    private Date ngay;
    private Integer soLuongDonHang;
    private BigDecimal tongTienHang;
    private BigDecimal tongTienChietKhau;

    public ThongKeTheoThoiGianViewModel() {
    }

    public ThongKeTheoThoiGianViewModel(Date ngay, Integer soLuongDonHang, BigDecimal tongTienHang, BigDecimal tongTienChietKhau) {
        this.ngay = ngay;
        this.soLuongDonHang = soLuongDonHang;
        this.tongTienHang = tongTienHang;
        this.tongTienChietKhau = tongTienChietKhau;
    }

    public Date getNgay() {
        return ngay;
    }

    public void setNgay(Date ngay) {
        this.ngay = ngay;
    }

    public Integer getSoLuongDonHang() {
        return soLuongDonHang;
    }

    public void setSoLuongDonHang(Integer soLuongDonHang) {
        this.soLuongDonHang = soLuongDonHang;
    }

    public BigDecimal getTongTienHang() {
        return tongTienHang;
    }

    public void setTongTienHang(BigDecimal tongTienHang) {
        this.tongTienHang = tongTienHang;
    }

    public BigDecimal getTongTienChietKhau() {
        return tongTienChietKhau;
    }

    public void setTongTienChietKhau(BigDecimal tongTienChietKhau) {
        this.tongTienChietKhau = tongTienChietKhau;
    }

    public Object[] getThongKeTheoThoiGian() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String date = dateFormat.format(ngay);
        return new Object[]{date, soLuongDonHang, tongTienHang, tongTienChietKhau, tongTienHang.subtract(tongTienChietKhau)};
    }
}
