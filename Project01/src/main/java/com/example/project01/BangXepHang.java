package com.example.project01;

public class BangXepHang extends CLB{
    private int soTran;
    private int thang;

    private int hoa;

    private int thua;

    private int diem;

    public BangXepHang(){

    }

    public BangXepHang(int id, String name, int hlv, int soTran, int thang, int hoa, int thua, int diem) {
        super(id, name, hlv);
        this.soTran = soTran;
        this.thang = thang;
        this.hoa = hoa;
        this.thua = thua;
        this.diem = diem;
    }

    public BangXepHang(int soTran, int thang, int hoa, int thua, int diem) {
        this.soTran = soTran;
        this.thang = thang;
        this.hoa = hoa;
        this.thua = thua;
        this.diem = diem;
    }

    public int getSoTran() {
        return soTran;
    }

    public void setSoTran(int soTran) {
        this.soTran = soTran;
    }

    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public int getHoa() {
        return hoa;
    }

    public void setHoa(int hoa) {
        this.hoa = hoa;
    }

    public int getThua() {
        return thua;
    }

    public void setThua(int thua) {
        this.thua = thua;
    }

    public int getDiem() {
        return diem;
    }

    public void setDiem(int diem) {
        this.diem = diem;
    }
}
